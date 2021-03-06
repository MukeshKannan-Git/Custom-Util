package com.example.customutilites.DB;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CINTAS")
public class Model{

    @PrimaryKey(autoGenerate = true)
    int SNO;
    private String EventTime;
    private String HostId;
    private String UserId;
    private String LocationNbr;
    private String RouteNbr;
    private String Day;
    private String Logger;
    private String EventNbr;
    private String AddtDesc;
    private String AddtNbr;

    public Model(String EventTime, String HostId, String UserId, String LocationNbr, String RouteNbr, String Day, String Logger, String EventNbr, String AddtDesc, String AddtNbr) {
        this.EventTime = EventTime;
        this.HostId = HostId;
        this.UserId = UserId;
        this.LocationNbr = LocationNbr;
        this.RouteNbr = RouteNbr;
        this.Day = Day;
        this.Logger = Logger;
        this.EventNbr = EventNbr;
        this.AddtDesc = AddtDesc;
        this.AddtNbr = AddtNbr;
    }

    public String getEventTime() {
        return EventTime;
    }

    public String getHostId() {
        return HostId;
    }

    public String getUserId() {
        return UserId;
    }

    public String getLocationNbr() {
        return LocationNbr;
    }

    public String getRouteNbr() {
        return RouteNbr;
    }

    public String getDay() {
        return Day;
    }

    public String getLogger() {
        return Logger;
    }

    public String getEventNbr() {
        return EventNbr;
    }

    public String getAddtDesc() {
        return AddtDesc;
    }

    public String getAddtNbr() {
        return AddtNbr;
    }
}
