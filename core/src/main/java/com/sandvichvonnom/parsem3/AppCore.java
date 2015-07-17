package com.sandvichvonnom.parsem3;

/**
 * Hello world!
 *
 */
public class AppCore
{
    public static void main( String[] args ) {

        System.out.println("Hello, I am core!");

        TestClass1 test1 = new TestClass1();
//        com.sandvichvonnom.parsem3.TestClass1 test1 = new com.sandvichvonnom.parsem3.TestClass1();

        test1.setName("AppCoreCore");

        test1.sayName();

    }
}
