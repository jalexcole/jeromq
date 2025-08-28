package zmq.io.net.tipc.wrapper;
public class TipcSiocNodeidReq {
    private final MemorySegment ptr;

    TipcSiocNodeidReq(MemorySegment ptr) {
        this.ptr = ptr;
    }

    public MemorySegment ptr() {
        return ptr;
    }

    public int peer() {
        return tipc_sioc_nodeid_req.peer(this.ptr);
    }

    public void peer(int peer) {
        tipc_sioc_nodeid_req.peer(this.ptr, peer);
    }

    public String nodeId() {
        return String.valueOf(tipc_sioc_nodeid_req.node_id(this.ptr));
    }

    public void nodeId(String nodeId) {
        tipc_sioc_nodeid_req.node_id(this.ptr, Arrays.copyOf(nodeId.getBytes(), 16));
    }
}
