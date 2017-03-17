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
@Table(name = "PZSTPRESEN")
public class Presentacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRESENTACION_SEQ")
    @SequenceGenerator(name = "PRESENTACION_SEQ", sequenceName = "PRESENTACION_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTPRESEN", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzstpresen;

    @Column(name = "PZSTPRESEN_DESC", nullable = false, length = 120)
    private String pzstpresenDesc;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pkPzstpresen")
    private List<Impresion> impresionList;

    public Presentacion() {
    }

    public Presentacion(BigDecimal pkPzstpresen) {
        this.pkPzstpresen = pkPzstpresen;
    }

    public BigDecimal getPkPzstpresen() {
        return pkPzstpresen;
    }

    public void setPkPzstpresen(BigDecimal pkPzstpresen) {
        this.pkPzstpresen = pkPzstpresen;
    }

    public String getPzstpresenDesc() {
        return pzstpresenDesc;
    }

    public void setPzstpresenDesc(String pzstpresenDesc) {
        this.pzstpresenDesc = pzstpresenDesc;
    }

    public List<Impresion> getImpresionList() {
        return impresionList;
    }

    public void setImpresionList(List<Impresion> impresionList) {
        this.impresionList = impresionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzstpresen != null ? pkPzstpresen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presentacion)) {
            return false;
        }
        Presentacion other = (Presentacion) object;
        if ((this.pkPzstpresen == null && other.pkPzstpresen != null) || (this.pkPzstpresen != null && !this.pkPzstpresen.equals(other.pkPzstpresen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Presentacion[ pkPzstpresen=" + pkPzstpresen + " ]";
    }
    
}
