package ro.uvt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.uvt.models.Author;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}
