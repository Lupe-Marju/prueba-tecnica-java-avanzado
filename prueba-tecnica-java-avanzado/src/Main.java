import entities.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import static utils.Filtro.filtrar;

public class Main {
    public static void main(String[] args) {
        // Lista de vuelos disponibles
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo("Rayner", LocalDate.of(2025, 7, 12), LocalDate.of(2025, 7, 11), 1, "Madrid", "Barcelona", "RA1211"));
        vuelos.add(new Vuelo("Luftansa", LocalDate.of(2025, 8, 4), LocalDate.of(2025, 8, 4), 2, "Madrid", "Buenos Aires", "LU1312"));
        vuelos.add(new Vuelo("Iberia", LocalDate.of(2025, 7, 15), LocalDate.of(2025, 7, 14), 3, "Barcelona", "Madrid", "IB2121"));
        vuelos.add(new Vuelo("Level", LocalDate.of(2025, 7, 12), LocalDate.of(2025, 7, 12), 4, "Madrid", "Barcelona", "LV2331"));
        vuelos.add(new Vuelo("Rayner", LocalDate.of(2025, 8, 3), LocalDate.of(2025, 8, 2), 5, "Buenos Aires", "Barcelona", "RA1014"));
        vuelos.add(new Vuelo("Vueling", LocalDate.of(2025, 7, 21), LocalDate.of(2025, 7, 21), 6, "Barcelona", "Londres", "VU4231"));
        vuelos.add(new Vuelo("Iberia", LocalDate.of(2025, 8, 10), LocalDate.of(2025, 8, 10), 7, "Madrid", "Londres", "IB1145"));
        vuelos.add(new Vuelo("Level", LocalDate.of(2025, 7, 27), LocalDate.of(2025, 7, 26), 8, "Buenos Aires", "Barcelona", "LV5421"));
        vuelos.add(new Vuelo("Rayner", LocalDate.of(2025, 7, 15), LocalDate.of(2025, 7, 15), 9, "Madrid", "Paris", "RA5426"));
        vuelos.add(new Vuelo("Vueling", LocalDate.of(2025, 8, 1), LocalDate.of(2025, 8, 1), 10, "Paris", "Barcelona", "VU4251"));

        // Fechas desde las cuales seleccionar las vuelos
        Optional<LocalDate> fechaDesde = Optional.ofNullable(null);
        Optional<LocalDate> fechaHasta = Optional.ofNullable(LocalDate.of(2025, 8, 20));

        //Esta en un try/catch por si sucede alguna exception para que no se rompa el programa
        try {
            filtrar(vuelos, fechaDesde, fechaHasta);
        } catch (Exception e) {
            System.out.println("Lo sentimos. Ha sucedido un error, vuelve a intentarlo");
        }
    }
}