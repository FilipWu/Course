package com.kodilla.testing.library;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.Objects;

@Value
@AllArgsConstructor
public class LibraryUser {

    private String firstname;
    private String lastname;
    private String peselId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, peselId);
    }
}
