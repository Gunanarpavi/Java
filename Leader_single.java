public class Leader_single {
    public static void main(String[] args) {
         int[]a={9,1,17,6,5,4,1};
         int max=a[a.length-1];
         for(int i=a.length-2;i>=0;i--)
         {
            if(a[i]>max)
            {
                System.out.println(a[i]+ " ");
                max=a[i];
            }
         }
    }
    
}
