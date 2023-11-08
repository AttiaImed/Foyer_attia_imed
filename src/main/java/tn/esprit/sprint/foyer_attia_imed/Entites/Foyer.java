package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;

    @Column(name = "nomFoyer")
    private String nom;

    @Column(name = "capaciteFoyer")
    private long capacite;
}
