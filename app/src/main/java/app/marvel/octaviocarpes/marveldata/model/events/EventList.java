package app.marvel.octaviocarpes.marveldata.model.events;

import java.util.List;

public class EventList {

    private Integer available;
    private Integer returned;
    private String collectionUrl;
    private List<EventSummary> items;

    public EventList(Integer available, Integer returned, String collectionUrl, List<EventSummary> items) {
        this.available = available;
        this.returned = returned;
        this.collectionUrl = collectionUrl;
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

    public String getCollectionUrl() {
        return collectionUrl;
    }

    public void setCollectionUrl(String collectionUrl) {
        this.collectionUrl = collectionUrl;
    }

    public List<EventSummary> getItems() {
        return items;
    }

    public void setItems(List<EventSummary> items) {
        this.items = items;
    }
}
