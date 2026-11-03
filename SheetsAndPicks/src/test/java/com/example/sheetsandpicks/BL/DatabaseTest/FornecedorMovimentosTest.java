package com.example.sheetsandpicks.BL.DatabaseTest;

import com.example.sheetsandpicks.BL.Database.DBstatements;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FornecedorMovimentosTest {

    @Test
    void fornecedorMovimentosCorretoTest() throws SQLException {
        // Criação de objetos mock
        Connection mockConnection = mock(Connection.class);
        PreparedStatement mockStmt = mock(PreparedStatement.class);
        ResultSet mockResultSet = mock(ResultSet.class);

        // Configuração do comportamento dos mocks
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStmt);
        when(mockStmt.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true); // Dados corretos simulados

        // Chama o método que você deseja testar
        ResultSet result = DBstatements.fornecedor_movimentos("PT92212");

        // Verifica se o ResultSet não é nulo (ou faça outras verificações conforme necessário)
        assertNotNull(result);

        // Feche o ResultSet, se necessário
        result.close();
    }

    @Test
    void fornecedorMovimentosIncorretoTest() throws SQLException {
        // Criação de objetos mock
        Connection mockConnection = mock(Connection.class);
        PreparedStatement mockStmt = mock(PreparedStatement.class);
        ResultSet mockResultSet = mock(ResultSet.class);

        // Configuração do comportamento dos mocks
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockStmt);
        when(mockStmt.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false); // Dados incorretos simulados

        // Chama o método que você deseja testar
        ResultSet result = DBstatements.fornecedor_movimentos("usuario_incorreto");

        // Verifica se o ResultSet é nulo (ou faça outras verificações conforme necessário)
        assertFalse(result.next());
    }
}