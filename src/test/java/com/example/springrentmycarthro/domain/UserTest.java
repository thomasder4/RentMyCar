package com.example.springrentmycarthro.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void getUser_FirtsName_Equal() {
        User user = new User();
        user.setFirstName("Henk");



        assertEquals("Henk", user.getFirstName());
}
}
