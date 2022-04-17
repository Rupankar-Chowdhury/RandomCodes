package practice;

import java.util.Scanner;
public class BoundaryTraversal {
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
        for(int i=0;i<R;i++)
        {for(int j=0;j<C;j++)
            System.out.print(mat[i][j]+" ");
        System.out.println();}

		if(R == 1)//corner case 1
		{
                for(int i = 0; i < C; i++)
		System.out.print(mat[0][i] + " ");
		}
		else if(C == 1)// corner case 2
		{
                for(int i = 0; i < R; i++)
		System.out.print(mat[i][0] + " ");
		}
		else
		{
		for(int i = 0; i < C; i++)
                    System.out.print(mat[0][i] + " ");
		for(int i = 1; i < R; i++)
                    System.out.print(mat[i][C - 1] + " ");
		for(int i = C - 2; i >= 0; i--)
                    System.out.print(mat[R - 1][i] + " ");
                for(int i = R - 2; i >= 1; i--)
                    System.out.print(mat[i][0] + " ");
		}	       
}
}
    

