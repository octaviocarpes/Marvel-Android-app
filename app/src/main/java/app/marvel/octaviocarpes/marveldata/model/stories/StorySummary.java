package app.marvel.octaviocarpes.marveldata.model.stories;

public class StorySummary {

    private String name;
    private String type;
    private String resourceUrl;

    public StorySummary(String name, String type, String resourceUrl) {
        this.name = name;
        this.type = type;
        this.resourceUrl = resourceUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
}
