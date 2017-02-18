package edu.jalc.basketballgoal.rim;

public class RimTest{
   
   public void testSetSize(){
      System.out.println("Testing Rim::setSize");
      RimSize size = new RimSize(18, 56.52);
      Rim rim = new Rim(size, null);
      rim.setSize(size);
      assert(size == rim.getSize());
   }
   
   public void testSetNet(){
      System.out.println("Testing Rim::setNet");
      Net net = new Net(1.5);
      Rim rim = new Rim(null, net);
      rim.setNet(net);
      assert(net == rim.getNet());
   }
   
   public static void main(String[] args){
      RimTest test = new RimTest();
      test.testSetSize();
      test.testSetNet();
      System.out.println("All tests for Rim passed");
   }
}