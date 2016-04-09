package com.tallerstruts.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends ActionSupport implements Preparable {

    @Override
    public String execute() throws Exception {
        return "hola";
    }

    @Override
    public void prepare() throws Exception {
    }
}
