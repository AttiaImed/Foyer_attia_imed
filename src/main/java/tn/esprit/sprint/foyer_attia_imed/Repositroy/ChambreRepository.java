package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Chambre;

import java.util.Date;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

//    1- Recherche par numéro de chambre
//2- Recherche par type de chambre
//3- Recherche des chambres par bloc
//4- Recherche des chambres par bloc et type de chambre
//5- Recherche des chambres par numéro de chambre et type de chambre
//6- Récupérer des chambres en filtrant par le nom de l'université associée au foyer, l'année de réservation, le nom de l'étudiant dans la réservation et le numéro de chambre

    Chambre findByIdChambre(int numero);
    Chambre findByTypec(String type);
    Chambre findByBlocNom(String nom);
    Chambre findByBlocNomAndTypec(String nom,String type);
    Chambre findByNumeroChambreAndTypec(int numero,String type);
    Chambre findByBlocFoyerUniversiteNomAndReservationsAnneeAndReservationsEtudiantsNomAndNumeroChambre(String nomUniversite, Date annee, String nomEtudiant, int numero);

    //Afficher le nombre des Chambre qui ont le meme type que le type passe en parametre du foyer qui a le meme  nom que le nom passe en paraméte
    long countByTypecAndBlocFoyerNom(String type,String nom);
}
