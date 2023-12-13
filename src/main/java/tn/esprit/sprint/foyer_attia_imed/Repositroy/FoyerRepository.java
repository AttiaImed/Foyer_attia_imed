package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Foyer;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
    Foyer findByNom(String nom);
    List<Foyer> findByCapaciteGreaterThan(int capacite);
    List<Foyer> findByCapaciteLessThan(int capacite);
    List<Foyer> findByCapaciteBetween(int min,int max);
    Foyer findByUniversiteNom(String nom);

//    1- Recherche des foyers d'un bloc spécifique
//            2- Recherche du foyer par son idFoyer pour un bloc donné
//3- Recherche des foyers d'un bloc ayant une capacité spécifique
//            4- Recherche du foyer d'un bloc spécifique dans une université

    List<Foyer> findByBlocsNom(String nom);
    Foyer findByBlocsIdBlockAndIdFoyer(long idBloc,long idFoyer);
    List<Foyer> findByBlocsCapacite(int capacite);
    Foyer findByBlocsNomAndBlocsFoyerUniversiteNom(String nom,String nomUniversite);
}
