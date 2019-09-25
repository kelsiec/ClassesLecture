import java.util.Arrays;

public class Student {
    private String name;
    private final String favoriteFood;
    private String[] hobbies;

    public Student(String name, String favoriteFood, String[] hobbies) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.hobbies = hobbies;
    }

    public void greet() {
        System.out.println("Hello! My name is " + name + "\n My favorite food is " + favoriteFood);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void listHobbies() {
//        System.out.println(hobbies[0] + ", " + hobbies[1] + ", " + hobbies[2]);
//        for (int i = 0; i < hobbies.length; i++) {
//            System.out.print(hobbies[i]);
//            if (i < hobbies.length - 1) {
//                System.out.print(", ");
//            }
//        }
        System.out.println(Arrays.toString(hobbies));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hobbies.length; i++) {
            sb.append(hobbies[i]);
            if (i < hobbies.length - 1) {
               sb.append(", ");
            }
        }

        return sb.toString();
    }
}
