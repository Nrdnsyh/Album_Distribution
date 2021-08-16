package finki.ukim.mk.emtproject.albumcatalog.domain.valueobjects;

import finki.ukim.mk.emtproject.sharedkernel.domain.base.ValueObject;
import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class AlbumInfo implements ValueObject {

    private String artistName;

    private String producerName;

    private String composerName;

    public static AlbumInfo build(String artistName, String producerName, String composerName) {
        return new AlbumInfo(artistName, producerName, composerName);
    }

    protected AlbumInfo(String artistName, String producerName, String composerName) {
        this.artistName = artistName;
        this.producerName = producerName;
        this.composerName = composerName;
    }

    protected AlbumInfo() {
    }

    public void changeArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void changeProducerName(String producerName) {
        this.producerName = producerName;
    }

    public void changeComposerName(String composerName) {
        this.composerName = composerName;
    }
}