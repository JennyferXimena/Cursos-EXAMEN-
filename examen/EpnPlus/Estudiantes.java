package examen.EpnPlus;

public class Estudiantes extends  Matriculacion{
    private int idEstudiante;
    private  String nombre;
    private int edad;

    @Override
    public String toString() {
        return "ESTUDIANTES: " +
                "idEstudiante=" + idEstudiante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad ;
    }

    public Estudiantes(int id, String fecha, double precio, int cedula, String periodo, String cursoMatriculado,int idEstudiante, String nombre, int edad) {
        super(id, fecha, precio, cedula, periodo, cursoMatriculado);
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.edad = edad;

    }
}
