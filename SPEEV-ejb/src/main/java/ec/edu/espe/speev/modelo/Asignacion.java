/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Nahtanoj
 */
@Entity
@Table(name = "PZSTASIG")
public class Asignacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected AsignacionPK asignacionPK;
    
    @JoinColumn(name = "PK_PZSTEVAL", referencedColumnName = "PK_PZSTEVAL", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Evaluacion evaluacion;
    
    @JoinColumn(name = "UZTROL_CODE", referencedColumnName = "UZTROL_CODE", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Uztrol rol;
    
    @JoinColumn(name = "SIBINST_PIDM", referencedColumnName = "SIBINST_PIDM", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Sibinst docente;

    public Asignacion() {
    }

    public Asignacion(AsignacionPK asignacionPK) {
        this.asignacionPK = asignacionPK;
    }

    public Asignacion(BigInteger pkPzsteval, int uztrolCode, int sibinstPidm) {
        this(new AsignacionPK(pkPzsteval, uztrolCode, sibinstPidm)) ;
    }

    public AsignacionPK getAsignacionPK() {
        return asignacionPK;
    }

    public void setAsignacionPK(AsignacionPK asignacionPK) {
        this.asignacionPK = asignacionPK;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Uztrol getRol() {
        return rol;
    }

    public void setRol(Uztrol rol) {
        this.rol = rol;
    }

    public Sibinst getDocente() {
        return docente;
    }

    public void setDocente(Sibinst docente) {
        this.docente = docente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asignacionPK != null ? asignacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignacion)) {
            return false;
        }
        Asignacion other = (Asignacion) object;
        if ((this.asignacionPK == null && other.asignacionPK != null) || (this.asignacionPK != null && !this.asignacionPK.equals(other.asignacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Asignacion[ asignacionPK=" + asignacionPK + " ]";
    }
    
}
