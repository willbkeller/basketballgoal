package edu.jalc.basketballgoal;

import edu.jalc.basketballgoal.backboard.Backboard;
import edu.jalc.basketballgoal.backboard.BackboardSize;
import edu.jalc.basketballgoal.backboard.BasePad;
import edu.jalc.basketballgoal.rim.Rim;
import edu.jalc.basketballgoal.rim.Net;
import edu.jalc.basketballgoal.rim.RimSize;

public class BasketballGoalTest{

   public void testGetHeight(){
      System.out.println("Testing BasketballGoal::getHeight");
      BasketballGoal basketballGoal = new BasketballGoal(10, null, null);
      assert(10 == basketballGoal.getHeight());
   }
   
   public void testGetBackboard(){
      System.out.println("Testing BasketballGoal::getBackboard");
      Backboard backboard = new Backboard(new BackboardSize(8, 5), new BasePad(8.8, 6));
      BasketballGoal basketballgoal = new BasketballGoal(10, backboard, null);
      basketballgoal.setBackboard(backboard);
      assert(backboard == basketballgoal.getBackboard());
   }
   
   public void testGetRim(){
      System.out.println("Testing BasketballGoal::getRim");
      Rim rim = new Rim(new RimSize(18, 56.52), new Net(1.5));
      BasketballGoal basketballgoal = new BasketballGoal(10, null, rim);
      basketballgoal.setRim(rim);
      assert(rim == basketballgoal.getRim());
   }
   
   public static void main(String[] args){
      BasketballGoalTest test = new BasketballGoalTest();
      test.testGetBackboard();
      test.testGetRim();
      System.out.println("All Tests for BasketballGoal Passed");
   }
}