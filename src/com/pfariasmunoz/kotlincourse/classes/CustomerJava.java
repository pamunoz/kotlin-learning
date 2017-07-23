package com.pfariasmunoz.kotlincourse.classes;

public class CustomerJava {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id: " + id + ",\n" +
                "name: " + name + ",\n" +
                "email: " + email+ ",\n" +
                "}";

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CustomerJava that = (CustomerJava) obj;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return email != null ? email.equals(that.email) : that.email != null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode(): 0);
        result = 31 * result + (email != null ? email.hashCode(): 0);
        return result;
    }

    public void prettyPrint() {
        System.out.printf("Id: %d - Name: %s%n" ,id, name);
    }
}
