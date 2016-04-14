/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linosoft.linosoftweb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ciro
 */
@Entity
@Table(name = "registronovedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registronovedad.findAll", query = "SELECT r FROM Registronovedad r"),
    @NamedQuery(name = "Registronovedad.findByIdregistro", query = "SELECT r FROM Registronovedad r WHERE r.idregistro = :idregistro"),
    @NamedQuery(name = "Registronovedad.findByCantidad", query = "SELECT r FROM Registronovedad r WHERE r.cantidad = :cantidad"),
    @NamedQuery(name = "Registronovedad.findByValor", query = "SELECT r FROM Registronovedad r WHERE r.valor = :valor"),
    @NamedQuery(name = "Registronovedad.findByTotal", query = "SELECT r FROM Registronovedad r WHERE r.total = :total")})
public class Registronovedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idregistro")
    private Integer idregistro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private int valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private int total;
    @JoinColumn(name = "idperiodo", referencedColumnName = "idperiodo")
    @ManyToOne(optional = false)
    private Periodo idperiodo;
    @JoinColumn(name = "idnovedad", referencedColumnName = "idnovedad")
    @ManyToOne(optional = false)
    private Novedad idnovedad;
    @JoinColumn(name = "cedula", referencedColumnName = "cedula")
    @ManyToOne(optional = false)
    private Empleado cedula;

    public Registronovedad() {
    }

    public Registronovedad(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public Registronovedad(Integer idregistro, int cantidad, int valor, int total) {
        this.idregistro = idregistro;
        this.cantidad = cantidad;
        this.valor = valor;
        this.total = total;
    }

    public Integer getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Periodo getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(Periodo idperiodo) {
        this.idperiodo = idperiodo;
    }

    public Novedad getIdnovedad() {
        return idnovedad;
    }

    public void setIdnovedad(Novedad idnovedad) {
        this.idnovedad = idnovedad;
    }

    public Empleado getCedula() {
        return cedula;
    }

    public void setCedula(Empleado cedula) {
        this.cedula = cedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregistro != null ? idregistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registronovedad)) {
            return false;
        }
        Registronovedad other = (Registronovedad) object;
        if ((this.idregistro == null && other.idregistro != null) || (this.idregistro != null && !this.idregistro.equals(other.idregistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Registronovedad[ idregistro=" + idregistro + " ]";
    }
    
}
