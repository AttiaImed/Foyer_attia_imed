package tn.esprit.sprint.foyer_attia_imed.Services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprint.foyer_attia_imed.Repositroy.FoyerRepository;
import tn.esprit.sprint.foyer_attia_imed.Services.FoyerService;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements FoyerService {
    FoyerRepository foyerRepository;
}
