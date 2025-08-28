package zmq.io.net.tipc;

import java.lang.foreign.MemorySegment;
import java.net.SocketAddress;

public class TipcSocketAddress extends SocketAddress {
    private final MemorySegment ptr;

    public TipcSocketAddress(MemorySegment ptr) {
        this.ptr = ptr;
    }

    public MemorySegment getPtr() {
        return ptr;
    }

    public int ref() {
        return tipc_socket_address.ref(this.ptr);
    }

    public int node() {
        return tipc_socket_address.node(this.ptr);
    }
}
