package practice;
import java.util.Scanner;
public class LomutoPartition 
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
        new LomutoPartition().iPartition(arr,0,n-1);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");                
    }
    //O(n)
    int iPartition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }   
}