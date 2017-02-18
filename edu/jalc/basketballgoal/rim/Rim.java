package edu.jalc.basketballgoal.rim;

import edu.jalc.basketballgoal.rim.Net;
import edu.jalc.basketballgoal.rim.RimSize;

public class Rim{
   
   private RimSize size;
   private Net net;
   
   private Rim(){
      this.size = null;
      this.net = null;
   }
   
   public Rim(RimSize size, Net net){
      this.size = size;
      this.net = net;
   }
   
   public RimSize getSize(){
      return this.size;
   }
   
   public Net getNet(){
      return this.net;
   }
   
   Rim setSize(RimSize size){
      this.size = size;
      return this;
   }
   
   Rim setNet(Net net){
      this.net = net;
      return this;
   }
}