package banking;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        String urlOfDatabase = "jdbc:sqlite:".concat(args[1]); // args[0] = "-filename", args[1] = "***.db"
        Database.createDatabaseSQLite(urlOfDatabase);
        Interface start = Interface.MENU;
        start.action(); // start interface menu
    }

    private boolean logged;

    private int ID;

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
