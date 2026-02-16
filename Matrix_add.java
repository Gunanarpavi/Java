  import java.util.Scanner;
  public class Matrix_add {
    public static void main(String[] args) {
        int r,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r");
        r=in.nextInt();
        System.out.println("Enter c");
        c=in.nextInt();
        int[][]a=new int[r][c];
         int[][]b=new int[r][c];
        System.out.println("Enter elements of 1st matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        System.out.println("ADDITION");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }



    }
    
}


