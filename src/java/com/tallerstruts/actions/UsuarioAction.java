package com.tallerstruts.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.tallerstruts.models.Usuario;

public class UsuarioAction extends ActionSupport implements Preparable {
    
    private Usuario Us = new Usuario();
    
    public Usuario getUs() {
        return Us;
    }

    public void setUs(Usuario Us) {
        this.Us = Us;
    }
    
    
    public UsuarioAction() {
    }

    @Override
    public String execute() throws Exception {
       String ir = ERROR;
        if(getUs().getNombre().equals("yerard") && getUs().getPassword().equals("1234")){
            Us.setNombre("Gerardo");
            ir = SUCCESS;
        }else{
            Us.setNombre("Error");
        }
        return ir;
    }

    @Override
    public void prepare() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String doList() {
//        ArrayList<Usuario> usuarios = empService.getAllEmployees();
        return SUCCESS;
    }

    public String doInput() {
        return SUCCESS;
    }

    public String doSave() {
        return SUCCESS;
    }

    public String doDelete() {
        return SUCCESS;
    }
}
