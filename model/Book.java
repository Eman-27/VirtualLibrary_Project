/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author BADOOR
 */
public class Book {

    private String id;
    private String title;
    private String author;
    private String mediaType; // "Video" أو "Audio"

    public Book(String id, String title, String author, String mediaType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.mediaType = mediaType;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getMediaType() {
        return mediaType;
    }
}
