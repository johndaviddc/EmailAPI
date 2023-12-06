package dave.dev.emailapi.service;

import dave.dev.emailapi.exception.EmailNotFoundException;
import dave.dev.emailapi.model.Email;
import dave.dev.emailapi.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Override
    public Email sendEmail(Email email) {
        return emailRepository.save(email);
    }

    @Override
    public Email getEmailById(Long id) {
        return emailRepository.findById(id)
                .orElseThrow(() -> new EmailNotFoundException("Email not found with id: " + id));
    }
}
