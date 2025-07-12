package entities;

import java.time.LocalDate;

public class Vuelo {
    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    public Vuelo(String empresa, LocalDate fechaFinal, LocalDate fechaInicio, int id, String lugarLlegada, String lugarSalida, String nombreVuelo) {
        this.empresa = empresa;
        this.fechaFinal = fechaFinal;
        this.fechaInicio = fechaInicio;
        this.id = id;
        this.lugarLlegada = lugarLlegada;
        this.lugarSalida = lugarSalida;
        this.nombreVuelo = nombreVuelo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public int getId() {
        return id;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    @Override
    public String toString() {
        return id + ". El vuelo " + nombreVuelo + " de la empresa " + empresa + " con salida desde " + lugarSalida + " con destino en " + lugarLlegada + " con fecha de salida en " + fechaInicio + " y con fecha de llegada en " + fechaFinal;
    }
}
