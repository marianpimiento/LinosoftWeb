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
@Table(name = "liquidacionempresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Liquidacionempresa.findAll", query = "SELECT l FROM Liquidacionempresa l"),
    @NamedQuery(name = "Liquidacionempresa.findByIdliquidacionempresa", query = "SELECT l FROM Liquidacionempresa l WHERE l.idliquidacionempresa = :idliquidacionempresa"),
    @NamedQuery(name = "Liquidacionempresa.findByBaseaportes", query = "SELECT l FROM Liquidacionempresa l WHERE l.baseaportes = :baseaportes"),
    @NamedQuery(name = "Liquidacionempresa.findByValorcaja", query = "SELECT l FROM Liquidacionempresa l WHERE l.valorcaja = :valorcaja"),
    @NamedQuery(name = "Liquidacionempresa.findByValorsena", query = "SELECT l FROM Liquidacionempresa l WHERE l.valorsena = :valorsena"),
    @NamedQuery(name = "Liquidacionempresa.findByValoricbf", query = "SELECT l FROM Liquidacionempresa l WHERE l.valoricbf = :valoricbf"),
    @NamedQuery(name = "Liquidacionempresa.findByBaseprestaciones", query = "SELECT l FROM Liquidacionempresa l WHERE l.baseprestaciones = :baseprestaciones"),
    @NamedQuery(name = "Liquidacionempresa.findByBasetransporte", query = "SELECT l FROM Liquidacionempresa l WHERE l.basetransporte = :basetransporte"),
    @NamedQuery(name = "Liquidacionempresa.findByValorcesantias", query = "SELECT l FROM Liquidacionempresa l WHERE l.valorcesantias = :valorcesantias"),
    @NamedQuery(name = "Liquidacionempresa.findByValorintereses", query = "SELECT l FROM Liquidacionempresa l WHERE l.valorintereses = :valorintereses"),
    @NamedQuery(name = "Liquidacionempresa.findByValorprima", query = "SELECT l FROM Liquidacionempresa l WHERE l.valorprima = :valorprima"),
    @NamedQuery(name = "Liquidacionempresa.findByValorvacaciones", query = "SELECT l FROM Liquidacionempresa l WHERE l.valorvacaciones = :valorvacaciones")})
public class Liquidacionempresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idliquidacionempresa")
    private Integer idliquidacionempresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "baseaportes")
    private int baseaportes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorcaja")
    private int valorcaja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorsena")
    private int valorsena;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valoricbf")
    private int valoricbf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "baseprestaciones")
    private int baseprestaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "basetransporte")
    private int basetransporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorcesantias")
    private int valorcesantias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorintereses")
    private int valorintereses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorprima")
    private int valorprima;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorvacaciones")
    private int valorvacaciones;
    @JoinColumn(name = "idperiodo", referencedColumnName = "idperiodo")
    @ManyToOne(optional = false)
    private Periodo idperiodo;

    public Liquidacionempresa() {
    }

    public Liquidacionempresa(Integer idliquidacionempresa) {
        this.idliquidacionempresa = idliquidacionempresa;
    }

    public Liquidacionempresa(Integer idliquidacionempresa, int baseaportes, int valorcaja, int valorsena, int valoricbf, int baseprestaciones, int basetransporte, int valorcesantias, int valorintereses, int valorprima, int valorvacaciones) {
        this.idliquidacionempresa = idliquidacionempresa;
        this.baseaportes = baseaportes;
        this.valorcaja = valorcaja;
        this.valorsena = valorsena;
        this.valoricbf = valoricbf;
        this.baseprestaciones = baseprestaciones;
        this.basetransporte = basetransporte;
        this.valorcesantias = valorcesantias;
        this.valorintereses = valorintereses;
        this.valorprima = valorprima;
        this.valorvacaciones = valorvacaciones;
    }

    public Integer getIdliquidacionempresa() {
        return idliquidacionempresa;
    }

    public void setIdliquidacionempresa(Integer idliquidacionempresa) {
        this.idliquidacionempresa = idliquidacionempresa;
    }

    public int getBaseaportes() {
        return baseaportes;
    }

    public void setBaseaportes(int baseaportes) {
        this.baseaportes = baseaportes;
    }

    public int getValorcaja() {
        return valorcaja;
    }

    public void setValorcaja(int valorcaja) {
        this.valorcaja = valorcaja;
    }

    public int getValorsena() {
        return valorsena;
    }

    public void setValorsena(int valorsena) {
        this.valorsena = valorsena;
    }

    public int getValoricbf() {
        return valoricbf;
    }

    public void setValoricbf(int valoricbf) {
        this.valoricbf = valoricbf;
    }

    public int getBaseprestaciones() {
        return baseprestaciones;
    }

    public void setBaseprestaciones(int baseprestaciones) {
        this.baseprestaciones = baseprestaciones;
    }

    public int getBasetransporte() {
        return basetransporte;
    }

    public void setBasetransporte(int basetransporte) {
        this.basetransporte = basetransporte;
    }

    public int getValorcesantias() {
        return valorcesantias;
    }

    public void setValorcesantias(int valorcesantias) {
        this.valorcesantias = valorcesantias;
    }

    public int getValorintereses() {
        return valorintereses;
    }

    public void setValorintereses(int valorintereses) {
        this.valorintereses = valorintereses;
    }

    public int getValorprima() {
        return valorprima;
    }

    public void setValorprima(int valorprima) {
        this.valorprima = valorprima;
    }

    public int getValorvacaciones() {
        return valorvacaciones;
    }

    public void setValorvacaciones(int valorvacaciones) {
        this.valorvacaciones = valorvacaciones;
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
        hash += (idliquidacionempresa != null ? idliquidacionempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Liquidacionempresa)) {
            return false;
        }
        Liquidacionempresa other = (Liquidacionempresa) object;
        if ((this.idliquidacionempresa == null && other.idliquidacionempresa != null) || (this.idliquidacionempresa != null && !this.idliquidacionempresa.equals(other.idliquidacionempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.linosoft.linosoftweb.Liquidacionempresa[ idliquidacionempresa=" + idliquidacionempresa + " ]";
    }
    
}
