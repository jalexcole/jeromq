package zmq.io.net.tipc.wrapper;

import java.lang.foreign.MemorySegment;

public class TipcSiocInReq {
    private final MemorySegment ptr;

    public TipcSiocInReq(MemorySegment ptr) {
        this.ptr = ptr;
    }

    public MemorySegment ptr() {
        return ptr;
    }

    public int pair() {
        return tipc_sioc_in_req.pair(this.ptr);
    }

    public void pair(int pair) {
        tipc_sioc_in_req.pair(this.ptr, pair);
    }

    public int bearerId() {
        return tipc_sioc_in_req.bearer_id(this.ptr);
    }

    public void bearerId(int bearerId) {
        tipc_sioc_in_req.bearer_id(this.ptr, bearerId);
    }
}
