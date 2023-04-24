package Backend.ResponseObject.ResponseLogin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookObject {

    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("title")
    private String title;
    @JsonProperty("subTitle")
    private String subTitle;
    @JsonProperty("author")
    private String author;
    @JsonProperty("publish_date")
    private String publish_date;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("pages")
    private String pages;
    @JsonProperty("description")
    private String description;
    @JsonProperty("website")
    private String website;

}
