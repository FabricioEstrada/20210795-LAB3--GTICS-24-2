package org.example.lab5_20210795.Controller;

import org.example.lab5_20210795.Repositories.ViajeRepository;
import org.example.lab5_20210795.entity.Viajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class Controlador {
    @Autowired
    ViajeRepository viajeRepository;

    @GetMapping("")
    public String index(){
        return "paginaprincipal";
    }
    @GetMapping("/viajes")
    public String listarViajes(Model model) {
        List<Viajes> viajes = viajeRepository.findAll();
        model.addAttribute("viajes", viajes);
        return "viajes";
    }

    @GetMapping("/detalles/{id}")
    public String verDetalles(@PathVariable Integer id, Model model) {
        Optional<Viajes> viaje = viajeRepository.findById(id);
        model.addAttribute("viaje", viaje);
        return "detalle-viaje"; // Vista no editable con detalles del viaje
    }

    @GetMapping("/editar/{id}")
    public String editarViaje(@PathVariable Integer id, Model model) {
        Optional<Viajes> viaje = viajeRepository.findById(id);
        model.addAttribute("viaje", viaje);
        return "editar-viaje"; // Vista editable para modificar el viaje
    }

    @PostMapping("/borrar/{id}")
    public String borrarViaje(@PathVariable Integer id) {
        viajeRepository.deleteById(id);
        return "redirect:/viajes"; // Redirige a la lista de viajes
    }
}
