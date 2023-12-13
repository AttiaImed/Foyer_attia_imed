package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    Chambre findByNom(String nom);
    Chambre findByNomLike(String nom);
    Chambre findByNomContains(String nom);
    Chambre findByNomContaining(String nom);
}
