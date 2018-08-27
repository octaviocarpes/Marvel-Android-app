package app.marvel.octaviocarpes.marveldata.responses.serie;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Serie;

public class SerieListResponse {

    private Integer available;
    private Integer returned;
    private String collectionURI;
    private List<Serie> items;

    public SerieListResponse(Integer available, Integer returned, String collectionURI, List<Serie> items) {
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

    public List<Serie> getItems() {
        return items;
    }

    public void setItems(List<Serie> items) {
        this.items = items;
    }
}
