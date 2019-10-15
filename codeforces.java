import java.util.*;
public class codeforces{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();

            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i=1;i<(int)Math.sqrt(arr[0]);i++){
                if(arr[0]%i==0){
                    map.put(i,1);
                    map.put(arr[i]/i,1);
                }
            }
            int msv=0;
            for(int i=1;i<n;i++){
                if(map.containsKey(arr[i]) && map.get(arr[i])>msv){
                    msv= map.get(arr[i]);
                }
                for(int j=1;j<=(int)Math.sqrt(arr[i]);j++){
                    if(arr[i]%j==0){
                        if(map.containsKey(j)){
                            map.put(j,map.get(j)+1);
                        }
                        else
                            map.put(j,1);
                        if(map.containsKey(arr[i]/j)){
                            map.put(arr[i]/j,map.get(arr[i]/j)+1);
                        }
                        else
                            map.put(arr[i]/j,1);
                    }
                }
            }
            System.out.println(msv);
        }
    }
    }