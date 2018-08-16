package app.marvel.octaviocarpes.marveldata.model;


import app.marvel.octaviocarpes.marveldata.model.Image;

public class Comic {

    private Integer id;
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
