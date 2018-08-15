package app.marvel.octaviocarpes.marveldata.model.characters;

public class CharacterSummary {

    private String name;
    private String role;
    private String resourceUrl;

    public CharacterSummary(String name, String role, String resourceUrl) {
        this.name = name;
        this.role = role;
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

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
}
