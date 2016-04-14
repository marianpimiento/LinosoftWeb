/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linosoft.linosoftweb;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "novedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Novedad.findAll", query = "SELECT n FROM Novedad n"),
    @NamedQuery(name = "Novedad.findByIdnovedad", query = "SELECT n FROM Novedad n WHERE n.idnovedad = :idnovedad"),
    @NamedQuery(name = "Novedad.findByNombre", query = "SELECT n FROM Novedad n WHERE n.nombre = :nombre"),
    @NamedQuery(name = "Novedad.findByTiponovedad", query = "SELECT n FROM Novedad n WHERE n.tiponovedad = :tiponovedad"),
    @NamedQuery(name = "Novedad.findByTipoliquidacion", query = "SELECT n FROM Novedad n WHERE n.tipoliquidacion = :tipoliquidacion"),
    @NamedQuery(name = "Novedad.findByValor", query = "SELECT n FROM Novedad n WHERE n.valor = :valor"),
    @NamedQuery(name = "Novedad.findByAportes", query = "SELECT n FROM Novedad n WHERE n.aportes = :aportes"),
    @NamedQuery(name = "Novedad.findByPrestacion", query = "SELECT n FROM Novedad n WHERE n.prestacion = :prestacion"),
    @NamedQuery(name = "Novedad.findBySalario", query = "SELECT n FROM Novedad n WHERE n.salario = :salario"),
    @NamedQuery(name = "Novedad.findByTransporte", query = "SELECT n FROM Novedad n WHERE n.transporte = :transporte")})
public class Novedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnovedad")
    private Integer idnovedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tiponovedad")
    private String tiponovedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipoliquidacion")
    private String tipoliquidacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aportes")
    private boolean aportes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prestacion")
    private boolean prestacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salario")
    private boolean salario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transporte")
    private boolean transporte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnovedad")
    private Collection<Registronovedad> registronovedadCollection;

    public Novedad() {
    }

    public Novedad(Integer idnovedad) {
        this.idnovedad = idnovedad;
    }

    public Novedad(Integer idnovedad, String nombre, String tiponovedad, String tipoliquidacion, boolean aportes, boolean prestacion, boolean salario, boolean transporte) {
        this.idnovedad = idnovedad;
        this.nombre = nombre;
        this.tiponovedad = tiponovedad;
        this.tipoliquidacion = tipoliquidacion;
        this.aportes = aportes;
        this.prestacion = prestacion;
        this.salario = salario;
        this.transporte = transporte;
    }

    public Integer getIdnovedad() {
        return idnovedad;
    }

    public void setIdnovedad(Integer idnovedad) {
        this.idnovedad = idnovedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiponovedad() {
        return tiponovedad;
    }

    public void setTiponovedad(String tiponovedad) {
        this.tiponovedad = tiponovedad;
    }

    public String getTipoliquidacion() {
        return tipoliquidacion;
    }

    public void setTipoliquidacion(String tipoliquidacion) {
        this.tipoliquidacion = tipoliquidacion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean getAportes() {
        return aportes;
    }

    public void setAportes(boolean aportes) {
        this.aportes = aportes;
    }

    public boolean getPrestacion() {
        return prestacion;
    }

    public void setPrestacion(boolean prestacion) {
        this.prestacion = prestacion;
    }

    public boolean getSalario() {
        return salario;
    }

    public void setSalario(boolean salario) {
        this.salario = salario;
    }

    public boolean getTransporte() {
        return transporte;
    }

    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }

    @XmlTransient
    public Collection<Registronovedad> getRegistronovedadCollection() {
        return registronovedadCollection;
    }

    public void setRegistronovedadCollection(Collection<Registronovedad> registronovedadCollection) {
        this.registronovedadCollection = registronovedadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnovedad != null ? idnovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Novedad)) {
            return false;
        }
        Novedad other = (Novedad) object;
        if ((this.idnovedad == null && other.idnovedad != null) || (this.idnovedad != null && !this.idnovedad.equals(other.idnovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Novedad[ idnovedad=" + idnovedad + " ]";
    }
    
}
