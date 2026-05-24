import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
        private String name;
        private String uemail;
        private String upass;
        private String city;
        private Connection dbConnection =null;
        private PreparedStatement stmt =null;
        private int status;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUemail() {
        return uemail;
    }
    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUpass() {
        return upass;
    }
    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int register(){
        try {
             dbConnection = JdbcUtil.getDBConnection();
            String Mysql_Query="Insert into userInfo(uname,uemail,upass,ucity) values(?,?,?,?)";
             stmt=dbConnection.prepareStatement(Mysql_Query);
            stmt.setString(1,name);
            stmt.setString(2,uemail);
            stmt.setString(3,upass);
            stmt.setString(4,city);
             status = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                JdbcUtil.CloseResource(dbConnection,stmt);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return status;
    }
}
