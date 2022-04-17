package practice;
import java.util.Scanner;
public class InsertSort 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=in.nextInt();
        int arr[]=new int[n];       
        for(int j=0;j<n;j++)
        arr[j]=in.nextInt(); 
        //MAIN LOGIC ,
        //comp : General : O(n)
        //Best : theta (n) , Worst : theta (n*n)               
       for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
for(int j=0;j<n;j++)
System.out.print(arr[j]+" ");    
    }    
}



