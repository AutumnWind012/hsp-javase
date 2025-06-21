package com.hspedu.P12_smallchange;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 完成零钱通的各个功能的类
 */
public class SmallChangeSysOOP {

    // 定义相关变量
    private Scanner scanner = new Scanner(System.in);
    private boolean loop = true;
    // 零钱通明细
    private String details = "------------- 零钱通明细 -------------";
    // 收益入账
    private int money = 0;
    private int balance = 0;
    // 用于格式化日期
    private Date date = null;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private void menu() {
        // 1. 显示菜单
        System.out.println("\n------------- 零钱通菜单 -------------");
        System.out.println("            1 零钱通明细            ");
        System.out.println("            2 收益入账              ");
        System.out.println("            3 消费                 ");
        System.out.println("            4 退     出            ");
        System.out.print("请选择（1～4）: ");
    }

    public void run() {
        do {
            this.menu();
            // 2. 进入选中的菜单
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    this.detail();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4:
                    // 退出
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
                    break;
            }
        } while (loop);
    }


    private void detail() {
        System.out.println(details);
    }

    private void income() {
        System.out.print("请输入收益入账金额：");
        money = scanner.nextInt();
        if (money <= 0) {
            System.out.println("收益金额无效");
            return;
        }
        balance += money;
        // 拼接一条收益记录
        details += "\n收益入账\t+" + money + "\t" + sdf.format(new Date()) + "\t" + balance;
    }

    private void pay() {
        System.out.print("请输入消费金额：");
        money = scanner.nextInt();
        if (money <= 0) {
            System.out.println("消费金额无效");
            return;
        }
        if (money > balance) {
            System.out.println("消费失败，余额不足");
            return;
        }
        System.out.print("请输入消费说明：");
        // 消费说明
        String note = scanner.next();
        balance -= money;
        // 拼接一条消费记录
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(new Date()) + "\t" + balance;
    }

    // 退出
    private void exit() {
        String choice;
        while (true) {
            System.out.println("确定要退出吗？输入 y/n");
            choice = scanner.next();
            if ("y".equals(choice)) {
                System.out.println("Bye~");
                loop = false;
                break;
            } else if ("n".equals(choice)) {
                break;
            }
        }
    }
}
