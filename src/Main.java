import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều cao : ");
        float heigth = sc.nextFloat();

        System.out.println("Nhập cân nặng : ");
        float weigth = sc.nextFloat();

        float BMI = weigth / (heigth * heigth);
        if (BMI < 18.5)
            System.out.println("Bạn gầy quá!");
        else if (BMI < 25.0)
            System.out.println("Bạn bình thường");
        else if (BMI < 30)
            System.out.println("Bạn hơi mập một chút");
        else
            System.out.println("Bạn nặng quá rồi hãy giảm cân đi ");
    }
}