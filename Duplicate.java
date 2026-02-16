public class Duplicate {
    public static void main(String[]args){
    int[]a={1,4,5,3,2,5};
    int d_count=0;
   
    for(int i=0;i<a.length;i++){
        int count=0;
         boolean seen=false;
        
    for(int j=0;j<a.length;j++){
        if(a[i]==a[j])
        {
            count++;
        }
    }
    if(count>1){
        for(int k=0;k<i;k++)
        {
            if(a[i]==a[k]){
                seen=true;
                break;
            }
        }
     if(!seen){
            d_count++;
            System.out.println("Duplicate elements"+a[i]+"");
        }    }
       
}
System.out.println("Count of duplicates"+d_count);
    
}
}

