package com.mta.edu.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String [] args){
        final Method [] methods = String.class.getMethods();
        for (final Method m : methods){
            System.out.println(m.getName());
        }

        final Field [] fields = String.class.getFields();
        for (final Field f : fields){
            System.err.println(f.getName());
        }
    }
}
