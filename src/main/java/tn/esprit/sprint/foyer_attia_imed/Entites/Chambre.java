package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Table(name = "Chambre")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    @Column(name = "numeroChambre")
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private typeChambre typec;
}
