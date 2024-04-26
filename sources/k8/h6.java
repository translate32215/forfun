package k8;

import e8.ft;
import java.io.IOException;
import k8.h6;
import k8.k6;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public class h6<MessageType extends k6<MessageType, BuilderType>, BuilderType extends h6<MessageType, BuilderType>> extends f5<MessageType, BuilderType> {

    /* renamed from: a  reason: collision with root package name */
    public final MessageType f20241a;

    /* renamed from: b  reason: collision with root package name */
    public MessageType f20242b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f20243c = false;

    public h6(MessageType messagetype) {
        this.f20241a = messagetype;
        this.f20242b = (k6) messagetype.r(4, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ m7 d() {
        return this.f20241a;
    }

    public final MessageType f() {
        MessageType g10 = g();
        boolean z10 = true;
        byte byteValue = ((Byte) g10.r(1, (Object) null, (Object) null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                boolean d10 = u7.f20499c.a(g10.getClass()).d(g10);
                g10.r(2, true != d10 ? null : g10, (Object) null);
                z10 = d10;
            }
        }
        if (z10) {
            return g10;
        }
        throw new k8();
    }

    public MessageType g() {
        if (this.f20243c) {
            return this.f20242b;
        }
        MessageType messagetype = this.f20242b;
        u7.f20499c.a(messagetype.getClass()).a(messagetype);
        this.f20243c = true;
        return this.f20242b;
    }

    public void h() {
        MessageType messagetype = (k6) this.f20242b.r(4, (Object) null, (Object) null);
        u7.f20499c.a(messagetype.getClass()).c(messagetype, this.f20242b);
        this.f20242b = messagetype;
    }

    /* renamed from: j */
    public final BuilderType clone() {
        BuilderType buildertype = (h6) this.f20241a.r(5, (Object) null, (Object) null);
        buildertype.k(g());
        return buildertype;
    }

    public final BuilderType k(MessageType messagetype) {
        if (this.f20243c) {
            h();
            this.f20243c = false;
        }
        MessageType messagetype2 = this.f20242b;
        u7.f20499c.a(messagetype2.getClass()).c(messagetype2, messagetype);
        return this;
    }

    public final BuilderType l(byte[] bArr, int i10, int i11, x5 x5Var) throws t6 {
        if (this.f20243c) {
            h();
            this.f20243c = false;
        }
        try {
            u7.f20499c.a(this.f20242b.getClass()).i(this.f20242b, bArr, 0, i11, new ft(x5Var));
            return this;
        } catch (t6 e10) {
            throw e10;
        } catch (IndexOutOfBoundsException unused) {
            throw t6.d();
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        }
    }
}
