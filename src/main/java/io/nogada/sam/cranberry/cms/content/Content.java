package io.nogada.sam.cranberry.cms.content;

/**
 * Entity class for Content : movie information
 */
public class Content {
    public Content(){
        this.name = "name";
        this.thumbnail = "thumbnail";
        this.streammURL = "streammURL";
        this.synopsis = "synopsis";
        this.director = "director";
        this.date = "date";
        this.nationality = "nationality";
    }
    private String name;
    private String thumbnail;
    private String streammURL;
    private String synopsis;
    private String director;
    private String date;
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getStreammURL() {
        return streammURL;
    }

    public void setStreammURL(String streammURL) {
        this.streammURL = streammURL;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}