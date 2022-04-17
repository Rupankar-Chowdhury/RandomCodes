package practice;
import java.util.Random;
public class Fun 
{
    public static void main(String[] args)
    {
        int n=10000;
        int arr[]=new int[n];
        for (int i = 0; i < n; i++)
        {
        arr[i] = new Random().nextInt(n);
        System.out.println(arr[i]+" ");
        }        
    }    
}
