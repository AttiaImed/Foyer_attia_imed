package tn.esprit.sprint.foyer_attia_imed.Entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "Etudiant")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "cin")
    private long cin;
    @Column(name = "ecole")
    private String ecole;
    @Column(name = "date_naissance")
    private LocalDate date_naissance;

}
