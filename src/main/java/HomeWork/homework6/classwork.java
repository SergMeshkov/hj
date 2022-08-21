package HomeWork.homework6;

import HomeWork.homework6.zoo.Cat;
import HomeWork.homework6.zoo.Dog;

public class classwork {


    public static void main(String[] args) {


        Cat cat = new Cat("Semen",0, 150);

        Dog dog = new Dog("Bobik", 50, 500);

        cat.swim();
        cat.run();
        dog.swim();
        dog.run();

    }


}
