package edu.jalc.basketballgoal.rim;

public class RimSizeTest{
   
   public void testGetDiameter(){
      System.out.println("Testing RimSize::getDiameter");
      RimSize size = new RimSize(18, 56.52);
      assert(18 == size.getDiameter());
   }
   
   public void testGetCircumference(){
      System.out.println("Testing RimSize::getCircumference");
      RimSize size = new RimSize(18, 56.52);
      assert(56.52 == size.getCircumference());
   }
   
   public static void main(String[] args){
      RimSizeTest test = new RimSizeTest();
      test.testGetDiameter();
      test.testGetCircumference();
      System.out.println("All tests for RimSize passed");
   }
}