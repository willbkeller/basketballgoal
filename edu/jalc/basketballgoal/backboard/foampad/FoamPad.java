package edu.jalc.basketballgoal.backboard.foampad;

public class FoamPad{
   
   private final double length;
   private final double width;
   
   private FoamPad(){
      this.length = 0;
      this.width = 0;
   }
   
   FoamPad(double length, double width){
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
      
   