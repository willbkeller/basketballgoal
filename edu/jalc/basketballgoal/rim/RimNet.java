package edu.jalc.basketballgoal.rim;

public class RimNet{

   private final double length;
   private boolean attached;
   
   RimNet(){
      this.length = 0.0;
      this.attached = false;
   }
   
   RimNet(double length){
      this.length = length;
      this.attached = false;
   }
   
   public double getLength(){
      return this.length;
   }
   
   public boolean isAttached(){
      return this.attached;
   }
   
   public RimNet attach(){
      this.setAttached(true);
      return this;
   }
   
   public RimNet detach(){
      this.setAttached(false);
      return this;
   }
   
   private void setAttached(boolean attached){
      this.attached = attached;
   }  
}