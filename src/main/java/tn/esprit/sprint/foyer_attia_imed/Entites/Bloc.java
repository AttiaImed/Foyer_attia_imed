package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.*;

@Entity
@Table(name = "Bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBlock;
    @Column(name = "nomBlock")
    private String nom;
    @Column(name = "capaticeBloc")
    private long capacite;
}
