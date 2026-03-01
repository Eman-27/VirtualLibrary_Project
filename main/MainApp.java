package main;

import model.Book;
import view.LibraryView;
import controller.LibraryController;

public class MainApp {

    public static void main(String[] args) {
        // إنشاء الموديل والفيو والمتحكم
        Book myBook = new Book("VR-2026", "Immersive 360 Journeys", "Future Lab", "Video");
        LibraryView myView = new LibraryView();
        LibraryController controller = new LibraryController(myBook, myView);

        // بدء تشغيل الوظيفة
        controller.openBook();
    }
}
