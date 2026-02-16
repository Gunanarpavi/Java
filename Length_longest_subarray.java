import java.util.Scanner;
public class Length_longest_subarray{
    public static void main(String[] args) {
         int n;
         int len=0;
         int maxlength = 0;
         Scanner in=new Scanner(System.in);
        System.out.println("Enter sum");
        n=in.nextInt();
        int[]a={3,2,1,1,1,2,4,4,1,1};
		for(int i =0;i<a.length;i++) {
			int sum=0;
			for(int j = i;j<a.length;j++) {
				sum+=a[j];
                if(sum>=n){
                    if (sum == n){
					len = j-i+1;
                    }
                    break;
                }
					if (len>maxlength) {
						maxlength = len;
					}
				}
			}
             System.out.print("Largest numbers "+ maxlength);
			
		}
       
		
}