package newsletterEmailSender.controller;

import newsletterEmailSender.model.Subscriber;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import newsletterEmailSender.service.SubscriberService;

@Controller
public class SubscriberController {

    private SubscriberService subscriberService;

    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @RequestMapping("/signup")
    public String createSubscriber(Model model) {
        Subscriber subscriber = new Subscriber();
        model.addAttribute("subscriber", subscriber);
        return "signup";
    }

    @PostMapping("/signup")
    public String saveSubscriber(@ModelAttribute("subscriber") Subscriber subscriber) {
        subscriberService.saveSubscriber(subscriber);
        return "signup";
    }
}
