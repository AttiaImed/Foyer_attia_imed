package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.*;

@Table(name = "Chambre")
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    @Column(name = "numeroChambre")
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private typeChambre typec;
}
