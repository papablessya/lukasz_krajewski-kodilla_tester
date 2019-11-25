public class SimpleArray {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Jeremy";
        names[2] = "Jonah";
        names[3] = "Ed";
        names[4] = "Adam";

        String name = names[3];
        System.out.println(name);

        int numberOfElements = names.length;
        System.out.println(numberOfElements);

        for (int i=0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
