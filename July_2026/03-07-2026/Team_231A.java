import java.util.*;
public class Team_231A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=0;i<a;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if((x+y+z)>=2){
                count+=1;
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}