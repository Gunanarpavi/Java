 import java.util.Scanner;
public class Sum_all_elements_array {
    public static void main(String[] args) {
        int r,c,sum;
        sum=0;
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
                sum+=a[i][j];
            }
        }
        
        System.out.println("Sum"+sum);
}
}
