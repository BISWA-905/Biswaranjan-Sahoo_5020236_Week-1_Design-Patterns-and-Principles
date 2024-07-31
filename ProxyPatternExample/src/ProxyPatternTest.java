public class ProxyPatternTest {
    public static void main(String[] args) {
        // Create a ProxyImage object
        Image image1 = new ProxyImage("test_image1.jpg");

        // Display image using proxy
        image1.display();  // This will load the image from server and display it
        image1.display();  // This will display the cached image

        // Create another ProxyImage object
        Image image2 = new ProxyImage("test_image2.jpg");

        // Display image using proxy
        image2.display();  // This will load the image from server and display it
    }
}
