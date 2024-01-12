package ro.uvt.example;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ClientComponent {
    private final TransientComponent tc;
    private final SingletonComponent sc;

    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " + this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
    }

    public String getClientMessage() {
        return "Hello from ClientComponent = " + this;
    }
}
