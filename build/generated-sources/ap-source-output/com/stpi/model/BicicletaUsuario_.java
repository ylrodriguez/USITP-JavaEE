package com.stpi.model;

import com.stpi.model.Bicicleta;
import com.stpi.model.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-03T13:20:41")
@StaticMetamodel(BicicletaUsuario.class)
public class BicicletaUsuario_ { 

    public static volatile SingularAttribute<BicicletaUsuario, Bicicleta> bicicletaId;
    public static volatile SingularAttribute<BicicletaUsuario, Date> fechaInicio;
    public static volatile SingularAttribute<BicicletaUsuario, Integer> id;
    public static volatile SingularAttribute<BicicletaUsuario, Date> fechaFin;
    public static volatile SingularAttribute<BicicletaUsuario, Usuario> usuarioId;

}