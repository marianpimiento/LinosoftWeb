package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Contrato;
import com.linosoft.linosoftweb.Liquidacionempleados;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Eps.class)
public class Eps_ { 

    public static volatile SingularAttribute<Eps, String> nombre;
    public static volatile SingularAttribute<Eps, Integer> ideps;
    public static volatile SingularAttribute<Eps, String> nit;
    public static volatile CollectionAttribute<Eps, Contrato> contratoCollection;
    public static volatile CollectionAttribute<Eps, Liquidacionempleados> liquidacionempleadosCollection;

}