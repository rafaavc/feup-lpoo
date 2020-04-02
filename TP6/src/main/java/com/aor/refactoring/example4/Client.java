package com.aor.refactoring.example4;

import java.util.Objects;

public class Client {
    private final String name, phone;

    Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return name.equals(client.name) &&
                phone.equals(client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
