package com.pfariasmunoz.kotlincourse.interop;

import com.pfariasmunoz.kotlincourse.classes.CustomerKotlin;
import com.pfariasmunoz.kotlincourse.classes.Status;

import java.io.IOException;

public class TalkingToKotling {

    public void loadingStats(CustomerKotlin customerKotlin) {


        try {
            customerKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(5, "Palo", "mail@mail.com");

        // Talking to a Kotlin class using the Java conventions
        customerKotlin.setEmail("pfariasmunoz@gmail.com");

        // To acces a field we add the anotation @JvmProperty to kotling class
        String someField = customerKotlin.someProperty;

        // We can access enums absolutelly find
        customerKotlin.changeStatus(Status.Current);
        // Because of the annotation of @JvmOverloads we can have a default parameter from kotlin code
        customerKotlin.changeStatus();

        // we can use this name because of the anotation @JvmName
        customerKotlin.preferencial();

        // Accessing top level functions from Kotlin in Java
        KotlinFunctions.prefix("some", "value");

        // Accessing fiels ( with the const modifier) from Kotlin in Java
        int copyRightYear = KotlinFunctions.copyrightYear;
        System.out.println(copyRightYear);

    }
}
