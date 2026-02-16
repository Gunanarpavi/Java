public class Merge_array {
    public static void main(String[] args) {
         int[]a={10,3,4,5,-9,6};
          int[]b={2,1,3,5,-9,6};
          int[]c=new int[a.length+b.length];
          for(int i=0;i<a.length;i++){
            c[i]=a[i];
          }
          for(int j=0;j<a.length;j++){
            c[a.length+j]=b[j];
          }
          for(int k=0;k<c.length;k++)
          {
            System.out.print(c[k]+" ");
          }
            }
    
}

