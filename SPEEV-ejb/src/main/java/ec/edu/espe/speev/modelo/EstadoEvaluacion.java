/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Nahtanoj
 */
@Entity
@Table(name = "PZSTESTEVA")
public class EstadoEvaluacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESTADO_EVAL_SEQ")
    @SequenceGenerator(name = "ESTADO_EVAL_SEQ", sequenceName = "ESTADO_EVAL_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTESTEVA", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzstesteva;

    @Column(name = "PZSTESTEVA_DESC", nullable = false, length = 120)
    private String pzstestevaDesc;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pkPzstesteva")
    private List<Evaluacion> evaluacionList;

    public EstadoEvaluacion() {
    }

    public EstadoEvaluacion(BigDecimal pkPzstesteva) {
        this.pkPzstesteva = pkPzstesteva;
    }

    public EstadoEvaluacion(BigDecimal pkPzstesteva, String pzstestevaDesc) {
        this.pkPzstesteva = pkPzstesteva;
        this.pzstestevaDesc = pzstestevaDesc;
    }

    public BigDecimal getPkPzstesteva() {
        return pkPzstesteva;
    }

    public void setPkPzstesteva(BigDecimal pkPzstesteva) {
        this.pkPzstesteva = pkPzstesteva;
    }

    public String getPzstestevaDesc() {
        return pzstestevaDesc;
    }

    public void setPzstestevaDesc(String pzstestevaDesc) {
        this.pzstestevaDesc = pzstestevaDesc;
    }

    public List<Evaluacion> getEvaluacionList() {
        return evaluacionList;
    }

    public void setEvaluacionList(List<Evaluacion> evaluacionList) {
        this.evaluacionList = evaluacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzstesteva != null ? pkPzstesteva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoEvaluacion)) {
            return false;
        }
        EstadoEvaluacion other = (EstadoEvaluacion) object;
        if ((this.pkPzstesteva == null && other.pkPzstesteva != null) || (this.pkPzstesteva != null && !this.pkPzstesteva.equals(other.pkPzstesteva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EstadoEvaluacion[ pkPzstesteva=" + pkPzstesteva + " ]";
    }

}
