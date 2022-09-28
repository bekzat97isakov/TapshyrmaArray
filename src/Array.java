public class Array {
    private int[] arr = new int[10];
    private int shetchic = 0;

    public int getSize(){
        return arr.length;
    }

    public void add(int arg){
        if ((shetchic + 1)== arr.length){
            int[]newArr = new int[Math.round(arr.length*1.5f)];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[shetchic] = arg;
        shetchic++;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){

            }
        }
    }
    public void remove(int index){
        for (int i = index; i < arr.length - 1 ; i++) {
            arr[i]= arr[i+1];
        }
        arr[shetchic] = 0;
        shetchic--;
    }
    public int getArr(int index){
        return arr[index];
    }


}
