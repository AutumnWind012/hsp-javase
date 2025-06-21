package com.hspedu.P03_EnumMethod;

/**
 * @author zijun
 * @date 2025/3/1
 */
public class EnumMethod {
    public static void main(String[] args) {
        //
        System.out.println("==所有日期的信息如下==");
        for (Week day : Week.values()) {
            System.out.println(day.getName());
        }
    }
}



enum Season {

    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽");

    private String name;
    private String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"),
    SUNDAY("星期日");

    private final String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}




