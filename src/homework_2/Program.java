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
public class Program {
    public void createArray() {
        int result = 0;

        String[][] array = {{"7","9", "121","71"},{"9","18","17","19"},
                                {"145","8","4","7"},{"20","98","4","5"}};
        
        try {
            result = 0;
            result = doCheck(array);
            System.out.println("The sum of array elements is " + result);

        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("=======================");
        }
        
    }
    
    public static int doCheck(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;
        int value = 0;

        if(array.length != 4 || array[0].length != 4 || array[1].length != 4
                                || array[2].length != 4 || array[3].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                try{
                    value = Integer.parseInt(array[i][j]);
                    summ += value;
                } catch (IllegalArgumentException e){
                    String message = "in array["+i+"]["+j+"]";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return summ;
    }
}
