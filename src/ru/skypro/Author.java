package ru.skypro;

public class Author {
    private String authorsName;
    private String surName;

    public Author(String authorsName, String surName) {
        this.authorsName = authorsName;
        this.surName = surName;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public String getSurName() {
        return surName;
    }
}

