/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacolec_extra_3.entities;

import java.util.Objects;

/**
 *
 * @author HP-G42
 */
public class Book {

    private String title;
    private String author;
    private Integer copies;
    private Integer loanedCopies;

    public Book() {
    }

    public Book(String title, String author, Integer copies, Integer loanedCopies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
        this.loanedCopies = loanedCopies;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public void setLoanedCopies(Integer loanedCopies) {
        this.loanedCopies = loanedCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getCopies() {
        return copies;
    }

    public Integer getLoanedCopies() {
        return loanedCopies;
    }

    public boolean loaned() {
        boolean flag = false;
        if (copies != 0) {
            loanedCopies+= 1;
            copies-=1;
            flag = true;
        }
        return flag;
    }

    public boolean returns() {
        boolean flag = false;
                if (loanedCopies != 0) {
                    copies += 1;
                    loanedCopies-=1;
                    flag = true;
                }
        return flag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.title);
        hash = 17 * hash + Objects.hashCode(this.author);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.author, other.author);
    }

    @Override
    public String toString() {
        return "title: " + title + " , author: " + author + " , copies: " + copies + ", loanedCopies: " + loanedCopies;
    }

}
