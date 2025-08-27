package zmq.io.net.tipc;

import java.lang.foreign.MemorySegment;
import java.net.SocketAddress;

public class TipcSocketAddress extends SocketAddress {
    private MemorySegment ptr;

    public TipcSocketAddress(MemorySegment ptr) {
        this.ptr = ptr;
    }

    public MemorySegment getPtr() {
        return ptr;
    }

    public int ref() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int node() {
        throw new UnsupportedOperationException("Not implemented yet");
        
    }
}
