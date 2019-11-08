package Jobsheet9;

public class Tester1 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dodik", 500);
        ow.pay(pEmp);
        System.out.println("-------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("-------------------------------");
        ow.showMyEmployee(iEmp);



    }
}
