package tn.esprit.sprint.foyer_attia_imed.Services;

import tn.esprit.sprint.foyer_attia_imed.Entites.Chambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> getAllChambres();
    Chambre addChambre(Chambre e);
    void removeChambre(long id);
    Chambre modifyChambre(Chambre e, long id);
}
