package tn.esprit.sprint.foyer_attia_imed.Entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Table(name = "Bloc")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBlock;
    @Column(name = "nomBlock")
    String nom;
    @Column(name = "capaticeBloc")
    long capacite;

    @OneToMany(mappedBy="bloc")
    Set<Chambre> chambre;

    @JsonIgnoreProperties("foyer")
    @ManyToOne
    Foyer foyer;
}
