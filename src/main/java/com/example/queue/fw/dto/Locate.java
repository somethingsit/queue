package com.example.queue.fw.dto;

import java.io.Serializable;

public class Locate implements Serializable {
    private String language;
    private String country;

    public Locate() {
    }

    public Locate(String language, String country) {
        this.language = language;
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int hashCode() {
        int hash = 0;
        int hash1 = hash + (this.language != null && this.country != null ? this.language.hashCode() + this.country.hashCode() : 0);
        return hash1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj instanceof Locate) {
            Locate locate = (Locate)obj;
            return this.language.equals(locate.getLanguage()) && this.country.equals(locate.getCountry());
        } else {
            return false;
        }
    }
}
