package info.movito.themoviedbapi.model.tv;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbTvEpisodes;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;


public class TvSeason extends AbstractTvElement {


    @JsonProperty("air_date")
    private String airDate;


    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("season_number")
    private int seasonNumber;


    @JsonProperty("overview")
    private String overview;

    @JsonProperty("episode_count")
    private int episodeCount;


    public String getAirDate() {
        return airDate;
    }


    public String getPosterPath() {
        return posterPath;
    }


    public int getSeasonNumber() {
        return seasonNumber;
    }


    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }


    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }


    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }


    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public String getOverview() {
        return overview;
    }

    public List<TvEpisode> retrieveEpisodes(TmdbApi tmdb, TvSeries serie) {
        List<TvEpisode> list = new ArrayList<>();

        for (int i = 1; i <= getEpisodeCount(); i++) {
            list.add(tmdb.getTvEpisodes().getEpisode(serie.getId(), getSeasonNumber(), i, "pl"));
        }

        return list;
    }

}
