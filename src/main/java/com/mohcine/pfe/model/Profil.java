package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private boolean suiviIntervenant;
	private boolean voirCahierDeTexteInteractif;
	private boolean voirConge;
	private boolean voirCours;
	private boolean voirEmargement;
	private boolean voirEmploisdutemps;
	private boolean voirNotes;
	private boolean voirTableauDeBord;

}