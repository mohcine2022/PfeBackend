package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate datePublication;
	private Double note;
	@ManyToOne
	private Cours cours;
	@ManyToOne
	private Etudiant etudiant;
}
