package guru.springframework.RecipeProject.repositories;

import guru.springframework.RecipeProject.domain.unitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;




public interface unitMeasureRepository extends CrudRepository<unitOfMeasure, Long> {
    Optional<unitOfMeasure> findByDescription(String description);
}
