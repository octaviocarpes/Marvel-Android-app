package app.marvel.octaviocarpes.marveldata.model.creators;

public class CreatorSummary {

    private String resourceUrl;
    private String name;
    private String role;

    public CreatorSummary(String resourceUrl, String name, String role) {
        this.resourceUrl = resourceUrl;
        this.name = name;
        this.role = role;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
