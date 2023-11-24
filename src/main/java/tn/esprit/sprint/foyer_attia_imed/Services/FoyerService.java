package tn.esprit.sprint.foyer_attia_imed.Services;

import tn.esprit.sprint.foyer_attia_imed.Entites.Foyer;

import java.util.List;

public interface FoyerService {
    List<Foyer> getAllFoyers();
    Foyer addFoyer(Foyer e);
    void removeFoyer(long id);
    Foyer modifyFoyer(Foyer e, long id);
}
