package com.company;

class MyEmployee{
    private int id;
    private String name;

    //setters and getters --> set the property to any value and get the property from main()
    //this is the only way to use private properties outside this class, i.e. through the following methods

    public void setId(int i){
        id = i;
    }

    public void setName(String N){
        name = N;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

//Importance of getters and setters: Helps to add data validation. For example, if our java program is to receive phone
//number of a person, then in order to check if he/she has entered a valid phone number we can add conditions inside
//setters like- if the phone number contains special characters, then show error message and do not save it; else save
//the phone number.

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee Sulley = new MyEmployee();
        Sulley.setId(1905008);
        Sulley.setName("Sullivan");

        System.out.println("Name of the employee: " + Sulley.getName());
        System.out.println("Id of the employee: " + Sulley.getId());
    }
}
