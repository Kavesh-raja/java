//https://www.codechef.com/problems/NAICHEF
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        int test_case = inp.nextInt();
        for (int i =0;i<test_case;i++) {
            double n = inp.nextInt();
            double A = inp.nextInt();
            double B = inp.nextInt();
            double A1 = 0;
            double B1 = 0;
            for (int j = 0;j<n;j++)
            {
                double m = inp.nextInt();
                if (A==m)
                {
                    A1++;
                }
                if (B==m)
                {
                    B1++;
                }

            }
            double OP = (A1/n)*(B1/n);
            System.out.println(OP);

        }
    }
}