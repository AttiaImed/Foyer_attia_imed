package tn.esprit.sprint.foyer_attia_imed.Services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprint.foyer_attia_imed.Repositroy.ChambreRepository;
import tn.esprit.sprint.foyer_attia_imed.Services.ChambreService;
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements ChambreService {
    ChambreRepository chambreRepository;
}
