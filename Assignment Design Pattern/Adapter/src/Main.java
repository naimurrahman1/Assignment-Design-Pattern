// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String recipient = "naimur@example.com";
        String message = "Message Sent";

        EmailService emailService = new EmailService();
        MessagingService messagingService = new EmailServiceAdapter(emailService);

        messagingService.sendMessage(recipient, message);
    }
}