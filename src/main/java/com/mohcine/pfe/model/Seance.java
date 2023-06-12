package com.mohcine.pfe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalTime heureDebut;
	private LocalTime heureFin;
	@Enumerated(EnumType.STRING)
	private Jours jour;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private Cours cours;
}
