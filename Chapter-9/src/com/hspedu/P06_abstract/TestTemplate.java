package com.hspedu.P06_abstract;

public class TestTemplate {
    public static void main(String[] args) {
        //
        new AA().job();
        new BB().job();;
    }
}



class AA {
    // 计算任务
    public void job() {
        long num = 0;
        // 得到开始时间
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 800000; i++) {
            num += i;
        }
        // 得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间 = "+ (end - start)  + " ms" );

    }
}


class BB {
    // 计算任务
    public void job() {
        long num = 0;
        // 得到开始时间
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 8000; i++) {
            num *= i;
        }
        // 得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间 = "+ (end - start)  + " ms" );

    }
}
