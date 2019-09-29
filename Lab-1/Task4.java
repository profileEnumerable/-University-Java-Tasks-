/**
 * Task4
 * TODO: Дані два числа. Знайти середнє арифметичне їх квадратів і середнє
 * арифметичне їх модулів
 */
public class Task4 {

    public static double GetUserInput(String dataName) {// reusable method
        while (true) {
            System.out.print("Enter " + dataName + " number: ");
            String numberStr = System.console().readLine();

            double parsedNumber = 0;

            try {
                parsedNumber = Double.parseDouble(numberStr);
                return parsedNumber;
            } catch (Exception e) {
                System.out.println("Your " + dataName + " number is incorrect,try again");
            }
        }
    }

    public static void main(String[] args) {
        double firstNum, secondNum;

        firstNum = GetUserInput("first");
        secondNum = GetUserInput("second");

        double avgOfSquares = (Math.pow(firstNum, 2) + Math.pow(secondNum, 2)) / 2;

        System.out.println("Avg of squares of numbers: " + avgOfSquares);

        double avgOfModules = (Math.abs(firstNum) + Math.abs(secondNum)) / 2;

        System.out.println("Avg of modules of numbers: " + avgOfModules);
    }
}