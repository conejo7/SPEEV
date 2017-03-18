/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Nahtanoj
 */
@Entity
@Table(name = "PZSTEVALEA")
public class EvaluacionAleatoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EVAL_ALEAT_SEQ")
    @SequenceGenerator(name = "EVAL_ALEAT_SEQ", sequenceName = "EVAL_ALEAT_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTEVALEA", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzstevalea;
    
    @JoinTable(name = "PZSTPREALE", joinColumns = {
        @JoinColumn(name = "PK_PZSTEVALEA", referencedColumnName = "PK_PZSTEVALEA")}, inverseJoinColumns = {
        @JoinColumn(name = "PK_PZSTPREG", referencedColumnName = "PK_PZSTPREG")})
    @ManyToMany
    private List<Pregunta> preguntaList;
    
    @JoinColumn(name = "PK_PZSTEVAL", referencedColumnName = "PK_PZSTEVAL")
    @ManyToOne
    private Evaluacion pkPzsteval;

    public EvaluacionAleatoria() {
    }

    public EvaluacionAleatoria(BigDecimal pkPzstevalea) {
        this.pkPzstevalea = pkPzstevalea;
    }

    public BigDecimal getPkPzstevalea() {
        return pkPzstevalea;
    }

    public void setPkPzstevalea(BigDecimal pkPzstevalea) {
        this.pkPzstevalea = pkPzstevalea;
    }

    public List<Pregunta> getPreguntaList() {
        return preguntaList;
    }

    public void setPreguntaList(List<Pregunta> preguntaList) {
        this.preguntaList = preguntaList;
    }

    public Evaluacion getPkPzsteval() {
        return pkPzsteval;
    }

    public void setPkPzsteval(Evaluacion pkPzsteval) {
        this.pkPzsteval = pkPzsteval;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzstevalea != null ? pkPzstevalea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluacionAleatoria)) {
            return false;
        }
        EvaluacionAleatoria other = (EvaluacionAleatoria) object;
        if ((this.pkPzstevalea == null && other.pkPzstevalea != null) || (this.pkPzstevalea != null && !this.pkPzstevalea.equals(other.pkPzstevalea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EvaluacionAleatoria[ pkPzstevalea=" + pkPzstevalea + " ]";
    }
    
}
