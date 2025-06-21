package hsp.edu.P01_Wrapper;

public class WrapperMethods {
    public static void main(String[] args) {
        // 包装类转字符串
        Integer i1 = 100;
        // 方式 1
        String str1 = i1 + "";
        // 方式 2
        String str2 = i1.toString();
        // 方式 3
        String str3 = String.valueOf(i1);

        String str4 = "12345";
        int i2 = Integer.parseInt(str4);
        Integer i3 = Integer.parseInt(str4);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);


    }
}



