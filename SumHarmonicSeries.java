/* This is a program to calculate sum of harmonic series */


import java.util.Scanner;

class SumHarmonicSeries
{
 public static void main(String args[])
 {

  try
  {
   Scanner in = new Scanner(System.in);
 
   int n =0;
   double sum =0;
   
   System.out.print("\n \n \n");
   System.out.print(" Please enter the number : ");
   
   n = in.nextInt() ;
  
   in.close();

   System.out.print("\n");
   System.out.println (" The nuber you have enterd is :" + n);

   for( double i=1; i<=n; i++)
   {
     sum = sum + (1/i);
    }
   
   System.out.println(" Sum of Harmonic Series =" + sum);
   }
  
   catch(Exception e)
   {
    e.printStackTrace();
   }
 }
}