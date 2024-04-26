package d6;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.i;
import e8.d40;
import java.util.Locale;
import l0.e;

/* compiled from: UrlTemplate */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public Object f13153a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13154b;

    /* renamed from: c  reason: collision with root package name */
    public Object f13155c;

    /* renamed from: d  reason: collision with root package name */
    public int f13156d;

    public l() {
        this.f13153a = null;
        this.f13155c = null;
        this.f13156d = 0;
        this.f13154b = new Object();
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f13156d;
            if (i11 < i12) {
                sb2.append(((String[]) this.f13153a)[i11]);
                Object obj = this.f13154b;
                if (((int[]) obj)[i11] == 1) {
                    sb2.append(str);
                } else if (((int[]) obj)[i11] == 2) {
                    sb2.append(String.format(Locale.US, ((String[]) this.f13155c)[i11], new Object[]{Long.valueOf(j10)}));
                } else if (((int[]) obj)[i11] == 3) {
                    sb2.append(String.format(Locale.US, ((String[]) this.f13155c)[i11], new Object[]{Integer.valueOf(i10)}));
                } else if (((int[]) obj)[i11] == 4) {
                    sb2.append(String.format(Locale.US, ((String[]) this.f13155c)[i11], new Object[]{Long.valueOf(j11)}));
                }
                i11++;
            } else {
                sb2.append(((String[]) this.f13153a)[i12]);
                return sb2.toString();
            }
        }
    }

    public Looper b() {
        Looper looper;
        synchronized (this.f13154b) {
            if (this.f13156d != 0) {
                i.i((HandlerThread) this.f13153a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (((HandlerThread) this.f13153a) == null) {
                e.H("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f13153a = handlerThread;
                handlerThread.start();
                this.f13155c = new d40(((HandlerThread) this.f13153a).getLooper());
                e.H("Looper thread started.");
            } else {
                e.H("Resuming the looper thread");
                this.f13154b.notifyAll();
            }
            this.f13156d++;
            looper = ((HandlerThread) this.f13153a).getLooper();
        }
        return looper;
    }

    public l(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f13153a = strArr;
        this.f13154b = iArr;
        this.f13155c = strArr2;
        this.f13156d = i10;
    }
}
