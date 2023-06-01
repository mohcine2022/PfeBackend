package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Inscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String dateInscription;
	@ManyToOne
	private Etudiant etudiant;
	@OneToMany
	private List<Cours> cours;
}