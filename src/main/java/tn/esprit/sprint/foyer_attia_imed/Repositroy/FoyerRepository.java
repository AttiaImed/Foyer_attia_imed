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


    List<Foyer> findByBlocsNom(String nom);
    Foyer findByBlocsIdBlockAndIdFoyer(long idBloc,long idFoyer);
    List<Foyer> findByBlocsCapacite(int capacite);
    Foyer findByBlocsNomAndBlocsFoyerUniversiteNom(String nom,String nomUniversite);
}
