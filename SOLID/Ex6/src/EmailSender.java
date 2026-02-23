public class EmailSender extends NotificationSender {

    public EmailSender(AuditLog audit) {
        super(audit);
    }

    @Override
    public void send(Notification n) {

        if (n == null) {
            throw new IllegalArgumentException("notification cannot be null");
        }

        System.out.println("EMAIL -> to=" + n.email
                + " subject=" + n.subject
                + " body=" + n.body);

        audit.add("email sent");
    }
}