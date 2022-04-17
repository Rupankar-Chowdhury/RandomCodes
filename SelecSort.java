package practice;
import java.util.Scanner;
public class SelecSort 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=in.nextInt();
        int arr[]=new int[n];       
        for(int j=0;j<n;j++)
        arr[j]=in.nextInt(); 
        //MAIN LOGIC , with comp:  theta(n*n)
            for(int i = 0; i < n-1; i++)
            {
            int min = i;            
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j] < arr[min])
                   min = j;
            }            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            }
for(int j=0;j<n;j++)
System.out.print(arr[j]+" ");    
    }    
}

