package app.marvel.octaviocarpes.marveldata.responses.story;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Story;

public class StoryListResponse {

    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<Story> items;

    public StoryListResponse(Integer available, Integer returned, String collectionURI, List<Story> items) {
        this.available = available;
        this.returned = returned;
        this.collectionURI = collectionURI;
        this.items = items;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getReturned() {
        return returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public List<Story> getItems() {
        return items;
    }

    public void setItems(List<Story> items) {
        this.items = items;
    }
}
