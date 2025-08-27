package zmq.io.net.tipc.wrapper;

import java.lang.foreign.MemorySegment;

import com.oracle.graal.enterprise.hotspot.phases.strings.t;

public class TipcAeadKey {
    private final MemorySegment ptr;

    TipcAeadKey(MemorySegment ptr) {
        this.ptr = ptr;
    }

    public MemorySegment getPtr() {
        return ptr;
    }

    public synchronized String algName() {
        final byte[] algName = new byte[32];

        for (long i = 0; i < 32; i++) {
            algName[(int) i] = tipc_aead_key.alg_name(this.ptr, i);
        }

        return String.valueOf(algName);
    }

    public synchronized void algName(final String algName) {
        if (algName.size() > 32) {
            throw new IllegalArgumentException("Algorithm name must be at most 32 bytes");
        }

        final byte[] inputArray = Arrays.copyOf(algName.getBytes(), 32);

        for (long i = 0; i < inputArray.length; i++) {
            tipc_aead_key.alg_name(this.ptr, i, inputArray[(int) i]);
        }
    }

    public synchronized String key() {
        final int keyLength = tipc_aead_key.key_length(this.ptr);

        final var keyPtr = tipc_aead_key.key(this.ptr);

        final byte[] key = new byte[keyLength];
        for (int i = 0; i < keyLength; i++) {
            key[i] = keyPtr.get(i);
        }

        return String.valueOf(key);
    }

    public void key(String key) {
        tipc_aead_key.key(this.ptr, ket.getBytes());
    }

}
