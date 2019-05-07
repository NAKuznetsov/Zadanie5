import java.util.Scanner;

public class NumTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();


        int one = 1 * num;
        int two = 2 * num;
        int three = 3 * num;
        int four = 4 * num;
        int five = 5 * num;
        int six = 6 * num;
        int seven = 7 * num;
        int eight = 8 * num;
        int nine = 9 * num;
        int ten = 10 * num;



        System.out.println("Таблица умножения на число: "  + num + " равна:" + "\n" +
                "1 * " + num + " = " + one + "\n" +
                "2 * " + num + " = " + two + "\n" +
                "3 * " + num + " = " + three + "\n" +
                "4 * " + num + " = " + four + "\n" +
                "5 * " + num + " = " + five + "\n" +
                "6 * " + num + " = " + six + "\n" +
                "7 * " + num + " = " + seven + "\n" +
                "8 * " + num + " = " + eight + "\n" +
                "9 * " + num + " = " + nine + "\n" +
                "10 * " + num + " = " + ten + "\n");


    }
}

