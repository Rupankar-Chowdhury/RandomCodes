package practice;
import java.util.Scanner;
import java.util.Arrays;
public class ChocolateDistribution 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements : ");
        for(int j=0;j<n;j++)
        arr[j]=in.nextInt();
        System.out.println("Enter value of m : ");
        int m=in.nextInt();        
        System.out.println("Original Array : ");        
        for(int x: arr)
        System.out.print(x+" ");
        System.out.println();        
        System.out.print(" MinDifference : "+minDiff(arr,n,m));               
    }
    static int minDiff(int arr[],int n,int m)
    {
        if(m>n)
            return -1;
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for(int i=0;(i+m-1)<n;i++)
            res=Math.min(res,arr[i+m-1]-arr[i]);
        return res;
    }        
}
