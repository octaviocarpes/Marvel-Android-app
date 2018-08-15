package app.marvel.octaviocarpes.marveldata.model.comics;

import java.util.Date;
import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Image;
import app.marvel.octaviocarpes.marveldata.model.characters.CharacterList;
import app.marvel.octaviocarpes.marveldata.model.creators.CreatorList;
import app.marvel.octaviocarpes.marveldata.model.events.EventList;
import app.marvel.octaviocarpes.marveldata.model.series.SeriesSummary;
import app.marvel.octaviocarpes.marveldata.model.TextObject;
import app.marvel.octaviocarpes.marveldata.model.Url;
import app.marvel.octaviocarpes.marveldata.model.stories.StoryList;

public class Comic {

    private Integer id;
    private Integer digitalId;
    private Double issueNumber;
    private String variantDescription;
    private String description;
    private Date modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private Integer pageCount;
    private List<TextObject> textObjects;
    private List<Url> urls;
    private SeriesSummary series;
    private List<ComicsSummary> variants;
    private List<ComicsSummary> collections;
    private List<ComicsSummary> collectedIssues;
    private List<ComicDate> dates;
    private List<Image> images;
    private CreatorList creators;
    private CharacterList characters;
    private StoryList stories;
    private EventList events;
    private String name;
    private String resourceURI;
    private Image thumbnail;

    public Comic(String name, String resourceURI, Image thumbnail) {
        this.name = name;
        this.resourceURI = resourceURI;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "name='" + name + '\'' +
                ", resourceURI='" + resourceURI + '\'' +
                '}';
    }
}
