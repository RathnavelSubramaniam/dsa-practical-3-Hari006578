import java.util.*;
public class secondLargest
{
public static void main(String args[]) 
{
System.out.println("PROGRAM FOR FINDING THE SECOND HIGHEST NUMBER IN AN ARRAY");
System.out.println("\nENTER THE SIZE OF THE ARRAY");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
for (int i = 0; i< n; i++) 
{
arr[i] = sc.nextInt();
}
int secondLargest = findSecondLargest(arr);
System.out.println("The Second Highest Number is "+ secondLargest);
}
static int findSecondLargest(int[]arr)
{
int max=Integer.MIN_VALUE;
int secondMax=Integer.MIN_VALUE;
for(int num:arr){
    if(num>max){
            secondMax=max;
                    max=num;
                              
                                  }
                                      else if(num>secondMax && num<max)
                                          {
                                                  secondMax=num;
                                                      }
                                                      }
                                                      return secondMax;
                                                      }
                                                      }





































































































































































