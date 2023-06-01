package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etudiant extends Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String classe;
	@OneToMany
	private List<Inscription> inscriptions;
	@OneToMany
	private List<Note> notes;
	@OneToMany
	private List<Presence> presences;

}