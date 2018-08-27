package app.marvel.octaviocarpes.marveldata.responses.character;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Comic;
import app.marvel.octaviocarpes.marveldata.model.Event;
import app.marvel.octaviocarpes.marveldata.model.Image;
import app.marvel.octaviocarpes.marveldata.model.Serie;
import app.marvel.octaviocarpes.marveldata.model.Story;
import app.marvel.octaviocarpes.marveldata.responses.comic.ComicListResponse;
import app.marvel.octaviocarpes.marveldata.responses.event.EventListResponse;
import app.marvel.octaviocarpes.marveldata.responses.serie.SerieListResponse;
import app.marvel.octaviocarpes.marveldata.responses.story.StoryListResponse;

public class CharacterResponse {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("modified")
    private Date modified;

    @SerializedName("resourceURI")
    private String resourceURI;

    @SerializedName("thumbnail")
    private Image image;

    @SerializedName("comics")
    private ComicListResponse comics;

    @SerializedName("stories")
    private StoryListResponse stories;

    @SerializedName("events")
    private EventListResponse events;

    @SerializedName("series")
    private SerieListResponse series;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Comic> getComics() {
        return comics.getItems();
    }

    public void setComics(List<Comic> comics) {
        this.comics.setItems(comics);
    }

    public List<Story> getStories() {
        return stories.getItems();
    }

    public void setStories(List<Story> stories) {
        this.stories.setItems(stories);
    }

    public List<Event> getEvents() {
        return events.getItems();
    }

    public void setEvents(List<Event> events) {
        this.events.setItems(events);
    }

    public List<Serie> getSeries() {
        return series.getItems();
    }

    public void setSeries(List<Serie> series) {
        this.series.setItems(series);
    }
}
