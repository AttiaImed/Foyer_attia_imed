package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Universite;

import java.util.Date;
import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
//    1- Afficher la liste des universités qui ont des étudiants dont leurs noms contiennet la chaine de caractère en paramètre et leurs dates de naissance entre deux dates passées en paramètre
    List<Universite> findByFoyerBlocsChambreReservationsEtudiantsNomContainingAndFoyerBlocsChambreReservationsEtudiantsDateNaissanceBetween(String nom, Date dateDebut, Date dateFin);

}
