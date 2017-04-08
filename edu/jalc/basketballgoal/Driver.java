package edu.jalc.basketballgoal;

import edu.jalc.basketballgoal.backboard.Backboard;
import edu.jalc.basketballgoal.rim.Rim;

public class Driver{

   public static void main(String[] args){
   
      BasketballGoal goal = new BasketballGoal(10, null, null);
      Backboard backboard = new Backboard(null, null);
      Rim rim = new Rim(null, null);
      
      goal.extend(10);
      goal.move();
      backboard.breaks();
      backboard.buzz();
      rim.breaks();
      rim.bend();
      
   }
}