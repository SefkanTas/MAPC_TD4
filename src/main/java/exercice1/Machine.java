package exercice1;

public class Machine {
    private MachineState state;
    private int balance;
    private int price;

    public Machine() {
        this.state = MachineDepositeState.instance();
        balance = 0;
        price = 10;
    }

    void setState(MachineState state) {
        this.state = state;
    }

    int getBalance() {
        return balance;
    }

    void addToBalance(int amount){
        balance+=amount;
    }

    void razBalance(){
        balance = 0;
        System.out.println("Balance set to 0");
    }

    boolean priceReached(){
        return balance >= price;
    }

    public void give(int amount){
        state.give(this, amount);
    }

    public void askCoffee(){
        state.askProduct(this, "Coffee");
    }

    public void askTea(){
        state.askProduct(this, "Tea");
    }
}
