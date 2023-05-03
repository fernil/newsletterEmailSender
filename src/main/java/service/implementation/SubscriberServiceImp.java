package service.implementation;

import model.Subscriber;
import repository.SubscriberRepository;
import service.SubscriberService;

public class SubscriberServiceImp implements SubscriberService {
    private SubscriberRepository subscriberRepository;

    public SubscriberServiceImp(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    @Override
    public Subscriber save(Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }
}
