package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Presence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String statut;
	@OneToMany
	private List<Emargement> emargements;
}