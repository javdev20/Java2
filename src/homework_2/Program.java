
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

        

        for(int i=0;i<4;i++){
            if(array.length != 4 || array[i].length != 4) {
            throw new MyArraySizeException();
            }
            for(int j=0;j<4;j++){
                try{
                    boolean isNumeric = array[i][j].chars().allMatch(Character::isDigit);
                    if(isNumeric == false) {
                        throw new MyArrayDataException();
                    }
                    value = Integer.parseInt(array[i][j]);
                    summ += value;
                } catch (MyArrayDataException m){
                    String message = "in array["+i+"]["+j+"]";
                    System.out.println(m.toString(message));
                }
            }
        }

        return summ;
    }
}
