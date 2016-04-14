/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linosoft.linosoftweb;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ciro
 */
@Entity
@Table(name = "periodo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Periodo.findAll", query = "SELECT p FROM Periodo p"),
    @NamedQuery(name = "Periodo.findByIdperiodo", query = "SELECT p FROM Periodo p WHERE p.idperiodo = :idperiodo"),
    @NamedQuery(name = "Periodo.findByAnio", query = "SELECT p FROM Periodo p WHERE p.anio = :anio"),
    @NamedQuery(name = "Periodo.findByMes", query = "SELECT p FROM Periodo p WHERE p.mes = :mes"),
    @NamedQuery(name = "Periodo.findByCorte", query = "SELECT p FROM Periodo p WHERE p.corte = :corte")})
public class Periodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idperiodo")
    private Integer idperiodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio")
    private int anio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mes")
    private int mes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "corte")
    private int corte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperiodo")
    private Collection<Configuracion> configuracionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperiodo")
    private Collection<Registronovedad> registronovedadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperiodo")
    private Collection<Liquidacionempleados> liquidacionempleadosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idperiodo")
    private Collection<Liquidacionempresa> liquidacionempresaCollection;

    public Periodo() {
    }

    public Periodo(Integer idperiodo) {
        this.idperiodo = idperiodo;
    }

    public Periodo(Integer idperiodo, int anio, int mes, int corte) {
        this.idperiodo = idperiodo;
        this.anio = anio;
        this.mes = mes;
        this.corte = corte;
    }

    public Integer getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(Integer idperiodo) {
        this.idperiodo = idperiodo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getCorte() {
        return corte;
    }

    public void setCorte(int corte) {
        this.corte = corte;
    }

    @XmlTransient
    public Collection<Configuracion> getConfiguracionCollection() {
        return configuracionCollection;
    }

    public void setConfiguracionCollection(Collection<Configuracion> configuracionCollection) {
        this.configuracionCollection = configuracionCollection;
    }

    @XmlTransient
    public Collection<Registronovedad> getRegistronovedadCollection() {
        return registronovedadCollection;
    }

    public void setRegistronovedadCollection(Collection<Registronovedad> registronovedadCollection) {
        this.registronovedadCollection = registronovedadCollection;
    }

    @XmlTransient
    public Collection<Liquidacionempleados> getLiquidacionempleadosCollection() {
        return liquidacionempleadosCollection;
    }

    public void setLiquidacionempleadosCollection(Collection<Liquidacionempleados> liquidacionempleadosCollection) {
        this.liquidacionempleadosCollection = liquidacionempleadosCollection;
    }

    @XmlTransient
    public Collection<Liquidacionempresa> getLiquidacionempresaCollection() {
        return liquidacionempresaCollection;
    }

    public void setLiquidacionempresaCollection(Collection<Liquidacionempresa> liquidacionempresaCollection) {
        this.liquidacionempresaCollection = liquidacionempresaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idperiodo != null ? idperiodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodo)) {
            return false;
        }
        Periodo other = (Periodo) object;
        if ((this.idperiodo == null && other.idperiodo != null) || (this.idperiodo != null && !this.idperiodo.equals(other.idperiodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Periodo[ idperiodo=" + idperiodo + " ]";
    }
    
}
