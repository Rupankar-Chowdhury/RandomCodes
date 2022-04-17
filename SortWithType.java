package practice;
import java.util.Scanner;
public class SortWithType
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements : ");
        for(int j=0;j<n;j++)
        arr[j]=in.nextInt();
        // last index partition assumed
        /*
        System.out.println("Enter partition index : ");
        int p=in.nextInt();
        */
        lPartition(arr,0,0);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");                
    }
    //O(n)
    static int lPartition(int arr[], int l, int h)
    {   
        int pivot=h;
        int i=l-1;
        for(int j=l;j<arr.length;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return -1;
    }   
}