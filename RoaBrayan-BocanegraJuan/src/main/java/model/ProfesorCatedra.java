/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sala8
 */
public class ProfesorCatedra extends Profesor {

    private String especialidad;

    public ProfesorCatedra(int cedulaProfesor, String nombreCompleto, String correoElectronico, String userName, String especialidad) {
        super(cedulaProfesor, nombreCompleto, correoElectronico, userName);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + " Especialidad: " + especialidad;
    }
}