package newsletterEmailSender.service;

import newsletterEmailSender.model.Subscriber;
import org.springframework.stereotype.Service;


public interface SubscriberService {
    Subscriber saveSubscriber(Subscriber subscriber);

}
