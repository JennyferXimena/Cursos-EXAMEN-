package examen.EpnPlus;

public class CursosAcademicos extends Matriculacion {
    // ATRIBUTOS
    private String duracion;
    private String certificado;
    private String tipoCurso;

    //CONSTRUCTOR
    public CursosAcademicos( int id, String fecha, double precio, int cedula, String periodo, String cursoMatriculado, String duracion, String certificado, String tipoCurso) {
        super(id, fecha, precio, cedula, periodo, cursoMatriculado);
        this.duracion = duracion;
        this.certificado = certificado;
        this.tipoCurso = tipoCurso;
    }

    // get y set
    public String getDuracion() {return duracion;}
    public String getCertificado() {return certificado;}
    public String getTipoCurso() {return tipoCurso;}

    // to string

    @Override
    public String toString() {
        return super.toString()+ '\n'+
                "CURSOSACADEMICOS: " +
                "duracion='" + duracion + '\'' +
                ", certificado='" + certificado + '\'' +
                ", tipoCurso='" + tipoCurso + '\'' +
                '}';
    }
}
