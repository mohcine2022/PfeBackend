package com.mohcine.pfe.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ResponsableDeFormation extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private List<Cours> cours;
    @OneToMany
    private List<Emargement> emargements;

}