package com.pfariasmunoz.kotlincourse.interop;

import com.pfariasmunoz.kotlincourse.classes.CustomerJava;

import java.util.List;

public interface CustomerJavaRepository {

    CustomerJava gerById(int id);
    List<CustomerJava> getAll();
}
