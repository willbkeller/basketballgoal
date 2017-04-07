package edu.jalc.basketballgoal.builder;

import edu.jalc.basketballgoal.BasketballGoal;

public interface BasketballGoalBuilderInterface{

   public String withGlassBackboard();
   public String withWoodenBackboard();
   public String withPlasticBackboard();
   public String withMetalRim();
   public String withPlasticRim();
   public BasketballGoal Build();
}