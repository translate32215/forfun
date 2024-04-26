package com.google.android.gms.internal.ads;

import e8.bg;
import e8.lj;
import e8.oh;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class v8 implements oh {

    /* renamed from: b  reason: collision with root package name */
    public static Logger f8337b = Logger.getLogger(v8.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public ThreadLocal<ByteBuffer> f8338a = new bg();

    public final a9 a(o7 o7Var, lj ljVar) throws IOException {
        int read;
        long j10;
        o7 o7Var2 = o7Var;
        lj ljVar2 = ljVar;
        long a10 = o7Var.a();
        this.f8338a.get().rewind().limit(8);
        do {
            read = o7Var2.read(this.f8338a.get());
            if (read == 8) {
                this.f8338a.get().rewind();
                long e10 = uc.e(this.f8338a.get());
                byte[] bArr = null;
                if (e10 >= 8 || e10 <= 1) {
                    byte[] bArr2 = new byte[4];
                    this.f8338a.get().get(bArr2);
                    try {
                        String str = new String(bArr2, "ISO-8859-1");
                        if (e10 == 1) {
                            this.f8338a.get().limit(16);
                            o7Var2.read(this.f8338a.get());
                            this.f8338a.get().position(8);
                            j10 = uc.g(this.f8338a.get()) - 16;
                        } else {
                            j10 = e10 == 0 ? ((long) o7Var2.f7672a.limit()) - o7Var.a() : e10 - 8;
                        }
                        if ("uuid".equals(str)) {
                            this.f8338a.get().limit(this.f8338a.get().limit() + 16);
                            o7Var2.read(this.f8338a.get());
                            bArr = new byte[16];
                            for (int position = this.f8338a.get().position() - 16; position < this.f8338a.get().position(); position++) {
                                bArr[position - (this.f8338a.get().position() - 16)] = this.f8338a.get().get(position);
                            }
                            j10 -= 16;
                        }
                        long j11 = j10;
                        byte[] bArr3 = bArr;
                        long j12 = j11;
                        a9 b10 = b(str, bArr3, ljVar2 instanceof a9 ? ((a9) ljVar2).o() : "");
                        b10.d(ljVar2);
                        this.f8338a.get().rewind();
                        b10.a(o7Var, this.f8338a.get(), j12, this);
                        return b10;
                    } catch (UnsupportedEncodingException e11) {
                        throw new RuntimeException(e11);
                    }
                } else {
                    Logger logger = f8337b;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(e10);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
            }
        } while (read >= 0);
        o7Var2.d(a10);
        throw new EOFException();
    }

    public abstract a9 b(String str, byte[] bArr, String str2);
}
