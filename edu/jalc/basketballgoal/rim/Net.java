package edu.jalc.basketballgoal.rim;

public class Net{

   private final double length;
   
   private Net(){
      this.length = 0.0;
   }
   
   public Net(double length){
      this.length = length;
   }
   
   public double getLength(){
      return this.length;
   }  
}