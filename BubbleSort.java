package practice;

import java.util.Scanner;
public class BubbleSort
{
    public static void main(String args[])
    {
        boolean swapped;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=in.nextInt();
        int a[]=new int[n];       
        for(int j=0;j<n;j++)
            a[j]=in.nextInt();
        //Comp : O(N*N)
        for(int i = 0; i < n; i++)
        {            
            swapped = false;            
            for(int j = 0; j < n - i - 1; j++)
            {
                if( a[j] > a[j + 1])
                {                    // swapping
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
for(int j=0;j<n;j++)
System.out.print(a[j]+" "); 
    }
}


