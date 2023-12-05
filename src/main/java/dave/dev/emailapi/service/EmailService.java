package dave.dev.emailapi.service;

import dave.dev.emailapi.model.Email;

public interface EmailService {
    Email sendEmail(Email email);
    Email getEmailById(Long id);
}
