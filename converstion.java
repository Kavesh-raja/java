import java.util.*;
class converstion {

     double inr, eur, usd;

     double inr_to_eur() {
         return (inr * 0.011);
     }

     double inr_to_usd() {
         return (inr * 88.07);
     }
     double eur_to_inr(){
         return (eur*88.49);
     }
     double eur_to_usd(){
         return (eur*1.07);
     }
     double usd_to_inr(){
         return (usd*82.57);
     }
     double usd_to_ero(){
         return (usd*0.93);
     }

     converstion(double i, double e, double u) {
         inr = i;
         eur = e;
         usd = u;
     }
 }
 class con{
     public static void main(String args[]){
         Scanner inp =new Scanner(System.in);
         System.out.println("enter the indian currency:");
         double irs = inp.nextDouble();
         System.out.println("Enter the euro currency:");
         double er = inp.nextDouble();
         System.out.println("Enter the usd currency:");
         double us = inp.nextDouble();
         converstion m1 = new converstion(irs,er,us);
         System.out.println( "inr to euro:"+m1.inr_to_eur()+" and inr to usd:"+ m1.inr_to_usd());
         System.out.println("euro to inr:"+m1.eur_to_inr()+" and euro to usd:"+m1.eur_to_usd());
         System.out.println("usd to inr:"+m1.usd_to_inr()+" and usd to euro:"+m1.usd_to_ero());
     }
 }








