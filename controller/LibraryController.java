package controller;

import model.Book;
import model.Media;
import model.MediaFactory;
import view.LibraryView;

public class LibraryController {

    private final Book bookModel;
    private final LibraryView libraryView;

    public LibraryController(Book bookModel, LibraryView libraryView) {
        this.bookModel = bookModel;
        this.libraryView = libraryView;
    }

    public void openBook() {
        // عرض البيانات
        libraryView.displayBookDetails(bookModel.getTitle(), bookModel.getAuthor(), bookModel.getId());
        libraryView.showNotification("Success: Preparing multimedia content...");

        // استخدام نمط المصنع لتشغيل الوسائط [356، 404]
        Media media = MediaFactory.createMedia(bookModel.getMediaType());
        if (media != null) {
            media.play();
        } else {
            libraryView.showNotification("Error: No compatible media found.");
        }
    }
}
