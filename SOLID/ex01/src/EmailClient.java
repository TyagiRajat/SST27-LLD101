public class EmailClient implements IEmailClient {
    @Override
    public void sendEmail(String to, String message) {
        System.out.println("[EMAIL to=" + to + "] " + message);
    }
}