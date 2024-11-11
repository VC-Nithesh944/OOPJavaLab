import mypack.Myaccount;

public class Accountbalance {
    public static void main(String[] args) {
        Myaccount current[] = new Myaccount[3];
    current[0] = new Myaccount("Nithesh", 2000.00);
    current[1] = new Myaccount("Namish", 4000.00);
    current[2] = new Myaccount("Shankar", 50000.00);

    current[0].display();
    current[1].display();
    current[2].display();
    }
}
