public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a base EmailNotifier
        Notifier emailNotifier = new EmailNotifier();
        
        // Decorate EmailNotifier with SMSNotifierDecorator
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        
        // Further decorate with SlackNotifierDecorator
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        
        // Send message through all channels
        slackNotifier.send("Hello, this is a test message!");
    }
}
