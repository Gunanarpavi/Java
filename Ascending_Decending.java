public class Ascending_Decending {
    public static void main(String[]args){
        int temp;
        int []a={10,3,4,-9,6,5};
        for (int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                   temp =a[i];
                a[i]=a[j];
                a[j]=temp;
                }
                }        }
            System.out.println("Ascending order");
                for(int i=0;i<a.length;i++)
                {
                 
                 System.out.print(a[i]+" ");
                }
                System.out.println();
                 for (int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                   temp =a[i];
                a[i]=a[j];
                a[j]=temp;
                }
                }        }
                System.out.println("Descending order"); 
            
                for(int i=0;i<a.length;i++)
                {
                    
                  System.out.print(a[i]+"  ");
                }
}

            
    
}

