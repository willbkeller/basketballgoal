package edu.jalc.basketballgoal.backboard;

public class Backboard{

   private final double width;
   private final double height;
   
   private Backboard(){
      this.width = 0;
      this.height = 0;
   }
   
   Backboard(double width, double height){
      this.width = width;
      this.height = height;
   }
   
   public double getWidth(){
      return this.width;
   }
   
   public double getHeight(){
      return this.height;
   }
} 
