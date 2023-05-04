class clc{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
class adv_clc extends clc{
    public int mult(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}
class sctific_clc extends adv_clc{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
    public double pow(double n1,double n2){
        double k  = Math.pow(n1,n2);
        return k;
    }

}
public class inheritence{
    public static void main(String[] args) {
        sctific_clc A1 = new sctific_clc();

        int r1 = A1.add(10, 22);
        double r2 = A1.pow(22, 4);
        System.out.println(r1);
        System.out.println(r2);
    }
}