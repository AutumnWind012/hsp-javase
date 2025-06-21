package com.hspedu.P10_object;

public class ToString {

    public static void main(String[] args) {
        Monster monster = new Monster("Werewolf", "Hybrid", 3);
        System.out.println(monster);
    }

}


class Monster {
    private String name;
    private String race;
    private int dangerLevel;

    public Monster(String name, String race, int dangerLevel) {
        this.name = name;
        this.race = race;
        this.dangerLevel = dangerLevel;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", dangerLevel=" + dangerLevel +
                '}';
    }
}




