package guru.springframework.RecipeProject.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categorySet")
    private Set<Recipe> recipeset;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipeset() {
        return recipeset;
    }

    public void setRecipeset(Set<Recipe> recipeset) {
        this.recipeset = recipeset;
    }
}
