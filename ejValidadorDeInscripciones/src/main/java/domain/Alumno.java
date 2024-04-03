package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    public String nombre;
    public Integer legajo;
    public String apellido;
    public LocalDate fechaDeNacimiento;
    public List<Materia> materiasAprobadas;


    public Alumno(String nombre){
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean puedeCursar(Materia materia){
        return materia.getCorrelativas().stream().allMatch(c -> this.aprobo((Materia) c));
    }

    private boolean aprobo(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }

    public void agregarMateriasAprobadas(Materia ... materiasAprobadas) {
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }
}
