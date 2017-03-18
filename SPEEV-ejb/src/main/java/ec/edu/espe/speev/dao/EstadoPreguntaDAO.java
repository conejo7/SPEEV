/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speev.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import ec.edu.espe.speev.modelo.EstadoPregunta;
import java.math.BigDecimal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Clase utilizada para especificar las operaciones de acceso a datos relacionada 
 * con la entidad PSZTESTPRE
 * 
 * @author Nahtanoj
 */
@Stateless
@LocalBean
public class EstadoPreguntaDAO extends DefaultGenericDAOImple<EstadoPregunta, BigDecimal> {

    /**
     * Constructor por defecto.
     */
    public EstadoPreguntaDAO() {
        super(EstadoPregunta.class);
    }
}
