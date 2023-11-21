package tn.esprit.sprint.foyer_attia_imed.Services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprint.foyer_attia_imed.Repositroy.UniversiteRepository;
import tn.esprit.sprint.foyer_attia_imed.Services.UniversiteService;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements UniversiteService {
    UniversiteRepository universiteRepository;
}
