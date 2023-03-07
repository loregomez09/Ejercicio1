package Principal;

public class Profesor extends Persona {

    private String Departamento;
    private String Categoria;

    public Profesor() {
    }

    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        Departamento = departamento;
        Categoria = categoria;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" +
                "Departamento='" + Departamento + '\'' +
                ", Categoria='" + Categoria + '\'' +
                '}';
    }
}
