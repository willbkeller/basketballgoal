package edu.jalc.basketballgoal.backboard;

public class BasePadTest{

   public void testGetLength(){
      System.out.println("Testing BasePad::getLength");
      BasePad pad = new BasePad(8.8, 6);
      assert(8.8 == pad.getLength());
   }
   
   public void testGetWidth(){
      System.out.println("Testing BasePad::getWidth");
      BasePad pad = new BasePad(8.8, 6);
      assert(6 == pad.getWidth());
   }
   
   public static void main(String[] args){
      BasePadTest test = new BasePadTest();
      test.testGetLength();
      test.testGetWidth();
      System.out.println("All tests for BasePad passed");
   }
}