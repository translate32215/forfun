package m3;

import android.util.Log;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n0.d;
import y3.c;

/* compiled from: DecodePath */
public class j<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f21583a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends f<DataType, ResourceType>> f21584b;

    /* renamed from: c  reason: collision with root package name */
    public final c<ResourceType, Transcode> f21585c;

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f21586d;

    /* renamed from: e  reason: collision with root package name */
    public final String f21587e;

    /* compiled from: DecodePath */
    public interface a<ResourceType> {
    }

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends f<DataType, ResourceType>> list, c<ResourceType, Transcode> cVar, d<List<Throwable>> dVar) {
        this.f21583a = cls;
        this.f21584b = list;
        this.f21585c = cVar;
        this.f21586d = dVar;
        StringBuilder a10 = android.support.v4.media.a.a("Failed DecodePath{");
        a10.append(cls.getSimpleName());
        a10.append("->");
        a10.append(cls2.getSimpleName());
        a10.append("->");
        a10.append(cls3.getSimpleName());
        a10.append("}");
        this.f21587e = a10.toString();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.bumptech.glide.load.data.e<DataType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: m3.w<ResourceType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: m3.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: m3.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: m3.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: m3.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: m3.w<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: m3.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: m3.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: m3.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: m3.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m3.w<Transcode> a(com.bumptech.glide.load.data.e<DataType> r11, int r12, int r13, k3.e r14, m3.j.a<ResourceType> r15) throws m3.r {
        /*
            r10 = this;
            n0.d<java.util.List<java.lang.Throwable>> r0 = r10.f21586d
            java.lang.Object r0 = r0.b()
            e.e.b(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r0
            m3.w r11 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x011c }
            n0.d<java.util.List<java.lang.Throwable>> r12 = r10.f21586d
            r12.a(r0)
            m3.i$b r15 = (m3.i.b) r15
            m3.i r12 = m3.i.this
            com.bumptech.glide.load.a r13 = r15.f21564a
            r12.getClass()
            java.lang.Object r15 = r11.get()
            java.lang.Class r7 = r15.getClass()
            com.bumptech.glide.load.a r15 = com.bumptech.glide.load.a.RESOURCE_DISK_CACHE
            r0 = 0
            if (r13 == r15) goto L_0x0043
            m3.h<R> r15 = r12.f21546a
            k3.g r15 = r15.f(r7)
            com.bumptech.glide.d r1 = r12.f21553h
            int r2 = r12.f21557t
            int r3 = r12.f21558u
            m3.w r1 = r15.b(r1, r11, r2, r3)
            r6 = r15
            r15 = r1
            goto L_0x0045
        L_0x0043:
            r15 = r11
            r6 = r0
        L_0x0045:
            boolean r1 = r11.equals(r15)
            if (r1 != 0) goto L_0x004e
            r11.c()
        L_0x004e:
            m3.h<R> r11 = r12.f21546a
            com.bumptech.glide.d r11 = r11.f21530c
            com.bumptech.glide.g r11 = r11.f4909b
            b4.d r11 = r11.f4928d
            java.lang.Class r1 = r15.b()
            k3.f r11 = r11.a(r1)
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x0064
            r11 = 1
            goto L_0x0065
        L_0x0064:
            r11 = 0
        L_0x0065:
            if (r11 == 0) goto L_0x008a
            m3.h<R> r11 = r12.f21546a
            com.bumptech.glide.d r11 = r11.f21530c
            com.bumptech.glide.g r11 = r11.f4909b
            b4.d r11 = r11.f4928d
            java.lang.Class r0 = r15.b()
            k3.f r0 = r11.a(r0)
            if (r0 == 0) goto L_0x0080
            k3.e r11 = r12.f21560w
            com.bumptech.glide.load.c r11 = r0.q(r11)
            goto L_0x008c
        L_0x0080:
            com.bumptech.glide.g$d r11 = new com.bumptech.glide.g$d
            java.lang.Class r12 = r15.b()
            r11.<init>(r12)
            throw r11
        L_0x008a:
            com.bumptech.glide.load.c r11 = com.bumptech.glide.load.c.NONE
        L_0x008c:
            r9 = r0
            m3.h<R> r0 = r12.f21546a
            k3.c r3 = r12.F
            java.util.List r0 = r0.c()
            int r4 = r0.size()
            r5 = 0
        L_0x009a:
            if (r5 >= r4) goto L_0x00af
            java.lang.Object r8 = r0.get(r5)
            q3.m$a r8 = (q3.m.a) r8
            k3.c r8 = r8.f24104a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x00ac
            r1 = 1
            goto L_0x00af
        L_0x00ac:
            int r5 = r5 + 1
            goto L_0x009a
        L_0x00af:
            r0 = r1 ^ 1
            m3.k r1 = r12.f21559v
            boolean r13 = r1.d(r0, r13, r11)
            if (r13 == 0) goto L_0x0115
            if (r9 == 0) goto L_0x0107
            int r13 = r11.ordinal()
            if (r13 == 0) goto L_0x00f1
            if (r13 != r2) goto L_0x00da
            m3.y r11 = new m3.y
            m3.h<R> r13 = r12.f21546a
            com.bumptech.glide.d r13 = r13.f21530c
            n3.b r1 = r13.f4908a
            k3.c r2 = r12.F
            k3.c r3 = r12.f21554i
            int r4 = r12.f21557t
            int r5 = r12.f21558u
            k3.e r8 = r12.f21560w
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00fa
        L_0x00da:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unknown strategy: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L_0x00f1:
            m3.e r11 = new m3.e
            k3.c r13 = r12.F
            k3.c r0 = r12.f21554i
            r11.<init>(r13, r0)
        L_0x00fa:
            m3.v r15 = m3.v.d(r15)
            m3.i$c<?> r12 = r12.f21551f
            r12.f21566a = r11
            r12.f21567b = r9
            r12.f21568c = r15
            goto L_0x0115
        L_0x0107:
            com.bumptech.glide.g$d r11 = new com.bumptech.glide.g$d
            java.lang.Object r12 = r15.get()
            java.lang.Class r12 = r12.getClass()
            r11.<init>(r12)
            throw r11
        L_0x0115:
            y3.c<ResourceType, Transcode> r11 = r10.f21585c
            m3.w r11 = r11.m(r15, r14)
            return r11
        L_0x011c:
            r11 = move-exception
            n0.d<java.util.List<java.lang.Throwable>> r12 = r10.f21586d
            r12.a(r0)
            goto L_0x0124
        L_0x0123:
            throw r11
        L_0x0124:
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.j.a(com.bumptech.glide.load.data.e, int, int, k3.e, m3.j$a):m3.w");
    }

    public final w<ResourceType> b(e<DataType> eVar, int i10, int i11, k3.e eVar2, List<Throwable> list) throws r {
        int size = this.f21584b.size();
        w<ResourceType> wVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            f fVar = (f) this.f21584b.get(i12);
            try {
                if (fVar.b(eVar.a(), eVar2)) {
                    wVar = fVar.a(eVar.a(), i10, i11, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + fVar, e10);
                }
                list.add(e10);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.f21587e, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("DecodePath{ dataClass=");
        a10.append(this.f21583a);
        a10.append(", decoders=");
        a10.append(this.f21584b);
        a10.append(", transcoder=");
        a10.append(this.f21585c);
        a10.append('}');
        return a10.toString();
    }
}
