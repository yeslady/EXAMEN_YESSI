/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class gerente extends persona{
    String id_ge,cod_ge;

    public String getId_ge() {
        return id_ge;
    }

    public void setId_ge(String id_ge) {
        this.id_ge = id_ge;
    }

    public String getCod_ge() {
        return cod_ge;
    }

    public void setCod_ge(String cod_ge) {
        this.cod_ge = cod_ge;
    }
    
    public void financiando(){
        System.out.println("estoy viendo los proyectos");
    }
}
