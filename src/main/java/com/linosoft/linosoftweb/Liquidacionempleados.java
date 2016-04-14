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
@Table(name = "liquidacionempleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Liquidacionempleados.findAll", query = "SELECT l FROM Liquidacionempleados l"),
    @NamedQuery(name = "Liquidacionempleados.findByIdliquidacionempleado", query = "SELECT l FROM Liquidacionempleados l WHERE l.idliquidacionempleado = :idliquidacionempleado"),
    @NamedQuery(name = "Liquidacionempleados.findBySueldo", query = "SELECT l FROM Liquidacionempleados l WHERE l.sueldo = :sueldo"),
    @NamedQuery(name = "Liquidacionempleados.findByDiassalario", query = "SELECT l FROM Liquidacionempleados l WHERE l.diassalario = :diassalario"),
    @NamedQuery(name = "Liquidacionempleados.findBySalario", query = "SELECT l FROM Liquidacionempleados l WHERE l.salario = :salario"),
    @NamedQuery(name = "Liquidacionempleados.findByDiastransporte", query = "SELECT l FROM Liquidacionempleados l WHERE l.diastransporte = :diastransporte"),
    @NamedQuery(name = "Liquidacionempleados.findByTransporte", query = "SELECT l FROM Liquidacionempleados l WHERE l.transporte = :transporte"),
    @NamedQuery(name = "Liquidacionempleados.findByIngresobaseaportes", query = "SELECT l FROM Liquidacionempleados l WHERE l.ingresobaseaportes = :ingresobaseaportes"),
    @NamedQuery(name = "Liquidacionempleados.findByDiasaportes", query = "SELECT l FROM Liquidacionempleados l WHERE l.diasaportes = :diasaportes"),
    @NamedQuery(name = "Liquidacionempleados.findByAportessalud", query = "SELECT l FROM Liquidacionempleados l WHERE l.aportessalud = :aportessalud"),
    @NamedQuery(name = "Liquidacionempleados.findByAportespension", query = "SELECT l FROM Liquidacionempleados l WHERE l.aportespension = :aportespension"),
    @NamedQuery(name = "Liquidacionempleados.findByFondosolidaridad", query = "SELECT l FROM Liquidacionempleados l WHERE l.fondosolidaridad = :fondosolidaridad"),
    @NamedQuery(name = "Liquidacionempleados.findByIngresobaseprestaciones", query = "SELECT l FROM Liquidacionempleados l WHERE l.ingresobaseprestaciones = :ingresobaseprestaciones"),
    @NamedQuery(name = "Liquidacionempleados.findByDevengados", query = "SELECT l FROM Liquidacionempleados l WHERE l.devengados = :devengados"),
    @NamedQuery(name = "Liquidacionempleados.findByDeducidos", query = "SELECT l FROM Liquidacionempleados l WHERE l.deducidos = :deducidos"),
    @NamedQuery(name = "Liquidacionempleados.findByNeto", query = "SELECT l FROM Liquidacionempleados l WHERE l.neto = :neto")})
public class Liquidacionempleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idliquidacionempleado")
    private Integer idliquidacionempleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sueldo")
    private int sueldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diassalario")
    private int diassalario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salario")
    private int salario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diastransporte")
    private int diastransporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transporte")
    private int transporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ingresobaseaportes")
    private int ingresobaseaportes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diasaportes")
    private int diasaportes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aportessalud")
    private int aportessalud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aportespension")
    private int aportespension;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fondosolidaridad")
    private int fondosolidaridad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ingresobaseprestaciones")
    private int ingresobaseprestaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "devengados")
    private int devengados;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deducidos")
    private int deducidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "neto")
    private int neto;
    @JoinColumn(name = "idperiodo", referencedColumnName = "idperiodo")
    @ManyToOne(optional = false)
    private Periodo idperiodo;
    @JoinColumn(name = "idpension", referencedColumnName = "idpension")
    @ManyToOne(optional = false)
    private Fondopension idpension;
    @JoinColumn(name = "ideps", referencedColumnName = "ideps")
    @ManyToOne(optional = false)
    private Eps ideps;
    @JoinColumn(name = "idcaja", referencedColumnName = "idcaja")
    @ManyToOne(optional = false)
    private Cajacompensacion idcaja;
    @JoinColumn(name = "cedula", referencedColumnName = "cedula")
    @ManyToOne(optional = false)
    private Empleado cedula;

    public Liquidacionempleados() {
    }

    public Liquidacionempleados(Integer idliquidacionempleado) {
        this.idliquidacionempleado = idliquidacionempleado;
    }

    public Liquidacionempleados(Integer idliquidacionempleado, int sueldo, int diassalario, int salario, int diastransporte, int transporte, int ingresobaseaportes, int diasaportes, int aportessalud, int aportespension, int fondosolidaridad, int ingresobaseprestaciones, int devengados, int deducidos, int neto) {
        this.idliquidacionempleado = idliquidacionempleado;
        this.sueldo = sueldo;
        this.diassalario = diassalario;
        this.salario = salario;
        this.diastransporte = diastransporte;
        this.transporte = transporte;
        this.ingresobaseaportes = ingresobaseaportes;
        this.diasaportes = diasaportes;
        this.aportessalud = aportessalud;
        this.aportespension = aportespension;
        this.fondosolidaridad = fondosolidaridad;
        this.ingresobaseprestaciones = ingresobaseprestaciones;
        this.devengados = devengados;
        this.deducidos = deducidos;
        this.neto = neto;
    }

    public Integer getIdliquidacionempleado() {
        return idliquidacionempleado;
    }

    public void setIdliquidacionempleado(Integer idliquidacionempleado) {
        this.idliquidacionempleado = idliquidacionempleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDiassalario() {
        return diassalario;
    }

    public void setDiassalario(int diassalario) {
        this.diassalario = diassalario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getDiastransporte() {
        return diastransporte;
    }

    public void setDiastransporte(int diastransporte) {
        this.diastransporte = diastransporte;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }

    public int getIngresobaseaportes() {
        return ingresobaseaportes;
    }

    public void setIngresobaseaportes(int ingresobaseaportes) {
        this.ingresobaseaportes = ingresobaseaportes;
    }

    public int getDiasaportes() {
        return diasaportes;
    }

    public void setDiasaportes(int diasaportes) {
        this.diasaportes = diasaportes;
    }

    public int getAportessalud() {
        return aportessalud;
    }

    public void setAportessalud(int aportessalud) {
        this.aportessalud = aportessalud;
    }

    public int getAportespension() {
        return aportespension;
    }

    public void setAportespension(int aportespension) {
        this.aportespension = aportespension;
    }

    public int getFondosolidaridad() {
        return fondosolidaridad;
    }

    public void setFondosolidaridad(int fondosolidaridad) {
        this.fondosolidaridad = fondosolidaridad;
    }

    public int getIngresobaseprestaciones() {
        return ingresobaseprestaciones;
    }

    public void setIngresobaseprestaciones(int ingresobaseprestaciones) {
        this.ingresobaseprestaciones = ingresobaseprestaciones;
    }

    public int getDevengados() {
        return devengados;
    }

    public void setDevengados(int devengados) {
        this.devengados = devengados;
    }

    public int getDeducidos() {
        return deducidos;
    }

    public void setDeducidos(int deducidos) {
        this.deducidos = deducidos;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public Periodo getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(Periodo idperiodo) {
        this.idperiodo = idperiodo;
    }

    public Fondopension getIdpension() {
        return idpension;
    }

    public void setIdpension(Fondopension idpension) {
        this.idpension = idpension;
    }

    public Eps getIdeps() {
        return ideps;
    }

    public void setIdeps(Eps ideps) {
        this.ideps = ideps;
    }

    public Cajacompensacion getIdcaja() {
        return idcaja;
    }

    public void setIdcaja(Cajacompensacion idcaja) {
        this.idcaja = idcaja;
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
        hash += (idliquidacionempleado != null ? idliquidacionempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Liquidacionempleados)) {
            return false;
        }
        Liquidacionempleados other = (Liquidacionempleados) object;
        if ((this.idliquidacionempleado == null && other.idliquidacionempleado != null) || (this.idliquidacionempleado != null && !this.idliquidacionempleado.equals(other.idliquidacionempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Liquidacionempleados[ idliquidacionempleado=" + idliquidacionempleado + " ]";
    }
    
}
