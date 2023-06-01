package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emploidutemps {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private LocalDate dateDebut;
	private LocalDate dateFin;
	@OneToMany
	private List<CreneauHoraire> creneauHoraires;

}