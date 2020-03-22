public class Auto {
    private String brand;
    private String model;
    private int year;
    private static int MAX_SPEED = 200;

    public Auto(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void run(int speed){
        if(isValidSpeed(speed))
            System.out.println(toString() + " is running at " + speed + " kmph");
        System.out.println("Invalid speed given");
    }

    public boolean isValidSpeed(int speed){
        if(speed <= MAX_SPEED)
            return true;
        return false;
    }

    public void stop(){
        System.out.println("Stopping vehicle..");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
