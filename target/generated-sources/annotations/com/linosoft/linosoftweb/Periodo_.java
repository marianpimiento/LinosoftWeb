package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Configuracion;
import com.linosoft.linosoftweb.Liquidacionempleados;
import com.linosoft.linosoftweb.Liquidacionempresa;
import com.linosoft.linosoftweb.Registronovedad;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Periodo.class)
public class Periodo_ { 

    public static volatile SingularAttribute<Periodo, Integer> anio;
    public static volatile CollectionAttribute<Periodo, Configuracion> configuracionCollection;
    public static volatile SingularAttribute<Periodo, Integer> idperiodo;
    public static volatile SingularAttribute<Periodo, Integer> corte;
    public static volatile SingularAttribute<Periodo, Integer> mes;
    public static volatile CollectionAttribute<Periodo, Liquidacionempresa> liquidacionempresaCollection;
    public static volatile CollectionAttribute<Periodo, Registronovedad> registronovedadCollection;
    public static volatile CollectionAttribute<Periodo, Liquidacionempleados> liquidacionempleadosCollection;

}