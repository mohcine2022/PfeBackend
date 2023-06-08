package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Presence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private StatutPresence statut = StatutPresence.PRESENT;

	@ManyToOne
	private CreneauHoraire creneauHoraire;

	@ManyToOne
	private Personne personne;
}
