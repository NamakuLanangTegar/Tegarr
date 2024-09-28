import java.util.Scanner;

public class DriverPersewaan {
    public static void main(String[] args) {
        
        String pilihan = "";
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner a = new Scanner(System.in);

        System.out.println("CD/DVD?");
        pilihan = a.nextLine();

        if (pilihan.equalsIgnoreCase("CD")) {
            cd.print();
        } else if (pilihan.equalsIgnoreCase("DVD")) {
            dvd.print();
        }
        a.close();
    }
    
}
