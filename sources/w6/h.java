package w6;

import a5.d;
import a5.f;
import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import c1.c;
import c5.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import m3.t;
import p5.i;
import p5.j;
import p5.k;
import p5.l;
import p5.n;
import p5.p;
import v6.e0;
import w6.n;
import w6.s;
import x4.b0;
import x4.m;
import x4.x0;

/* compiled from: MediaCodecVideoRenderer */
public class h extends l {
    public static final int[] H1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean I1;
    public static boolean J1;
    public int A1;
    public int B1;
    public float C1;
    public boolean D1;
    public int E1 = 0;
    public b F1;
    public m G1;
    public final Context V0;
    public final n W0;
    public final s.a X0;
    public final long Y0;
    public final int Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final boolean f27056a1 = "NVIDIA".equals(e0.f26438c);

    /* renamed from: b1  reason: collision with root package name */
    public a f27057b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f27058c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f27059d1;

    /* renamed from: e1  reason: collision with root package name */
    public Surface f27060e1;

    /* renamed from: f1  reason: collision with root package name */
    public Surface f27061f1;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f27062g1;

    /* renamed from: h1  reason: collision with root package name */
    public int f27063h1 = 1;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f27064i1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f27065j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f27066k1;

    /* renamed from: l1  reason: collision with root package name */
    public long f27067l1;

    /* renamed from: m1  reason: collision with root package name */
    public long f27068m1 = -9223372036854775807L;

    /* renamed from: n1  reason: collision with root package name */
    public long f27069n1;

    /* renamed from: o1  reason: collision with root package name */
    public int f27070o1;

    /* renamed from: p1  reason: collision with root package name */
    public int f27071p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f27072q1;

    /* renamed from: r1  reason: collision with root package name */
    public long f27073r1;

    /* renamed from: s1  reason: collision with root package name */
    public long f27074s1;

    /* renamed from: t1  reason: collision with root package name */
    public long f27075t1;

    /* renamed from: u1  reason: collision with root package name */
    public int f27076u1;

    /* renamed from: v1  reason: collision with root package name */
    public int f27077v1 = -1;

    /* renamed from: w1  reason: collision with root package name */
    public int f27078w1 = -1;

    /* renamed from: x1  reason: collision with root package name */
    public int f27079x1;

    /* renamed from: y1  reason: collision with root package name */
    public float f27080y1 = -1.0f;

    /* renamed from: z1  reason: collision with root package name */
    public int f27081z1;

    /* compiled from: MediaCodecVideoRenderer */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f27082a;

        /* renamed from: b  reason: collision with root package name */
        public final int f27083b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27084c;

        public a(int i10, int i11, int i12) {
            this.f27082a = i10;
            this.f27083b = i11;
            this.f27084c = i12;
        }
    }

    /* compiled from: MediaCodecVideoRenderer */
    public final class b implements i.b, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f27085a;

        public b(i iVar) {
            Handler m10 = e0.m(this);
            this.f27085a = m10;
            iVar.k(this, m10);
        }

        public final void a(long j10) {
            h hVar = h.this;
            if (this == hVar.F1) {
                if (j10 == Long.MAX_VALUE) {
                    hVar.L0 = true;
                    return;
                }
                try {
                    hVar.Q0(j10);
                } catch (m e10) {
                    h.this.P0 = e10;
                }
            }
        }

        public void b(i iVar, long j10, long j11) {
            if (e0.f26436a < 30) {
                this.f27085a.sendMessageAtFrontOfQueue(Message.obtain(this.f27085a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            a(j10);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a((e0.W(message.arg1) << 32) | e0.W(message.arg2));
            return true;
        }
    }

    public h(Context context, n nVar, long j10, boolean z10, Handler handler, s sVar, int i10) {
        super(2, i.a.f23876a, nVar, z10, 30.0f);
        this.Y0 = j10;
        this.Z0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.V0 = applicationContext;
        this.W0 = new n(applicationContext);
        this.X0 = new s.a(handler, sVar);
        E0();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07cf, code lost:
        if (r0.equals("NX573J") == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0831, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0829;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x084d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean G0() {
        /*
            int r0 = v6.e0.f26436a
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 28
            r6 = 2
            r7 = -1
            r8 = 0
            r9 = 1
            if (r0 > r5) goto L_0x006d
            java.lang.String r10 = v6.e0.f26437b
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1339091551: goto L_0x005e;
                case -1220081023: goto L_0x0053;
                case -1220066608: goto L_0x0048;
                case -1012436106: goto L_0x003d;
                case -64886864: goto L_0x0032;
                case 3415681: goto L_0x0027;
                case 825323514: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            r10 = -1
            goto L_0x0068
        L_0x001c:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0025
            goto L_0x001a
        L_0x0025:
            r10 = 6
            goto L_0x0068
        L_0x0027:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0030
            goto L_0x001a
        L_0x0030:
            r10 = 5
            goto L_0x0068
        L_0x0032:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x003b
            goto L_0x001a
        L_0x003b:
            r10 = 4
            goto L_0x0068
        L_0x003d:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0046
            goto L_0x001a
        L_0x0046:
            r10 = 3
            goto L_0x0068
        L_0x0048:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0051
            goto L_0x001a
        L_0x0051:
            r10 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x005c
            goto L_0x001a
        L_0x005c:
            r10 = 1
            goto L_0x0068
        L_0x005e:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0067
            goto L_0x001a
        L_0x0067:
            r10 = 0
        L_0x0068:
            switch(r10) {
                case 0: goto L_0x006c;
                case 1: goto L_0x006c;
                case 2: goto L_0x006c;
                case 3: goto L_0x006c;
                case 4: goto L_0x006c;
                case 5: goto L_0x006c;
                case 6: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x006d
        L_0x006c:
            return r9
        L_0x006d:
            r10 = 27
            if (r0 > r10) goto L_0x007c
            java.lang.String r11 = v6.e0.f26437b
            java.lang.String r12 = "HWEML"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x007c
            return r9
        L_0x007c:
            r11 = 26
            if (r0 > r11) goto L_0x084e
            java.lang.String r0 = v6.e0.f26437b
            r0.getClass()
            int r12 = r0.hashCode()
            switch(r12) {
                case -2144781245: goto L_0x080f;
                case -2144781185: goto L_0x0803;
                case -2144781160: goto L_0x07f7;
                case -2097309513: goto L_0x07eb;
                case -2022874474: goto L_0x07df;
                case -1978993182: goto L_0x07d3;
                case -1978990237: goto L_0x07c9;
                case -1936688988: goto L_0x07bd;
                case -1936688066: goto L_0x07b0;
                case -1936688065: goto L_0x07a2;
                case -1931988508: goto L_0x0794;
                case -1885099851: goto L_0x0786;
                case -1696512866: goto L_0x0778;
                case -1680025915: goto L_0x076a;
                case -1615810839: goto L_0x075c;
                case -1600724499: goto L_0x074e;
                case -1554255044: goto L_0x0740;
                case -1481772737: goto L_0x0732;
                case -1481772730: goto L_0x0724;
                case -1481772729: goto L_0x0716;
                case -1320080169: goto L_0x0708;
                case -1217592143: goto L_0x06fa;
                case -1180384755: goto L_0x06ec;
                case -1139198265: goto L_0x06de;
                case -1052835013: goto L_0x06d0;
                case -993250464: goto L_0x06c2;
                case -993250458: goto L_0x06b4;
                case -965403638: goto L_0x06a6;
                case -958336948: goto L_0x0698;
                case -879245230: goto L_0x068a;
                case -842500323: goto L_0x067c;
                case -821392978: goto L_0x066e;
                case -797483286: goto L_0x0660;
                case -794946968: goto L_0x0652;
                case -788334647: goto L_0x0644;
                case -782144577: goto L_0x0636;
                case -575125681: goto L_0x0628;
                case -521118391: goto L_0x061a;
                case -430914369: goto L_0x060c;
                case -290434366: goto L_0x05fe;
                case -282781963: goto L_0x05f0;
                case -277133239: goto L_0x05e2;
                case -173639913: goto L_0x05d4;
                case -56598463: goto L_0x05c6;
                case 2126: goto L_0x05b8;
                case 2564: goto L_0x05aa;
                case 2715: goto L_0x059c;
                case 2719: goto L_0x058e;
                case 3091: goto L_0x0580;
                case 3483: goto L_0x0572;
                case 73405: goto L_0x0564;
                case 75537: goto L_0x0556;
                case 75739: goto L_0x0548;
                case 76779: goto L_0x053a;
                case 78669: goto L_0x052c;
                case 79305: goto L_0x051e;
                case 80618: goto L_0x0510;
                case 88274: goto L_0x0502;
                case 98846: goto L_0x04f4;
                case 98848: goto L_0x04e6;
                case 99329: goto L_0x04d8;
                case 101481: goto L_0x04ca;
                case 1513190: goto L_0x04bc;
                case 1514184: goto L_0x04ae;
                case 1514185: goto L_0x04a0;
                case 2133089: goto L_0x0492;
                case 2133091: goto L_0x0484;
                case 2133120: goto L_0x0476;
                case 2133151: goto L_0x0468;
                case 2133182: goto L_0x045a;
                case 2133184: goto L_0x044c;
                case 2436959: goto L_0x043e;
                case 2463773: goto L_0x0430;
                case 2464648: goto L_0x0422;
                case 2689555: goto L_0x0414;
                case 3154429: goto L_0x0406;
                case 3284551: goto L_0x03f8;
                case 3351335: goto L_0x03ea;
                case 3386211: goto L_0x03dc;
                case 41325051: goto L_0x03ce;
                case 51349633: goto L_0x03c0;
                case 51350594: goto L_0x03b2;
                case 55178625: goto L_0x03a4;
                case 61542055: goto L_0x0396;
                case 65355429: goto L_0x0388;
                case 66214468: goto L_0x037a;
                case 66214470: goto L_0x036c;
                case 66214473: goto L_0x035e;
                case 66215429: goto L_0x0350;
                case 66215431: goto L_0x0342;
                case 66215433: goto L_0x0334;
                case 66216390: goto L_0x0326;
                case 76402249: goto L_0x0318;
                case 76404105: goto L_0x030a;
                case 76404911: goto L_0x02fc;
                case 80963634: goto L_0x02ee;
                case 82882791: goto L_0x02e0;
                case 98715550: goto L_0x02d2;
                case 101370885: goto L_0x02c4;
                case 102844228: goto L_0x02b6;
                case 165221241: goto L_0x02a8;
                case 182191441: goto L_0x029a;
                case 245388979: goto L_0x028c;
                case 287431619: goto L_0x027e;
                case 307593612: goto L_0x0270;
                case 308517133: goto L_0x0262;
                case 316215098: goto L_0x0254;
                case 316215116: goto L_0x0246;
                case 316246811: goto L_0x0238;
                case 316246818: goto L_0x022a;
                case 407160593: goto L_0x021c;
                case 507412548: goto L_0x020e;
                case 793982701: goto L_0x0200;
                case 794038622: goto L_0x01f2;
                case 794040393: goto L_0x01e4;
                case 835649806: goto L_0x01d6;
                case 917340916: goto L_0x01c8;
                case 958008161: goto L_0x01ba;
                case 1060579533: goto L_0x01ac;
                case 1150207623: goto L_0x019e;
                case 1176899427: goto L_0x0190;
                case 1280332038: goto L_0x0182;
                case 1306947716: goto L_0x0174;
                case 1349174697: goto L_0x0166;
                case 1522194893: goto L_0x0158;
                case 1691543273: goto L_0x014a;
                case 1691544261: goto L_0x013c;
                case 1709443163: goto L_0x012e;
                case 1865889110: goto L_0x0120;
                case 1906253259: goto L_0x0112;
                case 1977196784: goto L_0x0104;
                case 2006372676: goto L_0x00f7;
                case 2019281702: goto L_0x00ea;
                case 2029784656: goto L_0x00dd;
                case 2030379515: goto L_0x00d0;
                case 2033393791: goto L_0x00c3;
                case 2047190025: goto L_0x00b6;
                case 2047252157: goto L_0x00a9;
                case 2048319463: goto L_0x009c;
                case 2048855701: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r1 = -1
            goto L_0x081a
        L_0x008f:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0098
            goto L_0x008c
        L_0x0098:
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x081a
        L_0x009c:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x008c
        L_0x00a5:
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x081a
        L_0x00a9:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b2
            goto L_0x008c
        L_0x00b2:
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x081a
        L_0x00b6:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bf
            goto L_0x008c
        L_0x00bf:
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x081a
        L_0x00c3:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cc
            goto L_0x008c
        L_0x00cc:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x081a
        L_0x00d0:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d9
            goto L_0x008c
        L_0x00d9:
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x081a
        L_0x00dd:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e6
            goto L_0x008c
        L_0x00e6:
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x081a
        L_0x00ea:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f3
            goto L_0x008c
        L_0x00f3:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x081a
        L_0x00f7:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0100
            goto L_0x008c
        L_0x0100:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x081a
        L_0x0104:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010e
            goto L_0x008c
        L_0x010e:
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x081a
        L_0x0112:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011c
            goto L_0x008c
        L_0x011c:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x081a
        L_0x0120:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012a
            goto L_0x008c
        L_0x012a:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x081a
        L_0x012e:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0138
            goto L_0x008c
        L_0x0138:
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x081a
        L_0x013c:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0146
            goto L_0x008c
        L_0x0146:
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x081a
        L_0x014a:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0154
            goto L_0x008c
        L_0x0154:
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x081a
        L_0x0158:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0162
            goto L_0x008c
        L_0x0162:
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x081a
        L_0x0166:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0170
            goto L_0x008c
        L_0x0170:
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x081a
        L_0x0174:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017e
            goto L_0x008c
        L_0x017e:
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x081a
        L_0x0182:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018c
            goto L_0x008c
        L_0x018c:
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x081a
        L_0x0190:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019a
            goto L_0x008c
        L_0x019a:
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x081a
        L_0x019e:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a8
            goto L_0x008c
        L_0x01a8:
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x081a
        L_0x01ac:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b6
            goto L_0x008c
        L_0x01b6:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x081a
        L_0x01ba:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c4
            goto L_0x008c
        L_0x01c4:
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x081a
        L_0x01c8:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d2
            goto L_0x008c
        L_0x01d2:
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x081a
        L_0x01d6:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01e0
            goto L_0x008c
        L_0x01e0:
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x081a
        L_0x01e4:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ee
            goto L_0x008c
        L_0x01ee:
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x081a
        L_0x01f2:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01fc
            goto L_0x008c
        L_0x01fc:
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x081a
        L_0x0200:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x020a
            goto L_0x008c
        L_0x020a:
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x081a
        L_0x020e:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0218
            goto L_0x008c
        L_0x0218:
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x081a
        L_0x021c:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0226
            goto L_0x008c
        L_0x0226:
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x081a
        L_0x022a:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0234
            goto L_0x008c
        L_0x0234:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x081a
        L_0x0238:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0242
            goto L_0x008c
        L_0x0242:
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x081a
        L_0x0246:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0250
            goto L_0x008c
        L_0x0250:
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x081a
        L_0x0254:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025e
            goto L_0x008c
        L_0x025e:
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x081a
        L_0x0262:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x026c
            goto L_0x008c
        L_0x026c:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x081a
        L_0x0270:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x027a
            goto L_0x008c
        L_0x027a:
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x081a
        L_0x027e:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0288
            goto L_0x008c
        L_0x0288:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x081a
        L_0x028c:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0296
            goto L_0x008c
        L_0x0296:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x081a
        L_0x029a:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a4
            goto L_0x008c
        L_0x02a4:
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x081a
        L_0x02a8:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b2
            goto L_0x008c
        L_0x02b2:
            r1 = 100
            goto L_0x081a
        L_0x02b6:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02c0
            goto L_0x008c
        L_0x02c0:
            r1 = 99
            goto L_0x081a
        L_0x02c4:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ce
            goto L_0x008c
        L_0x02ce:
            r1 = 98
            goto L_0x081a
        L_0x02d2:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02dc
            goto L_0x008c
        L_0x02dc:
            r1 = 97
            goto L_0x081a
        L_0x02e0:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ea
            goto L_0x008c
        L_0x02ea:
            r1 = 96
            goto L_0x081a
        L_0x02ee:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f8
            goto L_0x008c
        L_0x02f8:
            r1 = 95
            goto L_0x081a
        L_0x02fc:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0306
            goto L_0x008c
        L_0x0306:
            r1 = 94
            goto L_0x081a
        L_0x030a:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0314
            goto L_0x008c
        L_0x0314:
            r1 = 93
            goto L_0x081a
        L_0x0318:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0322
            goto L_0x008c
        L_0x0322:
            r1 = 92
            goto L_0x081a
        L_0x0326:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0330
            goto L_0x008c
        L_0x0330:
            r1 = 91
            goto L_0x081a
        L_0x0334:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x033e
            goto L_0x008c
        L_0x033e:
            r1 = 90
            goto L_0x081a
        L_0x0342:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034c
            goto L_0x008c
        L_0x034c:
            r1 = 89
            goto L_0x081a
        L_0x0350:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x035a
            goto L_0x008c
        L_0x035a:
            r1 = 88
            goto L_0x081a
        L_0x035e:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0368
            goto L_0x008c
        L_0x0368:
            r1 = 87
            goto L_0x081a
        L_0x036c:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0376
            goto L_0x008c
        L_0x0376:
            r1 = 86
            goto L_0x081a
        L_0x037a:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0384
            goto L_0x008c
        L_0x0384:
            r1 = 85
            goto L_0x081a
        L_0x0388:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0392
            goto L_0x008c
        L_0x0392:
            r1 = 84
            goto L_0x081a
        L_0x0396:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a0
            goto L_0x008c
        L_0x03a0:
            r1 = 83
            goto L_0x081a
        L_0x03a4:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ae
            goto L_0x008c
        L_0x03ae:
            r1 = 82
            goto L_0x081a
        L_0x03b2:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03bc
            goto L_0x008c
        L_0x03bc:
            r1 = 81
            goto L_0x081a
        L_0x03c0:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ca
            goto L_0x008c
        L_0x03ca:
            r1 = 80
            goto L_0x081a
        L_0x03ce:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d8
            goto L_0x008c
        L_0x03d8:
            r1 = 79
            goto L_0x081a
        L_0x03dc:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03e6
            goto L_0x008c
        L_0x03e6:
            r1 = 78
            goto L_0x081a
        L_0x03ea:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03f4
            goto L_0x008c
        L_0x03f4:
            r1 = 77
            goto L_0x081a
        L_0x03f8:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0402
            goto L_0x008c
        L_0x0402:
            r1 = 76
            goto L_0x081a
        L_0x0406:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0410
            goto L_0x008c
        L_0x0410:
            r1 = 75
            goto L_0x081a
        L_0x0414:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x041e
            goto L_0x008c
        L_0x041e:
            r1 = 74
            goto L_0x081a
        L_0x0422:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x042c
            goto L_0x008c
        L_0x042c:
            r1 = 73
            goto L_0x081a
        L_0x0430:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x043a
            goto L_0x008c
        L_0x043a:
            r1 = 72
            goto L_0x081a
        L_0x043e:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0448
            goto L_0x008c
        L_0x0448:
            r1 = 71
            goto L_0x081a
        L_0x044c:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0456
            goto L_0x008c
        L_0x0456:
            r1 = 70
            goto L_0x081a
        L_0x045a:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0464
            goto L_0x008c
        L_0x0464:
            r1 = 69
            goto L_0x081a
        L_0x0468:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0472
            goto L_0x008c
        L_0x0472:
            r1 = 68
            goto L_0x081a
        L_0x0476:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0480
            goto L_0x008c
        L_0x0480:
            r1 = 67
            goto L_0x081a
        L_0x0484:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048e
            goto L_0x008c
        L_0x048e:
            r1 = 66
            goto L_0x081a
        L_0x0492:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x049c
            goto L_0x008c
        L_0x049c:
            r1 = 65
            goto L_0x081a
        L_0x04a0:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04aa
            goto L_0x008c
        L_0x04aa:
            r1 = 64
            goto L_0x081a
        L_0x04ae:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b8
            goto L_0x008c
        L_0x04b8:
            r1 = 63
            goto L_0x081a
        L_0x04bc:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04c6
            goto L_0x008c
        L_0x04c6:
            r1 = 62
            goto L_0x081a
        L_0x04ca:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d4
            goto L_0x008c
        L_0x04d4:
            r1 = 61
            goto L_0x081a
        L_0x04d8:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e2
            goto L_0x008c
        L_0x04e2:
            r1 = 60
            goto L_0x081a
        L_0x04e6:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f0
            goto L_0x008c
        L_0x04f0:
            r1 = 59
            goto L_0x081a
        L_0x04f4:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04fe
            goto L_0x008c
        L_0x04fe:
            r1 = 58
            goto L_0x081a
        L_0x0502:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x050c
            goto L_0x008c
        L_0x050c:
            r1 = 57
            goto L_0x081a
        L_0x0510:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x051a
            goto L_0x008c
        L_0x051a:
            r1 = 56
            goto L_0x081a
        L_0x051e:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0528
            goto L_0x008c
        L_0x0528:
            r1 = 55
            goto L_0x081a
        L_0x052c:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0536
            goto L_0x008c
        L_0x0536:
            r1 = 54
            goto L_0x081a
        L_0x053a:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0544
            goto L_0x008c
        L_0x0544:
            r1 = 53
            goto L_0x081a
        L_0x0548:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0552
            goto L_0x008c
        L_0x0552:
            r1 = 52
            goto L_0x081a
        L_0x0556:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0560
            goto L_0x008c
        L_0x0560:
            r1 = 51
            goto L_0x081a
        L_0x0564:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x056e
            goto L_0x008c
        L_0x056e:
            r1 = 50
            goto L_0x081a
        L_0x0572:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057c
            goto L_0x008c
        L_0x057c:
            r1 = 49
            goto L_0x081a
        L_0x0580:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058a
            goto L_0x008c
        L_0x058a:
            r1 = 48
            goto L_0x081a
        L_0x058e:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0598
            goto L_0x008c
        L_0x0598:
            r1 = 47
            goto L_0x081a
        L_0x059c:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05a6
            goto L_0x008c
        L_0x05a6:
            r1 = 46
            goto L_0x081a
        L_0x05aa:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05b4
            goto L_0x008c
        L_0x05b4:
            r1 = 45
            goto L_0x081a
        L_0x05b8:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c2
            goto L_0x008c
        L_0x05c2:
            r1 = 44
            goto L_0x081a
        L_0x05c6:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05d0
            goto L_0x008c
        L_0x05d0:
            r1 = 43
            goto L_0x081a
        L_0x05d4:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05de
            goto L_0x008c
        L_0x05de:
            r1 = 42
            goto L_0x081a
        L_0x05e2:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05ec
            goto L_0x008c
        L_0x05ec:
            r1 = 41
            goto L_0x081a
        L_0x05f0:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05fa
            goto L_0x008c
        L_0x05fa:
            r1 = 40
            goto L_0x081a
        L_0x05fe:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0608
            goto L_0x008c
        L_0x0608:
            r1 = 39
            goto L_0x081a
        L_0x060c:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0616
            goto L_0x008c
        L_0x0616:
            r1 = 38
            goto L_0x081a
        L_0x061a:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0624
            goto L_0x008c
        L_0x0624:
            r1 = 37
            goto L_0x081a
        L_0x0628:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0632
            goto L_0x008c
        L_0x0632:
            r1 = 36
            goto L_0x081a
        L_0x0636:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0640
            goto L_0x008c
        L_0x0640:
            r1 = 35
            goto L_0x081a
        L_0x0644:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x064e
            goto L_0x008c
        L_0x064e:
            r1 = 34
            goto L_0x081a
        L_0x0652:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x065c
            goto L_0x008c
        L_0x065c:
            r1 = 33
            goto L_0x081a
        L_0x0660:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x066a
            goto L_0x008c
        L_0x066a:
            r1 = 32
            goto L_0x081a
        L_0x066e:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0678
            goto L_0x008c
        L_0x0678:
            r1 = 31
            goto L_0x081a
        L_0x067c:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0686
            goto L_0x008c
        L_0x0686:
            r1 = 30
            goto L_0x081a
        L_0x068a:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0694
            goto L_0x008c
        L_0x0694:
            r1 = 29
            goto L_0x081a
        L_0x0698:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06a2
            goto L_0x008c
        L_0x06a2:
            r1 = 28
            goto L_0x081a
        L_0x06a6:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06b0
            goto L_0x008c
        L_0x06b0:
            r1 = 27
            goto L_0x081a
        L_0x06b4:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06be
            goto L_0x008c
        L_0x06be:
            r1 = 26
            goto L_0x081a
        L_0x06c2:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06cc
            goto L_0x008c
        L_0x06cc:
            r1 = 25
            goto L_0x081a
        L_0x06d0:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06da
            goto L_0x008c
        L_0x06da:
            r1 = 24
            goto L_0x081a
        L_0x06de:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06e8
            goto L_0x008c
        L_0x06e8:
            r1 = 23
            goto L_0x081a
        L_0x06ec:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06f6
            goto L_0x008c
        L_0x06f6:
            r1 = 22
            goto L_0x081a
        L_0x06fa:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0704
            goto L_0x008c
        L_0x0704:
            r1 = 21
            goto L_0x081a
        L_0x0708:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0712
            goto L_0x008c
        L_0x0712:
            r1 = 20
            goto L_0x081a
        L_0x0716:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0720
            goto L_0x008c
        L_0x0720:
            r1 = 19
            goto L_0x081a
        L_0x0724:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x072e
            goto L_0x008c
        L_0x072e:
            r1 = 18
            goto L_0x081a
        L_0x0732:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x073c
            goto L_0x008c
        L_0x073c:
            r1 = 17
            goto L_0x081a
        L_0x0740:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x074a
            goto L_0x008c
        L_0x074a:
            r1 = 16
            goto L_0x081a
        L_0x074e:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0758
            goto L_0x008c
        L_0x0758:
            r1 = 15
            goto L_0x081a
        L_0x075c:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0766
            goto L_0x008c
        L_0x0766:
            r1 = 14
            goto L_0x081a
        L_0x076a:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0774
            goto L_0x008c
        L_0x0774:
            r1 = 13
            goto L_0x081a
        L_0x0778:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0782
            goto L_0x008c
        L_0x0782:
            r1 = 12
            goto L_0x081a
        L_0x0786:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0790
            goto L_0x008c
        L_0x0790:
            r1 = 11
            goto L_0x081a
        L_0x0794:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x079e
            goto L_0x008c
        L_0x079e:
            r1 = 10
            goto L_0x081a
        L_0x07a2:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ac
            goto L_0x008c
        L_0x07ac:
            r1 = 9
            goto L_0x081a
        L_0x07b0:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ba
            goto L_0x008c
        L_0x07ba:
            r1 = 8
            goto L_0x081a
        L_0x07bd:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07c7
            goto L_0x008c
        L_0x07c7:
            r1 = 7
            goto L_0x081a
        L_0x07c9:
            java.lang.String r2 = "NX573J"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x081a
            goto L_0x008c
        L_0x07d3:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07dd
            goto L_0x008c
        L_0x07dd:
            r1 = 5
            goto L_0x081a
        L_0x07df:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07e9
            goto L_0x008c
        L_0x07e9:
            r1 = 4
            goto L_0x081a
        L_0x07eb:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07f5
            goto L_0x008c
        L_0x07f5:
            r1 = 3
            goto L_0x081a
        L_0x07f7:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0801
            goto L_0x008c
        L_0x0801:
            r1 = 2
            goto L_0x081a
        L_0x0803:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x080d
            goto L_0x008c
        L_0x080d:
            r1 = 1
            goto L_0x081a
        L_0x080f:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0819
            goto L_0x008c
        L_0x0819:
            r1 = 0
        L_0x081a:
            switch(r1) {
                case 0: goto L_0x084d;
                case 1: goto L_0x084d;
                case 2: goto L_0x084d;
                case 3: goto L_0x084d;
                case 4: goto L_0x084d;
                case 5: goto L_0x084d;
                case 6: goto L_0x084d;
                case 7: goto L_0x084d;
                case 8: goto L_0x084d;
                case 9: goto L_0x084d;
                case 10: goto L_0x084d;
                case 11: goto L_0x084d;
                case 12: goto L_0x084d;
                case 13: goto L_0x084d;
                case 14: goto L_0x084d;
                case 15: goto L_0x084d;
                case 16: goto L_0x084d;
                case 17: goto L_0x084d;
                case 18: goto L_0x084d;
                case 19: goto L_0x084d;
                case 20: goto L_0x084d;
                case 21: goto L_0x084d;
                case 22: goto L_0x084d;
                case 23: goto L_0x084d;
                case 24: goto L_0x084d;
                case 25: goto L_0x084d;
                case 26: goto L_0x084d;
                case 27: goto L_0x084d;
                case 28: goto L_0x084d;
                case 29: goto L_0x084d;
                case 30: goto L_0x084d;
                case 31: goto L_0x084d;
                case 32: goto L_0x084d;
                case 33: goto L_0x084d;
                case 34: goto L_0x084d;
                case 35: goto L_0x084d;
                case 36: goto L_0x084d;
                case 37: goto L_0x084d;
                case 38: goto L_0x084d;
                case 39: goto L_0x084d;
                case 40: goto L_0x084d;
                case 41: goto L_0x084d;
                case 42: goto L_0x084d;
                case 43: goto L_0x084d;
                case 44: goto L_0x084d;
                case 45: goto L_0x084d;
                case 46: goto L_0x084d;
                case 47: goto L_0x084d;
                case 48: goto L_0x084d;
                case 49: goto L_0x084d;
                case 50: goto L_0x084d;
                case 51: goto L_0x084d;
                case 52: goto L_0x084d;
                case 53: goto L_0x084d;
                case 54: goto L_0x084d;
                case 55: goto L_0x084d;
                case 56: goto L_0x084d;
                case 57: goto L_0x084d;
                case 58: goto L_0x084d;
                case 59: goto L_0x084d;
                case 60: goto L_0x084d;
                case 61: goto L_0x084d;
                case 62: goto L_0x084d;
                case 63: goto L_0x084d;
                case 64: goto L_0x084d;
                case 65: goto L_0x084d;
                case 66: goto L_0x084d;
                case 67: goto L_0x084d;
                case 68: goto L_0x084d;
                case 69: goto L_0x084d;
                case 70: goto L_0x084d;
                case 71: goto L_0x084d;
                case 72: goto L_0x084d;
                case 73: goto L_0x084d;
                case 74: goto L_0x084d;
                case 75: goto L_0x084d;
                case 76: goto L_0x084d;
                case 77: goto L_0x084d;
                case 78: goto L_0x084d;
                case 79: goto L_0x084d;
                case 80: goto L_0x084d;
                case 81: goto L_0x084d;
                case 82: goto L_0x084d;
                case 83: goto L_0x084d;
                case 84: goto L_0x084d;
                case 85: goto L_0x084d;
                case 86: goto L_0x084d;
                case 87: goto L_0x084d;
                case 88: goto L_0x084d;
                case 89: goto L_0x084d;
                case 90: goto L_0x084d;
                case 91: goto L_0x084d;
                case 92: goto L_0x084d;
                case 93: goto L_0x084d;
                case 94: goto L_0x084d;
                case 95: goto L_0x084d;
                case 96: goto L_0x084d;
                case 97: goto L_0x084d;
                case 98: goto L_0x084d;
                case 99: goto L_0x084d;
                case 100: goto L_0x084d;
                case 101: goto L_0x084d;
                case 102: goto L_0x084d;
                case 103: goto L_0x084d;
                case 104: goto L_0x084d;
                case 105: goto L_0x084d;
                case 106: goto L_0x084d;
                case 107: goto L_0x084d;
                case 108: goto L_0x084d;
                case 109: goto L_0x084d;
                case 110: goto L_0x084d;
                case 111: goto L_0x084d;
                case 112: goto L_0x084d;
                case 113: goto L_0x084d;
                case 114: goto L_0x084d;
                case 115: goto L_0x084d;
                case 116: goto L_0x084d;
                case 117: goto L_0x084d;
                case 118: goto L_0x084d;
                case 119: goto L_0x084d;
                case 120: goto L_0x084d;
                case 121: goto L_0x084d;
                case 122: goto L_0x084d;
                case 123: goto L_0x084d;
                case 124: goto L_0x084d;
                case 125: goto L_0x084d;
                case 126: goto L_0x084d;
                case 127: goto L_0x084d;
                case 128: goto L_0x084d;
                case 129: goto L_0x084d;
                case 130: goto L_0x084d;
                case 131: goto L_0x084d;
                case 132: goto L_0x084d;
                case 133: goto L_0x084d;
                case 134: goto L_0x084d;
                case 135: goto L_0x084d;
                case 136: goto L_0x084d;
                case 137: goto L_0x084d;
                case 138: goto L_0x084d;
                case 139: goto L_0x084d;
                default: goto L_0x081d;
            }
        L_0x081d:
            java.lang.String r0 = v6.e0.f26439d
            r0.getClass()
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x083f;
                case 2006354: goto L_0x0834;
                case 2006367: goto L_0x082b;
                default: goto L_0x0829;
            }
        L_0x0829:
            r6 = -1
            goto L_0x0849
        L_0x082b:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0849
            goto L_0x0829
        L_0x0834:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x083d
            goto L_0x0829
        L_0x083d:
            r6 = 1
            goto L_0x0849
        L_0x083f:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0848
            goto L_0x0829
        L_0x0848:
            r6 = 0
        L_0x0849:
            switch(r6) {
                case 0: goto L_0x084d;
                case 1: goto L_0x084d;
                case 2: goto L_0x084d;
                default: goto L_0x084c;
            }
        L_0x084c:
            goto L_0x084e
        L_0x084d:
            return r9
        L_0x084e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.h.G0():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        return (r7 * 3) / (r2 * 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int H0(p5.k r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto L_0x00ad
            if (r8 != r0) goto L_0x0007
            goto L_0x00ad
        L_0x0007:
            r6.getClass()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1851077871: goto L_0x0058;
                case -1664118616: goto L_0x004d;
                case -1662541442: goto L_0x0042;
                case 1187890754: goto L_0x0037;
                case 1331836730: goto L_0x002c;
                case 1599127256: goto L_0x0021;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = -1
            goto L_0x0062
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r6 = 6
            goto L_0x0062
        L_0x0021:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x002a
            goto L_0x0014
        L_0x002a:
            r6 = 5
            goto L_0x0062
        L_0x002c:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r6 = 4
            goto L_0x0062
        L_0x0037:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0040
            goto L_0x0014
        L_0x0040:
            r6 = 3
            goto L_0x0062
        L_0x0042:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004b
            goto L_0x0014
        L_0x004b:
            r6 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            r6 = 1
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = "video/dolby-vision"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0061
            goto L_0x0014
        L_0x0061:
            r6 = 0
        L_0x0062:
            switch(r6) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0069;
                case 2: goto L_0x0066;
                case 3: goto L_0x0069;
                case 4: goto L_0x006d;
                case 5: goto L_0x0069;
                case 6: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            return r0
        L_0x0066:
            int r7 = r7 * r8
            goto L_0x00a7
        L_0x0069:
            int r7 = r7 * r8
        L_0x006b:
            r2 = 2
            goto L_0x00a7
        L_0x006d:
            java.lang.String r6 = v6.e0.f26439d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = v6.e0.f26438c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "AFTS"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0096
            boolean r5 = r5.f23882f
            if (r5 == 0) goto L_0x0096
            goto L_0x00ad
        L_0x0096:
            r5 = 16
            int r6 = v6.e0.g(r7, r5)
            int r7 = v6.e0.g(r8, r5)
            int r7 = r7 * r6
            int r7 = r7 * 16
            int r7 = r7 * 16
            goto L_0x006b
        L_0x00a7:
            int r7 = r7 * 3
            int r2 = r2 * 2
            int r7 = r7 / r2
            return r7
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.h.H0(p5.k, java.lang.String, int, int):int");
    }

    public static List<k> I0(n nVar, b0 b0Var, boolean z10, boolean z11) throws p.c {
        Pair<Integer, Integer> c10;
        String str = b0Var.f27408t;
        if (str == null) {
            return Collections.emptyList();
        }
        List<k> a10 = nVar.a(str, z10, z11);
        Pattern pattern = p.f23924a;
        ArrayList arrayList = new ArrayList(a10);
        p.j(arrayList, new r0.b(b0Var));
        if ("video/dolby-vision".equals(str) && (c10 = p.c(b0Var)) != null) {
            int intValue = ((Integer) c10.first).intValue();
            if (intValue == 16 || intValue == 256) {
                arrayList.addAll(nVar.a("video/hevc", z10, z11));
            } else if (intValue == 512) {
                arrayList.addAll(nVar.a("video/avc", z10, z11));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static int J0(k kVar, b0 b0Var) {
        if (b0Var.f27409u == -1) {
            return H0(kVar, b0Var.f27408t, b0Var.f27413y, b0Var.f27414z);
        }
        int size = b0Var.f27410v.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += b0Var.f27410v.get(i11).length;
        }
        return b0Var.f27409u + i10;
    }

    public static boolean K0(long j10) {
        return j10 < -30000;
    }

    public void C() {
        E0();
        D0();
        this.f27062g1 = false;
        n nVar = this.W0;
        if (nVar.f27100b != null) {
            n.a aVar = nVar.f27102d;
            if (aVar != null) {
                aVar.f27116a.unregisterDisplayListener(aVar);
            }
            n.b bVar = nVar.f27101c;
            bVar.getClass();
            bVar.f27120b.sendEmptyMessage(2);
        }
        this.F1 = null;
        try {
            super.C();
            s.a aVar2 = this.X0;
            d dVar = this.Q0;
            aVar2.getClass();
            synchronized (dVar) {
            }
            Handler handler = aVar2.f27132a;
            if (handler != null) {
                handler.post(new c1.b(aVar2, dVar));
            }
        } catch (Throwable th) {
            s.a aVar3 = this.X0;
            d dVar2 = this.Q0;
            aVar3.getClass();
            synchronized (dVar2) {
                Handler handler2 = aVar3.f27132a;
                if (handler2 != null) {
                    handler2.post(new c1.b(aVar3, dVar2));
                }
                throw th;
            }
        }
    }

    public void D(boolean z10, boolean z11) throws m {
        this.Q0 = new d();
        x0 x0Var = this.f27494c;
        x0Var.getClass();
        boolean z12 = x0Var.f27763a;
        v6.a.d(!z12 || this.E1 != 0);
        if (this.D1 != z12) {
            this.D1 = z12;
            o0();
        }
        s.a aVar = this.X0;
        d dVar = this.Q0;
        Handler handler = aVar.f27132a;
        if (handler != null) {
            handler.post(new f0.i(aVar, dVar));
        }
        n nVar = this.W0;
        if (nVar.f27100b != null) {
            n.b bVar = nVar.f27101c;
            bVar.getClass();
            bVar.f27120b.sendEmptyMessage(1);
            n.a aVar2 = nVar.f27102d;
            if (aVar2 != null) {
                aVar2.f27116a.registerDisplayListener(aVar2, e0.l());
            }
            nVar.d();
        }
        this.f27065j1 = z11;
        this.f27066k1 = false;
    }

    public final void D0() {
        i iVar;
        this.f27064i1 = false;
        if (e0.f26436a >= 23 && this.D1 && (iVar = this.Q) != null) {
            this.F1 = new b(iVar);
        }
    }

    public void E(long j10, boolean z10) throws m {
        super.E(j10, z10);
        D0();
        this.W0.b();
        this.f27073r1 = -9223372036854775807L;
        this.f27067l1 = -9223372036854775807L;
        this.f27071p1 = 0;
        if (z10) {
            T0();
        } else {
            this.f27068m1 = -9223372036854775807L;
        }
    }

    public final void E0() {
        this.f27081z1 = -1;
        this.A1 = -1;
        this.C1 = -1.0f;
        this.B1 = -1;
    }

    public void F() {
        try {
            O();
            o0();
            u0((g) null);
            Surface surface = this.f27061f1;
            if (surface != null) {
                if (this.f27060e1 == surface) {
                    this.f27060e1 = null;
                }
                surface.release();
                this.f27061f1 = null;
            }
        } catch (Throwable th) {
            Surface surface2 = this.f27061f1;
            if (surface2 != null) {
                if (this.f27060e1 == surface2) {
                    this.f27060e1 = null;
                }
                surface2.release();
                this.f27061f1 = null;
            }
            throw th;
        }
    }

    public boolean F0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!I1) {
                J1 = G0();
                I1 = true;
            }
        }
        return J1;
    }

    public void G() {
        this.f27070o1 = 0;
        this.f27069n1 = SystemClock.elapsedRealtime();
        this.f27074s1 = SystemClock.elapsedRealtime() * 1000;
        this.f27075t1 = 0;
        this.f27076u1 = 0;
        n nVar = this.W0;
        nVar.f27103e = true;
        nVar.b();
        nVar.f(false);
    }

    public void H() {
        this.f27068m1 = -9223372036854775807L;
        L0();
        int i10 = this.f27076u1;
        if (i10 != 0) {
            s.a aVar = this.X0;
            long j10 = this.f27075t1;
            Handler handler = aVar.f27132a;
            if (handler != null) {
                handler.post(new q(aVar, j10, i10));
            }
            this.f27075t1 = 0;
            this.f27076u1 = 0;
        }
        n nVar = this.W0;
        nVar.f27103e = false;
        nVar.a();
    }

    public a5.g L(k kVar, b0 b0Var, b0 b0Var2) {
        int i10;
        a5.g c10 = kVar.c(b0Var, b0Var2);
        int i11 = c10.f96e;
        int i12 = b0Var2.f27413y;
        a aVar = this.f27057b1;
        if (i12 > aVar.f27082a || b0Var2.f27414z > aVar.f27083b) {
            i11 |= 256;
        }
        if (J0(kVar, b0Var2) > this.f27057b1.f27084c) {
            i11 |= 64;
        }
        int i13 = i11;
        String str = kVar.f23877a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = c10.f95d;
        }
        return new a5.g(str, b0Var, b0Var2, i10, i13);
    }

    public final void L0() {
        if (this.f27070o1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f27069n1;
            s.a aVar = this.X0;
            int i10 = this.f27070o1;
            Handler handler = aVar.f27132a;
            if (handler != null) {
                handler.post(new q(aVar, i10, j10));
            }
            this.f27070o1 = 0;
            this.f27069n1 = elapsedRealtime;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0146, code lost:
        r21 = r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(p5.k r23, p5.i r24, x4.b0 r25, android.media.MediaCrypto r26, float r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r27
            java.lang.String r5 = r1.f23879c
            x4.b0[] r6 = r0.f27498g
            r6.getClass()
            int r7 = r3.f27413y
            int r8 = r3.f27414z
            int r9 = J0(r1, r3)
            int r10 = r6.length
            r11 = 1
            r13 = -1
            if (r10 != r11) goto L_0x003f
            if (r9 == r13) goto L_0x0036
            java.lang.String r6 = r3.f27408t
            int r10 = r3.f27413y
            int r14 = r3.f27414z
            int r6 = H0(r1, r6, r10, r14)
            if (r6 == r13) goto L_0x0036
            float r9 = (float) r9
            r10 = 1069547520(0x3fc00000, float:1.5)
            float r9 = r9 * r10
            int r9 = (int) r9
            int r9 = java.lang.Math.min(r9, r6)
        L_0x0036:
            w6.h$a r6 = new w6.h$a
            r6.<init>(r7, r8, r9)
            r21 = r5
            goto L_0x0184
        L_0x003f:
            int r10 = r6.length
            r14 = 0
            r15 = 0
        L_0x0042:
            if (r14 >= r10) goto L_0x008f
            r11 = r6[r14]
            w6.b r12 = r3.F
            if (r12 == 0) goto L_0x005a
            w6.b r12 = r11.F
            if (r12 != 0) goto L_0x005a
            x4.b0$b r11 = r11.a()
            w6.b r12 = r3.F
            r11.f27437w = r12
            x4.b0 r11 = r11.a()
        L_0x005a:
            a5.g r12 = r1.c(r3, r11)
            int r12 = r12.f95d
            if (r12 == 0) goto L_0x0087
            int r12 = r11.f27413y
            r16 = r6
            if (r12 == r13) goto L_0x006f
            int r6 = r11.f27414z
            if (r6 != r13) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r6 = 0
            goto L_0x0070
        L_0x006f:
            r6 = 1
        L_0x0070:
            r15 = r15 | r6
            int r6 = java.lang.Math.max(r7, r12)
            int r7 = r11.f27414z
            int r7 = java.lang.Math.max(r8, r7)
            int r8 = J0(r1, r11)
            int r8 = java.lang.Math.max(r9, r8)
            r9 = r8
            r8 = r7
            r7 = r6
            goto L_0x0089
        L_0x0087:
            r16 = r6
        L_0x0089:
            int r14 = r14 + 1
            r6 = r16
            r11 = 1
            goto L_0x0042
        L_0x008f:
            if (r15 == 0) goto L_0x017d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Resolutions unknown. Codec max resolution: "
            r6.append(r10)
            r6.append(r7)
            java.lang.String r10 = "x"
            r6.append(r10)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r11 = "MediaCodecVideoRenderer"
            android.util.Log.w(r11, r6)
            int r6 = r3.f27414z
            int r12 = r3.f27413y
            if (r6 <= r12) goto L_0x00b7
            r13 = 1
            goto L_0x00b8
        L_0x00b7:
            r13 = 0
        L_0x00b8:
            if (r13 == 0) goto L_0x00bc
            r14 = r6
            goto L_0x00bd
        L_0x00bc:
            r14 = r12
        L_0x00bd:
            if (r13 == 0) goto L_0x00c0
            r6 = r12
        L_0x00c0:
            float r12 = (float) r6
            float r15 = (float) r14
            float r12 = r12 / r15
            int[] r15 = H1
            int r2 = r15.length
            r4 = 0
        L_0x00c7:
            r16 = 0
            if (r4 >= r2) goto L_0x0146
            r17 = r2
            r2 = r15[r4]
            r18 = r15
            float r15 = (float) r2
            float r15 = r15 * r12
            int r15 = (int) r15
            if (r2 <= r14) goto L_0x0146
            if (r15 > r6) goto L_0x00db
            goto L_0x0146
        L_0x00db:
            r19 = r6
            int r6 = v6.e0.f26436a
            r20 = r12
            r12 = 21
            if (r6 < r12) goto L_0x0111
            if (r13 == 0) goto L_0x00e9
            r6 = r15
            goto L_0x00ea
        L_0x00e9:
            r6 = r2
        L_0x00ea:
            if (r13 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r2 = r15
        L_0x00ee:
            android.media.MediaCodecInfo$CodecCapabilities r12 = r1.f23880d
            if (r12 != 0) goto L_0x00f3
            goto L_0x00f9
        L_0x00f3:
            android.media.MediaCodecInfo$VideoCapabilities r12 = r12.getVideoCapabilities()
            if (r12 != 0) goto L_0x00fc
        L_0x00f9:
            r2 = r16
            goto L_0x0101
        L_0x00fc:
            android.graphics.Point r16 = p5.k.a(r12, r6, r2)
            goto L_0x00f9
        L_0x0101:
            float r6 = r3.A
            int r12 = r2.x
            int r15 = r2.y
            r21 = r5
            double r5 = (double) r6
            boolean r5 = r1.g(r12, r15, r5)
            if (r5 == 0) goto L_0x0139
            goto L_0x014a
        L_0x0111:
            r21 = r5
            r5 = 16
            int r2 = v6.e0.g(r2, r5)     // Catch:{ c -> 0x0148 }
            int r2 = r2 * 16
            int r6 = v6.e0.g(r15, r5)     // Catch:{ c -> 0x0148 }
            int r6 = r6 * 16
            int r5 = r2 * r6
            int r12 = p5.p.i()     // Catch:{ c -> 0x0148 }
            if (r5 > r12) goto L_0x0139
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ c -> 0x0148 }
            if (r13 == 0) goto L_0x012f
            r5 = r6
            goto L_0x0130
        L_0x012f:
            r5 = r2
        L_0x0130:
            if (r13 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r2 = r6
        L_0x0134:
            r4.<init>(r5, r2)     // Catch:{ c -> 0x0148 }
            r2 = r4
            goto L_0x014a
        L_0x0139:
            int r4 = r4 + 1
            r2 = r17
            r15 = r18
            r6 = r19
            r12 = r20
            r5 = r21
            goto L_0x00c7
        L_0x0146:
            r21 = r5
        L_0x0148:
            r2 = r16
        L_0x014a:
            if (r2 == 0) goto L_0x017f
            int r4 = r2.x
            int r7 = java.lang.Math.max(r7, r4)
            int r2 = r2.y
            int r8 = java.lang.Math.max(r8, r2)
            java.lang.String r2 = r3.f27408t
            int r2 = H0(r1, r2, r7, r8)
            int r9 = java.lang.Math.max(r9, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r2.append(r4)
            r2.append(r7)
            r2.append(r10)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r11, r2)
            goto L_0x017f
        L_0x017d:
            r21 = r5
        L_0x017f:
            w6.h$a r6 = new w6.h$a
            r6.<init>(r7, r8, r9)
        L_0x0184:
            r0.f27057b1 = r6
            boolean r2 = r0.f27056a1
            boolean r4 = r0.D1
            if (r4 == 0) goto L_0x018f
            int r4 = r0.E1
            goto L_0x0190
        L_0x018f:
            r4 = 0
        L_0x0190:
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r7 = "mime"
            r8 = r21
            r5.setString(r7, r8)
            int r7 = r3.f27413y
            java.lang.String r8 = "width"
            r5.setInteger(r8, r7)
            int r7 = r3.f27414z
            java.lang.String r8 = "height"
            r5.setInteger(r8, r7)
            java.util.List<byte[]> r7 = r3.f27410v
            l0.e.k(r5, r7)
            float r7 = r3.A
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x01bc
            java.lang.String r9 = "frame-rate"
            r5.setFloat(r9, r7)
        L_0x01bc:
            int r7 = r3.B
            java.lang.String r9 = "rotation-degrees"
            l0.e.i(r5, r9, r7)
            w6.b r7 = r3.F
            if (r7 == 0) goto L_0x01e9
            int r9 = r7.f27025c
            java.lang.String r10 = "color-transfer"
            l0.e.i(r5, r10, r9)
            int r9 = r7.f27023a
            java.lang.String r10 = "color-standard"
            l0.e.i(r5, r10, r9)
            int r9 = r7.f27024b
            java.lang.String r10 = "color-range"
            l0.e.i(r5, r10, r9)
            byte[] r7 = r7.f27026d
            if (r7 == 0) goto L_0x01e9
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            java.lang.String r9 = "hdr-static-info"
            r5.setByteBuffer(r9, r7)
        L_0x01e9:
            java.lang.String r7 = r3.f27408t
            java.lang.String r9 = "video/dolby-vision"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0206
            android.util.Pair r3 = p5.p.c(r25)
            if (r3 == 0) goto L_0x0206
            java.lang.Object r3 = r3.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r7 = "profile"
            l0.e.i(r5, r7, r3)
        L_0x0206:
            int r3 = r6.f27082a
            java.lang.String r7 = "max-width"
            r5.setInteger(r7, r3)
            int r3 = r6.f27083b
            java.lang.String r7 = "max-height"
            r5.setInteger(r7, r3)
            int r3 = r6.f27084c
            java.lang.String r6 = "max-input-size"
            l0.e.i(r5, r6, r3)
            int r3 = v6.e0.f26436a
            r6 = 23
            if (r3 < r6) goto L_0x0232
            java.lang.String r7 = "priority"
            r9 = 0
            r5.setInteger(r7, r9)
            r7 = r27
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0232
            java.lang.String r8 = "operating-rate"
            r5.setFloat(r8, r7)
        L_0x0232:
            if (r2 == 0) goto L_0x0241
            java.lang.String r2 = "no-post-process"
            r7 = 1
            r5.setInteger(r2, r7)
            java.lang.String r2 = "auto-frc"
            r8 = 0
            r5.setInteger(r2, r8)
            goto L_0x0242
        L_0x0241:
            r7 = 1
        L_0x0242:
            if (r4 == 0) goto L_0x024e
            java.lang.String r2 = "tunneled-playback"
            r5.setFeatureEnabled(r2, r7)
            java.lang.String r2 = "audio-session-id"
            r5.setInteger(r2, r4)
        L_0x024e:
            android.view.Surface r2 = r0.f27060e1
            if (r2 != 0) goto L_0x0271
            boolean r2 = r22.U0(r23)
            if (r2 == 0) goto L_0x026b
            android.view.Surface r2 = r0.f27061f1
            if (r2 != 0) goto L_0x0266
            android.content.Context r2 = r0.V0
            boolean r1 = r1.f23882f
            w6.d r1 = w6.d.d(r2, r1)
            r0.f27061f1 = r1
        L_0x0266:
            android.view.Surface r1 = r0.f27061f1
            r0.f27060e1 = r1
            goto L_0x0271
        L_0x026b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0271:
            android.view.Surface r1 = r0.f27060e1
            r2 = r24
            r4 = r26
            r7 = 0
            r2.c(r5, r1, r4, r7)
            if (r3 < r6) goto L_0x0288
            boolean r1 = r0.D1
            if (r1 == 0) goto L_0x0288
            w6.h$b r1 = new w6.h$b
            r1.<init>(r2)
            r0.F1 = r1
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.h.M(p5.k, p5.i, x4.b0, android.media.MediaCrypto, float):void");
    }

    public void M0() {
        this.f27066k1 = true;
        if (!this.f27064i1) {
            this.f27064i1 = true;
            s.a aVar = this.X0;
            Surface surface = this.f27060e1;
            Handler handler = aVar.f27132a;
            if (handler != null) {
                handler.post(new f0.i(aVar, surface));
            }
            this.f27062g1 = true;
        }
    }

    public j N(Throwable th, k kVar) {
        return new g(th, kVar, this.f27060e1);
    }

    public final void N0() {
        int i10 = this.f27077v1;
        if (i10 != -1 || this.f27078w1 != -1) {
            if (this.f27081z1 != i10 || this.A1 != this.f27078w1 || this.B1 != this.f27079x1 || this.C1 != this.f27080y1) {
                this.X0.a(i10, this.f27078w1, this.f27079x1, this.f27080y1);
                this.f27081z1 = this.f27077v1;
                this.A1 = this.f27078w1;
                this.B1 = this.f27079x1;
                this.C1 = this.f27080y1;
            }
        }
    }

    public final void O0() {
        int i10 = this.f27081z1;
        if (i10 != -1 || this.A1 != -1) {
            this.X0.a(i10, this.A1, this.B1, this.C1);
        }
    }

    public final void P0(long j10, long j11, b0 b0Var) {
        m mVar = this.G1;
        if (mVar != null) {
            mVar.b(j10, j11, b0Var, this.S);
        }
    }

    public void Q0(long j10) throws m {
        C0(j10);
        N0();
        this.Q0.f78e++;
        M0();
        super.i0(j10);
        if (!this.D1) {
            this.f27072q1--;
        }
    }

    public void R0(i iVar, int i10) {
        N0();
        androidx.appcompat.widget.p.a("releaseOutputBuffer");
        iVar.d(i10, true);
        androidx.appcompat.widget.p.f();
        this.f27074s1 = SystemClock.elapsedRealtime() * 1000;
        this.Q0.f78e++;
        this.f27071p1 = 0;
        M0();
    }

    public void S0(i iVar, int i10, long j10) {
        N0();
        androidx.appcompat.widget.p.a("releaseOutputBuffer");
        iVar.n(i10, j10);
        androidx.appcompat.widget.p.f();
        this.f27074s1 = SystemClock.elapsedRealtime() * 1000;
        this.Q0.f78e++;
        this.f27071p1 = 0;
        M0();
    }

    public final void T0() {
        this.f27068m1 = this.Y0 > 0 ? SystemClock.elapsedRealtime() + this.Y0 : -9223372036854775807L;
    }

    public final boolean U0(k kVar) {
        return e0.f26436a >= 23 && !this.D1 && !F0(kVar.f23877a) && (!kVar.f23882f || d.b(this.V0));
    }

    public void V0(i iVar, int i10) {
        androidx.appcompat.widget.p.a("skipVideoBuffer");
        iVar.d(i10, false);
        androidx.appcompat.widget.p.f();
        this.Q0.f79f++;
    }

    public boolean W() {
        return this.D1 && e0.f26436a < 23;
    }

    public void W0(int i10) {
        d dVar = this.Q0;
        dVar.f80g += i10;
        this.f27070o1 += i10;
        int i11 = this.f27071p1 + i10;
        this.f27071p1 = i11;
        dVar.f81h = Math.max(i11, dVar.f81h);
        int i12 = this.Z0;
        if (i12 > 0 && this.f27070o1 >= i12) {
            L0();
        }
    }

    public float X(float f10, b0 b0Var, b0[] b0VarArr) {
        float f11 = -1.0f;
        for (b0 b0Var2 : b0VarArr) {
            float f12 = b0Var2.A;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    public void X0(long j10) {
        d dVar = this.Q0;
        dVar.f83j += j10;
        dVar.f84k++;
        this.f27075t1 += j10;
        this.f27076u1++;
    }

    public List<k> Y(p5.n nVar, b0 b0Var, boolean z10) throws p.c {
        return I0(nVar, b0Var, z10, this.D1);
    }

    public String a() {
        return "MediaCodecVideoRenderer";
    }

    @TargetApi(29)
    public void a0(f fVar) throws m {
        if (this.f27059d1) {
            ByteBuffer byteBuffer = fVar.f89f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    i iVar = this.Q;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    iVar.l(bundle);
                }
            }
        }
    }

    public void e0(String str, long j10, long j11) {
        s.a aVar = this.X0;
        Handler handler = aVar.f27132a;
        if (handler != null) {
            handler.post(new z4.i(aVar, str, j10, j11));
        }
        this.f27058c1 = F0(str);
        k kVar = this.f23887d0;
        kVar.getClass();
        boolean z10 = false;
        if (e0.f26436a >= 29 && "video/x-vnd.on2.vp9".equals(kVar.f23878b)) {
            MediaCodecInfo.CodecProfileLevel[] d10 = kVar.d();
            int length = d10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (d10[i10].profile == 16384) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f27059d1 = z10;
    }

    public void f0(String str) {
        s.a aVar = this.X0;
        Handler handler = aVar.f27132a;
        if (handler != null) {
            handler.post(new c(aVar, str));
        }
    }

    public a5.g g0(t tVar) throws m {
        a5.g g02 = super.g0(tVar);
        s.a aVar = this.X0;
        b0 b0Var = (b0) tVar.f21666b;
        Handler handler = aVar.f27132a;
        if (handler != null) {
            handler.post(new androidx.emoji2.text.f(aVar, b0Var, g02));
        }
        return g02;
    }

    public void h0(b0 b0Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        i iVar = this.Q;
        if (iVar != null) {
            iVar.e(this.f27063h1);
        }
        if (this.D1) {
            this.f27077v1 = b0Var.f27413y;
            this.f27078w1 = b0Var.f27414z;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                i10 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i10 = mediaFormat.getInteger("width");
            }
            this.f27077v1 = i10;
            if (z10) {
                i11 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i11 = mediaFormat.getInteger("height");
            }
            this.f27078w1 = i11;
        }
        float f10 = b0Var.C;
        this.f27080y1 = f10;
        if (e0.f26436a >= 21) {
            int i12 = b0Var.B;
            if (i12 == 90 || i12 == 270) {
                int i13 = this.f27077v1;
                this.f27077v1 = this.f27078w1;
                this.f27078w1 = i13;
                this.f27080y1 = 1.0f / f10;
            }
        } else {
            this.f27079x1 = b0Var.B;
        }
        n nVar = this.W0;
        nVar.f27105g = b0Var.A;
        e eVar = nVar.f27099a;
        eVar.f27040a.c();
        eVar.f27041b.c();
        eVar.f27042c = false;
        eVar.f27043d = -9223372036854775807L;
        eVar.f27044e = 0;
        nVar.e();
    }

    public void i0(long j10) {
        super.i0(j10);
        if (!this.D1) {
            this.f27072q1--;
        }
    }

    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.f27064i1 || (((surface = this.f27061f1) != null && this.f27060e1 == surface) || this.Q == null || this.D1))) {
            this.f27068m1 = -9223372036854775807L;
            return true;
        } else if (this.f27068m1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f27068m1) {
                return true;
            }
            this.f27068m1 = -9223372036854775807L;
            return false;
        }
    }

    public void j0() {
        D0();
    }

    public void k0(f fVar) throws m {
        boolean z10 = this.D1;
        if (!z10) {
            this.f27072q1++;
        }
        if (e0.f26436a < 23 && z10) {
            Q0(fVar.f88e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (r11 != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013b, code lost:
        if ((K0(r5) && r22 > 100000) != false) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m0(long r28, long r30, p5.i r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, x4.b0 r41) throws x4.m {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r3 = r32
            r4 = r34
            r5 = r37
            r32.getClass()
            long r7 = r0.f27067l1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x001a
            r0.f27067l1 = r1
        L_0x001a:
            long r7 = r0.f27073r1
            r13 = -1
            r15 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r17 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r17 == 0) goto L_0x00b9
            w6.n r7 = r0.W0
            long r9 = r7.f27112n
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x0033
            r7.f27114p = r9
            long r8 = r7.f27113o
            r7.f27115q = r8
        L_0x0033:
            long r8 = r7.f27111m
            r19 = 1
            long r8 = r8 + r19
            r7.f27111m = r8
            w6.e r8 = r7.f27099a
            long r9 = r5 * r15
            w6.e$a r13 = r8.f27040a
            r13.b(r9)
            w6.e$a r13 = r8.f27040a
            boolean r13 = r13.a()
            if (r13 == 0) goto L_0x004f
            r8.f27042c = r12
            goto L_0x008b
        L_0x004f:
            long r13 = r8.f27043d
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r22 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r22 == 0) goto L_0x008b
            boolean r13 = r8.f27042c
            if (r13 == 0) goto L_0x0077
            w6.e$a r13 = r8.f27041b
            long r11 = r13.f27048d
            r22 = 0
            int r24 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r24 != 0) goto L_0x006a
            r11 = 0
            goto L_0x0075
        L_0x006a:
            boolean[] r13 = r13.f27051g
            long r11 = r11 - r19
            r19 = 15
            long r11 = r11 % r19
            int r12 = (int) r11
            boolean r11 = r13[r12]
        L_0x0075:
            if (r11 == 0) goto L_0x0083
        L_0x0077:
            w6.e$a r11 = r8.f27041b
            r11.c()
            w6.e$a r11 = r8.f27041b
            long r12 = r8.f27043d
            r11.b(r12)
        L_0x0083:
            r11 = 1
            r8.f27042c = r11
            w6.e$a r11 = r8.f27041b
            r11.b(r9)
        L_0x008b:
            boolean r11 = r8.f27042c
            if (r11 == 0) goto L_0x00a2
            w6.e$a r11 = r8.f27041b
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x00a2
            w6.e$a r11 = r8.f27040a
            w6.e$a r12 = r8.f27041b
            r8.f27040a = r12
            r8.f27041b = r11
            r11 = 0
            r8.f27042c = r11
        L_0x00a2:
            r8.f27043d = r9
            w6.e$a r9 = r8.f27040a
            boolean r9 = r9.a()
            if (r9 == 0) goto L_0x00ae
            r9 = 0
            goto L_0x00b2
        L_0x00ae:
            int r9 = r8.f27044e
            r10 = 1
            int r9 = r9 + r10
        L_0x00b2:
            r8.f27044e = r9
            r7.e()
            r0.f27073r1 = r5
        L_0x00b9:
            long r7 = r0.S0
            long r9 = r5 - r7
            if (r39 == 0) goto L_0x00c6
            if (r40 != 0) goto L_0x00c6
            r0.V0(r3, r4)
            r1 = 1
            return r1
        L_0x00c6:
            float r11 = r0.O
            double r11 = (double) r11
            int r13 = r0.f27496e
            r14 = 2
            if (r13 != r14) goto L_0x00d0
            r13 = 1
            goto L_0x00d1
        L_0x00d0:
            r13 = 0
        L_0x00d1:
            long r22 = android.os.SystemClock.elapsedRealtime()
            long r22 = r22 * r15
            long r5 = r5 - r1
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r11)
            double r5 = r5 / r11
            long r5 = (long) r5
            if (r13 == 0) goto L_0x00ec
            long r11 = r22 - r30
            long r5 = r5 - r11
        L_0x00ec:
            android.view.Surface r11 = r0.f27060e1
            android.view.Surface r12 = r0.f27061f1
            if (r11 != r12) goto L_0x0102
            boolean r1 = K0(r5)
            if (r1 == 0) goto L_0x0100
            r0.V0(r3, r4)
            r0.X0(r5)
            r1 = 1
            return r1
        L_0x0100:
            r1 = 0
            return r1
        L_0x0102:
            long r11 = r0.f27074s1
            long r22 = r22 - r11
            boolean r11 = r0.f27066k1
            if (r11 != 0) goto L_0x0111
            if (r13 != 0) goto L_0x0115
            boolean r11 = r0.f27065j1
            if (r11 == 0) goto L_0x0117
            goto L_0x0115
        L_0x0111:
            boolean r11 = r0.f27064i1
            if (r11 != 0) goto L_0x0117
        L_0x0115:
            r11 = 1
            goto L_0x0118
        L_0x0117:
            r11 = 0
        L_0x0118:
            long r14 = r0.f27068m1
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x013f
            int r12 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x013f
            if (r11 != 0) goto L_0x013d
            if (r13 == 0) goto L_0x013f
            boolean r7 = K0(r5)
            if (r7 == 0) goto L_0x013a
            r7 = 100000(0x186a0, double:4.94066E-319)
            int r11 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x013a
            r7 = 1
            goto L_0x013b
        L_0x013a:
            r7 = 0
        L_0x013b:
            if (r7 == 0) goto L_0x013f
        L_0x013d:
            r7 = 1
            goto L_0x0140
        L_0x013f:
            r7 = 0
        L_0x0140:
            r8 = 21
            if (r7 == 0) goto L_0x0163
            long r1 = java.lang.System.nanoTime()
            r35 = r27
            r36 = r9
            r38 = r1
            r40 = r41
            r35.P0(r36, r38, r40)
            int r7 = v6.e0.f26436a
            if (r7 < r8) goto L_0x015b
            r0.S0(r3, r4, r1)
            goto L_0x015e
        L_0x015b:
            r0.R0(r3, r4)
        L_0x015e:
            r0.X0(r5)
            r1 = 1
            return r1
        L_0x0163:
            if (r13 == 0) goto L_0x02f7
            long r11 = r0.f27067l1
            int r7 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x016d
            goto L_0x02f7
        L_0x016d:
            long r11 = java.lang.System.nanoTime()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r13
            long r5 = r5 + r11
            w6.n r7 = r0.W0
            long r13 = r7.f27114p
            r15 = -1
            int r20 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r20 == 0) goto L_0x01d5
            w6.e r13 = r7.f27099a
            boolean r13 = r13.a()
            if (r13 == 0) goto L_0x01d5
            w6.e r13 = r7.f27099a
            boolean r14 = r13.a()
            if (r14 == 0) goto L_0x01a7
            w6.e$a r13 = r13.f27040a
            long r14 = r13.f27049e
            r20 = 0
            int r16 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r16 != 0) goto L_0x01a1
            r25 = r9
            r8 = r20
            r20 = r25
            goto L_0x01ae
        L_0x01a1:
            r20 = r9
            long r8 = r13.f27050f
            long r8 = r8 / r14
            goto L_0x01ae
        L_0x01a7:
            r20 = r9
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01ae:
            long r13 = r7.f27115q
            long r3 = r7.f27111m
            long r1 = r7.f27114p
            long r3 = r3 - r1
            long r3 = r3 * r8
            float r1 = (float) r3
            float r2 = r7.f27108j
            float r1 = r1 / r2
            long r1 = (long) r1
            long r13 = r13 + r1
            long r1 = r5 - r13
            long r1 = java.lang.Math.abs(r1)
            r3 = 20000000(0x1312d00, double:9.881313E-317)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L_0x01cc
            r1 = 1
            goto L_0x01cd
        L_0x01cc:
            r1 = 0
        L_0x01cd:
            if (r1 == 0) goto L_0x01d1
            r5 = r13
            goto L_0x01d7
        L_0x01d1:
            r7.b()
            goto L_0x01d7
        L_0x01d5:
            r20 = r9
        L_0x01d7:
            long r1 = r7.f27111m
            r7.f27112n = r1
            r7.f27113o = r5
            w6.n$b r1 = r7.f27101c
            if (r1 == 0) goto L_0x0213
            long r2 = r7.f27109k
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x01ed
            goto L_0x0213
        L_0x01ed:
            long r1 = r1.f27119a
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01f4
            goto L_0x0213
        L_0x01f4:
            long r3 = r7.f27109k
            long r8 = r5 - r1
            long r8 = r8 / r3
            long r8 = r8 * r3
            long r8 = r8 + r1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0203
            long r1 = r8 - r3
            goto L_0x0206
        L_0x0203:
            long r3 = r3 + r8
            r1 = r8
            r8 = r3
        L_0x0206:
            long r3 = r8 - r5
            long r5 = r5 - r1
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x020e
            goto L_0x020f
        L_0x020e:
            r8 = r1
        L_0x020f:
            long r1 = r7.f27110l
            long r8 = r8 - r1
            r5 = r8
        L_0x0213:
            long r1 = r5 - r11
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r0.f27068m1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0225
            r3 = 1
            goto L_0x0226
        L_0x0225:
            r3 = 0
        L_0x0226:
            r7 = -500000(0xfffffffffff85ee0, double:NaN)
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x022f
            r4 = 1
            goto L_0x0230
        L_0x022f:
            r4 = 0
        L_0x0230:
            if (r4 == 0) goto L_0x0236
            if (r40 != 0) goto L_0x0236
            r4 = 1
            goto L_0x0237
        L_0x0236:
            r4 = 0
        L_0x0237:
            if (r4 == 0) goto L_0x026e
            z5.b0 r4 = r0.f27497f
            r4.getClass()
            long r7 = r0.f27499h
            long r7 = r28 - r7
            int r4 = r4.l(r7)
            if (r4 != 0) goto L_0x024a
            r4 = 0
            goto L_0x026a
        L_0x024a:
            a5.d r7 = r0.Q0
            int r8 = r7.f82i
            r9 = 1
            int r8 = r8 + r9
            r7.f82i = r8
            int r8 = r0.f27072q1
            int r8 = r8 + r4
            if (r3 == 0) goto L_0x025d
            int r4 = r7.f79f
            int r4 = r4 + r8
            r7.f79f = r4
            goto L_0x0260
        L_0x025d:
            r0.W0(r8)
        L_0x0260:
            boolean r4 = r27.U()
            if (r4 == 0) goto L_0x0269
            r27.c0()
        L_0x0269:
            r4 = 1
        L_0x026a:
            if (r4 == 0) goto L_0x026e
            r4 = 0
            return r4
        L_0x026e:
            boolean r4 = K0(r1)
            if (r4 == 0) goto L_0x0278
            if (r40 != 0) goto L_0x0278
            r4 = 1
            goto L_0x0279
        L_0x0278:
            r4 = 0
        L_0x0279:
            if (r4 == 0) goto L_0x029e
            if (r3 == 0) goto L_0x0286
            r3 = r32
            r4 = r34
            r0.V0(r3, r4)
            r3 = 1
            goto L_0x029a
        L_0x0286:
            r3 = r32
            r4 = r34
            java.lang.String r5 = "dropVideoBuffer"
            androidx.appcompat.widget.p.a(r5)
            r5 = 0
            r3.d(r4, r5)
            androidx.appcompat.widget.p.f()
            r3 = 1
            r0.W0(r3)
        L_0x029a:
            r0.X0(r1)
            return r3
        L_0x029e:
            r3 = r32
            r4 = r34
            int r7 = v6.e0.f26436a
            r8 = 21
            if (r7 < r8) goto L_0x02c2
            r7 = 50000(0xc350, double:2.47033E-319)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x02f5
            r35 = r27
            r36 = r20
            r38 = r5
            r40 = r41
            r35.P0(r36, r38, r40)
            r0.S0(r3, r4, r5)
            r0.X0(r1)
            r1 = 1
            return r1
        L_0x02c2:
            r7 = 30000(0x7530, double:1.4822E-319)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x02f5
            r7 = 11000(0x2af8, double:5.4347E-320)
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x02e2
            r7 = 10000(0x2710, double:4.9407E-320)
            long r7 = r1 - r7
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x02d9 }
            goto L_0x02e2
        L_0x02d9:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = 0
            return r1
        L_0x02e2:
            r35 = r27
            r36 = r20
            r38 = r5
            r40 = r41
            r35.P0(r36, r38, r40)
            r0.R0(r3, r4)
            r0.X0(r1)
            r1 = 1
            return r1
        L_0x02f5:
            r1 = 0
            return r1
        L_0x02f7:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.h.m0(long, long, p5.i, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, x4.b0):boolean");
    }

    public void n(int i10, Object obj) throws m {
        int intValue;
        if (i10 == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f27061f1;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    k kVar = this.f23887d0;
                    if (kVar != null && U0(kVar)) {
                        surface = d.d(this.V0, kVar.f23882f);
                        this.f27061f1 = surface;
                    }
                }
            }
            if (this.f27060e1 != surface) {
                this.f27060e1 = surface;
                n nVar = this.W0;
                nVar.getClass();
                Surface surface3 = surface instanceof d ? null : surface;
                if (nVar.f27104f != surface3) {
                    nVar.a();
                    nVar.f27104f = surface3;
                    nVar.f(true);
                }
                this.f27062g1 = false;
                int i11 = this.f27496e;
                i iVar = this.Q;
                if (iVar != null) {
                    if (e0.f26436a < 23 || surface == null || this.f27058c1) {
                        o0();
                        c0();
                    } else {
                        iVar.h(surface);
                    }
                }
                if (surface == null || surface == this.f27061f1) {
                    E0();
                    D0();
                    return;
                }
                O0();
                D0();
                if (i11 == 2) {
                    T0();
                }
            } else if (surface != null && surface != this.f27061f1) {
                O0();
                if (this.f27062g1) {
                    s.a aVar = this.X0;
                    Surface surface4 = this.f27060e1;
                    Handler handler = aVar.f27132a;
                    if (handler != null) {
                        handler.post(new f0.i(aVar, surface4));
                    }
                }
            }
        } else if (i10 == 4) {
            int intValue2 = ((Integer) obj).intValue();
            this.f27063h1 = intValue2;
            i iVar2 = this.Q;
            if (iVar2 != null) {
                iVar2.e(intValue2);
            }
        } else if (i10 == 6) {
            this.G1 = (m) obj;
        } else if (i10 == 102 && this.E1 != (intValue = ((Integer) obj).intValue())) {
            this.E1 = intValue;
            if (this.D1) {
                o0();
            }
        }
    }

    public void q0() {
        super.q0();
        this.f27072q1 = 0;
    }

    public boolean w0(k kVar) {
        return this.f27060e1 != null || U0(kVar);
    }

    public void y(float f10, float f11) throws m {
        super.y(f10, f11);
        n nVar = this.W0;
        nVar.f27108j = f10;
        nVar.b();
        nVar.f(false);
    }

    public int y0(p5.n nVar, b0 b0Var) throws p.c {
        int i10 = 0;
        if (!v6.s.m(b0Var.f27408t)) {
            return 0;
        }
        boolean z10 = b0Var.f27411w != null;
        List<k> I0 = I0(nVar, b0Var, z10, false);
        if (z10 && I0.isEmpty()) {
            I0 = I0(nVar, b0Var, false, false);
        }
        if (I0.isEmpty()) {
            return 1;
        }
        if (!l.z0(b0Var)) {
            return 2;
        }
        k kVar = I0.get(0);
        boolean e10 = kVar.e(b0Var);
        int i11 = kVar.f(b0Var) ? 16 : 8;
        if (e10) {
            List<k> I02 = I0(nVar, b0Var, z10, true);
            if (!I02.isEmpty()) {
                k kVar2 = I02.get(0);
                if (kVar2.e(b0Var) && kVar2.f(b0Var)) {
                    i10 = 32;
                }
            }
        }
        return (e10 ? 4 : 3) | i11 | i10;
    }
}
