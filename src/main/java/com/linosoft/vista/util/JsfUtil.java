package com.linosoft.vista.util;

import com.linosoft.linosoftweb.Cajacompensacion;
import com.linosoft.linosoftweb.Cargo;
import com.linosoft.linosoftweb.Contrato;
import com.linosoft.linosoftweb.Empleado;
import com.linosoft.linosoftweb.Eps;
import com.linosoft.linosoftweb.Fondopension;
import com.linosoft.linosoftweb.Novedad;
import com.linosoft.linosoftweb.Periodo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;

public class JsfUtil {

    public static SelectItem[] getSelectItemsPension(List<Fondopension> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "Seleccione una opción");
            i++;
        }
        for (Fondopension x : entities) {
            items[i++] = new SelectItem(x, x.getNombre());
        }
        return items;
    }

    public static SelectItem[] getSelectItemsEps(List<Eps> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "Seleccione una opción");
            i++;
        }
        for (Eps x : entities) {
            items[i++] = new SelectItem(x, x.getNombre());
        }
        return items;
    }

    public static SelectItem[] getSelectItemsCargo(List<Cargo> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "Seleccione una opción");
            i++;
        }
        for (Cargo x : entities) {
            items[i++] = new SelectItem(x, x.getNombre());
        }
        return items;
    }

    public static SelectItem[] getSelectItemsCajaCompensacion(List<Cajacompensacion> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "Seleccione una opción");
            i++;
        }
        for (Cajacompensacion x : entities) {
            items[i++] = new SelectItem(x, x.getNombre());
        }
        return items;
    }

    public static SelectItem[] getSelectItemsEmpleado(List<Empleado> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "Seleccione una opción");
            i++;
        }
        for (Empleado x : entities) {
            String nombre = x.getNombres()+" "+x.getApellidos();
            items[i++] = new SelectItem(x, nombre);
        }
        return items;
    }

    public static SelectItem[] getSelectItemsPeriodo(List<Periodo> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "Seleccione una opción");
            i++;
        }
        for (Periodo x : entities) {
            String per = "Año:"+x.getAnio()+" / "+"Mes:"+x.getMes()+" / "+"Corte:"+x.getCorte();
            items[i++] = new SelectItem(x, per);
        }
        return items;
    }

    public static SelectItem[] getSelectItemsNovedad(List<Novedad> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "Seleccione una opción");
            i++;
        }
        for (Novedad x : entities) {
            items[i++] = new SelectItem(x, x.getNombre());
        }
        return items;
    }
    
    public static SelectItem[] getSelectItemsContrato(List<Contrato> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "Seleccione una opción");
            i++;
        }
        for (Contrato x : entities) {
            items[i++] = new SelectItem(x, x.getIdcontrato().toString());
        }
        return items;
    }    
    public static SelectItem[] getSelectItems(List<?> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "---");
            i++;
        }
        for (Object x : entities) {
            items[i++] = new SelectItem(x, x.toString());
        }
        return items;
    }

    public static boolean isValidationFailed() {
        return FacesContext.getCurrentInstance().isValidationFailed();
    }

    public static void addErrorMessage(Exception ex, String defaultMsg) {
        String msg = ex.getLocalizedMessage();
        if (msg != null && msg.length() > 0) {
            addErrorMessage(msg);
        } else {
            addErrorMessage(defaultMsg);
        }
    }

    public static void addErrorMessages(List<String> messages) {
        for (String message : messages) {
            addErrorMessage(message);
        }
    }

    public static void addErrorMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public static void addSuccessMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
    }

    public static String getRequestParameter(String key) {
        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
    }

    public static Object getObjectFromRequestParameter(String requestParameterName, Converter converter, UIComponent component) {
        String theId = JsfUtil.getRequestParameter(requestParameterName);
        return converter.getAsObject(FacesContext.getCurrentInstance(), component, theId);
    }

    public static enum PersistAction {

        CREATE,
        DELETE,
        UPDATE
    }
}
