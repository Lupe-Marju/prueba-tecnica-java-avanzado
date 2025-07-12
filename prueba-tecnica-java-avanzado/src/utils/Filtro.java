package utils;

import entities.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Filtro {
    public static void filtrar(ArrayList<Vuelo> vuelos, Optional <LocalDate> fechaDesde,Optional <LocalDate> fechaHasta) {
        System.out.println("Vuelos disponibles: ");
            // Filtra todos los vuelos desde una fecha dada.
            if (fechaDesde.isPresent() && fechaHasta.isEmpty()) {
                vuelos.stream()
                        .filter(a -> a.getFechaInicio().isAfter(fechaDesde.get()))
                        .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                        .forEach(System.out::println);
            }
            // Filtra los vuelos que hay hasta la fecha dada.
            if (fechaDesde.isEmpty() && fechaHasta.isPresent()) {
                vuelos.stream()
                        .filter(a -> a.getFechaInicio().isBefore(fechaHasta.get()))
                        .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                        .forEach(System.out::println);
            }
            // Muestra todos los vuelos ordenados por fecha de salida
            if (fechaDesde.isEmpty() && fechaHasta.isEmpty()) {
                vuelos.stream()
                        .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                        .forEach(System.out::println);
            }
            // Filtra los vuelos desde una fecha hasta una fecha.
            if (fechaDesde.isPresent() && fechaHasta.isPresent()) {
                vuelos.stream()
                        .filter(a -> a.getFechaInicio().isAfter(fechaDesde.get()))
                        .filter(a -> a.getFechaInicio().isBefore(fechaHasta.get()))
                        .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                        .forEach(System.out::println);
            }
    }
}
