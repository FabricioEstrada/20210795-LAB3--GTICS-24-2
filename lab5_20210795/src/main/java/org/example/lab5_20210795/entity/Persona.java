package org.example.lab5_20210795.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idPersona")
    private Integer idPersona;

    private String nombre;
    private String dni;
    private String celular;
    private String tipo_persona;
}
