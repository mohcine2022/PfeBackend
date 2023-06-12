package com.mohcine.pfe.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.text.MessageFormat;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	private Double cout;
	@ManyToOne
	private Enseignant enseignant;

	@Transient
	@JsonProperty("nomEnseignant")
	public String getNomEnseignant() {
		return enseignant != null ? MessageFormat.format("M. {0} {1}",  enseignant.getNom(), enseignant.getPrenom()): "-";
	}
}
