package com.mycapstone.servletdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class ClientsDbUtil {
    private DataSource dataSource;

    public ClientsDbUtil(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public Clients getClient(int clientId) throws Exception {
        Clients theClient = null;
        Connection myConn = null;
        PreparedStatement myStmt = null;
        ResultSet myRs = null;

        try {
            myConn = dataSource.getConnection();

            String sql = "SELECT * FROM clients WHERE id=?";

            myStmt = myConn.prepareStatement(sql);
            myStmt.setInt(1, clientId);

            myRs = myStmt.executeQuery();

            if (myRs.next()) {
                String firstName = myRs.getString("first_name");
                String lastName = myRs.getString("last_name");
                String email = myRs.getString("email");

                theClient = new Clients(clientId, firstName, lastName, email);
            } else {
                throw new Exception("Could not find client with ID: " + clientId);
            }

            return theClient;
        } finally {
            close(myConn, myStmt, myRs);
        }
    }
    public void updateClient(Clients updatedClient) throws Exception {
        Connection myConn = null;
        PreparedStatement myStmt = null;

        try {
            myConn = dataSource.getConnection();

            String sql = "UPDATE clients SET first_name=?, last_name=?, email=? WHERE id=?";

            myStmt = myConn.prepareStatement(sql);
            myStmt.setString(1, updatedClient.getFirstName());
            myStmt.setString(2, updatedClient.getLastName());
            myStmt.setString(3, updatedClient.getEmail());
            myStmt.setInt(4, updatedClient.getId());

            myStmt.executeUpdate();
        } finally {
            close(myConn, myStmt, null);
        }
    }
    public void addClient(Clients newClient) throws Exception {
        Connection myConn = null;
        PreparedStatement myStmt = null;

        try {
            myConn = dataSource.getConnection();

            String sql = "INSERT INTO clients (first_name, last_name, email) VALUES (?, ?, ?)";

            myStmt = myConn.prepareStatement(sql);
            myStmt.setString(1, newClient.getFirstName());
            myStmt.setString(2, newClient.getLastName());
            myStmt.setString(3, newClient.getEmail());

            myStmt.executeUpdate();
        } finally {
            close(myConn, myStmt, null);
        }
    }
    public List<Clients> getClients() throws Exception {
        List<Clients> clients = new ArrayList<>();
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myConn = dataSource.getConnection();

            String sql = "SELECT * FROM clients ORDER BY last_name";

            myStmt = myConn.createStatement();

            myRs = myStmt.executeQuery(sql);

            while (myRs.next()) {
                int id = myRs.getInt("id");
                String firstName = myRs.getString("first_name");
                String lastName = myRs.getString("last_name");
                String email = myRs.getString("email");

                Clients tempClient = new Clients(id, firstName, lastName, email);

                clients.add(tempClient);
            }

            return clients;
        } finally {
            close(myConn, myStmt, myRs);
        }
    }

    // ... Other methods (addClient, getClient, updateClient) remain the same ...

    private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
        try {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();  // Doesn't really close it, just puts it back in the connection pool
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public void deleteClient(int clientId) throws Exception {
        Connection myConn = null;
        PreparedStatement myStmt = null;

        try {
            myConn = dataSource.getConnection();

            String sql = "DELETE FROM clients WHERE id=?";

            myStmt = myConn.prepareStatement(sql);
            myStmt.setInt(1, clientId);

            myStmt.executeUpdate();
        } finally {
            close(myConn, myStmt, null);
        }
    }
}


