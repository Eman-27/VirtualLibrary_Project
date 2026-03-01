package model;

// أصناف التنفيذ الفعلي (Concrete Classes)
class VideoMedia implements Media {

    @Override
    public void play() {
        System.out.println("Displaying: 360-Degree Virtual Video Tour...");
    }
}

class AudioMedia implements Media {

    @Override
    public void play() {
        System.out.println("Playing: Immersive Audio Book Narrative...");
    }
}

public class MediaFactory {

    public static Media createMedia(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Video")) {
            return new VideoMedia();
        }
        if (type.equalsIgnoreCase("Audio")) {
            return new AudioMedia();
        }
        return null;
    }
}
