package app.marvel.octaviocarpes.marveldata.responses.event;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Event;

public class EventListResponse {

    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<Event> items;

    public EventListResponse(Integer available, Integer returned, String collectionURI, List<Event> items) {
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

    public List<Event> getItems() {
        return items;
    }

    public void setItems(List<Event> items) {
        this.items = items;
    }
}
