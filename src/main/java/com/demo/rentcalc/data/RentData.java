package com.demo.rentcalc.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@Getter
@Setter
public class RentData {
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTotalExpenditure() {
        return totalExpenditure;
    }

    public void setTotalExpenditure(int totalExpenditure) {
        this.totalExpenditure = totalExpenditure;
    }

    public double getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }

    public List<Roomies> getRoomiesList() {
        return roomiesList;
    }

    public void setRoomiesList(List<Roomies> roomiesList) {
        this.roomiesList = roomiesList;
    }

    @Id
    private String id;
    private String month;
    private String year;
    private int totalExpenditure;
    private double roomRent;
    private List<Roomies> roomiesList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
