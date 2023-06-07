package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Emargement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateEmargement;
	@ManyToOne
	private ResponsableDeFormation resposableDeFormation;
	@ManyToOne
	private Presence presence;
}