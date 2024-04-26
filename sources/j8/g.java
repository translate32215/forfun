package j8;

import java.io.IOException;
import oa.c;
import oa.d;
import oa.h;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19660a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19661b = false;

    /* renamed from: c  reason: collision with root package name */
    public d f19662c;

    /* renamed from: d  reason: collision with root package name */
    public final c f19663d;

    public g(c cVar) {
        this.f19663d = cVar;
    }

    public final h c(String str) throws IOException {
        if (!this.f19660a) {
            this.f19660a = true;
            this.f19663d.c(this.f19662c, str, this.f19661b);
            return this;
        }
        throw new c("Cannot encode a second value in the ValueEncoderContext");
    }

    public final h d(boolean z10) throws IOException {
        if (!this.f19660a) {
            this.f19660a = true;
            this.f19663d.d(this.f19662c, z10 ? 1 : 0, this.f19661b);
            return this;
        }
        throw new c("Cannot encode a second value in the ValueEncoderContext");
    }
}
