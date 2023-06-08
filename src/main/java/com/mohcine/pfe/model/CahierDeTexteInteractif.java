package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CahierDeTexteInteractif {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dateCreation;
	private String titre;
	private String description;
	@ManyToOne
	private Enseignant enseignant;
}






