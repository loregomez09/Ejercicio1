package Principal;

public class Estudiante extends Persona {

    private String Carrera;
    private int Semestre;

    public Estudiante() {
    }

    public Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        Carrera = carrera;
        Semestre = semestre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int semestre) {
        Semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString()+ "Estudiante{" +
                "Carrera='" + Carrera + '\'' +
                ", Semestre=" + Semestre +
                '}';
    }
}
