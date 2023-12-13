package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Bloc;
import tn.esprit.sprint.foyer_attia_imed.Entites.Foyer;

import java.util.List;

public interface BlockRepository  extends JpaRepository<Bloc,Long> {
    Bloc findByNom(String nom);
    Bloc findByNomLike(String nom);
    Bloc findByNomContains(String nom);
    Bloc findByNomContaining(String nom);

    List<Foyer> findByBlocsChambreTypec(String type);

}
