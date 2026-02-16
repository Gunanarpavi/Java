public class Leader {
    public static void main(String[] args) {
        int[]a={9,1,17,6,5,19,4,1};
        boolean[] v=new boolean[a.length];
        for(int i=0;i<a.length-1;i++)
        {
            v[i]=true;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j]){
                    v[i]=false;
                    break;
                }
            }
            if(v[i]==true){
            System.out.println(a[i]);}
        }

    }
    
}
