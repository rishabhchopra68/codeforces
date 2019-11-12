import java.util.*;
public class restrictedRPS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        while(t--!=0){
            int n= s.nextInt();
            int a= s.nextInt();
            int b= s.nextInt();
            int c= s.nextInt();

            int eA=a,eB=b,eC=c;
            String str= s.next();
            int toWin= str.length()/2;
            if(str.length()%2==1){
                toWin+=1;
            }
            int count=0;
            String ans="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='R'){
                    eB--;
                }
                else if(str.charAt(i)=='P'){
                    eC--;
                }
                else{
                    eA--;
                }
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='R'){
                    if(b!=0){
                        count++;
                        b--;
                        ans+="P";
                    }
                    else{
                        ans+=eA>=eC?"R":"S";
                        if(eA>=eC){
                            eA--;
                            a--;
                        }
                        else{
                            eC--;
                            c--;
                        }
                    }
                }
                else if(str.charAt(i)=='P'){
                    if(c!=0){
                        count++;
                        c--;
                        ans+="S";
                    }
                    else{
                        ans+=eA>=eB?"R":"P";
                        if(eA>=eB){
                            eA--;
                            a--;
                        }
                        else{
                            eB--;
                            b--;
                        }
                    }
                }
                else{
                    if(a!=0){
                        count++;
                        a--;
                        ans+="R";
                    }
                    else{
                        ans+=eB>=eC?"P":"S";
                        if(eB>=eC){
                            b--;
                            eB--;
                        }
                        else{
                            c--;
                            eC--;
                        }
                    }
                }
            }
            if(count>=toWin){
                System.out.println("YES");
                System.out.println(ans);
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
