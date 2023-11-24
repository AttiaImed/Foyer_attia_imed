package tn.esprit.sprint.foyer_attia_imed.Services;

import tn.esprit.sprint.foyer_attia_imed.Entites.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> getAllUniversites();
    Universite addUniversite(Universite e);
    void removeUniversite(long id);
    Universite modifyUniversite(Universite e, long id);
}
