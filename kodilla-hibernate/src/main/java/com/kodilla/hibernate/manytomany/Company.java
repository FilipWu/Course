package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.task.Task;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompanyWithFirstThreeLetters",
        query = "SELECT * FROM COMPANIES" +
                " WHERE COMPANY_NAME LIKE 'Gre%'",
        resultClass = Company.class
)

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID")
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

/*
Zadanie dodatkowe Kolega minimum oraz koleżanka maksimum
Zadania dodatkowe

To zadanie ma charakter dodatkowy, dlatego nie musisz wysyłać go swojemu Mentorowi.

Dana jest kolekcja liczb (tablica):

3,1,1,5,6,7,9,15,3,4,7,10.

Bez wykorzystania gotowych bibliotek bądź wbudowanych funkcji napisz program, który wyszuka spośród nich wartość:

    drugie minimum (w podanym przykładzie jest to 3)
    drugie maksimum (w podanym przykładzie jest to 10)

Nie należy ograniczać się do podanego jako przykład zbioru. Program powinien wyszukiwać minimum oraz maksimum z zakresu liczb całkowitych.
Kluczowe algorytmy zamknij w osobnych funkcjach/metodach tak, żeby można było wywoływać go wielokrotnie dla różnych zbiorów
 */