public class Rotational_modulo {
    public static void main(String[] args) {
        int[]a={1,2,5,12,15};
        int[]b={5,12,15,2,1};
         if(a.length!=b.length){
            System.out.println("Not Rotational");
            return;
        }
        int n=a.length;
        int start=-1;
        for (int i=0;i<n;i++)
        {
            if(a[i]==b[0])
            {
                start=i;
                break;
            }
        }
        if(start==-1){
            System.out.println("Not");
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(a[(start+i)%n]==b[i])

                {
                    System.out.println("Rotational");
                    return;
                }
                else{
                    System.out.println("No Rotational");
                    return;
                }
        }
        
    }
    
}
