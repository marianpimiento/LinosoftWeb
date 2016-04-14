/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linosoft.linosoftweb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ciro
 */
@Entity
@Table(name = "contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByIdcontrato", query = "SELECT c FROM Contrato c WHERE c.idcontrato = :idcontrato"),
    @NamedQuery(name = "Contrato.findByTipo", query = "SELECT c FROM Contrato c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Contrato.findByIngreso", query = "SELECT c FROM Contrato c WHERE c.ingreso = :ingreso"),
    @NamedQuery(name = "Contrato.findByTermino", query = "SELECT c FROM Contrato c WHERE c.termino = :termino"),
    @NamedQuery(name = "Contrato.findByArl", query = "SELECT c FROM Contrato c WHERE c.arl = :arl")})
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontrato")
    private Integer idcontrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ingreso")
    @Temporal(TemporalType.DATE)
    private Date ingreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "termino")
    @Temporal(TemporalType.DATE)
    private Date termino;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "arl")
    private BigDecimal arl;
    @OneToMany(mappedBy = "idcontrato")
    private Collection<Empleado> empleadoCollection;
    @JoinColumn(name = "idpension", referencedColumnName = "idpension")
    @ManyToOne(optional = false)
    private Fondopension idpension;
    @JoinColumn(name = "ideps", referencedColumnName = "ideps")
    @ManyToOne(optional = false)
    private Eps ideps;
    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo")
    @ManyToOne(optional = false)
    private Cargo idcargo;
    @JoinColumn(name = "idcaja", referencedColumnName = "idcaja")
    @ManyToOne(optional = false)
    private Cajacompensacion idcaja;
    @JoinColumn(name = "cedula", referencedColumnName = "cedula")
    @ManyToOne(optional = false)
    private Empleado cedula;

    public Contrato() {
    }

    public Contrato(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }

    public Contrato(Integer idcontrato, String tipo, Date ingreso, Date termino, BigDecimal arl) {
        this.idcontrato = idcontrato;
        this.tipo = tipo;
        this.ingreso = ingreso;
        this.termino = termino;
        this.arl = arl;
    }

    public Integer getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Integer idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    public BigDecimal getArl() {
        return arl;
    }

    public void setArl(BigDecimal arl) {
        this.arl = arl;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
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

    public Cargo getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Cargo idcargo) {
        this.idcargo = idcargo;
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
        hash += (idcontrato != null ? idcontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.idcontrato == null && other.idcontrato != null) || (this.idcontrato != null && !this.idcontrato.equals(other.idcontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Contrato[ idcontrato=" + idcontrato + " ]";
    }
    
}
