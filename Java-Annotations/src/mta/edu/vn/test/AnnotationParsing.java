package mta.edu.vn.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationParsing {
    public static void main(String[] args) {

        /*        try {
            for(Method method : AnnotaionParsing.class.getClassLoader().loadClass("mta.edu.vn.test").getMethods()){
                // check if MethodInfo annotation is parsent for the method
                if(method.isAnnotationPresent(mta.edu.vn.test.MethodInfo.class)){
                    for(Annotation anno : method.getDeclaredAnnotations()){
                        System.out.println("Annotation in Method " + method + " : " + anno);
                    }

                    MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                    if(method.revision() == 1){

                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        try {
            for (Method method : AnnotationParsing.class.getClassLoader().loadClass("mta.edu.vn.test.AnnotaionExample").getMethods()) {
                // checks if MethodInfo annotation is present for the method
                if (method.isAnnotationPresent(mta.edu.vn.test.MethodInfo.class)) {
                    try {
                        // iterates all the annotations available in the method
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method '" + method + "' : " + anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with revision no 1 = " + method);
                        }

                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
