package com.pojo;

public class DataItem {

    public long id;
    public String name;
    public int mobileNumber;
    public String varsityName;
    public int varsityYear;
    public String collageName;
    public int collageYear;
    public String personalInfo;
    public String collegeInfo;
    public String varsityInfo;

    public DataItem(){

    }

    public DataItem(String name , int mobileNumber , String varsityName , int varsityYear ,
                    String collageName , int collageYear){
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.varsityName = varsityName;
        this.varsityYear = varsityYear;
        this.collageName = collageName;
        this.collageYear = collageYear;
    }

    public long getId() {
        return id;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public int getVarsityYear() {
        return varsityYear;
    }

    public String getCollageName() {
        return collageName;
    }


    public int getCollageYear() {
        return collageYear;
    }

    public void setCollageYear(int collageYear) {
        this.collageYear = collageYear;
    }


    public String getCollegeInfo() {
        return collegeInfo;
    }

    public String getName() {
        return name;
    }

    public String getPersonalInfo() {
        return personalInfo;
    }

    public String getVarsityInfo() {
        return varsityInfo;
    }

    public String getVarsityName() {
        return varsityName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }



    public void setCollegeInfo(String collegeInfo) {
        this.collegeInfo = collegeInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String personalInfo) {
        this.personalInfo = personalInfo;
    }

    public void setVarsityInfo(String varsityInfo) {
        this.varsityInfo = varsityInfo;
    }

    public void setVarsityName(String varsityName) {
        this.varsityName = varsityName;
    }

    public void setVarsityYear(int varsityYear) {
        this.varsityYear = varsityYear;
    }

}
