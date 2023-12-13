package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Reservation;

import java.util.Date;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
//    Reservation findByNom(String nom);
//    Reservation findByNomLike(String nom);
//    Reservation findByNomContains(String nom);
//    Reservation findByNomContaining(String nom);
//    Reservation findByNomStartsWith(String nom);
//
//    1- Recherche des réservations validées
//2- Recherche des réservations par l'id de l'étudiant
//3- Recherche des réservations par année et validité

    Reservation findByEstValide(boolean valide);
    Reservation findByEtudiantsId(long idEtudiant);
    Reservation findByAnneeAndEstValide(Date annee, boolean valide);
}
