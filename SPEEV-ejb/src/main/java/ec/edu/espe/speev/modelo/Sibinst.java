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
@Table(name = "SIBINST")
public class Sibinst implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "SIBINST_PIDM", nullable = false)
    private Integer sibinstPidm;

    public Sibinst() {
    }

    public Sibinst(Integer sibinstPidm) {
        this.sibinstPidm = sibinstPidm;
    }

    public Integer getSibinstPidm() {
        return sibinstPidm;
    }

    public void setSibinstPidm(Integer sibinstPidm) {
        this.sibinstPidm = sibinstPidm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sibinstPidm != null ? sibinstPidm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sibinst)) {
            return false;
        }
        Sibinst other = (Sibinst) object;
        if ((this.sibinstPidm == null && other.sibinstPidm != null) || (this.sibinstPidm != null && !this.sibinstPidm.equals(other.sibinstPidm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sibinst[ sibinstPidm=" + sibinstPidm + " ]";
    }
    
}
