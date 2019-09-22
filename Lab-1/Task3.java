/**
 * Task3 
 * TODO: Дано ціле чотиризначне число.Використовуючи операції
 * цілочисленого ділення та остачу,знайти сумму його цифр
 */
public class Task3 {
    public static void main(String[] args) {

        int number;

        while (true) {
            try {
                System.out.print("Enter a four-digit number: ");

                String numberStr = System.console().readLine();
                number = Integer.parseInt(numberStr);

                int numberOfThousands = Math.abs(number / 1000);

                if (numberOfThousands >= 1 && numberOfThousands <= 9) {// check for a four-digit number
                    break;
                }

            } catch (Exception e) {
                System.out.println("Your number is incorrect,try again");
            }
        }

        int sumOfDigits = 0;

        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        System.err.println("Sum of digits: " + sumOfDigits);
    }
}