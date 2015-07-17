package com.sandvichvonnom.parsem3;

/**
 * Created by jscheel on 7/16/15.
 */
public class AppBackend {

    public static void main( String[] args ) {

        System.out.println("Hello, I am backend!");

        TestClass1 test1 = new TestClass1();

        test1.setName("AppBackend");

        test1.sayName();

    }

}
