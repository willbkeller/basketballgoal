package edu.jalc.basketballgoal.rim;

import edu.jalc.basketballgoal.rim.RimNet;
import edu.jalc.basketballgoal.rim.RimSize;

public class Rim{
   
   private final RimSize size;
   private final RimNet net;
   
   private Rim(){
      this.size = null;
      this.net = null;
   }
   
   Rim(RimSize size, RimNet net){
      this.size = size;
      this.net = net;
   }
   
   public RimSize getSize(){
      return this.size;
   }
   
   public RimNet getNet(){
      return this.net;
   }
}