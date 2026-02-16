public class Sec_max {
    public static void main(String[]args){
        int[]a={10,3,4,5,-9,6};
        int max=a[0];
        int sec_max=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max){
                sec_max=max;
                max=a[i];
            }
            else if(a[i]<max && a[i]>sec_max){
                sec_max=a[i];
            }
        }
        System.out.println("Maximum"+max);
        System.out.println("Second Maximum"+sec_max);
    }
}
