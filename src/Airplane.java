public class Airplane {
    protected int speed;
    protected int maxWeight;
    protected String model;

    public Airplane(){};

    public Airplane(int speed,int maxWeight,String model){
        this.speed = speed;
        this.maxWeight = maxWeight;
        this.model = model;
    };

    public void getInfo(){
        System.out.println("speed: " + this.speed + "\n" + "max-weight: " + this.maxWeight + "\n" + "model: " + this.model);
    };

     class Wing{
        protected float weight;

        public void setWeight(float weight){
            this.weight = weight;
        }

        public void getWeight(){
            System.out.println("fly weight is: " + this.weight);
        }
    }

    Wing wing = new Wing();
}
