package t4;

import android.support.v4.media.a;
import o4.f;
import o4.i;

/* compiled from: AutoValue_PersistedEvent */
public final class b extends h {

    /* renamed from: a  reason: collision with root package name */
    public final long f25694a;

    /* renamed from: b  reason: collision with root package name */
    public final i f25695b;

    /* renamed from: c  reason: collision with root package name */
    public final f f25696c;

    public b(long j10, i iVar, f fVar) {
        this.f25694a = j10;
        if (iVar != null) {
            this.f25695b = iVar;
            if (fVar != null) {
                this.f25696c = fVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public f a() {
        return this.f25696c;
    }

    public long b() {
        return this.f25694a;
    }

    public i c() {
        return this.f25695b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f25694a != hVar.b() || !this.f25695b.equals(hVar.c()) || !this.f25696c.equals(hVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f25694a;
        return this.f25696c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f25695b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder a10 = a.a("PersistedEvent{id=");
        a10.append(this.f25694a);
        a10.append(", transportContext=");
        a10.append(this.f25695b);
        a10.append(", event=");
        a10.append(this.f25696c);
        a10.append("}");
        return a10.toString();
    }
}
