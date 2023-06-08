package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.Set;

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
	private ResponsableDeFormation responsableDeFormation;

	@OneToMany
	private Set<Presence> presences;
}
