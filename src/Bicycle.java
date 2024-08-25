public class Bicycle extends ServiceStation {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }
    
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
