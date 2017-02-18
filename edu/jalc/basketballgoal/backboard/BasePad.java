package edu.jalc.basketballgoal.backboard;

public class BasePad{
   
   private final double length;
   private final double width;
   
   private BasePad(){
      this.length = 0;
      this.width = 0;
   }
   
   public BasePad(double length, double width){
      this.length = length;
      this.width = width;
   }
   
   public double getLength(){
      return this.length;
   }
   
   public double getWidth(){
      return this.width;
   }
}
      
   