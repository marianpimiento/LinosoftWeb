package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Cajacompensacion;
import com.linosoft.linosoftweb.Cargo;
import com.linosoft.linosoftweb.Empleado;
import com.linosoft.linosoftweb.Eps;
import com.linosoft.linosoftweb.Fondopension;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Contrato.class)
public class Contrato_ { 

    public static volatile SingularAttribute<Contrato, Date> ingreso;
    public static volatile SingularAttribute<Contrato, Eps> ideps;
    public static volatile SingularAttribute<Contrato, Cargo> idcargo;
    public static volatile SingularAttribute<Contrato, Date> termino;
    public static volatile SingularAttribute<Contrato, Cajacompensacion> idcaja;
    public static volatile SingularAttribute<Contrato, String> tipo;
    public static volatile CollectionAttribute<Contrato, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Contrato, Fondopension> idpension;
    public static volatile SingularAttribute<Contrato, Integer> idcontrato;
    public static volatile SingularAttribute<Contrato, BigDecimal> arl;
    public static volatile SingularAttribute<Contrato, Empleado> cedula;

}