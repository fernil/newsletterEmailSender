package newsletterEmailSender.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Email {
    private String to;
    private String message;
    private String subject;
}
