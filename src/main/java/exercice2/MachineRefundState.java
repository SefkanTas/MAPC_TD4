package exercice2;

public class MachineRefundState extends MachineState{

    private static MachineRefundState instance;

    private MachineRefundState(){}

    public static MachineRefundState instance() {
        if (instance == null)
            instance = new MachineRefundState();
        return instance;
    }

    @Override
    void give(Machine m, int amount) {
        System.out.println("Impossible");
    }

    @Override
    void askProduct(Machine m, String product) {
        System.out.println("Impossible");
    }
}
