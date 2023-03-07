package com.example.webserviceproject;

public interface PersonneService {

    public Response addPerson(Person p);

    public Response deletePerson(int id);

    public Person getPerson(int id);

    public Person[] getAllPersons();
}
