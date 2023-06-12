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
	private String description;
	private String titre;
	private LocalDate dateCreation = LocalDate.now();
	@Enumerated(EnumType.STRING)
	private TypeDeTexte typeDeTexte = TypeDeTexte.ANNONCE;
	@ManyToOne
	private Enseignant enseignant;
}






