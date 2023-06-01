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
	private Long Id;
	private String statut;
	@ManyToOne
	private Etudiant etudiant;
	@OneToMany
	private List<Emargement> emargements;
	@ManyToOne
	private Enseignant enseignant;

}