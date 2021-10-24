import java.util.*;


class Methods {

    public Double EuroToInd(Double Euro) {
        return(Euro*0.011);
    }

    public Double EuroToUS(Double Euro) {
        return(Euro*0.86);
    }

    public Double EuroToYen(Double Euro) {
        return(Euro*0.0076);
    }


}

public class Index {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Methods i = new Methods();

        System.out.print("Please enter amount in Euro:");
        Double amount = sc.nextDouble();
        sc.close();
        System.out.println(i.EuroToInd(amount) + " rupees");
        System.out.println(i.EuroToUS(amount) + " dollars");
        System.out.println(i.EuroToYen(amount) + " yen");

    }
    
}