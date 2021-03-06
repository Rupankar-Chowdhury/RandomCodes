package practice;

import java.util.Scanner;
public class CountInversionsInArray
{
    public static void main(String[] args)
    {   Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of elements for first array : ");
        int m=in.nextInt();
        System.out.println("Enter elements : ");        
        int a[]=new int[m];       
        for(int j=0;j<m;j++)
        a[j]=in.nextInt();
	    System.out.print(countInv(a,0,m-1));   
    }
    // Aux space : O(n)
    static int countInv(int arr[], int l, int r)
    {
        int res = 0;
        if (l<r) 
        {            
            int m = (r + l) / 2;   
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m , r);
        }
        return res;
    }
    
    //comp : O(nlog(n))
    static int countAndMerge(int arr[], int l, int m, int r)
    {
        int n1=m-l+1, n2=r-m;
        int[] left=new int[n1];int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            arr[k++]=left[i++];
            else
            {
                arr[k++]=right[j++];
                res=res+(n1-i);
            }
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
        return res;
    }
}    
