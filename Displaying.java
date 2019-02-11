/* This is a program to display numbers in the folloeing format.
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4 
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 * 1 2 3 4 5 6 7
 */


class Displaying
{
 public static void main(String args[])
 { 
  System.out.println();
  System.out.println("Starting Display..");
  for(int i=1;i<8;i++)
  {
   System.out.println();
   for(int j=1;j<=i;j++)
   {
    System.out.print("  ");
    System.out.print(j);
   }
  }
  System.out.print("\n \n");
  System.out.println("Display done..");
 }
}
  