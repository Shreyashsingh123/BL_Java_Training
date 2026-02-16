//package org.example.services;
//
//import org.junit.*;
//import org.junit.rules.Timeout;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
////till line 60 all is about Junit 4version
////    to execute anything before all test cases we use this annotation
//@BeforeClass
//public static void init(){
////    class level hote h ye
//    System.out.println("Before all test cases");
//    System.out.println("Execution date is"+new Date());
//}
////to execute anything after all test cases checked
//@AfterClass
//public static void cleanup(){
//    System.out.println("After all test cases");
//    System.out.println("Test case ended  at :"+new Date());
//}
//int c=0;
//@Before
//public void BeforeEach(){
//    System.out.println("New test case started");
//    c=0;
//}
//
//    @Test
//    public void sumTwoNumbersTest(){
//        System.out.println("Test case for sumTwoNumbers");
//        for(int i=0;i<25;i++){
//            c+=i;
//        }
//        System.out.println("Count is "+c);
//        int result=CalculatorService.sumTwoNumbers(25,15);
//        int expected=40;
//        Assert.assertEquals(expected,result);
//    }
//    @Test
//    public void sumanyNumbersTest(){
//        System.out.println("Test case for sumAnyNumbers");
//        for(int i=0;i<50;i++){
//            c+=i;
//        }
//        System.out.println("Count is "+c);
//        int res=CalculatorService.sumAnyNumbers(2,5,6,4,5,6);
//        int exp=28;
//        Assert.assertEquals(exp,res);
//    }
//    @Test (timeout=2000)
////    @test (timeout=2000)means this programme will take 2 sec to execute if more than that time is taken then test case failed
//    public void divideTwoNumbersTest() throws InterruptedException{
//    Thread.sleep(3000);
////    program will start after 3sec
//        System.out.println("Test for divide two numbers");
//        double res=CalculatorService.DivideTwoNumbers(25,5);
//        double exp=5.0;
//        Assert.assertEquals(exp,res,0.0);
//
//    }
//
//}
//@Ignore is used to ignore that test case