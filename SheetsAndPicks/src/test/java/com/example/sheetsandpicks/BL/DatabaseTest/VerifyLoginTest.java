package com.example.sheetsandpicks.BL.DatabaseTest;

import com.example.sheetsandpicks.BL.Database.DBstatements;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class VerifyLoginTest{

    @Test
    public void testVerifyLoginWithIncorrectCredentialsTest() throws SQLException {
        assertFalse(DBstatements.verifyLogin("username_inexistente", "senha_incorreta"));
    }

    @Test
    public void testVerifyLoginWithCorrectTest() throws SQLException {
        assertTrue(DBstatements.verifyLogin("roberto", "roberto"));
    }

    @Test
    public void testVerifyLoginWithCorrectUsernameOnlyTest() throws SQLException {
        assertFalse(DBstatements.verifyLogin("roberto", "senha_incorreta"));
    }
}