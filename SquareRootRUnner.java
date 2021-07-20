public class SquareRootRUnner {
    static public int mySqrt(int x) {
        int result = 0;
        switch (x){
            case 0:
                break;
            case 1:
                result = x;
                break;
            default:
                for (int iterator = 1; iterator <= x; iterator++) {

                        if(x / (iterator * iterator) < 1){
                            result = iterator-1;
                        break;
                        }
                }


            
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}

