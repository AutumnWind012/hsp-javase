package com.hspedu.P09_polymorphic;

public class Poly01 {
    public static void main(String[] args) {
        //
        Master tom = new Master("Tom");

        Dog dog = new Dog("大黄狗");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog, bone);

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat, fish);

        Hog hog = new Hog("小香猪");
        Rice rice = new Rice("大米饭");
        tom.feed(hog, rice);
    }
}


class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 主人给动物喂食
    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 喂 " + food.getName());
    }

}

class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Fish extends Food {
    public Fish(String name) {
        super(name);
    }
}

class Bone extends Food {
    public Bone(String name) {
        super(name);
    }
}

class Rice extends Food {
    public Rice(String name) {
        super(name);
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Hog extends Animal {
    public Hog(String name) {
        super(name);
    }
}
