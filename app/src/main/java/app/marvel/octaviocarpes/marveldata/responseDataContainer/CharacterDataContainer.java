package app.marvel.octaviocarpes.marveldata.responseDataContainer;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Character;

public class CharacterDataContainer {

    private Integer offset;
    private Integer limit;
    private Integer total;
    private Integer count;
    private List<Character> results;

    public CharacterDataContainer(Integer offset, Integer limit, Integer total, Integer count, List<Character> results) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Character> getResults() {
        return results;
    }

    public void setResults(List<Character> results) {
        this.results = results;
    }
}
