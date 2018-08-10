package app.marvel.octaviocarpes.marveldata.model;

public class Serie {

    private String name;
    private String resourceURI;

    public Serie(String name, String resourceURI) {
        this.name = name;
        this.resourceURI = resourceURI;
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
}
