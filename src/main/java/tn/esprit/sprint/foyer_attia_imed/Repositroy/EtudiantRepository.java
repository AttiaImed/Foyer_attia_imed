package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Etudiant;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findAll();
    Etudiant findByCin(long cin);
    Etudiant findByNomLike(String nom);
    Etudiant findByNomContains(String nom);
    Etudiant findByNomContaining(String nom);

//    1- Recherche par nom et prénom de l'étudiant
//            2- Recherche par CIN de l'étudiant
//            3- Recherche des étudiants par date de naissance après une certaine date
//4- Recherche des étudiants par nom d'école
//            5- Recherche des étudiants par réservation (id de réservation)
//6- Recherche des étudiants par réservation (année de réservation)
//7- Recherche des étudiants par nom d'école et date de naissance après une certaine date
//            8- Recherche des étudiants par réservation pour une année donnée et triés par date de naissance

    Etudiant findByNomAndPrenom(String nom,String prenom);
    Etudiant findByCinAndNom(long cin,String nom);
    List<Etudiant> findByDateNaissanceAfter(Date date);
    List<Etudiant> findByEcole(String nom);
    Etudiant findByReservationsIdReservation(String idReservation);
    List<Etudiant> findByReservationsAnnee(Date annee);
    List<Etudiant> findByEcoleAndDateNaissanceAfter(String nom, LocalDate date);
    List<Etudiant> findByReservationsAnneeOrderByDateNaissance(Date annee);


//    Afficher le nombre total des étudiants

    long countBy();

}
