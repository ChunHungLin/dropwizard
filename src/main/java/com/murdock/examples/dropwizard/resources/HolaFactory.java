package com.murdock.examples.dropwizard.resources;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HolaFactory {
    @NotEmpty
    private String title;
    private String description;
    
    public HolaFactory() {
	
}

    


	@JsonProperty
    public String getTitle() {
        return title;
    }

    @JsonProperty
    public void setTitle(String title) {
        this.title = title;
    }
    
    @JsonProperty
    public String getDescription() {
        return description;
    }

    @JsonProperty
    public void setDescription(String description) {
        this.description = description;
    }
	@Override
	public String toString(){
		return title+" "+description;
	}
}
