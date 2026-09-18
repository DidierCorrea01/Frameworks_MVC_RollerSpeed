package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;
import java.util.ArrayList;

import com.rollerspeed.rollerspeed.model.Servicio;
import com.rollerspeed.rollerspeed.model.Evento;
import com.rollerspeed.rollerspeed.model.Valor;

@Controller
public class SitioController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/mision")
    public String mision() {
        return "mision";
    }

    @GetMapping("/vision")
    public String vision() {
        return "vision";
    }

    @GetMapping("/valores")
    public String valores(Model model) {
        List<Valor> listaValores = new ArrayList<>();
        listaValores.add(new Valor("Disciplina", "Cumplir horarios de entrenamiento y seguir la metodología con constancia, dentro y fuera de la pista."));
        listaValores.add(new Valor("Respeto", "Hacia compañeros, instructores y rivales, tanto en el entrenamiento como en la competencia."));
        listaValores.add(new Valor("Trabajo en equipo", "El patinaje también se entrena en grupo: apoyarse mutuamente hace mejores atletas."));
        listaValores.add(new Valor("Constancia", "Los resultados en el patinaje de velocidad llegan con la práctica sostenida en el tiempo."));
        listaValores.add(new Valor("Superación personal", "Cada alumno compite primero contra su propio récord, antes que contra los demás."));

        model.addAttribute("valores", listaValores);
        return "valores";
    }

    @GetMapping("/servicios")
    public String servicios(Model model) {
        List<Servicio> listaServicios = new ArrayList<>();
        listaServicios.add(new Servicio("Clases para principiantes", "Iniciación al patinaje para niños y adultos sin experiencia previa."));
        listaServicios.add(new Servicio("Entrenamiento de velocidad", "Preparación física y técnica orientada a la competencia."));
        listaServicios.add(new Servicio("Preparación para competencias", "Entrenamiento especializado para torneos regionales y nacionales."));

        model.addAttribute("servicios", listaServicios);
        return "servicios";
    }

    @GetMapping("/eventos")
    public String eventos(Model model) {
        List<Evento> listaEventos = new ArrayList<>();
        listaEventos.add(new Evento("15", "Sep", "Interno", "Torneo interno de patinaje", "9:00 a.m. · Pista principal Roller Speed"));
        listaEventos.add(new Evento("28", "Sep", "Comunidad", "Jornada de puertas abiertas", "3:00 p.m. · Entrada libre para nuevos aspirantes"));
        listaEventos.add(new Evento("10", "Oct", "Regional", "Copa regional de patinaje de velocidad", "8:00 a.m. · Santa Marta, Magdalena"));

        model.addAttribute("eventos", listaEventos);
        return "eventos";
    }
}