package HomeWork.homework6.zoo;

public class Animal {
   public boolean counter;
   protected String name;
   protected int swim;
   protected int run;

   public Animal(){

   }
   public Animal(String name, int swim, int run) {
      this.name = name;
      this.swim = swim;
      this.run = run;
   }


   public String getName() {
      return name;
   }

   public int getSwim() {
      return swim;
   }

   public int getRun() {
      return run;
   }
}
