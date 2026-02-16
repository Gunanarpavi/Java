import java.util.Scanner;
public class Bin_dec {
    public static void main(String[]args){
    int decimal=0;
    int power=0;
    String bin="";
    Scanner in=new Scanner(System.in);
    System.out.println("Enter");
    bin=in.nextLine();
    for(int i=bin.length()-1;i>=0;i--)
    {
        int digit=bin.charAt(i)-'0';
        decimal=decimal+digit*(int)Math.pow(2,power);
        power++;
    }
    System.out.println("Decimal"+decimal);
    }
}