package practice;

import java.util.Scanner;

class MergeSort
{
    public static void main (String[] args) 
    {
        // array input
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=in.nextInt();
        int l=0;
        int r=n-1;
        int a[]=new int[n];       
        for(int j=0;j<n;j++)
        a[j]=in.nextInt();
        
        // merge function call
        mergeSort(a,l,r);
    	for(int x: a)
	        System.out.print(x+" ");
    }
    
    // MAIN merge function
    //comp : O(nlog(n))
    static void merge(int arr[], int l, int m, int h)
    {    
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        //Left array creation : 
            for(int i=0;i<n1;i++)
                left[i]=arr[i+l];
        //Right array creation : 
            for(int j=0;j<n2;j++)
                right[j]=arr[m+1+j]; 
        //Array compare and merge
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        //Extra remaining elements entry into merged and sorted array
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];    
    }
    
    // recursive left right array build and merge call
    // Aux space : O(n)
    static void mergeSort(int arr[],int l,int r)
    {
        if(r>l)
        {
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
}