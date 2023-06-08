package com.mohcine.pfe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String descriptions;
    private Date dateDebut;
    private Date dateFin;
    private int placesDisponibles;
    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Cours.class)
    @JoinTable(
            name = "formation_cours",
            joinColumns = @JoinColumn(name = "formation_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "cours_id", referencedColumnName = "id")
    )
    private Set<Cours> cours;
}
