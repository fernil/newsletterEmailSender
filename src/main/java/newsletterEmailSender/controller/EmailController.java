package newsletterEmailSender.controller;

import newsletterEmailSender.service.EmailSenderService;
import org.springframework.stereotype.Controller;

@Controller
public class EmailController {

    private final EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }
//
//    @PostMapping
//    public ResponseEntity sendEmail(@RequestBody Email email) {
//        emailSenderService.sendEmail(email.getTo(),email.getSubject(), email.getMessage());
//        return ResponseEntity.ok("Email sent");
//    }

}
