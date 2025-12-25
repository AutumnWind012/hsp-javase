package com.hspedu.P06_abstract;

public class TestTemplate {
    public static void main(String[] args) {
        //
        new AA().calculateTime();
        new BB().calculateTime();
    }
}

class AA extends Template {
    // 实现 template 的抽象方法 job
    @Override
    public void job() {
        long num = 0;
        for (int i = 1; i <= 800000; i++) {
            num += i;
        }
    }
}

class BB extends Template{
    // 实现 template 的抽象方法 job
    @Override
    public void job() {
        long num = 0;
        for (int i = 1; i <= 80000; i++) {
            num *= i;
        }
    }
}


abstract class Template {
    // 统计执行时间
    public void calculateTime() {
        // 得到开始时间
        long start = System.currentTimeMillis();
        // 执行 job
        job();
        // 得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 = "+ (end - start)  + " ms" );
    }
    // 抽象方法
    public abstract void job();
}