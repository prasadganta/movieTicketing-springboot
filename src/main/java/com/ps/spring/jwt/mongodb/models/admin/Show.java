
package com.ps.spring.jwt.mongodb.models.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "show"
})
public class Show {

    @JsonProperty("show")
    private Show__1 show;

    @JsonProperty("show")
    public Show__1 getShow() {
        return show;
    }

    @JsonProperty("show")
    public void setShow(Show__1 show) {
        this.show = show;
    }

}
