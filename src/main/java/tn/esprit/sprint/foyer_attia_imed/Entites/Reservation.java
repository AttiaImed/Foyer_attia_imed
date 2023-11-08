package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Table(name = "Reservation")
@Entity
public class Reservation {
    @Id
    private String idReservation;

    @Column(name = "anneeUniversitaire")
    private Date annee;

    @Column(name = "estValide")
    private boolean estValide;
}
