import java.util.ArrayList;
public class MessagingService {
    private ArrayList<Message> list;

    public MessagingService() {
        this.list = new ArrayList<>();
    }
    public void add(Message message) {
        String m = message.getContent();
        if(m.length() <= 280) {
            this.list.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.list;
    }
}
