package app.marvel.octaviocarpes.marveldata.model;

public class Comic {

    private String name;
    private String resourceURI;

    public Comic(String name, String resourceURI) {
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

    @Override
    public String toString() {
        return "Comic{" +
                "name='" + name + '\'' +
                ", resourceURI='" + resourceURI + '\'' +
                '}';
    }
}
