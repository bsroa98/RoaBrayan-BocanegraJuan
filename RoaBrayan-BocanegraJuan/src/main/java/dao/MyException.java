/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

/**
 *
 * @author brayan
 */
public class MyException extends Exception{
    private static final long serialVersionUID = 1L;

    public MyException(String msg){
        super(msg);
    }
}
