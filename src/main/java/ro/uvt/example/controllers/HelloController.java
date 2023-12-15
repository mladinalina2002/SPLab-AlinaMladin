package ro.uvt.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.example.ClientComponent;

@RestController
@RequestMapping("/")
public class HelloController {
    private final ClientComponent clientComponent;

    @Autowired
    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping
    public String sayHello() {
        return clientComponent.getClientMessage();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
