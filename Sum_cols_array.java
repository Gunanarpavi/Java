import java.util.Scanner;
public class Sum_cols_array {
     public static void main(String[] args) {
        int r,c,sum;
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
        for(int j=0;j<c;j++)
        {   
            sum=0;         
            for(int i=0;i<r;i++)
            {
               sum+=a[i][j];
            }
               System.out.println("sum: "+sum);
        }
        
       
}
}



