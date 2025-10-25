package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int currentServerIndex = 0;

    static class Server {
        String name;
        int activeConnections = 0;
    }

    public static void main(String[] args) {
        List<String> serverAddresses = List.of("server1", "server2");
        roundRobin(serverAddresses);
    }

    private static void roundRobin(List<String> serverAddresses) {
        String server = serverAddresses.get(currentServerIndex);
        currentServerIndex = (currentServerIndex + 1) % serverAddresses.size();
    }

    private static void weightedRoundRobin(List<String> serverAddresses, List<Integer> weights) {
        List<String> expandedServers = new ArrayList<>();

        for(int i = 0; i < serverAddresses.size(); i++) {
            String server = serverAddresses.get(i);
            int wt = weights.get(i);

            for(int j = 0; j < wt; j++) {
                expandedServers.add(server);
            }
        }

        String server = expandedServers.get(currentServerIndex);
        currentServerIndex = (currentServerIndex + 1) % expandedServers.size();
    }

    private static Server leastConnections(List<Server> servers) {
        Server selected = servers.get(0);
        int minConnections = Integer.MAX_VALUE;

        for (Server server : servers) {
            if(server.activeConnections < minConnections) {
                selected = server;
                minConnections = server.activeConnections;
            }
        }
        return selected;
    }
}