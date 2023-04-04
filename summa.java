//https://www.codechef.com/problems/HIGHSCORE
import java.util.*;
class summa
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        int test_case = inp.nextInt();

        for (int i = 0; i<test_case;i++)
        {
            int n1 = inp.nextInt();
            int temp = 0;
            for (int j =0; j<4;j++)
            {
                int m1 = inp.nextInt();
                if(m1>temp)
                {
                    temp = m1;
                }
            }
            System.out.println(temp);

        }
    }

}
