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
@Table(name = "STVTERM")
public class Stvterm implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "STVTERM_CODE", nullable = false, length = 6)
    private String stvtermCode;

    public Stvterm() {
    }

    public Stvterm(String stvtermCode) {
        this.stvtermCode = stvtermCode;
    }

    public String getStvtermCode() {
        return stvtermCode;
    }

    public void setStvtermCode(String stvtermCode) {
        this.stvtermCode = stvtermCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stvtermCode != null ? stvtermCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stvterm)) {
            return false;
        }
        Stvterm other = (Stvterm) object;
        if ((this.stvtermCode == null && other.stvtermCode != null) || (this.stvtermCode != null && !this.stvtermCode.equals(other.stvtermCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stvterm[ stvtermCode=" + stvtermCode + " ]";
    }
    
}
