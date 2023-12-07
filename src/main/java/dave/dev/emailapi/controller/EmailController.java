package dave.dev.emailapi.controller;

import dave.dev.emailapi.model.Email;
import dave.dev.emailapi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Email> sendEmail(@RequestBody Email email,) {
        Email sentEmail = emailService.sendEmail(email);
        return new ResponseEntity<>(sentEmail, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Email> getEmailById(@PathVariable Long id) {
        Email email = emailService.getEmailById(id);
        return new ResponseEntity<>(email, HttpStatus.OK);
    }
}
