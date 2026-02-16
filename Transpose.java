import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        int r,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r");
        r=in.nextInt();
        System.out.println("Enter c");
        c=in.nextInt();
        int[][]a=new int[r][c];
        int[][]b=new int[c][r];
        System.out.println("Enter elements");
        for(int i=0;i<r;i++)
        {           
             for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
               
            }
        }
        for(int j=0;j<c;j++)
        {          
            for(int i=0;i<r;i++)
            {
                b[j][i]=a[i][j];
            }
        } 
        System.out.println("Matrix:");
        for(int i=0;i<r;i++)
        {          
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose nMatrix:");
        for(int i=0;i<c;i++)
        {          
            for(int j=0;j<r;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
       
}
}

