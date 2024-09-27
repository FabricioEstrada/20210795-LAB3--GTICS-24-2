package org.example.lab5_20210795.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "lugares")
public class Lugares {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idLugares")
    private Integer idLugares;

    private String nombre_lugar;
    private String descrip_lugar;
    private Date fecha_lugar;
}
