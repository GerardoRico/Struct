package com.tallerstruts.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class UsuarioAction extends ActionSupport implements Preparable {

    public UsuarioAction() {
    }

    @Override
    public String execute() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
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
