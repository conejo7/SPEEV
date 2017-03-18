/*
 * CORENA
 * Sistema: Documental Corena
 * Creado: 25-dic-2016 - 23:45:32
 * 
 * Los contenidos de este archivo son propiedad intelectual de Corena
 * y se encuentran protegidos por la licencia: "Corena JEE Products".
 * 
 * Usted puede encontrar una copia de esta licencia en: 
 *   http://www.corena.com.ec
 * 
 * Copyright 2017-2018 Corena Todos los derechos reservados.
 */
package com.persist.common.exception;

/**
 * Excepcion generica de persistencia.  Esta clase deberia ser heredada por clases especificas.
 * @author Henry Coral
 * @version 1.0
 */
public class PersistException extends RuntimeException{

    private static final long serialVersionUID = 5037967618526999173L;
    
    private final String codigo;
    private final String detalle;

    public PersistException(String codigo, String detalle) {
        super(codigo+": "+detalle);
        this.codigo = codigo;
        this.detalle = detalle;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    @Override
    public String toString() {
        return "PersistException{" + "codigo=" + codigo + ", detalle=" + detalle + '}';
    }
    
    
}
