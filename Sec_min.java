public class Sec_min {
    public static void main(String[]args){
        int[]a={-11,3,4,5,-9,2};
        int min=a[0];
        int sec_min=Integer.MAX_VALUE;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min){
                sec_min=min;
                min=a[i];
            }
            else if(a[i]>min && a[i]<sec_min){
                sec_min=a[i];
            }
        }
        System.out.println("Minimum"+min);
        System.out.println("Second Minimum"+sec_min);
    
}
}
    

