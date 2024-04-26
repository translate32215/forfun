package t3;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState */
public final class q {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f25653g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f25654h;

    /* renamed from: i  reason: collision with root package name */
    public static final File f25655i = new File("/proc/self/fd");

    /* renamed from: j  reason: collision with root package name */
    public static volatile q f25656j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile int f25657k = -1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25658a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25659b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25660c;

    /* renamed from: d  reason: collision with root package name */
    public int f25661d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25662e = true;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f25663f = new AtomicBoolean(false);

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f25653g = i10 < 29;
        if (i10 < 26) {
            z10 = false;
        }
        f25654h = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0112, code lost:
        if (r2 == false) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q() {
        /*
            r21 = this;
            r0 = r21
            r21.<init>()
            r1 = 1
            r0.f25662e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f25663f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r6 = 14
            r7 = 13
            r8 = 12
            r9 = 11
            r10 = 10
            r11 = 9
            r12 = 8
            r13 = 7
            r14 = 6
            r15 = 5
            r16 = 4
            r17 = 3
            r18 = 2
            r19 = 16
            r5 = 17
            if (r2 == r4) goto L_0x0032
            goto L_0x009b
        L_0x0032:
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r4 = "SC-04J"
            r2[r3] = r4
            java.lang.String r4 = "SM-N935"
            r2[r1] = r4
            java.lang.String r4 = "SM-J720"
            r2[r18] = r4
            java.lang.String r4 = "SM-G570F"
            r2[r17] = r4
            java.lang.String r4 = "SM-G570M"
            r2[r16] = r4
            java.lang.String r4 = "SM-G960"
            r2[r15] = r4
            java.lang.String r4 = "SM-G965"
            r2[r14] = r4
            java.lang.String r4 = "SM-G935"
            r2[r13] = r4
            java.lang.String r4 = "SM-G930"
            r2[r12] = r4
            java.lang.String r4 = "SM-A520"
            r2[r11] = r4
            java.lang.String r4 = "SM-A720F"
            r2[r10] = r4
            java.lang.String r4 = "moto e5"
            r2[r9] = r4
            java.lang.String r4 = "moto e5 play"
            r2[r8] = r4
            java.lang.String r4 = "moto e5 plus"
            r2[r7] = r4
            java.lang.String r4 = "moto e5 cruise"
            r2[r6] = r4
            java.lang.String r4 = "moto g(6) forge"
            r20 = 15
            r2[r20] = r4
            java.lang.String r4 = "moto g(6) play"
            r2[r19] = r4
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0082:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x009b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L_0x0098
            r2 = 1
            goto L_0x009c
        L_0x0098:
            r5 = 17
            goto L_0x0082
        L_0x009b:
            r2 = 0
        L_0x009c:
            if (r2 != 0) goto L_0x0115
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L_0x00a6
            r2 = 0
            goto L_0x0112
        L_0x00a6:
            r2 = 21
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r4 = "LG-M250"
            r2[r3] = r4
            java.lang.String r4 = "LG-M320"
            r2[r1] = r4
            java.lang.String r4 = "LG-Q710AL"
            r2[r18] = r4
            java.lang.String r4 = "LG-Q710PL"
            r2[r17] = r4
            java.lang.String r4 = "LGM-K121K"
            r2[r16] = r4
            java.lang.String r4 = "LGM-K121L"
            r2[r15] = r4
            java.lang.String r4 = "LGM-K121S"
            r2[r14] = r4
            java.lang.String r4 = "LGM-X320K"
            r2[r13] = r4
            java.lang.String r4 = "LGM-X320L"
            r2[r12] = r4
            java.lang.String r4 = "LGM-X320S"
            r2[r11] = r4
            java.lang.String r4 = "LGM-X401L"
            r2[r10] = r4
            java.lang.String r4 = "LGM-X401S"
            r2[r9] = r4
            java.lang.String r4 = "LM-Q610.FG"
            r2[r8] = r4
            java.lang.String r4 = "LM-Q610.FGN"
            r2[r7] = r4
            java.lang.String r4 = "LM-Q617.FG"
            r2[r6] = r4
            java.lang.String r4 = "LM-Q617.FGN"
            r5 = 15
            r2[r5] = r4
            java.lang.String r4 = "LM-Q710.FG"
            r2[r19] = r4
            java.lang.String r4 = "LM-Q710.FGN"
            r5 = 17
            r2[r5] = r4
            r4 = 18
            java.lang.String r5 = "LM-X220PM"
            r2[r4] = r5
            r4 = 19
            java.lang.String r5 = "LM-X220QMA"
            r2[r4] = r5
            r4 = 20
            java.lang.String r5 = "LM-X410PM"
            r2[r4] = r5
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L_0x0112:
            if (r2 != 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r1 = 0
        L_0x0116:
            r0.f25658a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0125
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f25659b = r1
            r0.f25660c = r3
            goto L_0x012d
        L_0x0125:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f25659b = r1
            r1 = 128(0x80, float:1.794E-43)
            r0.f25660c = r1
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.q.<init>():void");
    }

    public static q a() {
        if (f25656j == null) {
            synchronized (q.class) {
                if (f25656j == null) {
                    f25656j = new q();
                }
            }
        }
        return f25656j;
    }

    public boolean b(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        int i12;
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f25658a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f25654h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else {
            if (f25653g && !this.f25663f.get()) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                }
                return false;
            } else if (z11) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                }
                return false;
            } else {
                int i13 = this.f25660c;
                if (i10 < i13) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                    }
                    return false;
                } else if (i11 < i13) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                    }
                    return false;
                } else {
                    synchronized (this) {
                        int i14 = this.f25661d + 1;
                        this.f25661d = i14;
                        if (i14 >= 50) {
                            this.f25661d = 0;
                            int length = f25655i.list().length;
                            if (f25657k != -1) {
                                i12 = f25657k;
                            } else {
                                i12 = this.f25659b;
                            }
                            long j10 = (long) i12;
                            boolean z13 = ((long) length) < j10;
                            this.f25662e = z13;
                            if (!z13 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j10);
                            }
                        }
                        z12 = this.f25662e;
                    }
                    if (z12) {
                        return true;
                    }
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    }
                    return false;
                }
            }
        }
    }
}
