import java.util.Scanner;

public class testerInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan Nama CD: ");
        String name = in.nextLine();
        System.out.println(" ");
        String artist = in.nextLine();
        System.out.println(" ");
        String label = in.nextLine();
        System.out.println(" ");
        int number = in.nextInt();
        System.out.println(" ");
        int quantity = in.nextInt();
        System.out.println(" ");
        int totalSong = in.nextInt();
        System.out.println(" ");
        double price = in.nextDouble();
        
        CD cd1 = new CD(number, name, quantity, price, artist, totalSong, label);
        cd1.print();
    }
}
