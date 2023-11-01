package com.mycapstone.servletdemo;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/ClientsControllerServlet")
public class ClientsControllerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ClientsDbUtil clientsDbUtil;

    @Resource(name = "jdbc/web_student_tracker")
    private DataSource dataSource;

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            clientsDbUtil = new ClientsDbUtil(dataSource);
        } catch (Exception exc) {
            throw new ServletException(exc);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String theCommand = request.getParameter("command");
            if (theCommand == null) {
                theCommand = "LIST";
            }

            switch (theCommand) {
                case "LIST":
                    listClients(request, response);
                    break;
                case "ADD":
                    addClient(request, response);
                    break;
                case "LOAD":
                    loadClient(request, response);
                    break;
                case "UPDATE":
                    updateClient(request, response);
                    break;
                case "DELETE":
                    deleteClient(request, response);
                    break;
                default:
                    listClients(request, response);
            }

        } catch (Exception exc) {
            throw new ServletException(exc);
        }
    } // Move the closing brace here

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String theCommand = request.getParameter("command");

            switch (theCommand) {
                case "ADD":
                    addClient(request, response);
                    break;
                case "UPDATE":
                    updateClient(request, response);
                    break;
                default:
                    listClients(request, response);
            }

        } catch (Exception exc) {
            throw new ServletException(exc);
        }
    }

    private void addClient(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // ... (code for addClient method) ...
    }

    private void loadClient(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // ... (code for loadClient method) ...
    }

    private void updateClient(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // read client info from form data
        int id = Integer.parseInt(request.getParameter("clientId"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        // create a new client object
        Clients updatedClient = new Clients(id, firstName, lastName, email);

        // update the client in the database
        clientsDbUtil.updateClient(updatedClient);

        // redirect to client list page
        listClients(request, response);
    }

    private void deleteClient(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // Get the client id from the request
        int clientId = Integer.parseInt(request.getParameter("clientId"));

        // Call the deleteClient method from clientsDbUtil
        clientsDbUtil.deleteClient(clientId);

        // Redirect back to the list of clients
        listClients(request, response);
    }

    private void listClients(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        List<Clients> clients = clientsDbUtil.getClients();
        request.setAttribute("CLIENTS_LIST", clients);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list-clients.jsp");
        dispatcher.forward(request, response);
    }
}