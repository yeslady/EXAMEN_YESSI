/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class contador extends persona{
    String id_cont,cod_cont;

    public String getId_cont() {
        return id_cont;
    }

    public void setId_cont(String id_cont) {
        this.id_cont = id_cont;
    }

    public String getCod_cont() {
        return cod_cont;
    }

    public void setCod_cont(String cod_cont) {
        this.cod_cont = cod_cont;
    }
    public void realizacuenta(){
        System.out.println("REALIZANDO CUENTAS");
    }
}
