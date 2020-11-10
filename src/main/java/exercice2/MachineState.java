package exercice2;

public abstract class MachineState {

    abstract void give(Machine m, int amount);
    abstract void askProduct(Machine m, String product);

    int getRefund(Machine m){
       int machineBalance = m.getBalance();
       m.razBalance();
       m.setState(MachineDeliverState.instance());
       return machineBalance;
    }

}
