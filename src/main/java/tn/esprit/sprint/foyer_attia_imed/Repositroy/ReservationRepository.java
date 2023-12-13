package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    Reservation findByNom(String nom);
    Reservation findByNomLike(String nom);
    Reservation findByNomContains(String nom);
    Reservation findByNomContaining(String nom);
    Reservation findByNomStartsWith(String nom);
//
//    1- Recherche des réservations validées
//2- Recherche des réservations par l'id de l'étudiant
//3- Recherche des réservations par année et validité

    Reservation findByValide(boolean valide);
    Reservation findByEtudiantIdEtudiant(long idEtudiant);
    Reservation findByAnneeAndValide(int annee,boolean valide);
}
