package newsletterEmailSender.controller;

import newsletterEmailSender.model.Email;
import newsletterEmailSender.service.EmailSenderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send-email")
    public ResponseEntity sendEmail(@RequestBody Email email) {
        emailSenderService.sendEmail(email.getTo(),email.getSubject(), email.getMessage());
        return ResponseEntity.ok("Email sent");
    }

}
