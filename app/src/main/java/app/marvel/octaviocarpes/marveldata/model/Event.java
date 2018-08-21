package app.marvel.octaviocarpes.marveldata.model;

public class Event {

    private Integer id;
    private String name;
    private String resourceURI;
    private Image thumbnail;

    public Event(String resourceURI, String name, Image thumbnail) {
        this.name = name;
        this.resourceURI = resourceURI;
        this.thumbnail = thumbnail;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Event{" +
                "resourceURI='" + resourceURI + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
