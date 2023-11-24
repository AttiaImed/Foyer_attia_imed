package tn.esprit.sprint.foyer_attia_imed.Services;

import tn.esprit.sprint.foyer_attia_imed.Entites.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Reservation addReservation(Reservation e);
    void removeReservation(String id);
    Reservation modifyReservation(Reservation e, String id);
}
