import java.util.*;
public class program{
    public static void main(String args[])
    {
        System.out.println("Enter n: "); //added in the branch
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            System.out.println("Loop: #"+(i+1));
        }
        sc.close();
    }
}
