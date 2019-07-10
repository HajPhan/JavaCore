package mta.edu.vn.gennerics;

public class GennericsTypeOld {

    private Object t;

    public Object get(){
        return this.t;
    }

    public void set(Object t){
        this.t = t;
    }

    public static void main(String [] args){
        GennericsTypeOld type = new GennericsTypeOld();
        type.set("Phan");
        String str = (String) type.get();
        System.out.println(str);
    }
}
