package org.example.lab5_20210795.Repositories;

import org.example.lab5_20210795.entity.Viajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ViajeRepository extends JpaRepository<Viajes, Integer> {

}
