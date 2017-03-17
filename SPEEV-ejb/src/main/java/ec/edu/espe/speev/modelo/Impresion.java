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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Nahtanoj
 */
@Entity
@Table(name = "PZSTIMPR")
public class Impresion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IMPRESION_SEQ")
    @SequenceGenerator(name = "IMPRESION_SEQ", sequenceName = "IMPRESION_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTIMPR", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzstimpr;
    
    @Column(name = "PZSTIMPR_FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date pzstimprFecha;

    @Column(name = "PZSTIMPR_CANT", nullable = false)
    private BigInteger pzstimprCant;
    
    @JoinColumn(name = "PK_PZSTEVAL", referencedColumnName = "PK_PZSTEVAL", nullable = false)
    @ManyToOne
    private Evaluacion pkPzsteval;
    
    @JoinColumn(name = "PK_PZSTPRESEN", referencedColumnName = "PK_PZSTPRESEN", nullable = false)
    @ManyToOne
    private Presentacion pkPzstpresen;

    public Impresion() {
    }

    public Impresion(BigDecimal pkPzstimpr) {
        this.pkPzstimpr = pkPzstimpr;
    }

    public Impresion(BigDecimal pkPzstimpr, Date pzstimprFecha, BigInteger pzstimprCant) {
        this.pkPzstimpr = pkPzstimpr;
        this.pzstimprFecha = pzstimprFecha;
        this.pzstimprCant = pzstimprCant;
    }

    public BigDecimal getPkPzstimpr() {
        return pkPzstimpr;
    }

    public void setPkPzstimpr(BigDecimal pkPzstimpr) {
        this.pkPzstimpr = pkPzstimpr;
    }

    public Date getPzstimprFecha() {
        return pzstimprFecha;
    }

    public void setPzstimprFecha(Date pzstimprFecha) {
        this.pzstimprFecha = pzstimprFecha;
    }

    public BigInteger getPzstimprCant() {
        return pzstimprCant;
    }

    public void setPzstimprCant(BigInteger pzstimprCant) {
        this.pzstimprCant = pzstimprCant;
    }

    public Evaluacion getPkPzsteval() {
        return pkPzsteval;
    }

    public void setPkPzsteval(Evaluacion pkPzsteval) {
        this.pkPzsteval = pkPzsteval;
    }

    public Presentacion getPkPzstpresen() {
        return pkPzstpresen;
    }

    public void setPkPzstpresen(Presentacion pkPzstpresen) {
        this.pkPzstpresen = pkPzstpresen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzstimpr != null ? pkPzstimpr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impresion)) {
            return false;
        }
        Impresion other = (Impresion) object;
        if ((this.pkPzstimpr == null && other.pkPzstimpr != null) || (this.pkPzstimpr != null && !this.pkPzstimpr.equals(other.pkPzstimpr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Impresion[ pkPzstimpr=" + pkPzstimpr + " ]";
    }
    
}
