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
@Table(name = "cargo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cargo.findAll", query = "SELECT c FROM Cargo c"),
    @NamedQuery(name = "Cargo.findByIdcargo", query = "SELECT c FROM Cargo c WHERE c.idcargo = :idcargo"),
    @NamedQuery(name = "Cargo.findByNombre", query = "SELECT c FROM Cargo c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cargo.findBySueldo", query = "SELECT c FROM Cargo c WHERE c.sueldo = :sueldo"),
    @NamedQuery(name = "Cargo.findByTipo", query = "SELECT c FROM Cargo c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Cargo.findBySubsidiotransporte", query = "SELECT c FROM Cargo c WHERE c.subsidiotransporte = :subsidiotransporte"),
    @NamedQuery(name = "Cargo.findByIntegral", query = "SELECT c FROM Cargo c WHERE c.integral = :integral")})
public class Cargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcargo")
    private Integer idcargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sueldo")
    private int sueldo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subsidiotransporte")
    private boolean subsidiotransporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "integral")
    private boolean integral;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcargo")
    private Collection<Contrato> contratoCollection;

    public Cargo() {
    }

    public Cargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public Cargo(Integer idcargo, String nombre, int sueldo, String tipo, boolean subsidiotransporte, boolean integral) {
        this.idcargo = idcargo;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.tipo = tipo;
        this.subsidiotransporte = subsidiotransporte;
        this.integral = integral;
    }

    public Integer getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Integer idcargo) {
        this.idcargo = idcargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getSubsidiotransporte() {
        return subsidiotransporte;
    }

    public void setSubsidiotransporte(boolean subsidiotransporte) {
        this.subsidiotransporte = subsidiotransporte;
    }

    public boolean getIntegral() {
        return integral;
    }

    public void setIntegral(boolean integral) {
        this.integral = integral;
    }

    @XmlTransient
    public Collection<Contrato> getContratoCollection() {
        return contratoCollection;
    }

    public void setContratoCollection(Collection<Contrato> contratoCollection) {
        this.contratoCollection = contratoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcargo != null ? idcargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        if ((this.idcargo == null && other.idcargo != null) || (this.idcargo != null && !this.idcargo.equals(other.idcargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Cargo[ idcargo=" + idcargo + " ]";
    }
    
}
