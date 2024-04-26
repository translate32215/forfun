package qe;

/* compiled from: ErrorCode */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f24288a;

    /* access modifiers changed from: public */
    b(int i10) {
        this.f24288a = i10;
    }

    public static b a(int i10) {
        for (b bVar : values()) {
            if (bVar.f24288a == i10) {
                return bVar;
            }
        }
        return null;
    }
}
