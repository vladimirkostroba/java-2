public class Main {
    public static void main(String[] args) {

        Airplane boeing = new Airplane(500,2300,"747");
        Airplane airbus = new Airplane();

        boeing.getInfo();
        boeing.wing.setWeight(345.5f);
        boeing.wing.getWeight();

        airbus.wing.setWeight(250.5f);
        airbus.wing.getWeight();
    }
}