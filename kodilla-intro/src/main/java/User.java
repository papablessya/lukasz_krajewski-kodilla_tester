public class User {

        String name;
        int age;
        int sum;

        public static void main(String[] args) {

        User[] users = new User[5];
        String[] names = new String[]{"John","Will","Ann","Merry","Sue"};
        int[] ages = new int[]{41,55,29,64,24};

        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
            users[i].name = names[i];
            users[i].age = ages [i];
        }
            System.out.println("Users");
        for (int i = 0; i < users.length; i++)
            System.out.println(users[i].name + " " + users[i].age + "lat");
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
        sum += ages[i];
        }
        sum /= ages.length;
        System.out.println(sum);
        }
}