package practice;
import java.util.Scanner;
public class Merge2SortedArray 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of elements for first array : ");
        int m=in.nextInt();
        System.out.println("Enter elements : ");        
        int a[]=new int[m];       
            for(int j=0;j<m;j++)
            a[j]=in.nextInt(); 
        System.out.println("Enter no. of elements for second array : ");
         int n=in.nextInt();
        System.out.println("Enter elements : ");        
         int b[]=new int[n];       
            for(int j=0;j<n;j++)
            b[j]=in.nextInt(); 
        System.out.println("Merge Sorted array : ");             
        //MAIN LOGIC : the actual merging algorithm
        //comp : theta(m+n)
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(a[i]<b[j])
                System.out.print(a[i++]+" ");
            else
                System.out.print(b[j++]+" ");
        }
        while(i<m)
            System.out.print(a[i++]+" ");
        while(j<n)
            System.out.print(b[j++]+" ");            
    }    
}
