import java.util.*;
public class baloonCF
{
    static int ansF=1;
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
        }
        int[] ans= new int[n];
        for(int i=0;i<n-1;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            arr.get(a-1).add(b-1);
            arr.get(b-1).add(a-1);
        }
        boolean[] visited= new boolean[n];

        calc(arr,ans,visited,0,1,-1);
        System.out.println(ansF);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }

    private static void calc(ArrayList<ArrayList<Integer>> arr, int[] ans, boolean[] visited, int start, int value,int prev){
        if(start==0 && !visited[start])
            ans[start]=value;

        visited[start]=true;

        for(int i=0;i<arr.get(start).size();i++) {
            if(visited[arr.get(start).get(i)])
                continue;
            if(value==ans[start] || value==prev){
                value++;
                i--;
            }else{
                ans[arr.get(start).get(i)] = value++;
                ansF=Math.max(value-1,ansF);
            }
        }

        for(int i=0;i<arr.get(start).size();i++){
            if(!visited[arr.get(start).get(i)])
                calc(arr,ans,visited,arr.get(start).get(i),1,ans[start]);
        }
    }
}