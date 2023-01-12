package Modelos;
// Generated 03-dic-2022 18:40:23 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Examenes generated by hbm2java
 */
public class Examenes  implements java.io.Serializable {


     private ExamenesId id;
     private Matriculas matriculas;
     private Date dfecexam;
     private BigDecimal nnotaexam;

    public Examenes() {
    }

	
    public Examenes(ExamenesId id, Matriculas matriculas, BigDecimal nnotaexam) {
        this.id = id;
        this.matriculas = matriculas;
        this.nnotaexam = nnotaexam;
    }
    public Examenes(ExamenesId id, Matriculas matriculas, Date dfecexam, BigDecimal nnotaexam) {
       this.id = id;
       this.matriculas = matriculas;
       this.dfecexam = dfecexam;
       this.nnotaexam = nnotaexam;
    }
   
    public ExamenesId getId() {
        return this.id;
    }
    
    public void setId(ExamenesId id) {
        this.id = id;
    }
    public Matriculas getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Matriculas matriculas) {
        this.matriculas = matriculas;
    }
    public Date getDfecexam() {
        return this.dfecexam;
    }
    
    public void setDfecexam(Date dfecexam) {
        this.dfecexam = dfecexam;
    }
    public BigDecimal getNnotaexam() {
        return this.nnotaexam;
    }
    
    public void setNnotaexam(BigDecimal nnotaexam) {
        this.nnotaexam = nnotaexam;
    }
    public String fechaComoCadena(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaComoCadena = sdf.format(this.dfecexam);
        return fechaComoCadena;
    }
    
    @Override
    public String toString() {
        return "{" + "\"codAlumno\":\"" + id.getCcodalu() + "\", \"codCurso\":\"" + id.getCcodcurso() + "\", \"nNumExam\":" + id.getNnumexam() + ", \"fechaExamen\":\"" + this.fechaComoCadena() + "\", \"notaExam\":" + this.nnotaexam.toString() + '}';
    }
}


