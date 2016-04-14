package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Registronovedad;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Novedad.class)
public class Novedad_ { 

    public static volatile SingularAttribute<Novedad, String> nombre;
    public static volatile SingularAttribute<Novedad, Boolean> transporte;
    public static volatile SingularAttribute<Novedad, String> tiponovedad;
    public static volatile SingularAttribute<Novedad, Boolean> salario;
    public static volatile SingularAttribute<Novedad, BigDecimal> valor;
    public static volatile SingularAttribute<Novedad, Boolean> aportes;
    public static volatile SingularAttribute<Novedad, Boolean> prestacion;
    public static volatile CollectionAttribute<Novedad, Registronovedad> registronovedadCollection;
    public static volatile SingularAttribute<Novedad, String> tipoliquidacion;
    public static volatile SingularAttribute<Novedad, Integer> idnovedad;

}