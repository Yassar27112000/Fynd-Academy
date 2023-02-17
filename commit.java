package git_demo;
import java.util.*;
public class commit{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("The number of Branches of the tree you want to print");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(" & ");
            for(int j=1;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}