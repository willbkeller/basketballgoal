package edu.jalc.basketballgoal.backboard;

public class BackboardPad{
   
   private final double length;
   private final double width;
   
   private BackboardPad(){
      this.length = 0;
      this.width = 0;
   }
   
   BackboardPad(double length, double width){
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
      
   