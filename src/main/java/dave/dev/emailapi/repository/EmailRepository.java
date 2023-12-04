package dave.dev.emailapi.repository;

import dave.dev.emailapi.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmailRepository extends JpaRepository<Email, Long> {
}
