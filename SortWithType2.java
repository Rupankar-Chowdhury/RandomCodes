package practice;
import java.util.Scanner;
public class SortWithType2
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
        sort3Type(arr,arr.length);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");                
    }
    //theta(n) and only one traversal of array
    static void sort3Type(int arr[], int n)
    {
        int l=0,h=n-1,mid=0;
        while(mid<=h)
        {
            switch(arr[mid])
            {
                case 0:
                    //swapping arr[l] & arr[mid])
                    int temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;
                    
                    l++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    //swapping arr[h] & arr[mid])
                    temp=arr[h];
                    arr[h]=arr[mid];
                    arr[mid]=temp;
                    
                    h--;
                    break;
            }
        }        
    }
}