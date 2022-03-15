package guru.springframework.RecipeProject.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class unitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
