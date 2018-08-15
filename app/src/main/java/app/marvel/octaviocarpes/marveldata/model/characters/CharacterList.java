package app.marvel.octaviocarpes.marveldata.model.characters;

import java.util.List;

public class CharacterList {

    private Integer available;
    private Integer returned;
    private String collectionUrl;
    private List<CharacterSummary> items;

    public CharacterList(Integer available, Integer returned, String collectionUrl, List<CharacterSummary> items) {
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

    public List<CharacterSummary> getItems() {
        return items;
    }

    public void setItems(List<CharacterSummary> items) {
        this.items = items;
    }
}
