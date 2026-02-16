public class Rotational {
    public static void main(String[] args) {
        int[]a={1,2,5,12,15};
        int[]b={5,12,15,2,1};
        if(a.length!=b.length){
            System.out.println("Not Rotational");
        }
        String s1="";
        String s2="";
        for (int i=0;i<a.length;i++){
            s1+=a[i]+",";
        }
        for (int j=0;j<a.length;j++){
            s2+=b[j]+",";
        }
        s1=s1+s1;
        if(s1.contains(s2)){
            System.out.println("Rotated");
        }
        else
        {
             System.out.println("Not Rotated");
        }
    }
    
}
