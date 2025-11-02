package com.example.util;

import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.*;

class PedidosAlterarTest {

    @Test
    void testPedidosAlterarClienteComSucesso() {
        // Arrange
        String tipo = "Cliente";
        boolean opcao = true;
        String id = "1676db28-c785-48e3-b7e3-1a9d89990c0a";
        String url = "https://services.inapa.com/FeiraOffice/api/client/" + id;
        int status = 0;
        double pvp = 40.0;

        // Act
        HttpResponse<String> result = Pedidos.pedidosAlterar(tipo, opcao, url, status, String.valueOf(pvp));

        // Assert
        assertNotNull(result);
        assertEquals(202, result.statusCode());
        // Adicione mais verificações conforme necessário
    }

    @Test
    void testPedidosAlterarFalhado() {
        // Arrange
        String tipo = "Produtos";
        boolean opcao = true;
        String url = "https://services.inapa.com/FeiraOffice/api/produtos";
        int status = 0;
        double pvp = 30.0;

        // Act
        HttpResponse<String> result = Pedidos.pedidosAlterar(tipo, opcao, url, status, String.valueOf(pvp));

        // Assert
        assertNull(result);
        // Adicione mais verificações conforme necessário
    }
}