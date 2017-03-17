/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Nahtanoj
 */
@Entity
@Table(name = "PZSTOPPREG")
public class OpcionPregunta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OPCION_PREG_SEQ")
    @SequenceGenerator(name = "OPCION_PREG_SEQ", sequenceName = "OPCION_PREG_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTOPPREG", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzstoppreg;

    @Column(name = "PZSTOPPREG_RESP", nullable = false, length = 120)
    private String pzstoppregResp;
    
    @JoinColumn(name = "PK_PZSTPREG", referencedColumnName = "PK_PZSTPREG", nullable = false)
    @ManyToOne
    private Pregunta pkPzstpreg;

    public OpcionPregunta() {
    }

    public OpcionPregunta(BigDecimal pkPzstoppreg) {
        this.pkPzstoppreg = pkPzstoppreg;
    }

    public BigDecimal getPkPzstoppreg() {
        return pkPzstoppreg;
    }

    public void setPkPzstoppreg(BigDecimal pkPzstoppreg) {
        this.pkPzstoppreg = pkPzstoppreg;
    }

    public String getPzstoppregResp() {
        return pzstoppregResp;
    }

    public void setPzstoppregResp(String pzstoppregResp) {
        this.pzstoppregResp = pzstoppregResp;
    }

    public Pregunta getPkPzstpreg() {
        return pkPzstpreg;
    }

    public void setPkPzstpreg(Pregunta pkPzstpreg) {
        this.pkPzstpreg = pkPzstpreg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzstoppreg != null ? pkPzstoppreg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpcionPregunta)) {
            return false;
        }
        OpcionPregunta other = (OpcionPregunta) object;
        if ((this.pkPzstoppreg == null && other.pkPzstoppreg != null) || (this.pkPzstoppreg != null && !this.pkPzstoppreg.equals(other.pkPzstoppreg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OpcionPregunta[ pkPzstoppreg=" + pkPzstoppreg + " ]";
    }
    
}
