import java.util.*;
public class codeforces{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        for( int i = 0 ;i<n ;i++ ){
            ArrayList<Integer> a= new ArrayList<>();
            arr.add(a);
        }
        for(int i=0;i<n-1;i++){
            int sv=s.nextInt();
            int ev=s.nextInt();
            arr.get(sv-1).add(ev-1);
            arr.get(ev-1).add(sv-1);
        }

        boolean[] visited= new boolean[n];

        ArrayList<Integer> ans= new ArrayList<>();
        calc(arr,ans,0,0,visited);
        long sum=0;
        for(int i=0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        System.out.println(sum/(ans.size()*(double)1.000000000000000));
    }

    private static void calc(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> ans,int start,int len,boolean[] visited){
        if(start!=0 && arr.get(start).size()==1){
            visited[start]=true;
            ans.add(len);
            return;
        }
        visited[start]=true;
        for(int i=0;i<arr.get(start).size();i++){
            if(!visited[arr.get(start).get(i)]){
                calc(arr,ans,arr.get(start).get(i),len+1,visited);
            }
        }
    }
}