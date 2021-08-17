package uz.pdp.codingbatcomrestfullapimain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.codingbatcomrestfullapimain.entity.Example;

public interface ExampleRepository extends JpaRepository<Example, Integer> {
}
