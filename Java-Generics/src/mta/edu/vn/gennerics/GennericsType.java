package mta.edu.vn.gennerics;

public class GennericsType<T> {

    private T t;

    public T getT() {
        return this.t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GennericsType<String> type = new GennericsType<>();
        type.setT("Phan");  // valid
        System.out.println(type.getT());

        @SuppressWarnings("rawtypes")
        GennericsType type1 = new GennericsType();  // raw type (loại thô)
        type1.setT("Van");  // valid
        System.out.println(type1.getT());
        type1.setT(10);     // valid and autoboxing support
        System.out.println(type1.getT());
    }
}
