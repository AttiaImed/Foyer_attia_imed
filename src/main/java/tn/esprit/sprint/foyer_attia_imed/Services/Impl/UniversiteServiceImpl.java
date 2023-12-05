package tn.esprit.sprint.foyer_attia_imed.Services.Impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.sprint.foyer_attia_imed.Entites.Universite;
import tn.esprit.sprint.foyer_attia_imed.Repositroy.UniversiteRepository;
import tn.esprit.sprint.foyer_attia_imed.Services.FoyerService;
import tn.esprit.sprint.foyer_attia_imed.Services.UniversiteService;

import java.util.List;

@Primary
@Service("UniversiteServiceImpl")
@AllArgsConstructor
public class UniversiteServiceImpl implements UniversiteService {
    UniversiteRepository universiteRepository;
    FoyerService foyerService;

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        if(e.getFoyer() != null){
            foyerService.addFoyer(e.getFoyer());
        }
        return universiteRepository.save(e);
    }

    @Override
    public void removeUniversite(long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite modifyUniversite(Universite updatedUniversite, long id) {
        Universite universiteToModify = universiteRepository.findById(id).orElse(null);

        if (universiteToModify != null) {
            universiteToModify.setNom(updatedUniversite.getNom());
            universiteToModify.setAdresse(updatedUniversite.getAdresse());

            return universiteRepository.save(universiteToModify);
        } else {
            throw new EntityNotFoundException("Universite with ID " + id + " not found");
        }
    }

}
