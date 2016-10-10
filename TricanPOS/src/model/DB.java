package model;

import com.ConstantData;
import model.*;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class DB {

    private static Connection con;

    public static Connection getconn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(ConstantData.dbConnectionURL, ConstantData.dbUsername, ConstantData.dbPassword);

//          con.setAutoCommit(false); // if call rollback function call
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return con;
        }
        return con;
    }

    ///////////////////////////////////////////////
    public static void putData(String s) throws SQLException {
        if (con == null) {
            getconn();
        }

        con.createStatement().executeUpdate(s);

    }

    //////////////////////////////////
    public static ResultSet getData(String s) throws SQLException {

        if (con == null) {
            getconn();
        }
        return con.createStatement().executeQuery(s);
    }
    //////////////////////////////////////

    public static java.sql.PreparedStatement getPreparedSatement(String s) throws Exception {

        if (con == null) {
            getconn();
        }

        return getconn().prepareStatement(s);
    }

    //////////////////////////////////////
    public static void executePreparedChange(java.sql.PreparedStatement statement) throws Exception {

        if (con == null) {
            getconn();
        }

        statement.executeUpdate();
    }

    //////////////////////////////////////
    public static ResultSet executePreparedFetch(java.sql.PreparedStatement statement) throws Exception {

        if (con == null) {
            getconn();
        }

        return statement.executeQuery();
    }
}
