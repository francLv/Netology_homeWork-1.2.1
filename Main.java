import java.util.Scanner;

class Main {
    public static int sum(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        Scanner load = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = load.nextInt();
        System.out.println("Введите второе число: ");
        int y = load.nextInt();
        System.out.println("Введите третье число: ");
        int z = load.nextInt();
        int result = sum(x, y, z);
        System.out.println("Сумма трех чисел равна: " + result);
        }
    }