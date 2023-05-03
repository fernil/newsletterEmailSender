package newsletterEmailSender.repository;

import newsletterEmailSender.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
}
