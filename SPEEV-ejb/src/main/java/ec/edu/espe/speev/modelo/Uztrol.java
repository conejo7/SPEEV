/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Nahtanoj
 */
@Entity
@Table(name = "UZTROL")
public class Uztrol implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "UZTROL_CODE", nullable = false)
    private Integer uztrolCode;

    public Uztrol() {
    }

    public Uztrol(Integer uztrolCode) {
        this.uztrolCode = uztrolCode;
    }

    public Integer getUztrolCode() {
        return uztrolCode;
    }

    public void setUztrolCode(Integer uztrolCode) {
        this.uztrolCode = uztrolCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uztrolCode != null ? uztrolCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uztrol)) {
            return false;
        }
        Uztrol other = (Uztrol) object;
        if ((this.uztrolCode == null && other.uztrolCode != null) || (this.uztrolCode != null && !this.uztrolCode.equals(other.uztrolCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Uztrol[ uztrolCode=" + uztrolCode + " ]";
    }
    
}
