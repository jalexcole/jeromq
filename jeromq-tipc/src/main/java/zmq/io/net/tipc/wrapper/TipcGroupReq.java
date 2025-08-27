package zmq.io.net.tipc.wrapper;

public class TipcGroupReq {
    private final MemorySegment ptr;

    public TipcGroupReq(MemorySegment ptr) {
        this.ptr = ptr;
    }

    public MemorySegment getPtr() {
        return ptr;
    }

    public int type() {
        return tipc_group_req.type(this.ptr);
    }

    public void type(int type) {
        tipc_group_req.type(this.ptr, type);
    }

    public int instance() {
        return tipc_group_req.instance(this.ptr);
    }

    public void instance(int instance) {
        tipc_group_req.instance(this.ptr, instance);
    }

    public int scope() {
        return tipc_group_req.scope(this.ptr);
    }

    public void scope(int scope) {
        tipc_group_req.scope(this.ptr, scope);
    }

    public int flags() {
        return tipc_group_req.flags(this.ptr);
    }

    public void flags(int flags) {
        tipc_group_req.flags(this.ptr, flags);
    }
}
