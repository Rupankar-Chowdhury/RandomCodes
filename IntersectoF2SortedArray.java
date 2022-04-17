package practice;

import java.util.Scanner;
public class IntersectoF2SortedArray
{
    public static void main(String[] args)
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
        System.out.println("Intersection of 2 arrays : ");    
    int m1 = a.length;
    int n1 = b.length;
    intersection(a,b,m1,n1);        
    }
    // complexity : theta(m+n)
    static void intersection(int a[], int b[], int m, int n)
    {
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(i>0 && a[i-1]==a[i])
            {
                i++;
                continue;
            }
            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                j++;
            else
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }   
    }
}

        
        
    

