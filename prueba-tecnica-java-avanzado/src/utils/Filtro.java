package utils;

import entities.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Filtro {
    public static void filtrar(ArrayList<Vuelo> vuelos, LocalDate fechaDesde, LocalDate fechaHasta) {
        System.out.println("Vuelos disponibles: ");
        try {
            // Filtra todos los vuelos desde una fecha dada.
            if (fechaDesde != null && fechaHasta == null) {
                vuelos.stream()
                        .filter(a -> a.getFechaInicio().isAfter(fechaDesde))
                        .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                        .forEach(System.out::println);
            }
            // Filtra los vuelos que hay hasta la fecha dada.
            if (fechaDesde == null && fechaHasta != null) {
                vuelos.stream()
                        .filter(a -> a.getFechaInicio().isBefore(fechaHasta))
                        .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                        .forEach(System.out::println);
            }
            // Muestra todos los vuelos ordenados por fecha de salida
            if (fechaDesde == null && fechaHasta == null) {
                vuelos.stream()
                        .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                        .forEach(System.out::println);
            }
            // Filtra los vuelos desde una fecha hasta una fecha.
            vuelos.stream()
                    .filter(a -> a.getFechaInicio().isAfter(fechaDesde))
                    .filter(a -> a.getFechaInicio().isBefore(fechaHasta))
                    .sorted(Comparator.comparing(Vuelo::getFechaInicio))
                    .forEach(System.out::println);
        // LocalDate no le gusta trabajar con null valores y tira una excepcion de esta manaera la agarramos y no tira error.
        } catch (NullPointerException e) {
        }
    }
}
