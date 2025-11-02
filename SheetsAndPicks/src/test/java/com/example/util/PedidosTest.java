package com.example.util;

import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PedidosTest {

//    @Test
//    void testPedidosPostComSucesso() throws JsonProcessingException {
//        // Arrange
//        Cliente cliente = new Cliente("string", "Marca", "marquanho@gmail.com", "rua do maraquinhos", "27", "5332-221", "Coimbra", "Portugal", "250345213", false, "marquinhos");
//        String dadosJson = new ObjectMapper().writeValueAsString(cliente);
//
//        String url = "https://services.inapa.com/FeiraOffice/api/client";
//        String method = "POST";
//
//        // Act
//        HttpResponse<String> result = Pedidos.pedidos(dadosJson, url, method);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(201, result.statusCode());
//        // Adicione mais verificações conforme necessário
//    }

    @Test
    void testPedidosGetComSucesso() {
        // Arrange
        String url = "https://services.inapa.com/FeiraOffice/api/client";
        String method = "GET";

        // Act
        HttpResponse<String> result = Pedidos.pedidos(null, url, method);

        // Assert
        assertNotNull(result);
        assertEquals(200, result.statusCode());
        // Adicione mais verificações conforme necessário
    }

//    @Test
//    void testPedidosDeleteComSucesso() {
//        // Arrange
//        String id = "717f0b8c-6c75-47a2-b27b-20ae5be2696f";
//        String url = "https://services.inapa.com/FeiraOffice/api/client/" + id;
//        String method = "DELETE";
//
//        // Act
//        HttpResponse<String> result = Pedidos.pedidos(null, url, method);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(202, result.statusCode());
//        // Adicione mais verificações conforme necessário
//    }

    @Test
    void testPedidosLoginComSucesso() {
        // Arrange
        String dadosJson = "{\"email\":\"marquanho@gmail.com\",\"password\":\"marquinhos\"}";
        String url = "https://services.inapa.com/FeiraOffice/api/client/login";
        String method = "LOGIN";

        // Act
        HttpResponse<String> result = Pedidos.pedidos(dadosJson, url, method);

        // Assert
        assertNotNull(result);
        assertEquals(200, result.statusCode());
        // Adicione mais verificações conforme necessário
    }

}