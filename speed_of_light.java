//https://www.codechef.com/problems/RELATIVE
import java.util.*;
class speed_of_light
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        int test_case = inp.nextInt();
        for (int i = 0;i<test_case;i++)
        {
            int g = inp.nextInt();
            int c = inp.nextInt();
            int H = (c*c)/(2*g);
            System.out.println(H);
        }

    }
}
