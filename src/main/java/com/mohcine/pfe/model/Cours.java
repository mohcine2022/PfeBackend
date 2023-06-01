package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String description;
	private String nomDuProf;
	private String titre;
	@ManyToOne
	private Enseignant enseignant;
}