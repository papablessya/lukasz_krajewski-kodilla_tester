public class User {

    public static void main(String[] args) {


        String[] userName = new String[5];
        userName[0] = "John Doe";
        userName[1] = "Ann Ban";
        userName[2] = "Ricky Tricky";
        userName[3] = "Cole Row";
        userName[4] = "Sebastian Essex";

        int[] userAge = new int[5];
        userAge[0] = 32;
        userAge[1] = 21;
        userAge[2] = 15;
        userAge[3] = 41;
        userAge[4] = 29;



        }

        public static int sumUserAge ( int[] userAge ){
            int result = 0;
            for (int i = 0; i < userAge.length; i++) {
                result = result + userAge[i];
            }
            return result;

        }

    }

