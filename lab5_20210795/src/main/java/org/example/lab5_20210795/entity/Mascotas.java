package org.example.lab5_20210795.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "mascotas")
public class Mascotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idMascotas")
    private Integer idMascotas;

    private String nombre_mascota;
    private String genero;
    private String edad;
    private String fecha_nacimiento;
    private String Vacunado;
    private String Desparasitado;

    @ManyToOne
    @JoinColumn(name = "Persona_idPersona")
    private Persona persona;
}
