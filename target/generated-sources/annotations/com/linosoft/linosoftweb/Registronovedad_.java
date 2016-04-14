package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Empleado;
import com.linosoft.linosoftweb.Novedad;
import com.linosoft.linosoftweb.Periodo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Registronovedad.class)
public class Registronovedad_ { 

    public static volatile SingularAttribute<Registronovedad, Integer> total;
    public static volatile SingularAttribute<Registronovedad, Periodo> idperiodo;
    public static volatile SingularAttribute<Registronovedad, Integer> valor;
    public static volatile SingularAttribute<Registronovedad, Integer> idregistro;
    public static volatile SingularAttribute<Registronovedad, Integer> cantidad;
    public static volatile SingularAttribute<Registronovedad, Empleado> cedula;
    public static volatile SingularAttribute<Registronovedad, Novedad> idnovedad;

}