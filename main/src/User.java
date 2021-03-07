import java.sql.*;

public class User extends Person {
    private static final String SELECT_ALL_BUS_SQL = "SELECT * FROM buses";
    public static final String PASSWORD_CHECK_SQL ="SELECT password FROM users WHERE login = ?";
    public static final String LOGIN_CHECK_SQL = "SELECT login FROM users";
    private String url = "jdbc:postgresql://localhost:5432/Bus Ticket Reservation System";
    private String user = "postgres";
    private String password = "dukabest";
    private String login;
    private String email;
    private String pass;
    private static final String DELETE_USERS_SQL = "DELETE from client where bin = ?;";

    public void deleteRecord(int binId) throws SQLException {
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/Bus Ticket Reservation System", "postgres", "passwordforedb_0210");
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL)) {
            preparedStatement.setInt(1, binId);
            //Execute the query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void findBusesFULL() throws SQLException {
        //Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             //Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BUS_SQL)) {
            //Execute the query
            ResultSet rs = preparedStatement.executeQuery();
            int i = 1;
            while (rs.next()){
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(i+"| busId: " + rs.getInt(1) +
                        " | FROM: " + rs.getString(2) + " | TO: " + rs.getString(3) + " | DEPART DATE: " +
                        rs.getDate(4) + " | TIME: " + rs.getTime(5) + " | ARRIVE DATE: " +
                        rs.getDate(6) + " | TIME: " + rs.getTime(7) + " | AVAILABLE SPACE: " + rs.getInt(9) + " |");
                i++;
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean checkLoginExistences(String login){
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
             Statement stmt = connection.createStatement();
        ){
            ResultSet rs = stmt.executeQuery(LOGIN_CHECK_SQL);
            while (rs.next()){
                return !login.equals(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
    public void login(String login, String password) {
        try (Connection connection = DriverManager
                .getConnection(url, user, password);
        PreparedStatement ps = connection.prepareStatement(PASSWORD_CHECK_SQL);
        ){
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(password.equals(rs.getString(1))){
                    System.out.println("You have successfully logged as " + login + "!");
                }else{
                    System.out.println("Incorrect password or login");
                }
            }
             //Create a statement using connection object
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registrationNewUser(String login, String pass, String email, String fName,
                                    String sName, String bin, String gender) throws SQLException {
        SqlInsert is = new SqlInsert();
        this.login = login;
        this.email = email;
        this.pass = pass;
        super.setfName(fName);
        super.setsName(sName);
        super.setBin(bin);
        super.setGender(gender);
        //adding to database
        is.addUser(login, email, pass);
        is.addPerson(fName, sName, bin, gender);
    }
}


