 import java.util.Scanner;
 public class Max_row {
    public static void main(String[] args) {
        int r,c,sum,large,row;
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
        large=0;
        row=0;
        for(int i=0;i<r;i++)
        {   
            sum=0;         
            for(int j=0;j<c;j++)
            {
               sum+=a[i][j];
            }
            if(sum>large)
            {
                large=sum;
                row=i;
            }
        }
        
       System.out.println("Maximum sum of rows:"+large);
           System.out.println("row:"+row);
}
}
