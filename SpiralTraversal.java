
package practice;
import java.util.Scanner;
public class SpiralTraversal 
{
public static void main(String[] args)
{
        Scanner in=new Scanner(System.in);
        System.out.println("Enter row, column : ");
        int R=in.nextInt();
        int C=in.nextInt();
        int mat[][]=new int[R][C];
        for(int i=0;i<R;i++)
        {for(int j=0;j<C;j++)
            mat[i][j]=in.nextInt();}
        SpiralTraversal ob=new SpiralTraversal();
        System.out.println("The matrix :: ");
        for(int i=0;i<R;i++)
        {for(int j=0;j<C;j++)
            System.out.print(mat[i][j]+" ");
        System.out.println();}
        ob.printSpiral(mat, R, C);        
}
void printSpiral(int mat[][], int R, int C)
{
    int top = 0, left = 0, bottom = R - 1, right = C - 1;
    while(top <= bottom && left <= right)
    {
        for(int i = left; i <= right; i++)
        System.out.print(mat[top][i] + " ");
        top++;
        
        for(int i = top; i <= bottom; i++)
        System.out.print(mat[i][right] + " ");
        right--;
        
        if(top <= bottom)
        {
        for(int i = right; i >= left; i--)
        System.out.print(mat[bottom][i] + " ");
        bottom--;
        }

        if(left <= right){
        for(int i = bottom; i >= top; i--)
        System.out.print(mat[i][left] + " ");
        left++;
        }			
    }
}
}