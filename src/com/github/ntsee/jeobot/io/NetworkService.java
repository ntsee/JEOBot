package com.github.ntsee.jeobot.io;

import com.github.ntsee.jeobot.events.Event;

import java.io.Closeable;

public interface NetworkService extends Closeable {

    void connect(String host, int port);
    void init(int s1, int s2, int encode, int decode);
    void setSequence(int s1, int s2);
    void send(EOWriter packet);

    interface Listener {
        void onEvent(Event event);
    }
}
