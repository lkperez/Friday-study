public class ArrayInt {
    public static int addAll(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    //tester for addAll
    static void testAddAll(){
        int[] testArray = {1,2,3};
        int total = addAll(testArray);
        System.out.println(total);
    }

    public static void main(String[] args){
        testAddAll();
    }
}
