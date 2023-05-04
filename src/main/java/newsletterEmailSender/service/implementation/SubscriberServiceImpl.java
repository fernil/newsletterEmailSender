package newsletterEmailSender.service.implementation;

import newsletterEmailSender.model.Subscriber;
import newsletterEmailSender.repository.SubscriberRepository;
import newsletterEmailSender.service.SubscriberService;
import org.springframework.stereotype.Service;

@Service
public class SubscriberServiceImpl implements SubscriberService {
    private SubscriberRepository subscriberRepository;

    public SubscriberServiceImpl(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    @Override
    public Subscriber saveSubscriber(Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }
}
