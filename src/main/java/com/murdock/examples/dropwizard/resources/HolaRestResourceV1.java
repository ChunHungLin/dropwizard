package com.murdock.examples.dropwizard.resources;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.murdock.examples.dropwizard.SQL_conn;

@Path("/api")
public class HolaRestResourceV1 {

	Connection connection = null;

    @Path("/get")
    @GET
    public String getTable() throws UnknownHostException {
        String hostname = null;
        try {
            hostname = InetAddress.getLocalHost()
                    .getHostAddress();
        } catch (UnknownHostException e) {
            hostname = "unknown";
        }
        return "Hola Dropwizard @ " + hostname;
    }
    
    @Path("/post")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void createTable(HolaFactory hola_bean) throws SQLException {
    		
    		System.out.println("====");
    		System.out.println(hola_bean.getTitle());
    		System.out.println(hola_bean.toString());
    		System.out.println("====");
    		PreparedStatement query = null;
    		SQL_conn c = new SQL_conn();
    		connection = c.connect();

		query = connection.prepareStatement("insert into CRUD (Title, Description) VALUES ('"+ hola_bean.getTitle() +"','"+ hola_bean.getDescription() +"')");
		query.executeUpdate();
    		connection.close();
    }
}