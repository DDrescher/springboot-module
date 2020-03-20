package academy.everyonecodes.secretagenthandshakes.DataClasses;

public class Handshake {
    private Integer number;
    private String move;

    Handshake() {
    }

    public Handshake(Integer number, String move) {
        this.number = number;
        this.move = move;
    }

    public Integer getNumber() {
        return number;
    }

    void setnumber(Integer number) {
        this.number = number;
    }

    public String getMove() {
        return move;
    }

    void setmove(String move) {
        this.move = move;
    }
}
