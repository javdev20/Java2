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
public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("The size of an array is incorrect!");
    }
}
