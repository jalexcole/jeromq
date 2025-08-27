package zmq.io.net.tipc.wrapper;

public class TipcServiceAddr {
    private final MemorySegment ptr;

    public TipcServiceAddr(MemorySegment ptr) {
        this.ptr = ptr;
    }

    public MemorySegment getPtr() {
        return ptr;
    }

    public int type() {
        return tipc_service_addr.type(this.ptr);
    }

    public void type(int type) {
        tipc_service_addr.type(this.ptr, type);
    }

    public int instance() {
        return tipc_service_addr.instance(this.ptr);
    }

    public void instance(int instance) {
        tipc_service_addr.instance(this.ptr, instance);
    }

}
