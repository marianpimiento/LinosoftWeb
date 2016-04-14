package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Contrato;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, String> nombre;
    public static volatile SingularAttribute<Cargo, Integer> idcargo;
    public static volatile SingularAttribute<Cargo, Boolean> subsidiotransporte;
    public static volatile SingularAttribute<Cargo, String> tipo;
    public static volatile SingularAttribute<Cargo, Integer> sueldo;
    public static volatile CollectionAttribute<Cargo, Contrato> contratoCollection;
    public static volatile SingularAttribute<Cargo, Boolean> integral;

}