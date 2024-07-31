public class Computer {
    // Required attributes
    private final String CPU;
    private final int RAM;

    // Optional attributes
    private final int storage;
    private final boolean isSSD;
    private final boolean hasGraphicsCard;

    // Private constructor to be used by the Builder class
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isSSD = builder.isSSD;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB, SSD=" + isSSD + ", GraphicsCard=" + hasGraphicsCard + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Required attributes
        private final String CPU;
        private final int RAM;

        // Optional attributes
        private int storage = 0;
        private boolean isSSD = false;
        private boolean hasGraphicsCard = false;

        // Builder constructor with required attributes
        public Builder(String CPU, int RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter methods for optional attributes
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setSSD(boolean isSSD) {
            this.isSSD = isSSD;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        // Build method to create a Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
