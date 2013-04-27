package com.cs.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="books")
public class Books {
    private String bookTitle;
    private int bookId;
    private String author;
    private Date startDate;
    private Date endDate;
    private Integer rating;
    private Boolean completed;

    @javax.persistence.Column(name = "book_id")
    @Id
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @javax.persistence.Column(name = "book_title")
    @Basic
    String getBookTitle() {
        return bookTitle;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @javax.persistence.Column(name = "author")
    @Basic
    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    @javax.persistence.Column(name = "start_date")
    @Basic
    Date getStartDate() {
        return startDate;
    }

    void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @javax.persistence.Column(name = "end_date")
    @Basic
    Date getEndDate() {
        return endDate;
    }

    void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @javax.persistence.Column(name = "rating")
    @Basic
    Integer getRating() {
        return rating;
    }

    void setRating(Integer rating) {
        this.rating = rating;
    }

    @javax.persistence.Column(name = "completed")
    @Basic
    Boolean getCompleted() {
        return completed;
    }

    void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (bookId != books.bookId) return false;
        if (author != null ? !author.equals(books.author) : books.author != null) return false;
        if (bookTitle != null ? !bookTitle.equals(books.bookTitle) : books.bookTitle != null) return false;
        if (completed != null ? !completed.equals(books.completed) : books.completed != null) return false;
        if (endDate != null ? !endDate.equals(books.endDate) : books.endDate != null) return false;
        if (rating != null ? !rating.equals(books.rating) : books.rating != null) return false;
        if (startDate != null ? !startDate.equals(books.startDate) : books.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + (bookTitle != null ? bookTitle.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (completed != null ? completed.hashCode() : 0);
        return result;
    }
}
