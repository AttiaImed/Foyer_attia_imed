package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PUBLIC)
@Entity
@Table
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;

    @Column(name = "nomFoyer")
    private String nom;

    @Column(name = "capaciteFoyer")
    private long capacite;
}
