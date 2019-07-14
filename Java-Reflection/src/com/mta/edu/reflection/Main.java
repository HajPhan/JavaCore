package com.mta.edu.reflection;

public class Main {
    public static void main(String [] args) throws ClassNotFoundException {
        // Get class using reflection
        Class<?> concreteClass = ConcreteClass.class;

        try {

            // Below method is used most of the time in framework like JUnit
            // Spring dependency injection, Tomcat web container
            // Eclipse auto completion is not available at compile time

            concreteClass = Class.forName("com.mta.edu.reflection.ConcreteClass");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(concreteClass.getCanonicalName());

        // for primitive types, wrapper classes and arrays
        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName());    // prints boolean

        Class<?> cDouble = Double.TYPE;
        System.out.println(cDouble.getCanonicalName());     // prints double

        Class<?> cDoubleArray = Class.forName("[D");
        System.out.println(cDoubleArray.getCanonicalName());    // prints double[]

        Class<?> twoDStringArray = String[][].class;
        System.out.println(twoDStringArray.getCanonicalName());     // print java.lang.String[][]

        // Get Super Class
        System.out.println("\n=================================================================================");
        System.out.println("=========================/// Get Super Class /// ================================");
        System.out.println("=================================================================================\n");
        Class<?> superClass  = Class.forName("com.mta.edu.reflection.ConcreteClass").getSuperclass();
        System.out.println(superClass);     // prints "com.mta.edu.reflection.BaseClass"
        System.out.println(Object.class.getSuperclass());   // prints "null"
        System.out.println(String[][].class.getSuperclass());   // prints "java.lang.Object"

    }
}
