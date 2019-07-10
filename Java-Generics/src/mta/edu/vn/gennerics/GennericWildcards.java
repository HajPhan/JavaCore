package mta.edu.vn.gennerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GennericWildcards {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        double sum = sumNew(list);

        List<Number> a = new ArrayList<>();
        a.add(100);
        a.add(200);
        a.add(300);
        double sum1 = sumOld(a);
        System.out.println("Sum = " + sum + " && a = " + a);

        for (Object obj : list){
            System.out.println(obj);
        }
        printData(list);
    }

    public static double sumNew(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static double sumOld(List<Number> list){
        double sum = 0;
        for (Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void printData(List<?> list){
        for (Object obj : list){
            System.out.println(obj + " :: ");
        }
    }

    public static void intList(List<? super Integer> list){
        list.add(new Integer(10));
    }

    public static void doubleList(List<? extends Double> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
