import java.util.Random;

public class HomeWork_1_2 {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(permission(generateRandomAge(), 15));
        System.out.println(permission(generateRandomAge(), 20));
        System.out.println(permission(generateRandomAge(), 25));
        System.out.println(permission(generateRandomAge(), 30));
    }

    public static String permission(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return new Random().nextInt(90) + 1;
    }
}