public class Delete {
    public static void main(String[] args) {
        int[]a={9,1,17,6,5,4,1};
        int pos=4;
        int n=a.length;
        for (int i=pos;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        n=n-1;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    
}
