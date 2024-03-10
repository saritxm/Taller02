package model;

public class Result {
    private Team equipoWin;
    private Team equipoLose;

    public Team getEquipoWin() {
        return this.equipoWin;
    }

    public void setEquipoWin(Team equipoWin) {
        this.equipoWin = equipoWin;
    }

    public Team getEquipoLose() {
        return this.equipoLose;
    }

    public void setEquipoLose(Team equipoLose) {
        this.equipoLose = equipoLose;
    }

    public Result(Team winner, Team loser){
        this.equipoLose = loser;
        this.equipoWin  = winner;
    }
    
}
