package examen.EpnPlus;

public class Matriculacion extends EpnPlus{
    // ATRIBUTOS
    private int cedula;
    private String periodo;
    private String cursoMatriculado;

     // CONSTRUCTORES
    public Matriculacion(int id, String fecha, double precio, int cedula, String periodo, String cursoMatriculado) {
        super(id, fecha,precio);
        this.cedula = cedula;
        this.periodo = periodo;
        this.cursoMatriculado = cursoMatriculado;
    }
    // SET - GET
    public void setCedula(int id) { this.cedula = id;}
    public String getPeriodo() {return periodo;}
    public String getCursoMatriculado() {return cursoMatriculado;}

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + '\n'+
                "MATRICULACION: "+
                "id=" + cedula +
                ", periodo='" + periodo + '\'' +
                ", cursoMatriculado='" + cursoMatriculado + '\'' +
                '}';
    }
}
