package exercice1;

public interface MachineState {

    void give(Machine m, int amount);
    void askProduct(Machine m, String product);

}
