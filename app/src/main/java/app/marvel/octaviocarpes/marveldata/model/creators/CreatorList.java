package app.marvel.octaviocarpes.marveldata.model.creators;

import java.util.List;

public class CreatorList {

    private Integer available;
    private Integer returned;
    private String collectionUrl;
    private List<CreatorSummary> items;

    public CreatorList(Integer available, Integer returned, String collectionUrl, List<CreatorSummary> items) {
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

    public List<CreatorSummary> getItems() {
        return items;
    }

    public void setItems(List<CreatorSummary> items) {
        this.items = items;
    }
}
