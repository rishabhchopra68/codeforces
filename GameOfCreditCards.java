import java.util.*;
public class GameOfCreditCards {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        String a = ans(s.next());
        String b = ans(s.next());
        int ans1=0,ans2=0;
        int pointer=0,pointer1=0;
        for(int i=0;i<n;i++){
            if(b.charAt(i)>=a.charAt(pointer)){
                pointer++;
            }
        }
        for(int i=0;i<n;i++){
            if(b.charAt(i)>a.charAt(pointer1)){
                pointer1++;
            }
        }
        System.out.println(n-pointer);
        System.out.println(pointer1);
    }

    private static String ans(String next) {
        char[] arr= next.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
