package com.exercise03;

//Creating custom array list in android

public class PersonDetails {
    String str_name, str_lastname, str_age, str_details;
    int image;

    public PersonDetails(String str_name, String str_lastname, String str_age, String str_details, int image) {
        this.str_name = str_name;
        this.str_lastname = str_lastname;
        this.str_age = str_age;
        this.str_details = str_details;
        this.image = image;
    }

    public String getStr_name() {
        return str_name;
    }

    public void setStr_name(String str_name) {
        this.str_name = str_name;
    }

    public String getStr_lastname() {
        return str_lastname;
    }

    public void setStr_lastname(String str_lastname) {
        this.str_lastname = str_lastname;
    }

    public String getStr_age() {
        return str_age;
    }

    public void setStr_age(String str_age) {
        this.str_age = str_age;
    }

    public String getStr_details() {
        return str_details;
    }

    public void setStr_details(String str_details) {
        this.str_details = str_details;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
