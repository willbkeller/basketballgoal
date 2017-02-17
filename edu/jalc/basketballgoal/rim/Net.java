package edu.jalc.basketballgoal.rim.net;

public class Net{

   private final double length;
   private boolean attached;
   
   Net(){
      this.length = 0.0;
      this.attached = false;
   }
   
   Net(double length){
      this.length = length;
      this.attached = false;
   }
   
   public double getLength(){
      return this.length;
   }
   
   public boolean isAttached(){
      return this.attached;
   }
   
   public Net attach(){
      this.setAttached(true);
      return this;
   }
   
   public Net detach(){
      this.setAttached(false);
      return this;
   }
   
   private void setAttached(boolean attached){
      this.attached = attached;
   }  
}