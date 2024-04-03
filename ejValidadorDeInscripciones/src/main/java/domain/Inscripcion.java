package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {
    public Alumno alumno;
    public List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void agregarMateria(Materia ... materias) {
        Collections.addAll(this.materias, materias);
    }

    public boolean aprobada() {
        return this.materias.stream().allMatch(m -> alumno.puedeCursar(m));
    }
}
