package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Cajacompensacion;
import com.linosoft.linosoftweb.Empleado;
import com.linosoft.linosoftweb.Eps;
import com.linosoft.linosoftweb.Fondopension;
import com.linosoft.linosoftweb.Periodo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Liquidacionempleados.class)
public class Liquidacionempleados_ { 

    public static volatile SingularAttribute<Liquidacionempleados, Integer> ingresobaseprestaciones;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> transporte;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> aportespension;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> idliquidacionempleado;
    public static volatile SingularAttribute<Liquidacionempleados, Periodo> idperiodo;
    public static volatile SingularAttribute<Liquidacionempleados, Cajacompensacion> idcaja;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> deducidos;
    public static volatile SingularAttribute<Liquidacionempleados, Fondopension> idpension;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> diastransporte;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> aportessalud;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> sueldo;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> ingresobaseaportes;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> neto;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> diasaportes;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> fondosolidaridad;
    public static volatile SingularAttribute<Liquidacionempleados, Eps> ideps;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> salario;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> diassalario;
    public static volatile SingularAttribute<Liquidacionempleados, Integer> devengados;
    public static volatile SingularAttribute<Liquidacionempleados, Empleado> cedula;

}