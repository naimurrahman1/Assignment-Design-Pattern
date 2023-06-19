public class EmailServiceAdapter implements MessagingService{
    private final EmailService emailService;

    public EmailServiceAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void sendMessage(String recipient, String message) {
        // Convert the modern message format to the email format
        String emailMessage = formatMessage(message);
        emailService.sendEmail(recipient, emailMessage);
    }

    private String formatMessage(String message) {
        // Add any necessary formatting or conversion logic here
        return message;
    }
}
