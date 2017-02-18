package edu.jalc.basketballgoal.backboard;

public class BackboardSizeTest{

   public void testGetWidth(){
      System.out.println("Testing BackboardSize::getWidth");
      BackboardSize size = new BackboardSize(8, 5);
      assert(8 == size.getWidth());
   }
   
   public void testGetHeight(){
      System.out.println("Testing BackboardSize::getHeight");
      BackboardSize size = new BackboardSize(8, 5);
      assert(5 == size.getHeight());
   }
   
   public static void main(String[] args){
      BackboardSizeTest test = new BackboardSizeTest();
      test.testGetWidth();
      test.testGetHeight();
      System.out.println("All tests for BackboardSize passed");
   }
}