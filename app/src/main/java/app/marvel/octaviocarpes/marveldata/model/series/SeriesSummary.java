package app.marvel.octaviocarpes.marveldata.model.series;

public class SeriesSummary {

    private String name;
    private String resourceUrl;

    public SeriesSummary(String name, String resourceUrl) {
        this.name = name;
        this.resourceUrl = resourceUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
}
