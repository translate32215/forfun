package p5;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import p5.e;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer */
public class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f23841a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, Looper looper) {
        super(looper);
        this.f23841a = eVar;
    }

    public void handleMessage(Message message) {
        e.a aVar;
        e eVar = this.f23841a;
        eVar.getClass();
        int i10 = message.what;
        if (i10 == 0) {
            aVar = (e.a) message.obj;
            try {
                eVar.f23844a.queueInputBuffer(aVar.f23851a, aVar.f23852b, aVar.f23853c, aVar.f23855e, aVar.f23856f);
            } catch (RuntimeException e10) {
                eVar.f23847d.set(e10);
            }
        } else if (i10 != 1) {
            if (i10 != 2) {
                eVar.f23847d.set(new IllegalStateException(String.valueOf(message.what)));
            } else {
                eVar.f23848e.c();
            }
            aVar = null;
        } else {
            aVar = (e.a) message.obj;
            int i11 = aVar.f23851a;
            int i12 = aVar.f23852b;
            MediaCodec.CryptoInfo cryptoInfo = aVar.f23854d;
            long j10 = aVar.f23855e;
            int i13 = aVar.f23856f;
            try {
                if (eVar.f23849f) {
                    synchronized (e.f23843i) {
                        eVar.f23844a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                    }
                } else {
                    eVar.f23844a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                }
            } catch (RuntimeException e11) {
                eVar.f23847d.set(e11);
            }
        }
        if (aVar != null) {
            ArrayDeque<e.a> arrayDeque = e.f23842h;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}
