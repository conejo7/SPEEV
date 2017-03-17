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
@Table(name = "PZSTTIPOPR")
public class TipoPregunta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIPO_PREG_SEQ")
    @SequenceGenerator(name = "TIPO_PREG_SEQ", sequenceName = "TIPO_PREG_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTTIPOPR", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzsttipopr;
    
    @Column(name = "PZSTTIPOPR_DESC", nullable = false, length = 30)
    private String pzsttipoprDesc;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pkPzsttipopr")
    private List<Pregunta> preguntaList;

    public TipoPregunta() {
    }

    public TipoPregunta(BigDecimal pkPzsttipopr) {
        this.pkPzsttipopr = pkPzsttipopr;
    }

    public TipoPregunta(BigDecimal pkPzsttipopr, String pzsttipoprDesc) {
        this.pkPzsttipopr = pkPzsttipopr;
        this.pzsttipoprDesc = pzsttipoprDesc;
    }

    public BigDecimal getPkPzsttipopr() {
        return pkPzsttipopr;
    }

    public void setPkPzsttipopr(BigDecimal pkPzsttipopr) {
        this.pkPzsttipopr = pkPzsttipopr;
    }

    public String getPzsttipoprDesc() {
        return pzsttipoprDesc;
    }

    public void setPzsttipoprDesc(String pzsttipoprDesc) {
        this.pzsttipoprDesc = pzsttipoprDesc;
    }

    public List<Pregunta> getPreguntaList() {
        return preguntaList;
    }

    public void setPreguntaList(List<Pregunta> preguntaList) {
        this.preguntaList = preguntaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzsttipopr != null ? pkPzsttipopr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPregunta)) {
            return false;
        }
        TipoPregunta other = (TipoPregunta) object;
        if ((this.pkPzsttipopr == null && other.pkPzsttipopr != null) || (this.pkPzsttipopr != null && !this.pkPzsttipopr.equals(other.pkPzsttipopr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoPregunta[ pkPzsttipopr=" + pkPzsttipopr + " ]";
    }
    
}
