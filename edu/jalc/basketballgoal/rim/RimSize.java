package edu.jalc.basketballgoal.rim;

public class RimSize{
   
   private final double diameter;
   private final double circumference;
   
   private RimSize(){
      this.diameter = 0;
      this.circumference = 0;
   }
   
   public RimSize(double diameter, double circumference){
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