/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brossard.proyectointegrador.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author cerso
 */
public class DBConnection {

    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://localhost:3306/cerso";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        try {
            //cargar el driver
            Class.forName(DRIVER);
            //crear la conexion
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return connection;
    }
    
    public static void main(String[] args) {
        connection = DBConnection.getConnection();

    }
}
