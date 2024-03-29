package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

public class Search {

    @NotNull
    @JsonProperty
    private String city;


    public Search() {
    }

    public Search(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }


}
