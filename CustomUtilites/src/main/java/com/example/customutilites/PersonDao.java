package com.example.customutilites;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PersonDao {

    @Query("Select * FROM person")
    List<Model> getPersonList();

    @Insert
    void insertPerson(Model person);

    @Query("DELETE FROM person WHERE name = :personname")
    void deletePerson(String personname);

    @Query("UPDATE person SET name= :person WHERE id= :id")
    void updatePerson(int id, String person);
}
