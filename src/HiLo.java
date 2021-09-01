import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
            // Генерация случайного числа, которое будет угадывать пользователь
            int theNumber = (int) (Math.random() * 100 + 1);
            System.out.println(theNumber);
            int guess = 0;
            while (guess != theNumber) {
                System.out.println("Угадайте число от 1 до 100:");
                guess = scan.nextInt();
                if (guess < theNumber)
                    System.out.println(guess + "  Указанное число меньше искомого. Введите число заново");
                else if (guess > theNumber)
                    System.out.println(guess + "  Указанное число больше искомого. Введите число заново");
                else
                    System.out.println(guess + "  Вы угадали число!");
            } // Конец цикла угадывания while
            System.out.println("Вы хотите сыграть снова? да/нет ");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("да"));
        System.out.println("Спасибо за игру! До свидания.");
        scan.close();
    }
}
