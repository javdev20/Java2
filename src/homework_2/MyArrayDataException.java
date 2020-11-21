/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_2;

/**
 *
 * @author User
 */
public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(String message) {
        super("Incorrect data " + message);
    }
}
