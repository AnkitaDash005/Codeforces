import java.util.*;
public class WayTooLongWords_71A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            
            String x=sc.next();
            if(x.length()>10){
            char a=x.charAt(0);
            char b=x.charAt((x.length())-1);
            int len=x.length()-2;
            System.out.println(""+a+len+b);
            }
            else{
                System.out.println(x);
            }
        }
        sc.close();
        
    }
}