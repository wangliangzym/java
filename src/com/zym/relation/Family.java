package com.zym.relation;

import java.util.List;

public class Family {

    private Integer number;

    private String hobby;

    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Family{" +
                "number=" + number +
                ", hobby='" + hobby + '\'' +
                ", members=" + members +
                '}';
    }
}
