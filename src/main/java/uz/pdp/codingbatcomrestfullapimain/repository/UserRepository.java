package uz.pdp.codingbatcomrestfullapimain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.codingbatcomrestfullapimain.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByEmail(String email);
    boolean existsByEmailNot(String email);
}
