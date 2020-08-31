import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            int count=0;
            for(int i=0;i<s.length();i++){
                if(isPlindrome(s.substring(0,i)+s.substring(i+1))){
                    count++;
                }
            }
            if(count==0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
    public static boolean isPlindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
