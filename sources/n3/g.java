package n3;

/* compiled from: ByteArrayAdapter */
public final class g implements a<byte[]> {
    public String a() {
        return "ByteArrayPool";
    }

    public int b(Object obj) {
        return ((byte[]) obj).length;
    }

    public int c() {
        return 1;
    }

    public Object newArray(int i10) {
        return new byte[i10];
    }
}
