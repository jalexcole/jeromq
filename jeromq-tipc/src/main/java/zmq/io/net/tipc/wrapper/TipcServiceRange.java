package zmq.io.net.tipc.wrapper;

import java.lang.foreign.MemorySegment;

public class TipcServiceRange {
    private final MemorySegment ptr;

    TipcServiceRange(MemorySegment ptr) {
        this.ptr = ptr;
    }

    public MemorySegment ptr() {
        return ptr;
    }

    public int type() {
        return tipc_service_range.type(this.ptr);
    }

    public void type(int type) {
        tipc_service_range.type(this.ptr, type);
    }

    public int lower() {
        return tipc_service_range.lower(this.ptr);
    }

    public void lower(int lower) {
        tipc_service_range.lower(this.ptr, lower);
    }

    public int upper() {
        return tipc_service_range.upper(this.ptr);
    }

    public void upper(int upper) {
        tipc_service_range.upper(this.ptr, upper);
    }
}
