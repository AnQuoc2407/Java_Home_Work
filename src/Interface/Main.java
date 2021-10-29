package Interface;

public class Main {
    public static void main(String[] args) {
        CalculatorUSA mtUSA = new CalculatorUSA();
        CalculatorVN mtVN = new CalculatorVN();
        System.out.println("mtUSA Cộng: "+ mtUSA.cong(5,3));
        System.out.println("mtUSA Trừ: "+ mtUSA.tru(5,3));
        System.out.println("mtUSA Nhân: "+ mtUSA.nhan(5,3));
        System.out.println("mtUSA Chia: \n"+ mtUSA.chia(5,3));

        System.out.println("mtVN Cộng: "+ mtVN.cong(5,3));
        System.out.println("mtVN Trừ: "+ mtVN.tru(5,3));
        System.out.println("mtVN Nhân: "+ mtVN.nhan(5,3));
        System.out.println("mtVN Chia: \n"+ mtVN.chia(5,3));
    }
}
