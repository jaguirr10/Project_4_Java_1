//Java Program       rationalNumber.java
//Course             CSE 1301J -002
//Name:              Juan Aguirre      
//Assignment#:        Project 4 
//Due Date:           11/11/2014
// purpose:     create a program that adds, subtracts, divideds and multiplies to rational numbers using a set of methods in the rational number class

public class Driver
{
   public static void main(String [] args)
   {

      rationalNumber a = new rationalNumber(3,-5);
      rationalNumber b = new rationalNumber(2,1);
     
      
                 
      rationalNumber c = a.add(b);
      c.reduce();
      System.out.println(a + " + " +  b + " is " + c );
     
     c = a.subtract(b);
        c.reduce();
      System.out.println(a + " - " + b + " is " + c);
      
     c = a.multiplication(b);
      c.reduce();
      System.out.println(a + " x " + b + " is " + c);
      
     c = a.division(b);
      c.reduce();
      System.out.println(a + " / " + b + " is " + c);
      
      c = a.negate();
      System.out.println(a + " negated is " + c);
      
      if (a.equals(b))
     System.out.println (a + " is equal to " + b);
else 
    
     System.out.println (a + " not equal to " + b);
    
    if (a.greaterthanorequal(b))
     System.out.println (a + " is greater than  equal to " + b);
else 
    
    System.out.println (a + " is less than or equal to " + b);

    
     System.out.println ("coded by Juan Aguirre");
   }
 }

      
