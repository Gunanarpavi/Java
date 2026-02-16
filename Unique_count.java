public class Unique_count {
    public static void main(String[]args){
    int[]a={1,4,2,4,1,3,3,2,5};
    int unique_count=0;
    for(int i=0;i<a.length;i++){
        int count=0;
        
    for(int j=0;j<a.length;j++){
        if(a[i]==a[j])
        {
            count++;
        }
    }
    if(count==1){
        unique_count++;
    }
}
System.out.println(unique_count);

    }
}
    

