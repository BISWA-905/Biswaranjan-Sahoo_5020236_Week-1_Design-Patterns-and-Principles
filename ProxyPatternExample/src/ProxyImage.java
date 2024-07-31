public class ProxyImage implements Image {
    private RealImage realImage;
    private String imageFileName;
    private boolean isLoaded = false;

    public ProxyImage(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    @Override
    public void display() {
        if (!isLoaded) {
            realImage = new RealImage(imageFileName);
            isLoaded = true;
        }
        realImage.display();
    }
}
