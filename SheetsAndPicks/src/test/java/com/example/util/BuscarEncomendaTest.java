package com.example.util;

import com.example.util.Models.Order;
import com.example.util.Models.OrderResponse;
import org.apiguardian.api.API;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BuscarEncomendaTest {

    @Test
    void testBuscarEncomendaConfirmarEncontrada() {
        // Arrange
        String sitio = "Confirmar"; // ou "Confirmar" conforme necessário

        // Act
        ArrayList<OrderResponse> result = APIOrder.BuscarEncomenda(sitio);

        // Assert
        assertNotNull(result);
        // Adicione mais verificações conforme necessário
    }

    @Test
    void testBuscarEncomendaVerEncontrada() {
        // Arrange
        String sitio = "Ver"; // ou "Confirmar" conforme necessário

        // Act
        ArrayList<OrderResponse> result = APIOrder.BuscarEncomenda(sitio);

        // Assert
        assertNotNull(result);
        // Adicione mais verificações conforme necessário
    }

    @Test
    void testBuscarEncomendaNaoEncontrada() {
        // Arrange
        String sitio = "AlgumaSitioQueNaoExiste";

        // Act
        ArrayList<OrderResponse> result = APIOrder.BuscarEncomenda(sitio);

        // Assert
        assertNull(result);
        // Adicione mais verificações conforme necessário
    }
}