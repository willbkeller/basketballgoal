package edu.jalc.basketballgoal.rim;

import edu.jalc.basketballgoal.rim.Net;
import edu.jalc.basketballgoal.rim.RimSize;
import edu.jalc.basketballgoal.interfaces.Breakable;
import edu.jalc.basketballgoal.interfaces.Bendable;

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
   
   public void breaks(){
      System.out.println("Rim breaks off of the goal");
   }
   
   public void bend(){
      System.out.println("The rim is bent");
   }
}