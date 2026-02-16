import java.util.Scanner;
public class Transfer_rows {
   public static void main(String[] args) {
        int r,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r");
        r=in.nextInt();
        System.out.println("Enter c");
        c=in.nextInt();
        int[][]a=new int[r][c];
        System.out.println("Enter elements");
        for(int i=0;i<r;i++)
        {           
             for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
               
            }
        }  
        for(int j=0;j<a.length;j++)
        {
            int temp=a[0][j];
            a[0][j]=a[a.length-1][j];
            a[a.length-1][j]=temp;

        }
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
}
}
