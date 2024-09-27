package org.example.lab5_20210795.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "viajes")
public class Viajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idViajes")
    private Integer idViajes;

    private String punto_recojo;
    private String cant_personas;
    private String cant_perros;

    @ManyToOne
    @JoinColumn(name = "Persona_idPersona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "Lugares_idLugares")
    private Lugares lugares;

}
