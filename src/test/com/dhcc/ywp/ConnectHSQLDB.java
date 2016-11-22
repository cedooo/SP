package com.dhcc.ywp;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by cedo on 2016/11/22.
 *　测试连接HSQLDB
 */
public class ConnectHSQLDB {
    @Test
    public void connectHSQLDB(){
        try(
                Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:testdb", "SA", "")
        ) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
