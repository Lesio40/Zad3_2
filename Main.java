import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String wyraz = scan.next();
        int j = 0;
        StringBuilder wynik = new StringBuilder();
        for (int i = 0; i < wyraz.length(); i++) {
            char c = wyraz.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                j++;
            }
            wynik.append(c);
        }
        System.out.println("Wynik: " + wynik.toString());
        System.out.println("Ilość liter zmienionych: " + j);
    }
}