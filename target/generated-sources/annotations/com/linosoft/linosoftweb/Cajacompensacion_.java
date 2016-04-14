package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Contrato;
import com.linosoft.linosoftweb.Liquidacionempleados;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Cajacompensacion.class)
public class Cajacompensacion_ { 

    public static volatile SingularAttribute<Cajacompensacion, String> nombre;
    public static volatile SingularAttribute<Cajacompensacion, Integer> idcaja;
    public static volatile SingularAttribute<Cajacompensacion, String> nit;
    public static volatile CollectionAttribute<Cajacompensacion, Contrato> contratoCollection;
    public static volatile CollectionAttribute<Cajacompensacion, Liquidacionempleados> liquidacionempleadosCollection;

}