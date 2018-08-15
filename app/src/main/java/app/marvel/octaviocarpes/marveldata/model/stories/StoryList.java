package app.marvel.octaviocarpes.marveldata.model.stories;

import java.util.List;

public class StoryList {

    private Integer available;
    private Integer returned;
    private String collectionUrl;
    private List<StorySummary> items;

    public StoryList(Integer available, Integer returned, String collectionUrl, List<StorySummary> items) {
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

    public List<StorySummary> getItems() {
        return items;
    }

    public void setItems(List<StorySummary> items) {
        this.items = items;
    }
}
