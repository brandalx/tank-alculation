public class Tank {
    private int capacity, amount;

    public Tank(int capacity, int amount) {
        this.capacity = capacity;
        this.amount = amount;
    }

    public Tank(Tank other) {
        this.capacity = other.capacity;
        this.amount = other.amount;
    }

    public Tank() {
        this.capacity = 1500;
        this.amount = 1000;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isOk(Tank tank1, Tank tank2, boolean isFirstFuel) {
        Tank firstTank;
        Tank secondTank;

        if (isFirstFuel) {
            firstTank = tank1;
            secondTank = tank2;
        } else {
            firstTank = tank2;
            secondTank = tank1;
        }

        int fuelDiff = firstTank.getAmount() + secondTank.getAmount();

        if (fuelDiff <= secondTank.getCapacity()) {

            return true;
        } else {
            return false;
        }
    }

    public void handleCount(Tank tank, char declare, int number) {

        switch (declare) {
            case '+':
                int cap = tank.getAmount() + number;
                if (cap > tank.getCapacity()) {
                    System.out.println("The requested amount to add is too big for current capacity of (" + tank.getCapacity() + ")");
                } else {
                    System.out.println("The total amount of fuel after adding is " + cap);
                }
                break;
            case '-':
                cap = tank.getAmount() - number;
                if (cap < 0) {
                    System.out.println("The requested amount to pump out runs out of fuel for current capacity of (" + tank.getCapacity() + ")");
                } else {
                    System.out.println("The total amount of fuel after pumping is " + cap);
                }
                break;
            default:
                System.out.println("Character ("+ declare+") you provided is not valid, provide operators (+) or (-)");
                break;
        }
    }
    public void handleDistance(Tank tank, int distance) {
int km = 2;


int result = distance * km;

if (result > tank.getCapacity()){
    double fuelTankRequired = (double) result / tank.getCapacity();

    System.out.println("The total amount of fuel for provided distance is " + result + " and its fuel barrel is " + fuelTankRequired);
}else{

    System.out.println("The total amount of fuel for provided distance is "+ result +" and its fuel barrel is " +1);
}
    }
    }



