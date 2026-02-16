     import java.util.Scanner;
     public class Matrix_Multiplication {
     public static void main(String[] args) {
        int r1,r2,c1,c2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r1");
        r1=in.nextInt();
        System.out.println("Enter c1");
        c1=in.nextInt();
        System.out.println("Enter r2");
        r2=in.nextInt();
        System.out.println("Enter c2");
        c2=in.nextInt();
        int[][]a=new int[r1][c1];
         int[][]b=new int[r2][c2];
         int[][]c=new int[r1][c2];
        System.out.println("Enter elements of 1st matrix");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        if(c1==r2){
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];   
                    }             
                }
            }
        }
         System.out.println("Matrix multiplication");
            for(int i=0;i<r1;i++){
               for(int j=0;j<c2;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
                
            }
        }
     
