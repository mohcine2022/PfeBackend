package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etudiant extends Personne {
	private String classe;
	private String niveau;
}
