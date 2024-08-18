import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char []a=str.toCharArray();
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||i+j==n-1)
                System.out.print(a[j]+"");
                else
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
