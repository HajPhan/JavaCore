package mta.edu.vn.gennerics;

public class GennericsMethod {

    // Java Genneric Method
    public static <D> boolean isEqual(GennericsType<D> g1, GennericsType<D> g2){
        return g1.getT().equals(g2.getT());
    }

    public static <T> boolean isCheck(GennericsType<T> g1, GennericsType<T> g2){
        return g1.getT().equals(g2.getT());
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

    public static void main(String [] args){
        GennericsType<String> g1 = new GennericsType<>();
        g1.setT("Phan");

        GennericsType<String> g2 = new GennericsType<>();
        g2.setT("Phan");

        // c1
        boolean is = GennericsMethod.isEqual(g1,g2);

        // c2
        boolean check = GennericsMethod.<String>isCheck(g1,g2);

        System.out.println("is = " + is + " && check = " + check);
    }
}
