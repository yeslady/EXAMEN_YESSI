/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class director_academico extends persona{
    String id_di,cod_aca;

    public String getId_di() {
        return id_di;
    }

    public void setId_di(String id_di) {
        this.id_di = id_di;
    }

    public String getCod_aca() {
        return cod_aca;
    }

    public void setCod_aca(String cod_aca) {
        this.cod_aca = cod_aca;
    }
    public void mifuncion(){
        System.out.println("ver el crecimiento de la u");
    }
}
