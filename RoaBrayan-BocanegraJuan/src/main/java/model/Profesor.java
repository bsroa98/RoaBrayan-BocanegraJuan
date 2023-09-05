/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * 
 * @author brayan
 */
public abstract class Profesor {
    
    protected int cedulaProfesor;
    protected String nombreCompleto;
    protected String correoElectronico;
    protected String userName;

    public Profesor(int cedulaProfesor, String nombreCompleto, String correoElectronico, String userName) {
        this.cedulaProfesor = cedulaProfesor;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.userName = userName;
    }

    public Profesor() {
    }

    
    
    /**
     * @return the claveProfesor
     */
    public int getCedulaProfesor() {
        return cedulaProfesor;
    }

    /**
     * @param cedulaProfesor
     */
    public void setCedulaProfesor(int cedulaProfesor) {
        this.cedulaProfesor = cedulaProfesor;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Override
    public String toString(){
        return " Codigo docente : "+cedulaProfesor+
                " Nombre del docente : "+nombreCompleto+
                " Correo electrónico : "+ correoElectronico+
                " Usuario : "+userName;
    }

}
