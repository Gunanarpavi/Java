
import java.util.Scanner;
public class Bin_hex{
    public static void main(String[]args){
    int value;
    String bin=" ";
    String hex=" ";
    Scanner in=new Scanner(System.in);
    System.out.println("Enter");
    bin=in.nextLine();
    while(bin.length()%4!=0)
    {
        bin="0"+bin;
    }
    for(int i=0;i<bin.length();i=i+4)
    {
        value=0;
        value+=(bin.charAt(i)-'0')*8;
        value+=(bin.charAt(i+1)-'0')*4;
        value+=(bin.charAt(i+2)-'0')*2;
        value+=(bin.charAt(i+3)-'0')*1;
        if(value<10){
        hex+=value;
        }
        else{
            hex+=(char)(value-10+'A');
        }
    }
    System.out.println("Hexa:"+hex);
    
    }
}

