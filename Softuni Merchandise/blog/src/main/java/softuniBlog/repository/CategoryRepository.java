package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Category;

/**
 * Created by pavilion on 01-Dec-16.
 */
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
