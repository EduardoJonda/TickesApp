package tecsup.teoria04.eduardo.jonda.com.tickesapp;

/**
 * Created by Alumno on 25/09/2017.
 */

public class User {

    private String username;
    private String passward;
    private String nick;
    private String roll;

    public User(String name, String pass){
        this.username = name;
        this.passward = pass;
    }

    public User(String username, String passward, String nick, String roll) {
        this.username = username;
        this.passward = passward;
        this.nick = nick;
        this.roll = roll;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }


}
