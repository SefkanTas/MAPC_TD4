package exercice2;

public class MachineDepositeState extends MachineState {

    private static MachineDepositeState instance;

    private MachineDepositeState(){}

    public static MachineDepositeState instance() {
        if (instance == null)
            instance = new MachineDepositeState();
        return instance;
    }

    @Override
    public void give(Machine m, int amount) {
        m.addToBalance(amount);
        System.out.println("Balance : " + m.getBalance());
        if(m.priceReached()){
            System.out.println("Ready to deliver, please choose your product");
            m.setState(MachineDeliverState.instance());
        }
    }

    @Override
    public void askProduct(Machine m, String product) {
        System.out.println("insufficient balance for " + product);
    }

    @Override
    public int getRefund(Machine m) {
        return 0;
    }

}
