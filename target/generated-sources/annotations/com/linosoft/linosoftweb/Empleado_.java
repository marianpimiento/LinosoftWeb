package com.linosoft.linosoftweb;

import com.linosoft.linosoftweb.Contrato;
import com.linosoft.linosoftweb.Liquidacionempleados;
import com.linosoft.linosoftweb.Registronovedad;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-16T21:38:53")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> mail;
    public static volatile SingularAttribute<Empleado, String> direccion;
    public static volatile SingularAttribute<Empleado, String> nombres;
    public static volatile SingularAttribute<Empleado, String> apellidos;
    public static volatile SingularAttribute<Empleado, String> telefono;
    public static volatile SingularAttribute<Empleado, Contrato> idcontrato;
    public static volatile SingularAttribute<Empleado, String> sexo;
    public static volatile CollectionAttribute<Empleado, Registronovedad> registronovedadCollection;
    public static volatile SingularAttribute<Empleado, String> barrio;
    public static volatile CollectionAttribute<Empleado, Contrato> contratoCollection;
    public static volatile SingularAttribute<Empleado, Date> fechanacimiento;
    public static volatile CollectionAttribute<Empleado, Liquidacionempleados> liquidacionempleadosCollection;
    public static volatile SingularAttribute<Empleado, String> cedula;
    public static volatile SingularAttribute<Empleado, String> celular;

}