package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Bloc;
import tn.esprit.sprint.foyer_attia_imed.Entites.Foyer;

import java.util.List;

public interface BlockRepository  extends JpaRepository<Bloc,Long> {
    Bloc findByNom(String nom);


//2- Recherche par capaciteBloc
//3- Recherche par nomBloc et capaciteBloc
//4- Recherche par nomBloc en ignorant la casse
//5- Recherche par capaciteBloc supérieure à une valeur donnée
//6- Recherche par nomBloc contenant une sous-chaîne
//7- Tri par nomBloc par ordre alphabétique

//8- Recherche par nomBloc ou capaciteBloc
//9- Recherche du bloc d'un foyer spécifique
//            10- Recherche du bloc pour un foyer d'une université donnée
Bloc findByNomAndCapacite(String nom, int capacite);
Bloc findByNomIgnoreCase(String nom);
List<Bloc> findByCapaciteGreaterThan(int capacite);
List<Bloc> findByNomContains(String nom);
List<Bloc> findByNomContaining(String nom);
List<Bloc> findByNomOrCapacite(String nom, int capacite);
Bloc findByFoyerNom(String nom);
Bloc findByFoyerUniversiteNom(String nom);

}
