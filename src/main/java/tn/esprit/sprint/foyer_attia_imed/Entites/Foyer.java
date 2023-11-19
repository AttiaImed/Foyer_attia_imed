package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFoyer;

    @Column(name = "nomFoyer")
    String nom;

    @Column(name = "capaciteFoyer")
    long capacite;

    @OneToOne(mappedBy="foyer")
    Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    Set<Bloc> blocs;
}
