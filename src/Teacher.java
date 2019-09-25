public class Teacher {
    private String name;
    private String favoriteFood;
    private String[] hobbies;

    public Teacher(String name) {
        this.name = name;
        favoriteFood = "";
        hobbies = new String[3];
    }

    public Teacher(String name, String favoriteFood, String[] hobbies) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.hobbies = hobbies;
    }

    public void greet() {
        System.out.println("Hello! My name is " + name + "\n My favorite food is " + favoriteFood);
    }
}
