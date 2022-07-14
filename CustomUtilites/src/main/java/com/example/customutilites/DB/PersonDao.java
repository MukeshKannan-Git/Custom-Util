package com.example.customutilites.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface PersonDao {

    @Query("Select * FROM CINTAS")
    List<Model> getPersonList();

    @Insert
    void insertPerson(Model person);

    @Query("DELETE FROM CINTAS WHERE SNO = :userID")
    void deletePerson(int userID);

    @Query("UPDATE CINTAS SET EventTime= :NewData WHERE UserId= :userID")
    void updatePerson(String userID, String NewData);
}
