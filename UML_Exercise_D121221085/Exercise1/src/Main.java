import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        MyCar2 mycar = new MyCar2();

        mycar.Colour = "Red";
        mycar.yearOfProduction = 2020;

        mycar.printMyCar();

        mycar.TurnOnMachine();
        System.out.print("Turn On Machine ? ");
        String machineOn = myScan.next();
        mycar.machineOn = machineOn;

        System.out.print("Please enter your initial speed : ");
        int speed = myScan.nextInt();
        mycar.speed = speed;
        mycar.changeGear();

        System.out.print("Turn Off Machine ? ");
        String machineOff = myScan.next();
        mycar.machineOff = machineOff;

    }
}
