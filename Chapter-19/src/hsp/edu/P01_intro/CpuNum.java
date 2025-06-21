package hsp.edu.P01_intro;

public class CpuNum {

    public static void main(String[] args) {
        //
        Runtime runtime = Runtime.getRuntime();
        int processors = runtime.availableProcessors();
        System.out.println("JAVA 可用的 CPU 核心数量：" + processors);
    }
}
