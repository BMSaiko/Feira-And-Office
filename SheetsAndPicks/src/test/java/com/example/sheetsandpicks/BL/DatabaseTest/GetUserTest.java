package com.example.sheetsandpicks.BL.DatabaseTest;

import com.example.sheetsandpicks.BL.Database.DBstatements;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GetUserTest {

    @Test
    void getUserCorrectTest() throws SQLException {
        // Criação de objetos mock
        Connection mockConnection = mock(Connection.class);
        PreparedStatement mockStmt1 = mock(PreparedStatement.class);
        ResultSet mockResultSet1 = mock(ResultSet.class);
        PreparedStatement mockStmt2 = mock(PreparedStatement.class);
        ResultSet mockResultSet2 = mock(ResultSet.class);

        // Configuração do comportamento dos mocks
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStmt1, mockStmt2);
        when(mockStmt1.executeQuery()).thenReturn(mockResultSet1);
        when(mockResultSet1.next()).thenReturn(true);
        when(mockResultSet1.getInt("id_acesso")).thenReturn(1);

        when(mockStmt2.executeQuery()).thenReturn(mockResultSet2);
        when(mockResultSet2.next()).thenReturn(true);
        when(mockResultSet2.getString("username")).thenReturn("admin");

        // Chama o método que você deseja testar
        assertEquals("admin", DBstatements.getuser(7)); // Sem mockConnection como argumento
    }

    @Test
    void getUserWrongTest() throws SQLException {
        // Criação de objetos mock
        Connection mockConnection = mock(Connection.class);
        PreparedStatement mockStmt1 = mock(PreparedStatement.class);
        ResultSet mockResultSet1 = mock(ResultSet.class);

        // Configuração do comportamento dos mocks
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStmt1);
        when(mockStmt1.executeQuery()).thenReturn(mockResultSet1);
        when(mockResultSet1.next()).thenReturn(false);

        // Chama o método que você deseja testar
        assertNull(DBstatements.getuser(456)); // Sem mockConnection como argumento
    }
}