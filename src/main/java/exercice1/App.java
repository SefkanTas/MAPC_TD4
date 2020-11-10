package exercice1;

public class App {

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.give(5);
        machine.askCoffee();
        machine.give(4);
        machine.askTea();
        machine.give(20);
        machine.askCoffee();

    }

}
