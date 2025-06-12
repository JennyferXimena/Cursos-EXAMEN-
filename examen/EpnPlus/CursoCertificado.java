package examen.EpnPlus;

public class CursoCertificado extends Estudiantes {
    private String horarios;
    private String examenFinal;
    private String descuentos;

    public CursoCertificado(int id, String fecha, double precio, int cedula, String periodo, String cursoMatriculado,int idEstudiante, String nombre,
                            int edad, String horarios, String examenFinal, String descuentos) {
        super(id, fecha, precio, cedula, periodo, cursoMatriculado, idEstudiante, nombre, edad);
        this.horarios = horarios;
        this.examenFinal = examenFinal;
        this.descuentos = descuentos;
    }

    @Override
    public String toString() {
        return "CursoCertificado{" +
                "horarios='" + horarios + '\'' +
                ", examenFinal='" + examenFinal + '\'' +
                ", descuentos='" + descuentos + '\'' +
                '}';
    }
}
