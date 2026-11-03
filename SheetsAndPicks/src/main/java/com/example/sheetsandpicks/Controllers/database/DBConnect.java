package com.example.sheetsandpicks.Controllers.database;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * A classe DBConnect é responsável por estabelecer e gerenciar a conexão com o banco de dados SQL Server.
 * Utiliza o padrão Singleton para garantir uma única instância da conexão.
 */
public class DBConnect {
    private static DBConnect instance;
    private static Connection connection;

    /**
     * Construtor privado da classe DBConnect responsável por estabelecer a conexão com o banco de dados SQL Server.
     * Utiliza as informações de URL de conexão, driver, nome de utilizador e palavra-passe fornecida para conectar a base de dados.
     * Imprime uma mensagem indicando se a conexão foi bem-sucedida ou falhou, juntamente com qualquer exceção lançada.
     */
    private DBConnect() {
        try {
            String connectionUrl = System.getenv("SHEETS_DB_URL");
            if (connectionUrl == null || connectionUrl.isBlank()) {
                throw new IllegalStateException("Defina a variável de ambiente SHEETS_DB_URL (jdbc:sqlserver://host;databaseName=...;user=...;password=...)");
            }

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection to the SQL Server database failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Obtém a instância única da classe DBConnect usando o padrão Singleton.
     * Se a instância ainda não foi criada, este método cria uma nova instância da classe DBConnect
     * e a retorna. Caso contrário, retorna a instância existente.
     *
     * @return A instância única da classe DBConnect.
     */
    public static synchronized DBConnect getInstance() {
        if (instance == null) {
            instance = new DBConnect();
        }
        return instance;
    }

    /**
     * Obtém a conexão ativa com o banco de dados.
     *
     * @return A conexão ativa com o banco de dados.
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Fecha a conexão ativa com o banco de dados.
     */
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                instance = null;
            }
        } catch (SQLException e) {
            System.out.println("Error closing the database connection: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
