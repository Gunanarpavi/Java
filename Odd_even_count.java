public class Odd_even_count {
     public static void main(String[]args){
        int []a={10,3,4,-9,6,5};
        int odd_count=0;
        int even_count=0;
        for (int i=0;i<a.length;i++){
    if(a[i]%2==0)
    {
        even_count++;
    }
       
     else
        {
        odd_count++;
    }
        
    
} System.out.print("Even count:   "+ even_count);
System.out.println();

System.out.println("Odd count:  "+  odd_count);

     }
     }