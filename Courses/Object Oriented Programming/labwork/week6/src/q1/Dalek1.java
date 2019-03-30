package q1;

public class Dalek1 {
    private double batteryCharge = 5.0;

    public void batteryReCharge(double c) {
        // ADD CODE HERE
        this.batteryCharge += c;
        System.out.println("Battery charge is: " + this.batteryCharge);
    }

    public void move(int distance) {
        // ADD CODE HERE
        int mostSteps = 0;
        boolean flag = false;
        if(this.batteryCharge < 0.5) {
            flag = true;
        }else if (distance <= this.batteryCharge * 2) {
            mostSteps = distance;
        } else {
            mostSteps = (int) this.batteryCharge * 2;
            flag = true;
        }
        for (int i = 0; i < mostSteps && this.batteryCharge >= 0.5; i++) {
            System.out.printf("[%d] ", i + 1);
            this.batteryCharge -= 0.5;
        }
        if (flag) {
            System.out.println("Out of power!");
        }
    }

    public static void main(String[] args) {
        Dalek1 d = new Dalek1(); // start off with a well-charged battery
        d.move(11); // move around and use up the charge
        d.batteryReCharge(2.5); // get a new charge
        d.batteryReCharge(0.5); // add a bit more
        d.move(5);
    }
}