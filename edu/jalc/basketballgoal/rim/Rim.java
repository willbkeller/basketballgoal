package edu.jalc.basketballgoal.rim;

import edu.jalc.basketballgoal.rim.net.Net;

public class Rim{
   
   private final double diameter;
   private double circumference;
   private final Net net;
   
   private Rim(){
      this.diameter = 0;
      this.circumference = 0;
      this.net = null;
   }
   
   Rim(double diameter, double circumference, Net net){
      this.diameter = diameter;
      this.circumference = circumference;
      this.net = net;
   }
   
   public double getDiameter(){
      return this.diameter;
   }
   
   public double getCircumference(){
      return this.circumference;
   }
   
   public Net getNet(){
      return this.net;
   }
}