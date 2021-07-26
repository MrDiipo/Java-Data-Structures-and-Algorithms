package Arrays;

public class SingDimArr {
    int arr[] = null;

    public SingDimArr(int sizeOfArray){
        this.arr = new int[sizeOfArray];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int valueToBeInserted){
          try {
              if (arr[location] == Integer.MIN_VALUE){
                  arr[location] = valueToBeInserted;
                  System.out.println("Successfully inserted");
              } else{
                  System.out.println("This cell is already occupied");
              }
          } catch (ArrayIndexOutOfBoundsException e){
              System.out.println("Invalid index to access array!");
          }
    }
    // We traverse through the array.
    public void traverseArray(){
      try {
          for (int i = 0; i<arr.length; i++){
              System.out.print(arr[i] + ", ");
          }
      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Array traversal");
      }
    }
    // Search for an element in the array
    public void searchArray(int valueToSearch){
        for (int i=0; i<arr.length; i++ ){
            if (arr[i] == valueToSearch){
                System.out.println("Value " + valueToSearch + " found at index " + i);
               return;
            }
        }
        System.out.println("Value " + valueToSearch + " not found!");
    }
}
