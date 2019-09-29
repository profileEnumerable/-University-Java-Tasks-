/**
 * Task2 
 * TODO:Дана площа круга.Знайти довжину кола,що обмежуе цей круг.
 * Вважати значення PI рівним 3.14
 */
public class Task2 {
    public static void main(String[] args) {
        double area;// contains a user circle area

        while (true) {// stops when the user enters the correct value
            try {
                System.out.print("Enter your circle area: ");

                String numberStr = System.console().readLine();
                area = Double.parseDouble(numberStr);

                break;
            } catch (Exception e) {
                System.out.println("Your number is incorrect,try again");
            }
        }

        double radius = Math.sqrt(area / Math.PI);

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference: " + circumference);
    }
}