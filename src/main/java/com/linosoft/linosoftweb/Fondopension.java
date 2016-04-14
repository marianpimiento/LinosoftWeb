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
@Table(name = "fondopension")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fondopension.findAll", query = "SELECT f FROM Fondopension f"),
    @NamedQuery(name = "Fondopension.findByIdpension", query = "SELECT f FROM Fondopension f WHERE f.idpension = :idpension"),
    @NamedQuery(name = "Fondopension.findByNombre", query = "SELECT f FROM Fondopension f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fondopension.findByNit", query = "SELECT f FROM Fondopension f WHERE f.nit = :nit")})
public class Fondopension implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpension")
    private Integer idpension;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpension")
    private Collection<Contrato> contratoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpension")
    private Collection<Liquidacionempleados> liquidacionempleadosCollection;

    public Fondopension() {
    }

    public Fondopension(Integer idpension) {
        this.idpension = idpension;
    }

    public Fondopension(Integer idpension, String nombre, String nit) {
        this.idpension = idpension;
        this.nombre = nombre;
        this.nit = nit;
    }

    public Integer getIdpension() {
        return idpension;
    }

    public void setIdpension(Integer idpension) {
        this.idpension = idpension;
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
        hash += (idpension != null ? idpension.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fondopension)) {
            return false;
        }
        Fondopension other = (Fondopension) object;
        if ((this.idpension == null && other.idpension != null) || (this.idpension != null && !this.idpension.equals(other.idpension))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Fondopension[ idpension=" + idpension + " ]";
    }
    
}
