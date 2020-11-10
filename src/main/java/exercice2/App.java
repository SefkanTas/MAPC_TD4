package exercice2;

public class App {

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.askCoffee();
        machine.give(5);
        machine.askCoffee();
        machine.give(10);
        machine.askCoffee();
        int refundedAmount = machine.getRefund();

        System.out.println("Refunded : " + refundedAmount);

    }

}
