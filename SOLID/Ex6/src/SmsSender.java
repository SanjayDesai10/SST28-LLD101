public class SmsSender extends NotificationSender {

    public SmsSender(AuditLog audit) {
        super(audit);
    }

    @Override
    public void send(Notification n) {

        if (n == null) {
            throw new IllegalArgumentException("notification cannot be null");
        }

        System.out.println("SMS -> to=" + n.phone
                + " body=" + n.body);

        audit.add("sms sent");
    }
}