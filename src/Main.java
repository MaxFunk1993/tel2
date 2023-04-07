// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int money = 100; // на счету

        int added = 999; // пополнил счет
        int bonus = 100; // бонус
        if (added > 1000) {

            System.out.println((money + added + added / bonus) + "с бонусом");
        } else {
            System.out.println((money + added) + "без бонуса");
        }


    }
}