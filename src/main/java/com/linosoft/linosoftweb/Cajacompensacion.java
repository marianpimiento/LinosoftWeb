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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ciro
 */
@Entity
@Table(name = "cajacompensacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cajacompensacion.findAll", query = "SELECT c FROM Cajacompensacion c"),
    @NamedQuery(name = "Cajacompensacion.findByIdcaja", query = "SELECT c FROM Cajacompensacion c WHERE c.idcaja = :idcaja"),
    @NamedQuery(name = "Cajacompensacion.findByNombre", query = "SELECT c FROM Cajacompensacion c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cajacompensacion.findByNit", query = "SELECT c FROM Cajacompensacion c WHERE c.nit = :nit")})
public class Cajacompensacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcaja")
    private Integer idcaja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nit")
    private String nit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcaja")
    private Collection<Contrato> contratoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcaja")
    private Collection<Liquidacionempleados> liquidacionempleadosCollection;

    public Cajacompensacion() {
    }

    public Cajacompensacion(Integer idcaja) {
        this.idcaja = idcaja;
    }

    public Cajacompensacion(Integer idcaja, String nombre, String nit) {
        this.idcaja = idcaja;
        this.nombre = nombre;
        this.nit = nit;
    }

    public Integer getIdcaja() {
        return idcaja;
    }

    public void setIdcaja(Integer idcaja) {
        this.idcaja = idcaja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @XmlTransient
    public Collection<Contrato> getContratoCollection() {
        return contratoCollection;
    }

    public void setContratoCollection(Collection<Contrato> contratoCollection) {
        this.contratoCollection = contratoCollection;
    }

    @XmlTransient
    public Collection<Liquidacionempleados> getLiquidacionempleadosCollection() {
        return liquidacionempleadosCollection;
    }

    public void setLiquidacionempleadosCollection(Collection<Liquidacionempleados> liquidacionempleadosCollection) {
        this.liquidacionempleadosCollection = liquidacionempleadosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcaja != null ? idcaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cajacompensacion)) {
            return false;
        }
        Cajacompensacion other = (Cajacompensacion) object;
        if ((this.idcaja == null && other.idcaja != null) || (this.idcaja != null && !this.idcaja.equals(other.idcaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Cajacompensacion[ idcaja=" + idcaja + " ]";
    }
    
}
