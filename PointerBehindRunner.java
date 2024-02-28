public class PointerBehindRunner {

    public static void main(String[] args){
        int[] number = {1,2,3,4,5};
        int index = -1;
        for(int i : number){
            if(i==1){
                index = index+1;
            }else{
                index++;
                System.out.println(number[index]);
            }
            System.out.println(i);
        }
    }

}
