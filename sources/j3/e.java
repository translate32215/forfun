package j3;

import android.graphics.Bitmap;
import j3.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import x3.b;

/* compiled from: StandardGifDecoder */
public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f19511a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f19512b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final a.C0166a f19513c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f19514d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f19515e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f19516f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f19517g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f19518h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f19519i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f19520j;

    /* renamed from: k  reason: collision with root package name */
    public int f19521k;

    /* renamed from: l  reason: collision with root package name */
    public c f19522l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f19523m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f19524n;

    /* renamed from: o  reason: collision with root package name */
    public int f19525o;

    /* renamed from: p  reason: collision with root package name */
    public int f19526p;

    /* renamed from: q  reason: collision with root package name */
    public int f19527q;

    /* renamed from: r  reason: collision with root package name */
    public int f19528r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f19529s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f19530t = Bitmap.Config.ARGB_8888;

    public e(a.C0166a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
        int[] iArr;
        this.f19513c = aVar;
        this.f19522l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f19525o = 0;
                this.f19522l = cVar;
                this.f19521k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f19514d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f19514d.order(ByteOrder.LITTLE_ENDIAN);
                this.f19524n = false;
                Iterator<b> it = cVar.f19500e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f19491g == 3) {
                            this.f19524n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f19526p = highestOneBit;
                int i11 = cVar.f19501f;
                this.f19528r = i11 / highestOneBit;
                int i12 = cVar.f19502g;
                this.f19527q = i12 / highestOneBit;
                this.f19519i = ((b) this.f19513c).a(i11 * i12);
                a.C0166a aVar2 = this.f19513c;
                int i13 = this.f19528r * this.f19527q;
                n3.b bVar = ((b) aVar2).f27304b;
                if (bVar == null) {
                    iArr = new int[i13];
                } else {
                    iArr = (int[]) bVar.f(i13, int[].class);
                }
                this.f19520j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    public int a() {
        return this.f19521k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap b() {
        /*
            r8 = this;
            monitor-enter(r8)
            j3.c r0 = r8.f19522l     // Catch:{ all -> 0x00ec }
            int r0 = r0.f19498c     // Catch:{ all -> 0x00ec }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f19521k     // Catch:{ all -> 0x00ec }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "e"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r3.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            j3.c r4 = r8.f19522l     // Catch:{ all -> 0x00ec }
            int r4 = r4.f19498c     // Catch:{ all -> 0x00ec }
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            int r4 = r8.f19521k     // Catch:{ all -> 0x00ec }
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ec }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ec }
        L_0x0039:
            r8.f19525o = r2     // Catch:{ all -> 0x00ec }
        L_0x003b:
            int r0 = r8.f19525o     // Catch:{ all -> 0x00ec }
            r3 = 0
            if (r0 == r2) goto L_0x00ca
            r4 = 2
            if (r0 != r4) goto L_0x0045
            goto L_0x00ca
        L_0x0045:
            r0 = 0
            r8.f19525o = r0     // Catch:{ all -> 0x00ec }
            byte[] r5 = r8.f19515e     // Catch:{ all -> 0x00ec }
            if (r5 != 0) goto L_0x0058
            j3.a$a r5 = r8.f19513c     // Catch:{ all -> 0x00ec }
            r6 = 255(0xff, float:3.57E-43)
            x3.b r5 = (x3.b) r5     // Catch:{ all -> 0x00ec }
            byte[] r5 = r5.a(r6)     // Catch:{ all -> 0x00ec }
            r8.f19515e = r5     // Catch:{ all -> 0x00ec }
        L_0x0058:
            j3.c r5 = r8.f19522l     // Catch:{ all -> 0x00ec }
            java.util.List<j3.b> r5 = r5.f19500e     // Catch:{ all -> 0x00ec }
            int r6 = r8.f19521k     // Catch:{ all -> 0x00ec }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00ec }
            j3.b r5 = (j3.b) r5     // Catch:{ all -> 0x00ec }
            int r6 = r8.f19521k     // Catch:{ all -> 0x00ec }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0074
            j3.c r7 = r8.f19522l     // Catch:{ all -> 0x00ec }
            java.util.List<j3.b> r7 = r7.f19500e     // Catch:{ all -> 0x00ec }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00ec }
            j3.b r6 = (j3.b) r6     // Catch:{ all -> 0x00ec }
            goto L_0x0075
        L_0x0074:
            r6 = r3
        L_0x0075:
            int[] r7 = r5.f19495k     // Catch:{ all -> 0x00ec }
            if (r7 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            j3.c r7 = r8.f19522l     // Catch:{ all -> 0x00ec }
            int[] r7 = r7.f19496a     // Catch:{ all -> 0x00ec }
        L_0x007e:
            r8.f19511a = r7     // Catch:{ all -> 0x00ec }
            if (r7 != 0) goto L_0x00a6
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r1.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00ec }
            int r4 = r8.f19521k     // Catch:{ all -> 0x00ec }
            r1.append(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ec }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ec }
        L_0x00a2:
            r8.f19525o = r2     // Catch:{ all -> 0x00ec }
            monitor-exit(r8)
            return r3
        L_0x00a6:
            boolean r1 = r5.f19490f     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x00c4
            int[] r1 = r8.f19512b     // Catch:{ all -> 0x00ec }
            int r2 = r7.length     // Catch:{ all -> 0x00ec }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00ec }
            int[] r1 = r8.f19512b     // Catch:{ all -> 0x00ec }
            r8.f19511a = r1     // Catch:{ all -> 0x00ec }
            int r2 = r5.f19492h     // Catch:{ all -> 0x00ec }
            r1[r2] = r0     // Catch:{ all -> 0x00ec }
            int r0 = r5.f19491g     // Catch:{ all -> 0x00ec }
            if (r0 != r4) goto L_0x00c4
            int r0 = r8.f19521k     // Catch:{ all -> 0x00ec }
            if (r0 != 0) goto L_0x00c4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00ec }
            r8.f19529s = r0     // Catch:{ all -> 0x00ec }
        L_0x00c4:
            android.graphics.Bitmap r0 = r8.j(r5, r6)     // Catch:{ all -> 0x00ec }
            monitor-exit(r8)
            return r0
        L_0x00ca:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r1.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00ec }
            int r2 = r8.f19525o     // Catch:{ all -> 0x00ec }
            r1.append(r2)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ec }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ec }
        L_0x00ea:
            monitor-exit(r8)
            return r3
        L_0x00ec:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.b():android.graphics.Bitmap");
    }

    public void c() {
        this.f19521k = (this.f19521k + 1) % this.f19522l.f19498c;
    }

    public void clear() {
        n3.b bVar;
        n3.b bVar2;
        n3.b bVar3;
        this.f19522l = null;
        byte[] bArr = this.f19519i;
        if (!(bArr == null || (bVar3 = ((b) this.f19513c).f27304b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f19520j;
        if (!(iArr == null || (bVar2 = ((b) this.f19513c).f27304b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f19523m;
        if (bitmap != null) {
            ((b) this.f19513c).f27303a.b(bitmap);
        }
        this.f19523m = null;
        this.f19514d = null;
        this.f19529s = null;
        byte[] bArr2 = this.f19515e;
        if (bArr2 != null && (bVar = ((b) this.f19513c).f27304b) != null) {
            bVar.put(bArr2);
        }
    }

    public int d() {
        return this.f19522l.f19498c;
    }

    public int e() {
        int i10;
        c cVar = this.f19522l;
        int i11 = cVar.f19498c;
        if (i11 <= 0 || (i10 = this.f19521k) < 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= i11) {
            return -1;
        }
        return cVar.f19500e.get(i10).f19493i;
    }

    public int f() {
        return (this.f19520j.length * 4) + this.f19514d.limit() + this.f19519i.length;
    }

    public ByteBuffer g() {
        return this.f19514d;
    }

    public final Bitmap h() {
        Boolean bool = this.f19529s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f19530t;
        Bitmap e10 = ((b) this.f19513c).f27303a.e(this.f19528r, this.f19527q, config);
        e10.setHasAlpha(true);
        return e10;
    }

    public void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f19530t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f19505j == r1.f19492h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v30, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap j(j3.b r36, j3.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f19520j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f19523m
            if (r3 == 0) goto L_0x0018
            j3.a$a r4 = r0.f19513c
            x3.b r4 = (x3.b) r4
            n3.e r4 = r4.f27303a
            r4.b(r3)
        L_0x0018:
            r3 = 0
            r0.f19523m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r12 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.f19491g
            if (r3 != r12) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f19523m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r13 = 2
            if (r2 == 0) goto L_0x0080
            int r3 = r2.f19491g
            if (r3 <= 0) goto L_0x0080
            if (r3 != r13) goto L_0x006e
            boolean r3 = r1.f19490f
            if (r3 != 0) goto L_0x0047
            j3.c r3 = r0.f19522l
            int r4 = r3.f19506k
            int[] r5 = r1.f19495k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f19505j
            int r5 = r1.f19492h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            int r3 = r2.f19488d
            int r5 = r0.f19526p
            int r3 = r3 / r5
            int r6 = r2.f19486b
            int r6 = r6 / r5
            int r7 = r2.f19487c
            int r7 = r7 / r5
            int r2 = r2.f19485a
            int r2 = r2 / r5
            int r5 = r0.f19528r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005e:
            if (r6 >= r3) goto L_0x0080
            int r2 = r6 + r7
            r5 = r6
        L_0x0063:
            if (r5 >= r2) goto L_0x006a
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0063
        L_0x006a:
            int r2 = r0.f19528r
            int r6 = r6 + r2
            goto L_0x005e
        L_0x006e:
            if (r3 != r12) goto L_0x0080
            android.graphics.Bitmap r2 = r0.f19523m
            if (r2 == 0) goto L_0x0080
            r4 = 0
            int r8 = r0.f19528r
            r6 = 0
            r7 = 0
            int r9 = r0.f19527q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x0080:
            java.nio.ByteBuffer r2 = r0.f19514d
            int r3 = r1.f19494j
            r2.position(r3)
            int r2 = r1.f19487c
            int r3 = r1.f19488d
            int r2 = r2 * r3
            byte[] r3 = r0.f19519i
            if (r3 == 0) goto L_0x0094
            int r3 = r3.length
            if (r3 >= r2) goto L_0x009e
        L_0x0094:
            j3.a$a r3 = r0.f19513c
            x3.b r3 = (x3.b) r3
            byte[] r3 = r3.a(r2)
            r0.f19519i = r3
        L_0x009e:
            byte[] r3 = r0.f19519i
            short[] r4 = r0.f19516f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00aa
            short[] r4 = new short[r5]
            r0.f19516f = r4
        L_0x00aa:
            short[] r4 = r0.f19516f
            byte[] r6 = r0.f19517g
            if (r6 != 0) goto L_0x00b4
            byte[] r6 = new byte[r5]
            r0.f19517g = r6
        L_0x00b4:
            byte[] r6 = r0.f19517g
            byte[] r7 = r0.f19518h
            if (r7 != 0) goto L_0x00c0
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f19518h = r7
        L_0x00c0:
            byte[] r7 = r0.f19518h
            java.nio.ByteBuffer r8 = r0.f19514d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 1
            int r16 = r14 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r13 = -1
            int r17 = r17 + -1
            r5 = 0
        L_0x00d8:
            if (r5 >= r14) goto L_0x00e3
            r4[r5] = r11
            byte r13 = (byte) r5
            r6[r5] = r13
            int r5 = r5 + 1
            r13 = -1
            goto L_0x00d8
        L_0x00e3:
            byte[] r5 = r0.f19515e
            r12 = r0
            r25 = r8
            r24 = r16
            r28 = r17
            r9 = 0
            r13 = -1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L_0x00fc:
            r30 = 8
            if (r9 >= r2) goto L_0x01f7
            if (r20 != 0) goto L_0x0139
            java.nio.ByteBuffer r11 = r12.f19514d
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 > 0) goto L_0x0115
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
            goto L_0x012d
        L_0x0115:
            r31 = r8
            java.nio.ByteBuffer r8 = r12.f19514d
            r32 = r9
            byte[] r9 = r12.f19515e
            r33 = r13
            int r13 = r8.remaining()
            int r13 = java.lang.Math.min(r11, r13)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r13)
        L_0x012d:
            if (r11 > 0) goto L_0x0134
            r8 = 3
            r12.f19525o = r8
            goto L_0x01f9
        L_0x0134:
            r20 = r11
            r21 = 0
            goto L_0x0141
        L_0x0139:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
        L_0x0141:
            byte r8 = r5[r21]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r22
            int r23 = r23 + r8
            int r22 = r22 + 8
            r8 = 1
            int r21 = r21 + 1
            r8 = -1
            int r20 = r20 + -1
            r10 = r22
            r11 = r24
            r8 = r25
            r9 = r32
            r13 = r33
            r22 = r5
            r5 = r26
        L_0x015f:
            if (r10 < r8) goto L_0x01e1
            r24 = r12
            r12 = r23 & r28
            int r23 = r23 >> r8
            int r10 = r10 - r8
            if (r12 != r14) goto L_0x017b
            r25 = r10
            r11 = r16
            r28 = r17
            r12 = r24
            r8 = r31
            r13 = -1
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01db
        L_0x017b:
            if (r12 != r15) goto L_0x0185
            r12 = r24
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e6
        L_0x0185:
            r25 = r10
            r10 = -1
            if (r13 != r10) goto L_0x0197
            byte r5 = r6[r12]
            r3[r27] = r5
            int r27 = r27 + 1
            int r9 = r9 + 1
            r24 = r12
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01d9
        L_0x0197:
            if (r12 < r11) goto L_0x01a0
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r13
            goto L_0x01a1
        L_0x01a0:
            r5 = r12
        L_0x01a1:
            if (r5 < r14) goto L_0x01ac
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01a1
        L_0x01ac:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r27] = r10
        L_0x01b3:
            r19 = 1
            int r27 = r27 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01c2
            int r29 = r29 + -1
            byte r24 = r7[r29]
            r3[r27] = r24
            goto L_0x01b3
        L_0x01c2:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L_0x01d9
            short r13 = (short) r13
            r4[r11] = r13
            r6[r11] = r10
            int r11 = r11 + 1
            r10 = r11 & r28
            if (r10 != 0) goto L_0x01d9
            if (r11 >= r5) goto L_0x01d9
            int r8 = r8 + 1
            int r28 = r28 + r11
        L_0x01d9:
            r13 = r12
            r12 = r0
        L_0x01db:
            r5 = r24
            r10 = r25
            goto L_0x015f
        L_0x01e1:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r12 = r0
        L_0x01e6:
            r25 = r8
            r5 = r22
            r26 = r24
            r8 = r31
            r22 = r10
            r24 = r11
            r10 = r34
            r11 = 0
            goto L_0x00fc
        L_0x01f7:
            r34 = r10
        L_0x01f9:
            r11 = r27
            r10 = 0
            java.util.Arrays.fill(r3, r11, r2, r10)
            boolean r2 = r1.f19489e
            if (r2 != 0) goto L_0x0278
            int r2 = r0.f19526p
            r3 = 1
            if (r2 == r3) goto L_0x020a
            goto L_0x0278
        L_0x020a:
            int[] r2 = r0.f19520j
            int r3 = r1.f19488d
            int r4 = r1.f19486b
            int r5 = r1.f19487c
            int r6 = r1.f19485a
            int r7 = r0.f19521k
            if (r7 != 0) goto L_0x021a
            r7 = 1
            goto L_0x021b
        L_0x021a:
            r7 = 0
        L_0x021b:
            int r8 = r0.f19528r
            byte[] r9 = r0.f19519i
            int[] r11 = r0.f19511a
            r12 = -1
            r13 = 0
        L_0x0223:
            if (r13 >= r3) goto L_0x025a
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0231
            r10 = r14
        L_0x0231:
            int r14 = r1.f19487c
            int r14 = r14 * r13
        L_0x0235:
            if (r15 >= r10) goto L_0x0252
            r16 = r3
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x0249
            r4 = r11[r4]
            if (r4 == 0) goto L_0x0248
            r2[r15] = r4
            goto L_0x0249
        L_0x0248:
            r12 = r3
        L_0x0249:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x0235
        L_0x0252:
            r16 = r3
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x0223
        L_0x025a:
            java.lang.Boolean r2 = r0.f19529s
            if (r2 == 0) goto L_0x0264
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x026d
        L_0x0264:
            java.lang.Boolean r2 = r0.f19529s
            if (r2 != 0) goto L_0x026f
            if (r7 == 0) goto L_0x026f
            r2 = -1
            if (r12 == r2) goto L_0x026f
        L_0x026d:
            r11 = 1
            goto L_0x0270
        L_0x026f:
            r11 = 0
        L_0x0270:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f19529s = r2
            goto L_0x0406
        L_0x0278:
            int[] r2 = r0.f19520j
            int r3 = r1.f19488d
            int r4 = r0.f19526p
            int r3 = r3 / r4
            int r5 = r1.f19486b
            int r5 = r5 / r4
            int r6 = r1.f19487c
            int r6 = r6 / r4
            int r7 = r1.f19485a
            int r7 = r7 / r4
            int r8 = r0.f19521k
            if (r8 != 0) goto L_0x028e
            r10 = 1
            goto L_0x028f
        L_0x028e:
            r10 = 0
        L_0x028f:
            int r8 = r0.f19528r
            int r9 = r0.f19527q
            byte[] r11 = r0.f19519i
            int[] r12 = r0.f19511a
            java.lang.Boolean r13 = r0.f19529s
            r14 = r13
            r13 = 0
            r15 = 0
            r16 = 1
            r17 = 8
        L_0x02a0:
            if (r13 >= r3) goto L_0x03f2
            r37 = r14
            boolean r14 = r1.f19489e
            if (r14 == 0) goto L_0x02cf
            if (r15 < r3) goto L_0x02ca
            int r14 = r16 + 1
            r20 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02c5
            r3 = 3
            if (r14 == r3) goto L_0x02be
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02ba
            goto L_0x02cc
        L_0x02ba:
            r15 = 1
            r17 = 2
            goto L_0x02cc
        L_0x02be:
            r3 = 4
            r16 = r14
            r15 = 2
            r17 = 4
            goto L_0x02cc
        L_0x02c5:
            r3 = 4
            r16 = r14
            r15 = 4
            goto L_0x02cc
        L_0x02ca:
            r20 = r3
        L_0x02cc:
            int r3 = r15 + r17
            goto L_0x02d3
        L_0x02cf:
            r20 = r3
            r3 = r15
            r15 = r13
        L_0x02d3:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02d9
            r14 = 1
            goto L_0x02da
        L_0x02d9:
            r14 = 0
        L_0x02da:
            if (r15 >= r9) goto L_0x03d2
            int r15 = r15 * r8
            int r18 = r15 + r7
            r21 = r3
            int r3 = r18 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02e8
            r3 = r15
        L_0x02e8:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f19487c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0312
            r14 = r37
            r5 = r18
        L_0x02f6:
            r23 = r6
            if (r5 >= r3) goto L_0x03cb
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x0305
            r2[r5] = r6
            goto L_0x030c
        L_0x0305:
            if (r10 == 0) goto L_0x030c
            if (r14 != 0) goto L_0x030c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x030c:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f6
        L_0x0312:
            r23 = r6
            int r5 = r3 - r18
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r18
        L_0x031d:
            if (r6 >= r3) goto L_0x03cb
            r18 = r3
            int r3 = r1.f19487c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0332:
            int r8 = r0.f19526p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x0367
            byte[] r8 = r0.f19519i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0369
            if (r7 >= r5) goto L_0x0369
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f19511a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0362
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0362:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0332
        L_0x0367:
            r32 = r9
        L_0x0369:
            int r3 = r3 + r15
            r7 = r3
        L_0x036b:
            int r8 = r0.f19526p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x039c
            byte[] r8 = r0.f19519i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x039c
            if (r7 >= r5) goto L_0x039c
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f19511a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0399
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0399:
            int r7 = r7 + 1
            goto L_0x036b
        L_0x039c:
            if (r28 != 0) goto L_0x03a0
            r3 = 0
            goto L_0x03b2
        L_0x03a0:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b2:
            if (r3 == 0) goto L_0x03b7
            r2[r6] = r3
            goto L_0x03be
        L_0x03b7:
            if (r10 == 0) goto L_0x03be
            if (r14 != 0) goto L_0x03be
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03be:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r18
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x031d
        L_0x03cb:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e0
        L_0x03d2:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03e0:
            int r13 = r13 + 1
            r3 = r20
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a0
        L_0x03f2:
            r37 = r14
            java.lang.Boolean r2 = r0.f19529s
            if (r2 != 0) goto L_0x0406
            if (r37 != 0) goto L_0x03fc
            r11 = 0
            goto L_0x0400
        L_0x03fc:
            boolean r11 = r37.booleanValue()
        L_0x0400:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f19529s = r2
        L_0x0406:
            boolean r2 = r0.f19524n
            if (r2 == 0) goto L_0x042a
            int r1 = r1.f19491g
            if (r1 == 0) goto L_0x0411
            r2 = 1
            if (r1 != r2) goto L_0x042a
        L_0x0411:
            android.graphics.Bitmap r1 = r0.f19523m
            if (r1 != 0) goto L_0x041b
            android.graphics.Bitmap r1 = r35.h()
            r0.f19523m = r1
        L_0x041b:
            android.graphics.Bitmap r1 = r0.f19523m
            r3 = 0
            int r7 = r0.f19528r
            r5 = 0
            r6 = 0
            int r8 = r0.f19527q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x042a:
            android.graphics.Bitmap r9 = r35.h()
            r3 = 0
            int r7 = r0.f19528r
            r5 = 0
            r6 = 0
            int r8 = r0.f19527q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.j(j3.b, j3.b):android.graphics.Bitmap");
    }
}
