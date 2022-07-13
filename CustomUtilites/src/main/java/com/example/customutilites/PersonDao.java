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

    @Query("DELETE FROM person WHERE id = :userID")
    void deletePerson(int userID);

    @Query("UPDATE person SET EventTime= :NewData WHERE UserId= :userID")
    void updatePerson(String userID, String NewData);
}
