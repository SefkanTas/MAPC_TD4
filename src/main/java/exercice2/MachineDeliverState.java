package exercice2;

public class MachineDeliverState extends MachineState {

    private static MachineDeliverState instance;

    public static MachineDeliverState instance(){
        if(instance == null)
            return new MachineDeliverState();
        return instance;
    }

    private MachineDeliverState() { }

    @Override
    public void give(Machine m, int amount) {
        System.out.println("Not in deposit state");
    }

    @Override
    public void askProduct(Machine m, String product) {
        System.out.println("Delivering " + product);
        m.payProduct();
        m.setState(MachineRefundState.instance());
    }
}
