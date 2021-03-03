import java.sql.SQLException;

public class User extends Person {
    private String login;
    private String email;
    private String pass;

    public void login(String login, String pass) {
        System.out.println("You have successfully logged as " + login);
    }

    public void registrationNewUser(String login, String pass, String email, String fName, String sName, String bin, String gender) throws SQLException {
        SqlInsert is = new SqlInsert();
        this.login = login;
        this.email = email;
        this.pass = pass;
        super.setfName(fName);
        super.setsName(sName);
        super.setBin(bin);
        super.setGender(gender);
        //adding to DB
        is.addUser(login, email, pass);
        is.addPerson(fName, sName, bin, gender);
    }
}


