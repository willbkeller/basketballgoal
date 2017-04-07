package edu.jalc.basketballgoal.builder;

import edu.jalc.basketballgoal.BasketballGoal;

public class BasketballGoalBuilder implements BasketballGoalBuilderInterface{

   private BasketballGoal basketballGoal;
   
   public BasketballGoalBuilder(){
   
      this.basketballGoal = new BasketballGoal(0,null, null);   
   }
   
   public String withGlassBackboard(){
      return "with Glass Backboard";
   }
   public String withWoodenBackboard(){
      return "with Wooden Backboard";
   }
   public String withPlasticBackboard(){
      return "with Plastic Backboard";
   }
   public String withMetalRim(){
      return "with Metal Rim";   
   }
   public String withPlasticRim(){
      return "with Plastic Rim";
   }
   public BasketballGoal Build(){
      return this.basketballGoal;
   }
      

}