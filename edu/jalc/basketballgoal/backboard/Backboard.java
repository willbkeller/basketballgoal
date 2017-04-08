package edu.jalc.basketballgoal.backboard;

import edu.jalc.basketballgoal.backboard.BasePad;
import edu.jalc.basketballgoal.backboard.BackboardSize;
import edu.jalc.basketballgoal.interfaces.Breakable;
import edu.jalc.basketballgoal.interfaces.Buzzable;

public class Backboard{

   private BackboardSize size;
   private BasePad pad;
   
   Backboard(){
      this.size = null;
      this.pad = null;
   }
   
   public Backboard(BackboardSize size, BasePad pad){
      this.size = size;
      this.pad = pad;
   }
   
   public BackboardSize getSize(){
      return this.size;
   }
   
   public BasePad getPad(){
      return this.pad;
   }
   
   Backboard setSize(BackboardSize size){
      this.size = size;
      return this;
   }
   
   Backboard setPad(BasePad pad){
      this.pad = pad;
      return this;
   }
   
   public void breaks(){
      System.out.println("Shattered the Backboard");
   }
   
   public void buzz(){
      System.out.println("Backboard buzzes at the end of the half");
   }
} 
