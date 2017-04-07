package edu.jalc.basketballgoal.builder;

import java.util.ArrayList;
import edu.jalc.basketballgoal.BasketballGoal;

public class Builder{

   public static void main (String[] args){
   
      ArrayList<String> build = new ArrayList<>();
      
      BasketballGoalBuilder builder = new BasketballGoalBuilder();
      
      build.add(builder.withGlassBackboard());
      build.add(builder.withMetalRim());
      
      System.out.println("Basketball Goal:");
      
      for(String b : build){
         System.out.println(b);
      }
     
   }
}
      