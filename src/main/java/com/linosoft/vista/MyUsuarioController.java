package com.linosoft.vista;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

@Named("MyUsuarioController")
@SessionScoped
public class MyUsuarioController implements Serializable {

    @Inject
    private UsuarioController usuarioController;
    
    @PostConstruct
    public void inicializar() {
        if ( usuarioController.getSelected() == null ) {
          usuarioController.setSelected( usuarioController.prepareCreate() ) ;
        }
    }   
    
    private String user;	   
    
    public String getUser() {
        return user;
        
    }

    public void getUser(String user) {
        this.user = user;
    }

    public String validaUsuario() {
    return "/Inicio/templateInicio";
    }
    

}
