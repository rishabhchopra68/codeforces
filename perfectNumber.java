import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int[] arr = new int[10000];
        int k =s.nextInt();
        int count=1;
        for(int i=19;i<1000000000;i+=9){
            if(check(i)){
                if(count==k){
                    System.out.print(i);
                    break;
                }
                count++;
            }
        }
    }

    private static boolean check(int i) {
        int sum=0;
        while(i>0){
            sum+=i%10;
            i/=10;
        }
        return sum==10;
    }
}
