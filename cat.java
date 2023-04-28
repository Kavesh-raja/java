//https://codeforces.com/contest/1800/problem/A
import java.util.Scanner;

public class cat {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int test_case = inp.nextInt();
        for (int k = 0; k < test_case; k++) {
            int len = inp.nextInt();
            inp.nextLine();
            String Str = inp.nextLine();
            String low = Str.toLowerCase();
            int tem = 0;
            int index = 0;
            int check =0;
            for (int i = 0; i < len; i++) {
                if (low.charAt(i) == 'm') {
                    check++;
                    continue;
                } else if (low.charAt(i) == 'e') {
                    tem++;
                    index = i;
                    break;
                } else {
                    break;
                }
            }
            int check1 =0;
            //System.out.println(tem);

            if (tem == 1 & check>0) {
                for (int i = index; i < len; i++) {
                    if (low.charAt(i) == 'e') {
                        check1++;
                        continue;
                    } else if (low.charAt(i) == 'o') {
                        tem++;
                        index = i;
                        break;
                    } else {
                        break;
                    }
                }

            }
            int check2 =0;
            //System.out.println(tem);

            if (tem == 2 & check1>0) {
                for (int i = index; i < len; i++) {
                    if (low.charAt(i) == 'o') {
                        check2++;
                        continue;
                    } else if (low.charAt(i) == 'w') {
                        tem++;
                        index = i;
                        break;
                    } else {
                        break;
                    }
                }
            }
            int check3 =0;
            //System.out.println(tem);

            if (tem == 3 & check2>0) {
                for (int i = index; i < len; i++) {
                    if (low.charAt(i) == 'w') {
                        check3++;
                        continue;
                    } else {
                        tem--;
                    }
                }
            }
            //System.out.println(tem);
            if (tem == 3 & check3>0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
