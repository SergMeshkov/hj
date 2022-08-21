package HomeWork.homework6.zoo;

public class Cat extends Animal {

    public Cat(String name, int swim, int run) {
        this.name = name;
        this.swim = swim;
        this.run = run;
    }

    public void run() {
        if (run <= 200) {
            System.out.printf("%sRun: \n", name + " " + run + " метров" + " ");
        }else {
            System.out.println("Error");
        }
    }

    public void swim() {
        if (swim == 0) {
            System.out.printf("%sSwim: \n", name + " " + swim + " метров" + " ");
        } else {
            System.out.println("Error");
        }
    }
}