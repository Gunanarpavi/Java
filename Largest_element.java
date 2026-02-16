import java.util.Scanner;
public class Largest_element {
    public static void main(String[] args) {
        int r,c,largest,smallest;
        
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
        largest=a[0][0];
        smallest=a[0][0];
        for(int i=0;i<r;i++)
        {          
            for(int j=0;j<c;j++)
            {
               if(a[i][j]>largest)
               {
                largest=a[i][j];
               }
               if(a[i][j]<smallest)
               {
                smallest=a[i][j];
               }
            }
              
        }
         System.out.println("Largest:"+largest);
                System.out.println("smallest"+smallest);
       
}
}
    
