package tn.esprit.sprint.foyer_attia_imed.Services;

import tn.esprit.sprint.foyer_attia_imed.Entites.Etudiant;

import java.util.List;

public interface EtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    void removeEtudiant(long id);
    Etudiant modifyEtudiant(Etudiant e, long id);

}
