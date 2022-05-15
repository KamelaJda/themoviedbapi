package info.movito.themoviedbapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.model.core.IdElement;

import java.util.HashMap;
import java.util.Map;

public class WatchProvider extends IdElement {

    @JsonProperty("results")
    private Map<String, WatchProviderResult> results = new HashMap<>();

    public Map<String, WatchProviderResult> getResults() {
        return results;
    }

    public void setResults(Map<String, WatchProviderResult> results) {
        this.results = results;
    }

}
