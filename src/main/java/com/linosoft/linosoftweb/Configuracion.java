/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linosoft.linosoftweb;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "configuracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Configuracion.findAll", query = "SELECT c FROM Configuracion c"),
    @NamedQuery(name = "Configuracion.findByIdconfiguracion", query = "SELECT c FROM Configuracion c WHERE c.idconfiguracion = :idconfiguracion"),
    @NamedQuery(name = "Configuracion.findByPorcentajecaja", query = "SELECT c FROM Configuracion c WHERE c.porcentajecaja = :porcentajecaja"),
    @NamedQuery(name = "Configuracion.findByPorcentajesena", query = "SELECT c FROM Configuracion c WHERE c.porcentajesena = :porcentajesena"),
    @NamedQuery(name = "Configuracion.findByPorcentajeicbf", query = "SELECT c FROM Configuracion c WHERE c.porcentajeicbf = :porcentajeicbf"),
    @NamedQuery(name = "Configuracion.findBySalariominimo", query = "SELECT c FROM Configuracion c WHERE c.salariominimo = :salariominimo"),
    @NamedQuery(name = "Configuracion.findBySubsidiotransporte", query = "SELECT c FROM Configuracion c WHERE c.subsidiotransporte = :subsidiotransporte"),
    @NamedQuery(name = "Configuracion.findByDiasliquidar", query = "SELECT c FROM Configuracion c WHERE c.diasliquidar = :diasliquidar"),
    @NamedQuery(name = "Configuracion.findByProvisioncesantias", query = "SELECT c FROM Configuracion c WHERE c.provisioncesantias = :provisioncesantias"),
    @NamedQuery(name = "Configuracion.findByProvisionintereses", query = "SELECT c FROM Configuracion c WHERE c.provisionintereses = :provisionintereses"),
    @NamedQuery(name = "Configuracion.findByProvisionprima", query = "SELECT c FROM Configuracion c WHERE c.provisionprima = :provisionprima"),
    @NamedQuery(name = "Configuracion.findByProvisionvacaciones", query = "SELECT c FROM Configuracion c WHERE c.provisionvacaciones = :provisionvacaciones"),
    @NamedQuery(name = "Configuracion.findBySaludempleado", query = "SELECT c FROM Configuracion c WHERE c.saludempleado = :saludempleado"),
    @NamedQuery(name = "Configuracion.findBySaludempresa", query = "SELECT c FROM Configuracion c WHERE c.saludempresa = :saludempresa"),
    @NamedQuery(name = "Configuracion.findByConvencionempleado", query = "SELECT c FROM Configuracion c WHERE c.convencionempleado = :convencionempleado"),
    @NamedQuery(name = "Configuracion.findByConvencionempresa", query = "SELECT c FROM Configuracion c WHERE c.convencionempresa = :convencionempresa"),
    @NamedQuery(name = "Configuracion.findByPensionempleado", query = "SELECT c FROM Configuracion c WHERE c.pensionempleado = :pensionempleado"),
    @NamedQuery(name = "Configuracion.findByPensionempresa", query = "SELECT c FROM Configuracion c WHERE c.pensionempresa = :pensionempresa")})
public class Configuracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconfiguracion")
    private Integer idconfiguracion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentajecaja")
    private BigDecimal porcentajecaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentajesena")
    private BigDecimal porcentajesena;
    @Basic(optional = false)
    @NotNull
    @Column(name = "porcentajeicbf")
    private BigDecimal porcentajeicbf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salariominimo")
    private int salariominimo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "subsidiotransporte")
    private int subsidiotransporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diasliquidar")
    private int diasliquidar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provisioncesantias")
    private BigDecimal provisioncesantias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provisionintereses")
    private BigDecimal provisionintereses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provisionprima")
    private BigDecimal provisionprima;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provisionvacaciones")
    private BigDecimal provisionvacaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saludempleado")
    private BigDecimal saludempleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saludempresa")
    private BigDecimal saludempresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "convencionempleado")
    private BigDecimal convencionempleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "convencionempresa")
    private BigDecimal convencionempresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pensionempleado")
    private BigDecimal pensionempleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pensionempresa")
    private BigDecimal pensionempresa;
    @JoinColumn(name = "idperiodo", referencedColumnName = "idperiodo")
    @ManyToOne(optional = false)
    private Periodo idperiodo;

    public Configuracion() {
    }

    public Configuracion(Integer idconfiguracion) {
        this.idconfiguracion = idconfiguracion;
    }

    public Configuracion(Integer idconfiguracion, BigDecimal porcentajecaja, BigDecimal porcentajesena, BigDecimal porcentajeicbf, int salariominimo, int subsidiotransporte, int diasliquidar, BigDecimal provisioncesantias, BigDecimal provisionintereses, BigDecimal provisionprima, BigDecimal provisionvacaciones, BigDecimal saludempleado, BigDecimal saludempresa, BigDecimal convencionempleado, BigDecimal convencionempresa, BigDecimal pensionempleado, BigDecimal pensionempresa) {
        this.idconfiguracion = idconfiguracion;
        this.porcentajecaja = porcentajecaja;
        this.porcentajesena = porcentajesena;
        this.porcentajeicbf = porcentajeicbf;
        this.salariominimo = salariominimo;
        this.subsidiotransporte = subsidiotransporte;
        this.diasliquidar = diasliquidar;
        this.provisioncesantias = provisioncesantias;
        this.provisionintereses = provisionintereses;
        this.provisionprima = provisionprima;
        this.provisionvacaciones = provisionvacaciones;
        this.saludempleado = saludempleado;
        this.saludempresa = saludempresa;
        this.convencionempleado = convencionempleado;
        this.convencionempresa = convencionempresa;
        this.pensionempleado = pensionempleado;
        this.pensionempresa = pensionempresa;
    }

    public Integer getIdconfiguracion() {
        return idconfiguracion;
    }

    public void setIdconfiguracion(Integer idconfiguracion) {
        this.idconfiguracion = idconfiguracion;
    }

    public BigDecimal getPorcentajecaja() {
        return porcentajecaja;
    }

    public void setPorcentajecaja(BigDecimal porcentajecaja) {
        this.porcentajecaja = porcentajecaja;
    }

    public BigDecimal getPorcentajesena() {
        return porcentajesena;
    }

    public void setPorcentajesena(BigDecimal porcentajesena) {
        this.porcentajesena = porcentajesena;
    }

    public BigDecimal getPorcentajeicbf() {
        return porcentajeicbf;
    }

    public void setPorcentajeicbf(BigDecimal porcentajeicbf) {
        this.porcentajeicbf = porcentajeicbf;
    }

    public int getSalariominimo() {
        return salariominimo;
    }

    public void setSalariominimo(int salariominimo) {
        this.salariominimo = salariominimo;
    }

    public int getSubsidiotransporte() {
        return subsidiotransporte;
    }

    public void setSubsidiotransporte(int subsidiotransporte) {
        this.subsidiotransporte = subsidiotransporte;
    }

    public int getDiasliquidar() {
        return diasliquidar;
    }

    public void setDiasliquidar(int diasliquidar) {
        this.diasliquidar = diasliquidar;
    }

    public BigDecimal getProvisioncesantias() {
        return provisioncesantias;
    }

    public void setProvisioncesantias(BigDecimal provisioncesantias) {
        this.provisioncesantias = provisioncesantias;
    }

    public BigDecimal getProvisionintereses() {
        return provisionintereses;
    }

    public void setProvisionintereses(BigDecimal provisionintereses) {
        this.provisionintereses = provisionintereses;
    }

    public BigDecimal getProvisionprima() {
        return provisionprima;
    }

    public void setProvisionprima(BigDecimal provisionprima) {
        this.provisionprima = provisionprima;
    }

    public BigDecimal getProvisionvacaciones() {
        return provisionvacaciones;
    }

    public void setProvisionvacaciones(BigDecimal provisionvacaciones) {
        this.provisionvacaciones = provisionvacaciones;
    }

    public BigDecimal getSaludempleado() {
        return saludempleado;
    }

    public void setSaludempleado(BigDecimal saludempleado) {
        this.saludempleado = saludempleado;
    }

    public BigDecimal getSaludempresa() {
        return saludempresa;
    }

    public void setSaludempresa(BigDecimal saludempresa) {
        this.saludempresa = saludempresa;
    }

    public BigDecimal getConvencionempleado() {
        return convencionempleado;
    }

    public void setConvencionempleado(BigDecimal convencionempleado) {
        this.convencionempleado = convencionempleado;
    }

    public BigDecimal getConvencionempresa() {
        return convencionempresa;
    }

    public void setConvencionempresa(BigDecimal convencionempresa) {
        this.convencionempresa = convencionempresa;
    }

    public BigDecimal getPensionempleado() {
        return pensionempleado;
    }

    public void setPensionempleado(BigDecimal pensionempleado) {
        this.pensionempleado = pensionempleado;
    }

    public BigDecimal getPensionempresa() {
        return pensionempresa;
    }

    public void setPensionempresa(BigDecimal pensionempresa) {
        this.pensionempresa = pensionempresa;
    }

    public Periodo getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(Periodo idperiodo) {
        this.idperiodo = idperiodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconfiguracion != null ? idconfiguracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Configuracion)) {
            return false;
        }
        Configuracion other = (Configuracion) object;
        if ((this.idconfiguracion == null && other.idconfiguracion != null) || (this.idconfiguracion != null && !this.idconfiguracion.equals(other.idconfiguracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Configuracion[ idconfiguracion=" + idconfiguracion + " ]";
    }
    
}
