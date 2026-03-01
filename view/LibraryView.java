package view;

public class LibraryView {

    public void displayBookDetails(String title, String author, String id) {
        System.out.println("================================");
        System.out.println("   VIRTUAL LIBRARY SYSTEM");
        System.out.println("================================");
        System.out.println("ID    : " + id);
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
    }

    public void showNotification(String message) {
        System.out.println("[Notification]: " + message);
    }
}
