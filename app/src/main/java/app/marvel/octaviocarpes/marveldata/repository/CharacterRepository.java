package app.marvel.octaviocarpes.marveldata.repository;

import java.util.ArrayList;
import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.model.Comic;
import app.marvel.octaviocarpes.marveldata.model.Event;
import app.marvel.octaviocarpes.marveldata.model.Image;
import app.marvel.octaviocarpes.marveldata.model.Serie;
import app.marvel.octaviocarpes.marveldata.model.Story;

public class CharacterRepository {

    private List<Character> charactersDB;
    private List<Comic> comics;
    private List<Event> events;
    private List<Serie> series;
    private List<Story> stories;

    public CharacterRepository() {
        this.charactersDB = new ArrayList<>();
        this.comics = new ArrayList<>();
        this.events = new ArrayList<>();
        this.series = new ArrayList<>();
        this.stories = new ArrayList<>();

        charactersDB.add(new Character("Wolverine", new Image("https://img.elo7.com.br/product/zoom/113FE59/painel-wolverine-1-5mx1-0m-mod-decoracao-de-festa.jpg", ".jpg")));
        charactersDB.add(new Character("Spider-Man", new Image("https://img.purch.com/o/aHR0cDovL3d3dy5uZXdzYXJhbWEuY29tL2ltYWdlcy9pLzAwMC8yMjEvOTU2L2kwMi9BU01GQ0JEXzEuanBn", ".jpg")));
        charactersDB.add(new Character("Iron Man", new Image("https://lumiere-a.akamaihd.net/v1/images/usa_avengers_chi_ironman_n_cf2a66b6.png?region=0%2C0%2C300%2C300", ".jpg")));

        comics.add(new Comic("Comic 1", "Comic URL", new Image("https://vignette.wikia.nocookie.net/marveldatabase/images/d/d8/Origins_of_Marvel_Comics_Vol_1_1.jpg/revision/latest?cb=20110202224931", ".jpg")));
        comics.add(new Comic("Comic 2", "Comic URL", new Image("https://vignette.wikia.nocookie.net/marveldatabase/images/d/d8/Origins_of_Marvel_Comics_Vol_1_1.jpg/revision/latest?cb=20110202224931", ".jpg")));
        comics.add(new Comic("Comic 3", "Comic URL", new Image("https://vignette.wikia.nocookie.net/marveldatabase/images/d/d8/Origins_of_Marvel_Comics_Vol_1_1.jpg/revision/latest?cb=20110202224931", ".jpg")));
        comics.add(new Comic("Comic 4", "Comic URL", new Image("https://vignette.wikia.nocookie.net/marveldatabase/images/d/d8/Origins_of_Marvel_Comics_Vol_1_1.jpg/revision/latest?cb=20110202224931", ".jpg")));
        comics.add(new Comic("Comic 5", "Comic URL", new Image("https://vignette.wikia.nocookie.net/marveldatabase/images/d/d8/Origins_of_Marvel_Comics_Vol_1_1.jpg/revision/latest?cb=20110202224931", ".jpg")));
        comics.add(new Comic("Comic 6", "Comic URL", new Image("https://vignette.wikia.nocookie.net/marveldatabase/images/d/d8/Origins_of_Marvel_Comics_Vol_1_1.jpg/revision/latest?cb=20110202224931", ".jpg")));
        comics.add(new Comic("Comic 7", "Comic URL", new Image("https://vignette.wikia.nocookie.net/marveldatabase/images/d/d8/Origins_of_Marvel_Comics_Vol_1_1.jpg/revision/latest?cb=20110202224931", ".jpg")));
        comics.add(new Comic("Comic 8", "Comic URL", new Image("https://vignette.wikia.nocookie.net/marveldatabase/images/d/d8/Origins_of_Marvel_Comics_Vol_1_1.jpg/revision/latest?cb=20110202224931", ".jpg")));


        events.add(new Event("Event URL", "Event 1"));
        events.add(new Event("Event URL", "Event 2"));
        events.add(new Event("Event URL", "Event 3"));

        series.add(new Serie("Serie 1", "Serie URL"));
        series.add(new Serie("Serie 2", "Serie URL"));
        series.add(new Serie("Serie 3", "Serie URL"));

        stories.add(new Story("Story URL", "Story 1", "Standard"));
        stories.add(new Story("Story URL", "Story 2", "Standard"));
        stories.add(new Story("Story URL", "Story 3", "Standard"));

        for (Character c: charactersDB
             ) {
            c.setComics(comics);
            c.setEvents(events);
            c.setSeries(series);
            c.setStories(stories);
        }
    }

    public List<Character> getcharactersDB() {
        return charactersDB;
    }

    public void setcharactersDB(List<Character> charactersDB) {
        this.charactersDB = charactersDB;
    }

    public List<Comic> getComics() {
        return comics;
    }

    public void setComics(List<Comic> comics) {
        this.comics = comics;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
