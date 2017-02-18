package edu.jalc.basketballgoal.rim;

public class NetTest{
   
   public void testGetLength(){
      System.out.println("Testing Net::getLength");
      Net net = new Net(1.5);
      assert(1.5 == net.getLength());
   }

   public static void main(String[] args)throws Exception{
      NetTest test = new NetTest();
      test.testGetLength();
      System.out.println("All tests for RimNet passed");
   }
}