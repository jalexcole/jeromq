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
        return new TipcServiceRange(tipc_subscr.seq(this.ptr));
    }

    public void seq(TipcServiceRange seq) {
        tipc_subscr.seq(this.ptr, seq.ptr());
    }
}
