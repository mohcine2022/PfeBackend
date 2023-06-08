package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Inscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateInscription;
	private Double fraisInscription;
	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Formation formation;
}
