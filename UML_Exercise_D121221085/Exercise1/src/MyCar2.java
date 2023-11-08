public class MyCar2 {
    public String Colour;
    public int yearOfProduction;
    public String machineOn;
    public String machineOff;
    public int speed;

    public void printMyCar() {
        System.out.println("Colour : " + Colour);
        System.out.println("Year of Production : " + yearOfProduction);
    }

    public void TurnOnMachine() {
        if (machineOn == "Yes"){
            System.out.println("Machine is Turned On.");
        }
        else {
            System.out.println("Machine is Turned Off.");
        }
    }

    public void changeGear(){
        if (speed > 0 && speed <= 40){
            System.out.println("Gear 1 is active");
        }
        else if (speed > 40 && speed <= 65){
            System.out.println("Gear 2 is active");
        }
        else if (speed > 65 && speed <= 90){
            System.out.println("Gear 3 is active");
        }
        else {
            System.out.println("Gear 4 is active");
        }
    }

    public void TurnOffMachine(){
        if (machineOff == "Yes"){
            System.out.println("Machine is Turned Off.");
        }
        else {
            System.out.println("Machine is Turned On.");
        }
    }
}

