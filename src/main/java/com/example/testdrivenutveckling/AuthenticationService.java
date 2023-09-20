package com.example.testdrivenutveckling;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthenticationService {


        // Mockad databas med användare (ersätt med riktig databas)
        private static List<User> users = new ArrayList<>();

        // Metod för inloggning
        public boolean login(String username, String password) throws AuthenticationException {
            Optional<User> user = users.stream()
                    .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                    .findFirst();

            if (user.isPresent()) {
                return true;
            } else {
                throw new AuthenticationException("Fel användarnamn eller lösenord");
            }
        }


}
