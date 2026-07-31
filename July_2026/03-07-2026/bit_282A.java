import java.util.*;
public class bit_282A {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        for (int i=0;i<n;i++){
            String a=sc.next();

            if(a.contains("++")){
                k++;
            }
            else{
                k--;
            }

            }
            System.out.println(k);
            sc.close();
        }
    }