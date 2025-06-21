package hsp.edu.P01_Wrapper;

public class WrapperType {
    public static void main(String[] args) {
        Object d1 = (true ? 5 : 15.7);
        System.out.println(d1.getClass());
    }
}
