package tn.esprit.sprint.foyer_attia_imed.Entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
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
    long idChambre;
    @Column(name = "numeroChambre")
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    typeChambre typec;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Reservation> reservations;

    @ManyToOne
    Bloc bloc;

}
