 import java.util.Scanner;
 public class Jaggel {
   public static void main(String[] args) {
        int r,c;
        int[][]a=new int[3][];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r");
        r=in.nextInt();
       for(int i=0;i<r;i++)
        {
        System.out.println("Enter c");
        c=in.nextInt();
         System.out.println("Enter elements");
        a[i]=new int[c];
         for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
         System.out.println("Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<a[i].length;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
           
        }
    
}
