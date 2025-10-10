package org.example;

import java.util.List;

public class Main {
    private static int currentServerIndex = 0;

    public static void main(String[] args) {
        List<String> serverAddresses = List.of("server1", "server2");
        roundRobin(serverAddresses);
    }

    private static void roundRobin(List<String> serverAddresses) {
        String server = serverAddresses.get(currentServerIndex);
        currentServerIndex = (currentServerIndex + 1) % serverAddresses.size();
    }
}