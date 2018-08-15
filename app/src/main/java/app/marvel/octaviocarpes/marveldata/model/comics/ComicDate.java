package app.marvel.octaviocarpes.marveldata.model.comics;

import java.util.Date;

public class ComicDate {

    private String type;
    private Date date;

    public ComicDate(String type, Date date) {
        this.type = type;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
