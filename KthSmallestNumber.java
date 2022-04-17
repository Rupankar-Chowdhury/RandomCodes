package practice;
import java.util.Scanner;
public class KthSmallestNumber 
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
        System.out.println("Enter value of k : "); 
        int k=in.nextInt();
        int f = kthSmallest(arr,n,k);
        System.out.println(arr[f]+" is the Kth smallest element. ");        
    }
    static int kthSmallest(int arr[],int n,int k)
    {
        int l=0,r=n-1;        
        while(l<=r)
        {
        int p=lPartition(arr,l,r);            
            if(p==k-1)
                return p;
            else if(p>k-1 )
                r=p-1;
            else
                l=p+1;
        }
        return -1;
    }            
    static int lPartition(int arr[], int l, int h)
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

    

