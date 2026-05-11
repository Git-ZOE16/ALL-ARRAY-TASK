public class TaskFour{
public static int evenArray(int[] array){

 int count = 0;
 int number = 0; 
 
for(count = 0; count < array.length; count++){
    if (count % 2 == 0){
    
        number = array[count];
    System.out.println(number);
    }
}
 
 return number;
 }
 
 public static void main(String[] args){
 
 int[] array = {12, 2, 46, 48, 7};
 
 evenArray(array);
 }
}
 
