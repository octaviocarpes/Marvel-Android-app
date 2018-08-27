package app.marvel.octaviocarpes.marveldata.responses.comic;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Comic;

public class ComicListResponse {

    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<Comic> items;

    public ComicListResponse(Integer available, Integer returned, String collectionURI, List<Comic> items) {
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

    public List<Comic> getItems() {
        return items;
    }

    public void setItems(List<Comic> items) {
        this.items = items;
    }
}
