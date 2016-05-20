package de.sfn_kassel;

/**
 * Created by robin on 20.05.16.
 */


import java.net.URI;
import java.nio.ByteBuffer;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_10;
import org.java_websocket.handshake.ServerHandshake;

public class LocateServer extends WebSocketClient implements SoundAPI {

    public LocateServer(URI serverUri) {
        super(serverUri, new Draft_10());
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("new connection opened: " + handshakedata);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("closed with exit code " + code + " additional info: " + reason);
    }

    @Override
    public void onMessage(ByteBuffer bytes) {
        System.out.println("binary message: " + bytes);
    }

    @Override
    public void onMessage(String message) {
        System.out.println("received message: " + message);
    }

    @Override
    public void onError(Exception ex) {
        System.err.println("an error occurred:" + ex);
    }

    public DataPoint nextPoint() {
        return null;
    }
}
