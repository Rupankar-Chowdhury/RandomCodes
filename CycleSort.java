package practice;
import java.util.Scanner;
public class CycleSort 
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
        cycleSortDistinct(arr, n); 
  
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
        
    }    
    static void cycleSortDistinct(int arr[], int n) 
    { 
        for(int cs=0;cs<n-1;cs++)
        {
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++)
            {
                if(arr[i]<item)
                  pos++;
            }
            //swap(item,arr[pos])           
            int temp=item;
            item=arr[pos];
            arr[pos]=temp;
            
            while(pos!=cs)
            {
                pos=cs;
                for(int i=cs+1;i<n;i++)
                {
                    if(arr[i]<item)
                      pos++;
                }       
                //swap(item,arr[pos])
                temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }
        }
    }
}
    

        
  
