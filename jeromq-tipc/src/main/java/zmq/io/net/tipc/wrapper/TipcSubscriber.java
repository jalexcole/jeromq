package zmq.io.net.tipc.wrapper;

import java.lang.foreign.MemorySegment;

public class TipcSubscriber {
    private MemorySegment ptr;

    static {
        System.loadLibrary("tipc");
    }

    public void usrHandle(String handle) {
        throw new UnsupportedOperationException("User handle not supported");
    }
    

    public TipcServiceRange seq() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void seq(TipcServiceRange seq) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
