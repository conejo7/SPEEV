/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Nahtanoj
 */
@Entity
@Table(name = "PZSTEVAL")
public class Evaluacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EVALUACION_SEQ")
    @SequenceGenerator(name = "EVALUACION_SEQ", sequenceName = "EVALUACION_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTEVAL", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzsteval;

    @Column(name = "PZSTEVAL_MATERIA", nullable = false, length = 5)
    private String pzstevalMateria;

    @Column(name = "PZSTEVAL_PREG_EVAL")
    private BigInteger pzstevalPregEval;

    @Column(name = "PZSTEVAL_PREG_BANCO")
    private BigInteger pzstevalPregBanco;

    @Column(name = "PZSTEVAL_PREG_ABIER")
    private BigInteger pzstevalPregAbier;

    @Column(name = "PZSTEVAL_PREG_CERR")
    private BigInteger pzstevalPregCerr;

    @Column(name = "PZSTEVAL_PUNTAJE")
    private BigInteger pzstevalPuntaje;

    @Column(name = "PZSTEVAL_INSTRUC", length = 400)
    private String pzstevalInstruc;

    @Column(name = "PZSTEVAL_TLF_DOCEN", length = 20)
    private String pzstevalTlfDocen;

    @Column(name = "PZSTEVAL_FECHA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstevalFechaCrea;

    @Column(name = "PZSTEVAL_FECHA_LIM_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstevalFechaLimCrea;

    @Column(name = "PZSTEVAL_FECHA_REV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstevalFechaRev;

    @Column(name = "PZSTEVAL_FECHA_LIM_REV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstevalFechaLimRev;

    @Column(name = "PZSTEVAL_FECHA_RECEP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstevalFechaRecep;

    @Column(name = "PZSTEVAL_FECHA_LIM_RECEP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstevalFechaLimRecep;

    @Column(name = "PZSTEVAL_FECHA_CORREC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstevalFechaCorrec;

    @Column(name = "PZSTEVAL_FECHA_TOMA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstevalFechaToma;

    @JoinTable(name = "PZSTPREEVA", joinColumns = {
        @JoinColumn(name = "PK_PZSTEVAL", referencedColumnName = "PK_PZSTEVAL", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "PK_PZSTPREG", referencedColumnName = "PK_PZSTPREG", nullable = false)})
    @ManyToMany
    private List<Pregunta> preguntaList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pkPzsteval")
    private List<Impresion> impresionList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaluacion")
    private List<Asignacion> asignacionList;

    @JoinColumn(name = "PK_PZSTESTEVA", referencedColumnName = "PK_PZSTESTEVA", nullable = false)
    @ManyToOne
    private EstadoEvaluacion pkPzstesteva;

    @JoinColumn(name = "PK_PZSTPARCIAL", referencedColumnName = "PK_PZSTPARCIAL", nullable = false)
    @ManyToOne
    private Parcial pkPzstparcial;

    @JoinColumn(name = "STVTERM_CODE", referencedColumnName = "STVTERM_CODE", nullable = false)
    @ManyToOne
    private Stvterm periodo;

    @OneToMany(mappedBy = "pkPzsteval")
    private List<EvaluacionAleatoria> evaluacionAleatoriaList;

    public Evaluacion() {
    }

    public Evaluacion(BigDecimal pkPzsteval) {
        this.pkPzsteval = pkPzsteval;
    }

    public BigDecimal getPkPzsteval() {
        return pkPzsteval;
    }

    public void setPkPzsteval(BigDecimal pkPzsteval) {
        this.pkPzsteval = pkPzsteval;
    }

    public String getPzstevalMateria() {
        return pzstevalMateria;
    }

    public void setPzstevalMateria(String pzstevalMateria) {
        this.pzstevalMateria = pzstevalMateria;
    }

    public BigInteger getPzstevalPregEval() {
        return pzstevalPregEval;
    }

    public void setPzstevalPregEval(BigInteger pzstevalPregEval) {
        this.pzstevalPregEval = pzstevalPregEval;
    }

    public BigInteger getPzstevalPregBanco() {
        return pzstevalPregBanco;
    }

    public void setPzstevalPregBanco(BigInteger pzstevalPregBanco) {
        this.pzstevalPregBanco = pzstevalPregBanco;
    }

    public BigInteger getPzstevalPregAbier() {
        return pzstevalPregAbier;
    }

    public void setPzstevalPregAbier(BigInteger pzstevalPregAbier) {
        this.pzstevalPregAbier = pzstevalPregAbier;
    }

    public BigInteger getPzstevalPregCerr() {
        return pzstevalPregCerr;
    }

    public void setPzstevalPregCerr(BigInteger pzstevalPregCerr) {
        this.pzstevalPregCerr = pzstevalPregCerr;
    }

    public BigInteger getPzstevalPuntaje() {
        return pzstevalPuntaje;
    }

    public void setPzstevalPuntaje(BigInteger pzstevalPuntaje) {
        this.pzstevalPuntaje = pzstevalPuntaje;
    }

    public String getPzstevalInstruc() {
        return pzstevalInstruc;
    }

    public void setPzstevalInstruc(String pzstevalInstruc) {
        this.pzstevalInstruc = pzstevalInstruc;
    }

    public String getPzstevalTlfDocen() {
        return pzstevalTlfDocen;
    }

    public void setPzstevalTlfDocen(String pzstevalTlfDocen) {
        this.pzstevalTlfDocen = pzstevalTlfDocen;
    }

    public Date getPzstevalFechaCrea() {
        return pzstevalFechaCrea;
    }

    public void setPzstevalFechaCrea(Date pzstevalFechaCrea) {
        this.pzstevalFechaCrea = pzstevalFechaCrea;
    }

    public Date getPzstevalFechaLimCrea() {
        return pzstevalFechaLimCrea;
    }

    public void setPzstevalFechaLimCrea(Date pzstevalFechaLimCrea) {
        this.pzstevalFechaLimCrea = pzstevalFechaLimCrea;
    }

    public Date getPzstevalFechaRev() {
        return pzstevalFechaRev;
    }

    public void setPzstevalFechaRev(Date pzstevalFechaRev) {
        this.pzstevalFechaRev = pzstevalFechaRev;
    }

    public Date getPzstevalFechaLimRev() {
        return pzstevalFechaLimRev;
    }

    public void setPzstevalFechaLimRev(Date pzstevalFechaLimRev) {
        this.pzstevalFechaLimRev = pzstevalFechaLimRev;
    }

    public Date getPzstevalFechaRecep() {
        return pzstevalFechaRecep;
    }

    public void setPzstevalFechaRecep(Date pzstevalFechaRecep) {
        this.pzstevalFechaRecep = pzstevalFechaRecep;
    }

    public Date getPzstevalFechaLimRecep() {
        return pzstevalFechaLimRecep;
    }

    public void setPzstevalFechaLimRecep(Date pzstevalFechaLimRecep) {
        this.pzstevalFechaLimRecep = pzstevalFechaLimRecep;
    }

    public Date getPzstevalFechaCorrec() {
        return pzstevalFechaCorrec;
    }

    public void setPzstevalFechaCorrec(Date pzstevalFechaCorrec) {
        this.pzstevalFechaCorrec = pzstevalFechaCorrec;
    }

    public Date getPzstevalFechaToma() {
        return pzstevalFechaToma;
    }

    public void setPzstevalFechaToma(Date pzstevalFechaToma) {
        this.pzstevalFechaToma = pzstevalFechaToma;
    }

    public List<Pregunta> getPreguntaList() {
        return preguntaList;
    }

    public void setPreguntaList(List<Pregunta> preguntaList) {
        this.preguntaList = preguntaList;
    }

    public List<Impresion> getImpresionList() {
        return impresionList;
    }

    public void setImpresionList(List<Impresion> impresionList) {
        this.impresionList = impresionList;
    }

    public List<Asignacion> getAsignacionList() {
        return asignacionList;
    }

    public void setAsignacionList(List<Asignacion> asignacionList) {
        this.asignacionList = asignacionList;
    }

    public EstadoEvaluacion getPkPzstesteva() {
        return pkPzstesteva;
    }

    public void setPkPzstesteva(EstadoEvaluacion pkPzstesteva) {
        this.pkPzstesteva = pkPzstesteva;
    }

    public Parcial getPkPzstparcial() {
        return pkPzstparcial;
    }

    public void setPkPzstparcial(Parcial pkPzstparcial) {
        this.pkPzstparcial = pkPzstparcial;
    }

    public Stvterm getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Stvterm periodo) {
        this.periodo = periodo;
    }

    public List<EvaluacionAleatoria> getEvaluacionAleatoriaList() {
        return evaluacionAleatoriaList;
    }

    public void setEvaluacionAleatoriaList(List<EvaluacionAleatoria> evaluacionAleatoriaList) {
        this.evaluacionAleatoriaList = evaluacionAleatoriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzsteval != null ? pkPzsteval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluacion)) {
            return false;
        }
        Evaluacion other = (Evaluacion) object;
        if ((this.pkPzsteval == null && other.pkPzsteval != null) || (this.pkPzsteval != null && !this.pkPzsteval.equals(other.pkPzsteval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evaluacion[ pkPzsteval=" + pkPzsteval + " ]";
    }

}
