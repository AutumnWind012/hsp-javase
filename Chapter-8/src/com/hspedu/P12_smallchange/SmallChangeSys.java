package com.hspedu.P12_smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {

        // 定义相关变量
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        // 零钱通明细
        String details = "------------- 零钱通明细 -------------";
        // 收益入账
        int money = 0;
        int balance = 0;
        // 用于格式化日期
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        // 消费说明
        String note = null;

        // 主循环
        do {
            // 1. 显示菜单
            System.out.println("\n------------- 零钱通菜单 -------------");
            System.out.println("            1 零钱通明细            ");
            System.out.println("            2 收益入账              ");
            System.out.println("            3 消费                 ");
            System.out.println("            4 退     出            ");
            System.out.print("请选择（1～4）: ");
            // 2. 进入选中的菜单
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.print("请输入收益入账金额：");
                    money = scanner.nextInt();
                    if (money <= 0) {
                        System.out.println("收益金额无效");
                        break;
                    }
                    balance += money;
                    // 拼接一条收益记录
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(new Date()) + "\t" + balance;
                    break;
                case 3:
                    System.out.print("请输入消费金额：");
                    money = scanner.nextInt();
                    if (money <= 0) {
                        System.out.println("消费金额无效");
                        break;
                    }
                    if (money > balance) {
                        System.out.println("消费失败，余额不足");
                        break;
                    }
                    System.out.print("请输入消费说明：");
                    note = scanner.next();
                    balance -= money;
                    // 拼接一条消费记录
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(new Date()) + "\t" + balance;
                    break;
                case 4:
                    // 退出
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
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
                    break;
            }
        } while (loop);
    }
}




