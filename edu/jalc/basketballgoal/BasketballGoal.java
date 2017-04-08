package edu.jalc.basketballgoal;

import edu.jalc.basketballgoal.backboard.Backboard;
import edu.jalc.basketballgoal.rim.Rim;
import edu.jalc.basketballgoal.interfaces.Moveable;
import edu.jalc.basketballgoal.interfaces.Extendable;

public class BasketballGoal{

   private final int height;
   private Backboard backboard;
   private Rim rim;
   
   private BasketballGoal(){
      this.height = 0;
      this.backboard = null;
      this.rim = null;
   }
   
   public BasketballGoal(int height, Backboard backboard, Rim rim){
      this.height = height;
      this.setBackboard(backboard);
      this.setRim(rim);
   }
   
   int getHeight(){
      return height;
   }
   
   Backboard getBackboard(){
      return this.backboard;
   }
   
   Rim getRim(){
      return this.rim;
   }
   
   BasketballGoal setBackboard(Backboard backboard){
      this.backboard = backboard;
      return this;
   }
   
   BasketballGoal setRim(Rim rim){
      this.rim = rim;
      return this;
   }
   
   public void move(){
      System.out.println("Moved the Basketball Goal");
   }
   
   public void extend(int height){
      System.out.println("Extended the Basketball Goal to " + height + " feet");
   }
}