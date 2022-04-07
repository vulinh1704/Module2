package staticmember;

public class Fish extends Animal{
   private String id;
   private String email;
   public void speaking(){
      this.speak();
   }

   @Override

   public void move(){
      System.out.println("hahaha");
   }
}
