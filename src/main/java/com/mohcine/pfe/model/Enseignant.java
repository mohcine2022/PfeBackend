package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Enseignant extends Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany
	private List<Cours> cours;
	@ManyToOne
	private Emploidutemps emploidutemps;
	@OneToMany
	private List<Note> note;
	@OneToMany
	private List<CahierDeTexteInteractif> cahierDeTexteInteractifs;
	@OneToMany
	private List<Conge> conge;

}
