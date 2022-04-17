package practice;
import java.util.Scanner;
public class QuickSortUsingHoareP 
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
        qSort(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    // theta(n.logn) average case
    static int Hpartition(int arr[], int l, int h)
    {   
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true)
        {
            do
            {
                i++;
            }while(arr[i]<pivot);
            
            do
            {
                j--;
            }while(arr[j]>pivot);
            
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }    
    static void qSort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int p=Hpartition(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
        }
    }
}