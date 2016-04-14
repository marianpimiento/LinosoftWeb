package com.linosoft.vista;

import com.linosoft.linosoftweb.Liquidacionempleados;
import com.linosoft.vista.util.JsfUtil;
import com.linosoft.vista.util.JsfUtil.PersistAction;
import com.linosoft.controlador.LiquidacionempleadosFacade;
import com.linosoft.linosoftweb.Usuario;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("liquidacionempleadosController")
@SessionScoped
public class LiquidacionempleadosController implements Serializable {

    @EJB
    private com.linosoft.controlador.LiquidacionempleadosFacade ejbFacade;
    private List<Liquidacionempleados> items = null;
    private Liquidacionempleados selected;

    public LiquidacionempleadosController() {
    }

    public Liquidacionempleados getSelected() {
        return selected;
    }

    public void setSelected(Liquidacionempleados selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private LiquidacionempleadosFacade getFacade() {
        return ejbFacade;
    }

    public Liquidacionempleados prepareCreate() {
        selected = new Liquidacionempleados();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("LiquidacionempleadosCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("LiquidacionempleadosUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("LiquidacionempleadosDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Liquidacionempleados> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Liquidacionempleados getLiquidacionempleados(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Liquidacionempleados> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Liquidacionempleados> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

   public String liquidarNomina() {
        JsfUtil.addSuccessMessage("Liquidación de Nomina finalizada") ;
        return "/liquidacionempleados/List";
       
    }
        
    
    
    @FacesConverter(forClass = Liquidacionempleados.class)
    public static class LiquidacionempleadosControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            LiquidacionempleadosController controller = (LiquidacionempleadosController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "liquidacionempleadosController");
            return controller.getLiquidacionempleados(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Liquidacionempleados) {
                Liquidacionempleados o = (Liquidacionempleados) object;
                return getStringKey(o.getIdliquidacionempleado());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Liquidacionempleados.class.getName()});
                return null;
            }
        }

    }

}
