package zc;

import androidx.lifecycle.y;
import kd.o;
import od.e;
import od.h;
import qc.m;
import rc.b;
import td.p;

@e(c = "dev.pankaj.ytvclib.ui.main.player.viewmodel.PlayerViewModel$channelStreams$1$1", f = "PlayerViewModel.kt", l = {28, 30, 30, 32, 34}, m = "invokeSuspend")
/* compiled from: PlayerViewModel.kt */
public final class d extends h implements p<y<m<b>>, md.d<? super o>, Object> {

    /* renamed from: e  reason: collision with root package name */
    public Object f28828e;

    /* renamed from: f  reason: collision with root package name */
    public int f28829f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f28830g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f28831h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f28832i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, md.d<? super d> dVar) {
        super(2, dVar);
        this.f28831h = cVar;
        this.f28832i = str;
    }

    public final md.d<o> a(Object obj, md.d<?> dVar) {
        d dVar2 = new d(this.f28831h, this.f28832i, dVar);
        dVar2.f28830g = obj;
        return dVar2;
    }

    public Object h(Object obj, Object obj2) {
        d dVar = new d(this.f28831h, this.f28832i, (md.d) obj2);
        dVar.f28830g = (y) obj;
        return dVar.l(o.f20627a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r10) {
        /*
            r9 = this;
            nd.a r0 = nd.a.COROUTINE_SUSPENDED
            int r1 = r9.f28829f
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r1 == 0) goto L_0x0045
            if (r1 == r5) goto L_0x003d
            if (r1 == r6) goto L_0x002d
            if (r1 == r4) goto L_0x0024
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            goto L_0x001f
        L_0x0017:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001f:
            l0.e.l(r10)
            goto L_0x00be
        L_0x0024:
            java.lang.Object r1 = r9.f28830g
            androidx.lifecycle.y r1 = (androidx.lifecycle.y) r1
            l0.e.l(r10)     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            goto L_0x00be
        L_0x002d:
            java.lang.Object r1 = r9.f28828e
            androidx.lifecycle.y r1 = (androidx.lifecycle.y) r1
            java.lang.Object r5 = r9.f28830g
            androidx.lifecycle.y r5 = (androidx.lifecycle.y) r5
            l0.e.l(r10)     // Catch:{ IOException -> 0x003b, l -> 0x0039 }
            goto L_0x0076
        L_0x0039:
            r10 = move-exception
            goto L_0x008a
        L_0x003b:
            r10 = move-exception
            goto L_0x00a5
        L_0x003d:
            java.lang.Object r1 = r9.f28830g
            androidx.lifecycle.y r1 = (androidx.lifecycle.y) r1
            l0.e.l(r10)
            goto L_0x005d
        L_0x0045:
            l0.e.l(r10)
            java.lang.Object r10 = r9.f28830g
            androidx.lifecycle.y r10 = (androidx.lifecycle.y) r10
            qc.m$b r1 = new qc.m$b
            r1.<init>(r7, r5)
            r9.f28830g = r10
            r9.f28829f = r5
            java.lang.Object r1 = r10.a(r1, r9)
            if (r1 != r0) goto L_0x005c
            return r0
        L_0x005c:
            r1 = r10
        L_0x005d:
            zc.c r10 = r9.f28831h     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            qc.g r10 = r10.f28823d     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            java.lang.String r5 = r9.f28832i     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            java.lang.String r8 = "it"
            ud.k.e(r5, r8)     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            r9.f28830g = r1     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            r9.f28828e = r1     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            r9.f28829f = r6     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            java.lang.Object r10 = r10.b(r5, r9)     // Catch:{ IOException -> 0x00a3, l -> 0x0088 }
            if (r10 != r0) goto L_0x0075
            return r0
        L_0x0075:
            r5 = r1
        L_0x0076:
            qc.m$c r8 = new qc.m$c     // Catch:{ IOException -> 0x003b, l -> 0x0039 }
            r8.<init>(r10)     // Catch:{ IOException -> 0x003b, l -> 0x0039 }
            r9.f28830g = r5     // Catch:{ IOException -> 0x003b, l -> 0x0039 }
            r9.f28828e = r7     // Catch:{ IOException -> 0x003b, l -> 0x0039 }
            r9.f28829f = r4     // Catch:{ IOException -> 0x003b, l -> 0x0039 }
            java.lang.Object r10 = r1.a(r8, r9)     // Catch:{ IOException -> 0x003b, l -> 0x0039 }
            if (r10 != r0) goto L_0x00be
            return r0
        L_0x0088:
            r10 = move-exception
            r5 = r1
        L_0x008a:
            qc.m$a r1 = new qc.m$a
            java.lang.String r10 = r10.getMessage()
            ud.k.c(r10)
            r1.<init>(r10, r7, r6)
            r9.f28830g = r7
            r9.f28828e = r7
            r9.f28829f = r2
            java.lang.Object r10 = r5.a(r1, r9)
            if (r10 != r0) goto L_0x00be
            return r0
        L_0x00a3:
            r10 = move-exception
            r5 = r1
        L_0x00a5:
            qc.m$a r1 = new qc.m$a
            java.lang.String r10 = r10.getMessage()
            ud.k.c(r10)
            r1.<init>(r10, r7, r6)
            r9.f28830g = r7
            r9.f28828e = r7
            r9.f28829f = r3
            java.lang.Object r10 = r5.a(r1, r9)
            if (r10 != r0) goto L_0x00be
            return r0
        L_0x00be:
            kd.o r10 = kd.o.f20627a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d.l(java.lang.Object):java.lang.Object");
    }
}
