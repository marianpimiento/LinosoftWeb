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
@Table(name = "eps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eps.findAll", query = "SELECT e FROM Eps e"),
    @NamedQuery(name = "Eps.findByIdeps", query = "SELECT e FROM Eps e WHERE e.ideps = :ideps"),
    @NamedQuery(name = "Eps.findByNombre", query = "SELECT e FROM Eps e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Eps.findByNit", query = "SELECT e FROM Eps e WHERE e.nit = :nit")})
public class Eps implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ideps")
    private Integer ideps;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideps")
    private Collection<Contrato> contratoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ideps")
    private Collection<Liquidacionempleados> liquidacionempleadosCollection;

    public Eps() {
    }

    public Eps(Integer ideps) {
        this.ideps = ideps;
    }

    public Eps(Integer ideps, String nombre, String nit) {
        this.ideps = ideps;
        this.nombre = nombre;
        this.nit = nit;
    }

    public Integer getIdeps() {
        return ideps;
    }

    public void setIdeps(Integer ideps) {
        this.ideps = ideps;
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
        hash += (ideps != null ? ideps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eps)) {
            return false;
        }
        Eps other = (Eps) object;
        if ((this.ideps == null && other.ideps != null) || (this.ideps != null && !this.ideps.equals(other.ideps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Eps[ ideps=" + ideps + " ]";
    }
    
}
