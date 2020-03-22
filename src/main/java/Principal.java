public class Principal {
    public static void main(String[] args) {

        Auto car = new Auto("VOLKSWAGEN", "AMAROK", 2019);
        car.run(300);
        car.run(60);
        car.stop();
    }
}
