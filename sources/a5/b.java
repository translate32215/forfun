package a5;

import android.media.MediaCodec;
import v6.e0;

/* compiled from: CryptoInfo */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f62a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f63b;

    /* renamed from: c  reason: collision with root package name */
    public int f64c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f65d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f66e;

    /* renamed from: f  reason: collision with root package name */
    public int f67f;

    /* renamed from: g  reason: collision with root package name */
    public int f68g;

    /* renamed from: h  reason: collision with root package name */
    public int f69h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f70i;

    /* renamed from: j  reason: collision with root package name */
    public final C0003b f71j;

    /* renamed from: a5.b$b  reason: collision with other inner class name */
    /* compiled from: CryptoInfo */
    public static final class C0003b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f72a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f73b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public C0003b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this.f72a = cryptoInfo;
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f70i = cryptoInfo;
        this.f71j = e0.f26436a >= 24 ? new C0003b(cryptoInfo, (a) null) : null;
    }
}
