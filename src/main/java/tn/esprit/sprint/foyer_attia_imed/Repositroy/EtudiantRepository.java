package tn.esprit.sprint.foyer_attia_imed.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.sprint.foyer_attia_imed.Entites.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findAll();
    Etudiant findByCin(long cin);
    Etudiant findByNomLike(String nom);
    Etudiant findByNomContains(String nom);
    Etudiant findByNomContaining(String nom);
}
