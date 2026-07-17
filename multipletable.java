import java.util.*;
public class multipleTable{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++)
        {
            System.out.println(i+"x"+n+"="+(n*i));
            sc.close();
        }
    }
}
