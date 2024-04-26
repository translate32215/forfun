package k8;

import androidx.appcompat.widget.p;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class i3 extends k6<i3, h3> implements n7 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final i3 zze;
    private boolean zzA;
    private String zzB = "";
    private long zzC;
    private int zzD;
    private String zzE = "";
    private String zzF = "";
    private boolean zzG;
    private q6<u2> zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private l3 zzT;
    private o6 zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private e3 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private q6<y2> zzi;
    private q6<r3> zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private int zzt;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private long zzx;
    private long zzy;
    private String zzz = "";

    static {
        i3 i3Var = new i3();
        zze = i3Var;
        k6.l(i3.class, i3Var);
    }

    public i3() {
        v7<Object> v7Var = v7.f20508d;
        this.zzi = v7Var;
        this.zzj = v7Var;
        this.zzH = v7Var;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = m6.f20325d;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
    }

    public static /* synthetic */ void A0(i3 i3Var, long j10) {
        i3Var.zzf |= 2;
        i3Var.zzk = j10;
    }

    public static /* synthetic */ void B0(i3 i3Var, long j10) {
        i3Var.zzf |= 4;
        i3Var.zzl = j10;
    }

    public static /* synthetic */ void C0(i3 i3Var, long j10) {
        i3Var.zzf |= 8;
        i3Var.zzm = j10;
    }

    public static /* synthetic */ void D0(i3 i3Var, long j10) {
        i3Var.zzf |= 16;
        i3Var.zzn = j10;
    }

    public static /* synthetic */ void E0(i3 i3Var) {
        i3Var.zzf &= -17;
        i3Var.zzn = 0;
    }

    public static /* synthetic */ void F0(i3 i3Var, long j10) {
        i3Var.zzf |= 32;
        i3Var.zzo = j10;
    }

    public static /* synthetic */ void G0(i3 i3Var) {
        i3Var.zzf &= -33;
        i3Var.zzo = 0;
    }

    public static /* synthetic */ void H0(i3 i3Var) {
        i3Var.zzf |= 64;
        i3Var.zzp = "android";
    }

    public static /* synthetic */ void I(i3 i3Var, long j10) {
        i3Var.zzf |= 1073741824;
        i3Var.zzO = j10;
    }

    public static /* synthetic */ void I0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 128;
        i3Var.zzq = str;
    }

    public static /* synthetic */ void J(i3 i3Var) {
        i3Var.zzf &= Integer.MAX_VALUE;
        i3Var.zzP = zze.zzP;
    }

    public static /* synthetic */ void J0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 256;
        i3Var.zzr = str;
    }

    public static /* synthetic */ void K(i3 i3Var, int i10) {
        i3Var.zzg |= 2;
        i3Var.zzR = i10;
    }

    public static /* synthetic */ void K0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 512;
        i3Var.zzs = str;
    }

    public static /* synthetic */ void L(i3 i3Var, int i10, y2 y2Var) {
        i3Var.S0();
        i3Var.zzi.set(i10, y2Var);
    }

    public static /* synthetic */ void L0(i3 i3Var, int i10) {
        i3Var.zzf |= 1024;
        i3Var.zzt = i10;
    }

    public static /* synthetic */ void M(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzg |= 4;
        i3Var.zzS = str;
    }

    public static /* synthetic */ void M0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 2048;
        i3Var.zzu = str;
    }

    public static void N(i3 i3Var, Iterable iterable) {
        o6 o6Var = i3Var.zzU;
        if (!((h5) o6Var).f20240a) {
            m6 m6Var = (m6) o6Var;
            int i10 = m6Var.f20327c;
            i3Var.zzU = m6Var.g(i10 == 0 ? 10 : i10 + i10);
        }
        g5.g(iterable, i3Var.zzU);
    }

    public static /* synthetic */ void N0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 4096;
        i3Var.zzv = str;
    }

    public static /* synthetic */ void O(i3 i3Var, y2 y2Var) {
        i3Var.S0();
        i3Var.zzi.add(y2Var);
    }

    public static /* synthetic */ void O0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 8192;
        i3Var.zzw = str;
    }

    public static /* synthetic */ void P(i3 i3Var, long j10) {
        i3Var.zzg |= 16;
        i3Var.zzV = j10;
    }

    public static /* synthetic */ void P0(i3 i3Var, long j10) {
        i3Var.zzf |= 16384;
        i3Var.zzx = j10;
    }

    public static /* synthetic */ void Q(i3 i3Var, long j10) {
        i3Var.zzg |= 32;
        i3Var.zzW = j10;
    }

    public static /* synthetic */ void Q0(i3 i3Var) {
        i3Var.zzf |= 32768;
        i3Var.zzy = 43042;
    }

    public static /* synthetic */ void S(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 65536;
        i3Var.zzz = str;
    }

    public static /* synthetic */ void T(i3 i3Var) {
        i3Var.zzf &= -65537;
        i3Var.zzz = zze.zzz;
    }

    public static /* synthetic */ void U(i3 i3Var, boolean z10) {
        i3Var.zzf |= 131072;
        i3Var.zzA = z10;
    }

    public static /* synthetic */ void V(i3 i3Var) {
        i3Var.zzf &= -131073;
        i3Var.zzA = false;
    }

    public static /* synthetic */ void W(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 262144;
        i3Var.zzB = str;
    }

    public static /* synthetic */ void X(i3 i3Var) {
        i3Var.zzf &= -262145;
        i3Var.zzB = zze.zzB;
    }

    public static /* synthetic */ void Y(i3 i3Var, long j10) {
        i3Var.zzf |= 524288;
        i3Var.zzC = j10;
    }

    public static /* synthetic */ void Z(i3 i3Var, int i10) {
        i3Var.zzf |= 1048576;
        i3Var.zzD = i10;
    }

    public static /* synthetic */ void a0(i3 i3Var, String str) {
        i3Var.zzf |= 2097152;
        i3Var.zzE = str;
    }

    public static /* synthetic */ void b0(i3 i3Var) {
        i3Var.zzf &= -2097153;
        i3Var.zzE = zze.zzE;
    }

    public static /* synthetic */ void c0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 4194304;
        i3Var.zzF = str;
    }

    public static /* synthetic */ void d0(i3 i3Var, boolean z10) {
        i3Var.zzf |= 8388608;
        i3Var.zzG = z10;
    }

    public static /* synthetic */ void e0(i3 i3Var, Iterable iterable) {
        q6<u2> q6Var = i3Var.zzH;
        if (!q6Var.e()) {
            i3Var.zzH = k6.j(q6Var);
        }
        g5.g(iterable, i3Var.zzH);
    }

    public static void f0(i3 i3Var) {
        i3Var.zzH = v7.f20508d;
    }

    public static /* synthetic */ void g0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzf |= 16777216;
        i3Var.zzI = str;
    }

    public static /* synthetic */ void h0(i3 i3Var, int i10) {
        i3Var.zzf |= 33554432;
        i3Var.zzJ = i10;
    }

    public static /* synthetic */ void i0(i3 i3Var) {
        i3Var.zzf |= 1;
        i3Var.zzh = 1;
    }

    public static /* synthetic */ void j0(i3 i3Var) {
        i3Var.zzf &= -268435457;
        i3Var.zzM = zze.zzM;
    }

    public static /* synthetic */ void k0(i3 i3Var, long j10) {
        i3Var.zzf |= 536870912;
        i3Var.zzN = j10;
    }

    public static /* synthetic */ void s0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzg |= 64;
        i3Var.zzX = str;
    }

    public static /* synthetic */ void t0(i3 i3Var, String str) {
        str.getClass();
        i3Var.zzg |= 128;
        i3Var.zzY = str;
    }

    public static /* synthetic */ void u0(i3 i3Var, Iterable iterable) {
        i3Var.S0();
        g5.g(iterable, i3Var.zzi);
    }

    public static void v0(i3 i3Var) {
        i3Var.zzi = v7.f20508d;
    }

    public static /* synthetic */ void w0(i3 i3Var, int i10) {
        i3Var.S0();
        i3Var.zzi.remove(i10);
    }

    public static /* synthetic */ void x0(i3 i3Var, int i10, r3 r3Var) {
        r3Var.getClass();
        i3Var.T0();
        i3Var.zzj.set(i10, r3Var);
    }

    public static /* synthetic */ void y0(i3 i3Var, r3 r3Var) {
        r3Var.getClass();
        i3Var.T0();
        i3Var.zzj.add(r3Var);
    }

    public static /* synthetic */ void z0(i3 i3Var, int i10) {
        i3Var.T0();
        i3Var.zzj.remove(i10);
    }

    public static h3 z1() {
        return (h3) zze.n();
    }

    public final String A() {
        return this.zzE;
    }

    public final String B() {
        return this.zzq;
    }

    public final r3 B1(int i10) {
        return this.zzj.get(i10);
    }

    public final String C() {
        return this.zzp;
    }

    public final String C1() {
        return this.zzS;
    }

    public final String D() {
        return this.zzz;
    }

    public final String D1() {
        return this.zzv;
    }

    public final String E() {
        return this.zzs;
    }

    public final String E1() {
        return this.zzB;
    }

    public final List<u2> F() {
        return this.zzH;
    }

    public final List<y2> G() {
        return this.zzi;
    }

    public final List<r3> H() {
        return this.zzj;
    }

    public final int R() {
        return this.zzJ;
    }

    public final int R0() {
        return this.zzD;
    }

    public final void S0() {
        q6<y2> q6Var = this.zzi;
        if (!q6Var.e()) {
            this.zzi = k6.j(q6Var);
        }
    }

    public final void T0() {
        q6<r3> q6Var = this.zzj;
        if (!q6Var.e()) {
            this.zzj = k6.j(q6Var);
        }
    }

    public final boolean U0() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean V0() {
        return (this.zzg & 16) != 0;
    }

    public final boolean W0() {
        return (this.zzf & 8) != 0;
    }

    public final boolean X0() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean Z0() {
        return (this.zzf & 32) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean b1() {
        return (this.zzf & 1) != 0;
    }

    public final boolean c1() {
        return (this.zzg & 2) != 0;
    }

    public final boolean d1() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean e1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean f1() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean g1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 32768) != 0;
    }

    public final int i1() {
        return this.zzi.size();
    }

    public final int j1() {
        return this.zzh;
    }

    public final int k1() {
        return this.zzR;
    }

    public final boolean l0() {
        return this.zzA;
    }

    public final int l1() {
        return this.zzt;
    }

    public final boolean m0() {
        return this.zzG;
    }

    public final int m1() {
        return this.zzj.size();
    }

    public final boolean n0() {
        return (this.zzf & 1073741824) != 0;
    }

    public final long n1() {
        return this.zzO;
    }

    public final boolean o0() {
        return (this.zzf & 33554432) != 0;
    }

    public final long o1() {
        return this.zzN;
    }

    public final boolean p0() {
        return (this.zzf & 1048576) != 0;
    }

    public final long p1() {
        return this.zzC;
    }

    public final boolean q0() {
        return (this.zzf & 536870912) != 0;
    }

    public final long q1() {
        return this.zzV;
    }

    public final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new w7(zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,", new Object[]{"zzf", "zzg", "zzh", "zzi", y2.class, "zzj", r3.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", u2.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", q2.f20433a, "zzaa", "zzab", "zzac", "zzad"});
        } else if (i11 == 3) {
            return new i3();
        } else {
            if (i11 == 4) {
                return new h3((p) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final boolean r0() {
        return (this.zzg & 128) != 0;
    }

    public final long r1() {
        return this.zzm;
    }

    public final String s() {
        return this.zzu;
    }

    public final long s1() {
        return this.zzx;
    }

    public final String t() {
        return this.zzw;
    }

    public final long t1() {
        return this.zzo;
    }

    public final String u() {
        return this.zzY;
    }

    public final long u1() {
        return this.zzn;
    }

    public final String v() {
        return this.zzr;
    }

    public final long v1() {
        return this.zzl;
    }

    public final String w() {
        return this.zzP;
    }

    public final long w1() {
        return this.zzk;
    }

    public final String x() {
        return this.zzI;
    }

    public final long x1() {
        return this.zzy;
    }

    public final String y() {
        return this.zzX;
    }

    public final y2 y1(int i10) {
        return this.zzi.get(i10);
    }

    public final String z() {
        return this.zzF;
    }
}
