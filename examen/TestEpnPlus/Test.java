package examen.TestEpnPlus;

import examen.EpnPlus.*;

public class Test {
    public static void main(String[] args) {
        EpnPlus cursos = new EpnPlus(202015,"12/06/2025",250);
       // System.out.println(cursos);

        Matriculacion matricula = new Matriculacion(202015,"12/06/2025",30,1752122075,"2025-A","Curso Certificado ");
        //System.out.println( "Informacion General "+matricula);

        CursosAcademicos cursosA = new CursosAcademicos(202015,"12/06/2025",30,1752122075,"2025-A",
                "Curso Certificado ","6 Meses","Certificado Valido a nivel nacional","Curso Certificado");
        System.out.println("------------------Informacion General \n "+cursosA);

        Estudiantes estudiantes = new Estudiantes(202015,"12/06/2025",30,1752122075,"2025-A",
                "Curso Certificado ",1515,"Jennyfer Guayanay",23);
        System.out.println(estudiantes);

        EvaluacionFinal examen = new EvaluacionFinal(202015,"12/06/2025",30,1752122075,"2025-A",
                "Curso Certificado ",1515,"Jennyfer Guayanay",23,
                "Un recargo del 25% sobre el precio regular","Estudiante regular",14.25);
        System.out.println(examen);

        CursosAcademicos cursosAcademicos = new CursosAcademicos(202015,"12/06/2025",30,1752122075,"2025-A",
                "Curso Certificado ","5 meses","Certificado Valido a nivel nacional","Curso Certificado");
        System.out.println(cursosAcademicos);
    }

}
