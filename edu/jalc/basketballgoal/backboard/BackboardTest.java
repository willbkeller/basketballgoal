package edu.jalc.basketballgoal.backboard;

public class BackboardTest{
   
   public void testSetSize(){
      System.out.println("Testing Backboard::getSize");
      BackboardSize size = new BackboardSize(8, 5);
      Backboard backboard = new Backboard(size, null);
      backboard.setSize(size);
      assert(size == backboard.getSize());
   }

   public void testSetPad(){
      System.out.println("Testing Backboard::getPad");
      BasePad pad = new BasePad(8.8, 6);
      Backboard backboard = new Backboard(null, pad);
      backboard.setPad(pad);
      assert(pad == backboard.getPad());
   } 
   
   public static void main(String[] args){
      BackboardTest test = new BackboardTest();
      test.testSetSize();
      test.testSetPad();
      System.out.println("All tests for Backboard passed");
   }  
}
      