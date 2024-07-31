public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a Computer instance with only required attributes
        Computer basicComputer = new Computer.Builder("Intel i5", 8).build();
        System.out.println("Basic Computer: " + basicComputer);

        // Create a Computer instance with additional optional attributes
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", 16)
            .setStorage(512)
            .setSSD(true)
            .setGraphicsCard(true)
            .build();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Create another configuration of Computer
        Computer officeComputer = new Computer.Builder("Intel i7", 16)
            .setStorage(256)
            .setSSD(true)
            .build();
        System.out.println("Office Computer: " + officeComputer);
    }
}

