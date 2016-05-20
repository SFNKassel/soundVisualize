package de.sfn_kassel;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_10;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException {
        WebSocketClient client = new LocateServer(new URI("ws://localhost:8887"), new Draft_10());
        client.connect();
    }
}
