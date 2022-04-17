package practice;
import java.util.Scanner;
public class NaivePartition 
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
        System.out.println("Enter partition index : ");
        int p=in.nextInt();
        partition(arr,0,n-1,p);
        for(int x: arr)
        System.out.print(x+" ");        
    }
    static void partition(int arr[], int l, int h, int p)
    {
        int[] temp=new int[h-l+1];int index=0;
        
        for(int i=l;i<=h;i++)
            if(arr[i]<=arr[p] && i!= p)
                {
                    temp[index++]=arr[i];
                }
        
        temp[index++] = arr[p];
        
        for(int i=l;i<=h;i++)
            if(arr[i]>arr[p])
                {
                    temp[index++]=arr[i];
                }
        
        for(int i=l;i<=h;i++)
            arr[i]=temp[i-l];
    }   
}
