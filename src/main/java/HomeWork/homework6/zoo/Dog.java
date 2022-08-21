package HomeWork.homework6.zoo;

public class Dog extends Animal {


    public Dog (String name, int swim, int run){
        this.name = name;
        this.swim = swim;
        this.run = run;

    }
    public void run(){
        if (run <= 1500) {
            System.out.printf("%sRun: \n", name + " " + run + " метров" + " ");
        }else {
            System.out.println("Error");
        }
    }
    public void swim(){
        if (swim <= 100) {
            System.out.printf("%sSwim: \n", name + " " + swim + " метров" + " ");
        } else {
            System.out.println("Error");
        }
    }
}
