package org.example.services;
//JUNIT 5

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {
//to execute any logic before test cases we use beforeall annotation
@BeforeAll
//instead of beforeclass we use beforeall in junit 5

    public static void init(){
    System.out.println("This is singletime logic");
    }

@AfterAll
//executes after all test cases passed or failed
public static void cleanup(){
    System.out.println("Test case executed! programme ended");
}

//executes after each test case
@AfterEach
public void aftereach()
{
    System.out.println(" after each test case");
}


//    executes before each test case
@BeforeEach
public void beforeeach(){
    System.out.println("Before  each test case");
}

@DisplayName("hello display")

    @Test
public void AddTwoNumbersTest(){
int res=CalculatorService.sumTwoNumbers(20,30);
int exp=50;
Assertions.assertEquals(exp,res);
        System.out.println("first test case passed");
}
@Test
public void addAnyNumbers(){
int res=CalculatorService.sumAnyNumbers(20,30,10);
 int exp=60;
 Assertions.assertEquals(exp,res,"faild test case");
//if fails then msg print after error
    System.out.println("Second test case passed");
}
}

//@Disabled is to ignore that test case
//@Tag is for ading tag to method
//@Nested tells that this class is  a nested class(class inside another class )
//@Testfactory is used to mark a method testfactory



