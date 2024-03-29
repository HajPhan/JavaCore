package mta.edu.vn.test;

import java.util.ArrayList;
import java.util.List;

public class AnnotaionExample {

//    public static void main(String[] args) {
//
//    }

    @Override
    @MethodInfo(author = "hai", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public String toString() {
        return "Overriden toString method";
    }

    @Deprecated
    @MethodInfo(comments = "deprecated method", date = "Nov 17 2012")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    @MethodInfo(author = "Hai", comments = "Main method", date = "Nov 17 2020", revision = 10)
    public static void genericsTest() {
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }
}
