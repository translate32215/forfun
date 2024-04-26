package g5;

import d5.a0;
import v6.v;
import x4.m0;

/* compiled from: TagPayloadReader */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f18495a;

    /* compiled from: TagPayloadReader */
    public static final class a extends m0 {
        public a(String str) {
            super(str);
        }
    }

    public e(a0 a0Var) {
        this.f18495a = a0Var;
    }

    public final boolean a(v vVar, long j10) throws m0 {
        return b(vVar) && c(vVar, j10);
    }

    public abstract boolean b(v vVar) throws m0;

    public abstract boolean c(v vVar, long j10) throws m0;
}
