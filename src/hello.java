import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imie: ");
        String name = scanner.nextLine();

        System.out.println("Podaj swoje nazwisko: ");
        String surname = scanner.nextLine();

        System.out.println("Podaj numer album: ");
        int nrAlbum = scanner.nextInt();

        System.out.println("Dane Studenta: " + name + " "
                            + surname +"\nNumer albumu: " + nrAlbum);
    }
}
