package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    Chambre findByNom(String nom);
    Chambre findByNomLike(String nom);
    Chambre findByNomContains(String nom);
    Chambre findByNomContaining(String nom);

//    1- Recherche par numéro de chambre
//2- Recherche par type de chambre
//3- Recherche des chambres par bloc
//4- Recherche des chambres par bloc et type de chambre
//5- Recherche des chambres par numéro de chambre et type de chambre
//6- Récupérer des chambres en filtrant par le nom de l'université associée au foyer, l'année de réservation, le nom de l'étudiant dans la réservation et le numéro de chambre

    Chambre findByNumero(int numero);
    Chambre findByTypec(String type);
    Chambre findByBlocNom(String nom);
    Chambre findByBlocNomAndTypec(String nom,String type);
    Chambre findByNumeroAndTypec(int numero,String type);
    Chambre findByBlocFoyerUniversiteNomAndReservationAnneeAndReservationEtudiantNomAndNumero(String nomUniversite,int annee,String nomEtudiant,int numero);
}
