package com.sandvichvonnom.parsem3;

/**
 * Created by jscheel on 7/16/15.
 */
public class TestClass2 {

    private String name;
    private int age;

    TestClass2() {
        name = "Default";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayName() {
        System.out.println(name);
    }

}
