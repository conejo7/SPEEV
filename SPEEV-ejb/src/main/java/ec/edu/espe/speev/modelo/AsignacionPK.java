/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Nahtanoj
 */
@Embeddable
public class AsignacionPK implements Serializable {

    @Column(name = "PK_PZSTEVAL", nullable = false)
    private BigInteger pkPzsteval;

    @Column(name = "UZTROL_CODE", nullable = false)
    private int uztrolCode;

    @Column(name = "SIBINST_PIDM", nullable = false)
    private int sibinstPidm;

    public AsignacionPK() {
    }

    public AsignacionPK(BigInteger pkPzsteval, int uztrolCode, int sibinstPidm) {
        this.pkPzsteval = pkPzsteval;
        this.uztrolCode = uztrolCode;
        this.sibinstPidm = sibinstPidm;
    }

    public BigInteger getPkPzsteval() {
        return pkPzsteval;
    }

    public void setPkPzsteval(BigInteger pkPzsteval) {
        this.pkPzsteval = pkPzsteval;
    }

    public int getUztrolCode() {
        return uztrolCode;
    }

    public void setUztrolCode(int uztrolCode) {
        this.uztrolCode = uztrolCode;
    }

    public int getSibinstPidm() {
        return sibinstPidm;
    }

    public void setSibinstPidm(int sibinstPidm) {
        this.sibinstPidm = sibinstPidm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkPzsteval != null ? pkPzsteval.hashCode() : 0);
        hash += (int) uztrolCode;
        hash += (int) sibinstPidm;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsignacionPK)) {
            return false;
        }
        AsignacionPK other = (AsignacionPK) object;
        if ((this.pkPzsteval == null && other.pkPzsteval != null) || (this.pkPzsteval != null && !this.pkPzsteval.equals(other.pkPzsteval))) {
            return false;
        }
        if (this.uztrolCode != other.uztrolCode) {
            return false;
        }
        if (this.sibinstPidm != other.sibinstPidm) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AsignacionPK[ pkPzsteval=" + pkPzsteval + ", uztrolCode=" + uztrolCode + ", sibinstPidm=" + sibinstPidm + " ]";
    }
    
}
