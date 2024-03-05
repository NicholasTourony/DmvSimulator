import java.util.Random;

public class DmvSimulator
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the DMV!");
        Random random = new Random();
        int userNumber = random.nextInt(1, 101);
        System.out.println("You're number " + userNumber + " please wait until you are called");
        int currentNumber = (userNumber % 100) + 1;
        boolean notCalled = true;
        while (notCalled)
        {
            System.out.println("Now helping number " + currentNumber);
            notCalled = !(currentNumber == userNumber);
            currentNumber = (currentNumber % 100) + 1;
        }
        System.out.println("You clot. You absolute buffoon. You forgot your paperwork. Leave my sight immediately!");

    }
}