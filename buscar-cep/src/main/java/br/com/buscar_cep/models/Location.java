package br.com.buscar_cep.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    @JsonProperty("type")
    private String type;

    @JsonProperty("coordinates")
    private Coordinates coordinates;
}
