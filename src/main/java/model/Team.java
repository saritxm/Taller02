/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Riveros
 */
public class Team {
    
    private ArrayList<Player> players;
    private String deparment;
    private int TeamNumber;
    
    public Team(Player p1, Player p2, Player p3, Player p4){
        this.players =  new ArrayList<>();
        this.deparment = "";
        this.TeamNumber = 0;
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public int getTeamNumber() {
        return TeamNumber;
    }

    public void setTeamNumber(int TeamNumber) {
        this.TeamNumber = TeamNumber;
    }
    
}
