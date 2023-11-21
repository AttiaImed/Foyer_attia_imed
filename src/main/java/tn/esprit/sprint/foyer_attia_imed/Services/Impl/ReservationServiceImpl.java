package tn.esprit.sprint.foyer_attia_imed.Services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprint.foyer_attia_imed.Repositroy.ReservationRepository;
import tn.esprit.sprint.foyer_attia_imed.Services.ReservationService;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    ReservationRepository reservationRepository;
}
