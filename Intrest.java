import java.util.*;
class nes {
    double P,r,t,n;
    double simple_intrest(){
        return P*(1+(r*t));
    }
    double compound_intrest(){
        return Math.pow((P*(1+(r/n))),(n*t));
    }
}
class Intrest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        nes i1 = new nes();
        nes i2 = new nes();
        System.out.println("Enter principle amount:");
        i1.P =input.nextDouble();
        System.out.println("Enter rate of intrest:");
        i1.r = input.nextDouble();
        System.out.println("Enter total time:");
        i1.t = input.nextDouble();
        System.out.println("Enter n:");
        i1.n = input.nextDouble();
        System.out.println("simple intrest:"+i1.simple_intrest());
        System.out.println("Compound intrest:"+i1.compound_intrest());
        input.close();
    }
}