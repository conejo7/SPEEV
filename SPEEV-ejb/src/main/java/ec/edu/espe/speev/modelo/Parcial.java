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
@Table(name = "PZSTPARCIAL")
public class Parcial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARCIAL_SEQ")
    @SequenceGenerator(name = "PARCIAL_SEQ", sequenceName = "PARCIAL_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTPARCIAL", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzstparcial;
    
    @Column(name = "PZSTPARCIAL_DESC", nullable = false, length = 120)
    private String pzstparcialDesc;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pkPzstparcial")
    private List<Evaluacion> evaluacionList;

    public Parcial() {
    }

    public Parcial(BigDecimal pkPzstparcial) {
        this.pkPzstparcial = pkPzstparcial;
    }

    public BigDecimal getPkPzstparcial() {
        return pkPzstparcial;
    }

    public void setPkPzstparcial(BigDecimal pkPzstparcial) {
        this.pkPzstparcial = pkPzstparcial;
    }

    public String getPzstparcialDesc() {
        return pzstparcialDesc;
    }

    public void setPzstparcialDesc(String pzstparcialDesc) {
        this.pzstparcialDesc = pzstparcialDesc;
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
        hash += (pkPzstparcial != null ? pkPzstparcial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcial)) {
            return false;
        }
        Parcial other = (Parcial) object;
        if ((this.pkPzstparcial == null && other.pkPzstparcial != null) || (this.pkPzstparcial != null && !this.pkPzstparcial.equals(other.pkPzstparcial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parcial[ pkPzstparcial=" + pkPzstparcial + " ]";
    }
    
}
