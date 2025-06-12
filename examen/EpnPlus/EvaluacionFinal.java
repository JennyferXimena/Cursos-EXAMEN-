package examen.EpnPlus;

public class EvaluacionFinal extends Estudiantes {
    private String tipoEvaluacion;
    private String desempleneo;
    private double notaFinal;

    public EvaluacionFinal(int id, String fecha, double precio, int cedula, String periodo, String cursoMatriculado,int idEstudiante, String nombre,
                           int edad, String tipoEvaluacion, String desempleneo, double notaFinal) {
        super(id, fecha, precio, cedula, periodo, cursoMatriculado, idEstudiante, nombre, edad);
        this.tipoEvaluacion = tipoEvaluacion;
        this.desempleneo = desempleneo;
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "EvaluacionFinal: " +
                "tipoEvaluacion='" + tipoEvaluacion + '\'' +
                ", desempleneo='" + desempleneo + '\'' +
                ", notaFinal=" + notaFinal;
    }
}
