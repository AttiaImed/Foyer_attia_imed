package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
    private long idBlock;
    @Column(name = "nomBlock")
    private String nom;
    @Column(name = "capaticeBloc")
    private long capacite;
}
