package activities;

public class Activity5 {
    public static void main(String[] args) {
        String title = "Its a SECRET";

        Book b = new MyBook();
        b.setTitle(title);

        System.out.println("title of the book is "+b.getTitle());
    }
}
