package edu.jalc.basketballgoal.backboard;

import edu.jalc.basketballgoal.backboard.foampad.FoamPad;

public class Backboard{

   private final double width;
   private final double height;
   private final FoamPad foamPad;
   
   private Backboard(){
      this.width = 0;
      this.height = 0;
      this.foamPad = null;
   }
   
   Backboard(double width, double height, FoamPad foamPad){
      this.width = width;
      this.height = height;
      this.foamPad = foamPad;
   }
   
   public double getWidth(){
      return this.width;
   }
   
   public double getHeight(){
      return this.height;
   }
   
   public FoamPad getFoamPad(){
      return this.foamPad;
   }
} 
