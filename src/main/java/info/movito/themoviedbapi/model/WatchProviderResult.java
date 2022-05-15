package info.movito.themoviedbapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.model.core.AbstractJsonMapping;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class WatchProviderResult extends AbstractJsonMapping {

    @JsonProperty("link")
    private String link;

    @JsonProperty("flatrate")
    private List<Data> flatrate = new ArrayList<>();

    @JsonProperty("rent")
    private List<Data> rent = new ArrayList<>();

    @JsonProperty("buy")
    private List<Data> buy = new ArrayList<>();
//
    public String getLink() {
        return link;
    }

    public List<Data> getFlatrate() {
        return flatrate;
    }

    public List<Data> getRent() {
        return rent;
    }

    public List<Data> getBuy() {
        return buy;
    }

    public static class Data extends AbstractJsonMapping {

        @JsonProperty("display_priority")
        private int displayPriority;

        @JsonProperty("logo_path")
        private String logoPath;

        @JsonProperty("provider_id")
        private int providerId;

        @JsonProperty("provider_name")
        private String providerName;

        public int getDisplayPriority() {
            return displayPriority;
        }

        public String getLogoPath() {
            return logoPath;
        }

        public int getProviderId() {
            return providerId;
        }

        public String getProviderName() {
            return providerName;
        }

        public void setDisplayPriority(int displayPriority) {
            this.displayPriority = displayPriority;
        }

        public void setLogoPath(String logoPath) {
            this.logoPath = logoPath;
        }

        public void setProviderId(int providerId) {
            this.providerId = providerId;
        }

        public void setProviderName(String providerName) {
            this.providerName = providerName;
        }

    }

}
