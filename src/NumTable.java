import java.util.Scanner;

public class NumTable {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Эта программа выводит таблицу умножения для введенного числа. Введите число от 1 до 9:");
        int num = in.nextInt();

        if (num == 1)
        {
            System.out.println("1*1=1\n1*2=2\n1*3=3\n1*4=4\n1*5=5\n1*6=6\n1*7=7\n1*8=8\n1*9=9");
        }
        else if (num == 2)
        {
            System.out.println("2*1=2\n2*2=4\n2*3=6\n2*4=8\n2*5=10\n2*6=12\n2*7=14\n2*8=16\n2*9=18");
        }
        else if (num == 3)
        {
            System.out.println("3*1=3\n3*2=6\n3*3=9\n3*4=12\n3*5=15\n3*6=18\n3*7=21\n3*8=24\n3*9=27");
        }
        else if (num == 4)
        {
            System.out.println("4*1=4\n4*2=8\n4*3=12\n4*4=16\n4*5=20\n4*6=24\n4*7=28\n4*8=32\n4*9=36");
        }
        else if (num == 5)
        {
            System.out.println("5*1=5\n5*2=10\n5*3=15\n5*4=20\n5*5=25\n2*6=30\n5*7=35\n5*8=40\n5*9=45");
        }
        else if (num == 6)
        {
            System.out.println("6*1=6\n6*2=12\n6*3=18\n6*4=24\n6*5=30\n6*6=36\n6*7=42\n6*8=48\n6*9=54");
        }
        else if (num == 7)
        {
            System.out.println("7*1=7\n7*2=14\n7*3=21\n7*4=28\n7*5=35\n7*6=42\n7*7=49\n7*8=56\n7*9=63");
        }
        else if (num == 8)
        {
            System.out.println("8*1=8\n8*2=16\n8*3=24\n8*4=32\n8*5=40\n8*6=48\n8*7=56\n8*8=64\n8*9=72");
        }
        else if (num == 9)
        {
            System.out.println("9*1=9\n9*2=18\n9*3=27\n9*4=36\n9*5=45\n9*6=54\n9*7=63\n9*8=72\n9*9=81");
        }
        else
        {
            System.out.println("Вы ввели неверное число");
        }
    }
}
