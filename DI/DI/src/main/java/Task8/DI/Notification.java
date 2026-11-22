package Task8.DI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Notification {
    private final MessageService service;

    @Autowired
    public Notification(MessageService service) {
        this.service = service;
    }
    @Override
    public void run(String args) {
        service.send("Hello Boss!");
    }
}
