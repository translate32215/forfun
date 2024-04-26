package n3;

/* compiled from: IntegerArrayAdapter */
public final class i implements a<int[]> {
    public String a() {
        return "IntegerArrayPool";
    }

    public int b(Object obj) {
        return ((int[]) obj).length;
    }

    public int c() {
        return 4;
    }

    public Object newArray(int i10) {
        return new int[i10];
    }
}
