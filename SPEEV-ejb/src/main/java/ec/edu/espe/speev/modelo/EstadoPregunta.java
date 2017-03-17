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
@Table(name = "PZSTESTPRE")
public class EstadoPregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESTADO_PREG_SEQ")
    @SequenceGenerator(name = "ESTADO_PREG_SEQ", sequenceName = "ESTADO_PREG_SEQ", allocationSize = 1)
    @Column(name = "PK_PZSTESTPRE", nullable = false, precision = 38, scale = 0)
    private BigDecimal pkPzstestpre;
    
    @Column(name = "PZSTESTPRE_DESC", nullable = false, length = 120)
    private String pzstestpreDesc;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pkPzstestpre")
    private List<Pregunta> preguntaList;

    public EstadoPregunta() {
    }

    public EstadoPregunta(BigDecimal pkPzstestpre) {
        this.pkPzstestpre = pkPzstestpre;
    }

    public EstadoPregunta(BigDecimal pkPzstestpre, String pzstestpreDesc) {
        this.pkPzstestpre = pkPzstestpre;
        this.pzstestpreDesc = pzstestpreDesc;
    }

    public BigDecimal getPkPzstestpre() {
        return pkPzstestpre;
    }

    public void setPkPzstestpre(BigDecimal pkPzstestpre) {
        this.pkPzstestpre = pkPzstestpre;
    }

    public String getPzstestpreDesc() {
        return pzstestpreDesc;
    }

    public void setPzstestpreDesc(String pzstestpreDesc) {
        this.pzstestpreDesc = pzstestpreDesc;
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
        hash += (pkPzstestpre != null ? pkPzstestpre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoPregunta)) {
            return false;
        }
        EstadoPregunta other = (EstadoPregunta) object;
        if ((this.pkPzstestpre == null && other.pkPzstestpre != null) || (this.pkPzstestpre != null && !this.pkPzstestpre.equals(other.pkPzstestpre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EstadoPregunta[ pkPzstestpre=" + pkPzstestpre + " ]";
    }
    
}
