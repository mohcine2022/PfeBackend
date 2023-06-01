package com.mohcine.pfe.model;
import java.sql.Time;
import jakarta.persistence.*;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CreneauHoraire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Time heureDebut;
	private Time heureFin;
	private String jour;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private Cours cours;
	@ManyToOne
	private Emploidutemps emploidutemps;

}