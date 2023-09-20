package com.example.testdrivenutveckling;

import java.util.Objects;

public class AnvändarKlass {
    public class User {
        private String username;
        private String password;

        // Getter-metoder
        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        // Equals-metod
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(username, user.username);
        }
    }
}
