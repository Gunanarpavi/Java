public class Reverse {
     public static void main(String[]args){
        int start,end;
        int []a={10,3,4,-9,6,5};
        System.out.print("ORDER ");
         for(int i=0;i<a.length;i++)
                {
                    
                  System.out.print(a[i]+"  ");
                }
                System.out.println();

        start=0;
        end=a.length-1;
        while(start<end){
            int temp=a[end];
             a[end]=a[start];
            a[start]=temp;
            start+=1;
            end-=1;
        }
        System.out.print("REVERSE ORDER ");
         for(int i=0;i<a.length;i++)
                {
                    
                  System.out.print(a[i]+"  ");
                }

    
}
}
