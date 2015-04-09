/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class jefe_area extends persona{
    String id_je,cod_je;

    public String getId_je() {
        return id_je;
    }

    public void setId_je(String id_je) {
        this.id_je = id_je;
    }

    public String getCod_je() {
        return cod_je;
    }

    public void setCod_je(String cod_je) {
        this.cod_je = cod_je;
    }
    public void verorden(){
        System.out.println("observando el orden ");
    }
}
