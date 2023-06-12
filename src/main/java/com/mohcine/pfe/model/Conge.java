package com.mohcine.pfe.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Conge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	@ManyToOne
	private Enseignant enseignant;
	@ManyToOne
	private ResponsableDeFormation responsableDeFormation;

	@Transient
	@JsonProperty("nomEnseignant")
	public String nomEnseignant() {
		return enseignant != null ? enseignant.getNom()+ " "+enseignant.getPrenom(): "";
	}

	@Transient
	@JsonProperty("nomResponsable")
	public String nomResponsable() {
		return responsableDeFormation != null ? responsableDeFormation.getNom()+ " "+responsableDeFormation.getPrenom(): "";
	}
}
