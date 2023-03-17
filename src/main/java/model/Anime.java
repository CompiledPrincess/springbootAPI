package model;

import java.util.Objects;

public class Anime {
    private int id;
    private int year;
    private String url;
    private String title;
    private String description;

    public Anime(int id, int year, String url, String title, String description) {
    }

    public Anime(String toString, int i, int i1, String s, String legend_of_the_galactic_heroes, String s1) {
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public Anime() { }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return id == anime.id && year == anime.year && url.equals(anime.url) && title.equals(anime.title) && description.equals(anime.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, url, title, description);
    }

    @Override
    public String toString() {
        return "model.Anime{" +
                "id=" + id +
                ", year=" + year +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
