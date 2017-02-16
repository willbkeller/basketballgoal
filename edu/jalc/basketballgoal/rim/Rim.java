package edu.jalc.basketballgoal.rim;

public class Rim{
   
   private final double diameter;
   private double circumference;
   
   private Rim(){
      this.diameter = 0;
      this.circumference = 0;
   }
   
   Rim(double diameter, double circumference){
      this.diameter = diameter;
      this.circumference = circumference;
   }
   
   public double getDiameter(){
      return this.diameter;
   }
   
   public double getCircumference(){
      return this.circumference;
   }
}