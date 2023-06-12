package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

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
	private Seance seance;

	@ManyToOne
	private Personne personne;
}
