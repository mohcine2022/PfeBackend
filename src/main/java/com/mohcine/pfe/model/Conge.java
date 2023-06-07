package com.mohcine.pfe.model;
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
	private LocalDate debutConge;
	private LocalDate finConge;
	private int idConge;
	@ManyToOne
	private Enseignant enseignant;
	@ManyToOne
	private ResponsableDeFormation responsableDeFormation;
}