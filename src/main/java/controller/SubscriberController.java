package controller;

import model.Subscriber;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.SubscriberService;

@Controller
public class SubscriberController {
    private SubscriberService subscriberService;

    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @PostMapping
    public ResponseEntity<String> saveSubscriber(@ModelAttribute Subscriber subscriber){
        subscriberService.save(subscriber);
        return ResponseEntity.ok("subscriber added");
    }
}
