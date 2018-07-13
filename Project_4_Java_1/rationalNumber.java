//Java Program       rationalNumber.java
//Course             CSE 1301J -002
//Name:              Juan Aguirre      
//Assignment#:        Project 4 
//Due Date:           11/11/2014

public class rationalNumber
{
   private int num;
   private int denom;
   public rationalNumber()
   {
      num = 0;
      denom = 1;
   }
   public rationalNumber(int n, int d)
   {
      num = n;
      setDenom( d);
   }
   public int getNum()
   {  
      return num;
   }
   public int getDenom()
   {
      return denom;
   }
   public void setNum( int n )
   {
      num = n;
   }
   public void setDenom( int d )
   {
      if (d <0)
      {
         num = -1 * num;  
         denom = -1 *d;
      }
      else if (d==0)
         denom = 1;
      else
         denom = d;
   }
   public String toString()
   {
      return num + "/" + denom;
   }
   public boolean notequals( rationalNumber other)
   {
      if(num * other.denom != denom * other.num)
         return true;
      else
         return false;
   }
   public boolean equals( rationalNumber other)
   {
      if(num * other.denom == denom * other.num)
         return true;
      else
         return false;
   }
   public rationalNumber add(rationalNumber other)
   {
      int newnum = num*other.denom + denom*other.num;
      int newdenom = denom * other.denom;
      rationalNumber temp = new rationalNumber(newnum,newdenom);
      return temp;
   }
   public rationalNumber subtract( rationalNumber other)
   {
      int newnum = num*other.denom - denom*other.num;
      int newdenom = denom * other.denom;
      rationalNumber temp = new rationalNumber(newnum,newdenom);
      return temp;
   }
   public rationalNumber multiplication( rationalNumber other)
   {
      int newnum = num * other.num;
      int newdenom = denom * other.denom;
      rationalNumber temp = new rationalNumber(newnum,newdenom);
      return temp;
   }
   public rationalNumber division( rationalNumber other)
   { 
      int newnum = num * other.denom;
      int newdenom = other.num * denom; 
      rationalNumber temp = new rationalNumber(newnum,newdenom);
      return temp;
   }
   public rationalNumber negate()
   {
      int newnum = num * -1;
      int newdenom = denom;
      rationalNumber temp = new rationalNumber(newnum, newdenom);
      return temp;
   }
   public boolean lessthan ( rationalNumber other)
   {
      return (num * other.denom <  denom * other.num);
   }

   public boolean notequal ( rationalNumber other)
   {
      return (num * other.denom !=  denom * other.num);
   }

   public boolean equal ( rationalNumber other)
   {
      return (num * other.denom ==  denom * other.num);
   }
   public boolean greaterthan (rationalNumber other)
   {
      return (num * other.denom > denom * other.num);
   }
   public boolean lessthanorequal ( rationalNumber other)
   {
      return (num * other.denom <= denom * other.num);
   }
   public boolean greaterthanorequal ( rationalNumber other)
   {
      return (num * other.denom >= denom * other.num);
   }
   public rationalNumber reduce()
   {
      if (num !=0)
      
      {
         int common = gcd(Math.abs(num),denom);
         num = num/ common;
         denom = denom/ common;
      }
      return new rationalNumber(num,denom);
   }
  
   public int gcd (int n, int d)
   {
      while(n != d)
      {  
         if(n> d)
            n = n-d;
         else
            d = d-n;
      }
      return n;
       
   }
}  
