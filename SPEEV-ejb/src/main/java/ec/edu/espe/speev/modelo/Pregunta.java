/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Nahtanoj
 */
@Entity
@Table(name = "PZSTPREG")
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PREGUNTA_SEQ")
    @SequenceGenerator(name = "PREGUNTA_SEQ", sequenceName = "PREGUNTA_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTPREG", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzstpreg;
    
    @Column(name = "PZSTPREG_ENUN", nullable = false, length = 300)
    private String pzstpregEnun;

    @Column(name = "PZSTPREG_PUNTAJE", nullable = false)
    private BigInteger pzstpregPuntaje;

    @Column(name = "PZSTPREG_FIJA", nullable = false)
    private BigInteger pzstpregFija;

    @Column(name = "PZSTPREG_IMAGEN", length = 300)
    private String pzstpregImagen;

    @Column(name = "PZSTPREG_COMENT", length = 300)
    private String pzstpregComent;
    
    @ManyToMany(mappedBy = "preguntaList")
    private List<Evaluacion> evaluacionList;
    
    @ManyToMany(mappedBy = "preguntaList")
    private List<EvaluacionAleatoria> evaluacionAleatoriaList;
    
    @JoinColumn(name = "PK_PZSTESTPRE", referencedColumnName = "PK_PZSTESTPRE", nullable = false)
    @ManyToOne
    private EstadoPregunta pkPzstestpre;
    
    @JoinColumn(name = "PK_PZSTTIPOPR", referencedColumnName = "PK_PZSTTIPOPR", nullable = false)
    @ManyToOne
    private TipoPregunta pkPzsttipopr;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pkPzstpreg")
    private List<OpcionPregunta> opcionPreguntaList;

    public Pregunta() {
    }

    public Pregunta(BigDecimal pkPzstpreg) {
        this.pkPzstpreg = pkPzstpreg;
    }

    public BigDecimal getPkPzstpreg() {
        return pkPzstpreg;
    }

    public void setPkPzstpreg(BigDecimal pkPzstpreg) {
        this.pkPzstpreg = pkPzstpreg;
    }

    public String getPzstpregEnun() {
        return pzstpregEnun;
    }

    public void setPzstpregEnun(String pzstpregEnun) {
        this.pzstpregEnun = pzstpregEnun;
    }

    public BigInteger getPzstpregPuntaje() {
        return pzstpregPuntaje;
    }

    public void setPzstpregPuntaje(BigInteger pzstpregPuntaje) {
        this.pzstpregPuntaje = pzstpregPuntaje;
    }

    public BigInteger getPzstpregFija() {
        return pzstpregFija;
    }

    public void setPzstpregFija(BigInteger pzstpregFija) {
        this.pzstpregFija = pzstpregFija;
    }

    public String getPzstpregImagen() {
        return pzstpregImagen;
    }

    public void setPzstpregImagen(String pzstpregImagen) {
        this.pzstpregImagen = pzstpregImagen;
    }

    public String getPzstpregComent() {
        return pzstpregComent;
    }

    public void setPzstpregComent(String pzstpregComent) {
        this.pzstpregComent = pzstpregComent;
    }

    public List<Evaluacion> getEvaluacionList() {
        return evaluacionList;
    }

    public void setEvaluacionList(List<Evaluacion> evaluacionList) {
        this.evaluacionList = evaluacionList;
    }

    public List<EvaluacionAleatoria> getEvaluacionAleatoriaList() {
        return evaluacionAleatoriaList;
    }

    public void setEvaluacionAleatoriaList(List<EvaluacionAleatoria> evaluacionAleatoriaList) {
        this.evaluacionAleatoriaList = evaluacionAleatoriaList;
    }

    public EstadoPregunta getPkPzstestpre() {
        return pkPzstestpre;
    }

    public void setPkPzstestpre(EstadoPregunta pkPzstestpre) {
        this.pkPzstestpre = pkPzstestpre;
    }

    public TipoPregunta getPkPzsttipopr() {
        return pkPzsttipopr;
    }

    public void setPkPzsttipopr(TipoPregunta pkPzsttipopr) {
        this.pkPzsttipopr = pkPzsttipopr;
    }

    public List<OpcionPregunta> getOpcionPreguntaList() {
        return opcionPreguntaList;
    }

    public void setOpcionPreguntaList(List<OpcionPregunta> opcionPreguntaList) {
        this.opcionPreguntaList = opcionPreguntaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzstpreg != null ? pkPzstpreg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.pkPzstpreg == null && other.pkPzstpreg != null) || (this.pkPzstpreg != null && !this.pkPzstpreg.equals(other.pkPzstpreg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pregunta[ pkPzstpreg=" + pkPzstpreg + " ]";
    }
    
}
