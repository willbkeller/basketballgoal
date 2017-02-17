package edu.jalc.basketballgoal.backboard;

import edu.jalc.basketballgoal.backboard.BackboardPad;
import edu.jalc.basketballgoal.backboard.BackboardSize;

public class Backboard{

   private final BackboardSize size;
   private final BackboardPad pad;
   
   private Backboard(){
      this.size = null;
      this.pad = null;
   }
   
   Backboard(BackboardSize size, BackboardPad pad){
      this.size = size;
      this.pad = pad;
   }
   
   public BackboardSize getSize(){
      return this.size;
   }
   
   public BackboardPad getPad(){
      return this.pad;
   }
} 
