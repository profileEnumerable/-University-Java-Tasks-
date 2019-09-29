/**
 * Task1
 * TODO: Дана довжина кола. Знайти площу круга, обмеженого цим колом.Вважати
 * значення PI рівним 3.14
 */
public class Task1 {
    public static void main(String[] args) {

        double circumference;// contains a user circle length

        while (true) {// stops when the user enters the correct value
            try {
                System.out.print("Enter your circle length: ");

                String numberStr = System.console().readLine();
                circumference = Double.parseDouble(numberStr);

                break;
            } catch (Exception e) {
                System.out.println("Your number is incorrect,try again");
            }
        }

        double radius = circumference / (2 * Math.PI);        

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area of a circle: " + area);
    }
}