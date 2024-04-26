package c5;

import android.media.MediaDrm;
import c5.d;
import c5.q;

public final /* synthetic */ class s implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f4345a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.b f4346b;

    public /* synthetic */ s(u uVar, q.b bVar) {
        this.f4345a = uVar;
        this.f4346b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        u uVar = this.f4345a;
        q.b bVar = this.f4346b;
        uVar.getClass();
        d.c cVar = d.this.f4307x;
        cVar.getClass();
        cVar.obtainMessage(i10, bArr).sendToTarget();
    }
}
