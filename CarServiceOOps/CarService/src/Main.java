import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              String name=sc.next();
              Car obj=new Car();
            if(name.equals("Hatchback")){
               obj=new Hatchback(name);
                }
           else if(name.equals("Suv")){
               obj=new Suv(name);
            }
           else{
                obj=new Sedan(name);
            }
            int noOfService= sc.nextInt();
            String[] arr=new String[noOfService];
            for(int i=0; i<noOfService; i++){
                arr[i]=sc.next();
            }
        System.out.print("Service codes - ");
        for(int i=0; i<noOfService; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
            int total=0;
            for(int i=0; i<arr.length; i++) {
                String temp = arr[i];
                if (temp.equals("BS01")) {
                    int cost = obj.charge(temp);
                    System.out.println("Charge of basic servicing - " + cost);
                    total += cost;
                } else if (temp.equals("EF01")) {
                    int cost = obj.charge(temp);
                    System.out.println("Charge of engine fixing - " + cost);
                    total += cost;
                } else if (temp.equals("BF01")) {
                    int cost = obj.charge(temp);
                    System.out.println("Charge of brake fixing - " + cost);
                    total += cost;
                } else if (temp.equals("GF01")) {
                    int cost = obj.charge(temp);
                    System.out.println("Charge of gear fixing - " + cost);
                    total += cost;
                } else if (temp.equals("CF01")) {
                    int cost = obj.charge(temp);
                    System.out.println("Charge of clutch fixing - " + cost);
                    total += cost;
                }
            }
                System.out.println("total bill - "+total);
                if(total>10000){
                    System.out.println("Complementry cleaning service provided");
                }


            }

}