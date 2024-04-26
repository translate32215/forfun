package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.startapp.b4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1217d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f1218e = new SparseIntArray();

    /* renamed from: f  reason: collision with root package name */
    public static SparseIntArray f1219f = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, y.a> f1220a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1221b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, a> f1222c = new HashMap<>();

    /* compiled from: ConstraintSet */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1223a;

        /* renamed from: b  reason: collision with root package name */
        public final d f1224b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f1225c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final C0015b f1226d = new C0015b();

        /* renamed from: e  reason: collision with root package name */
        public final e f1227e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, y.a> f1228f = new HashMap<>();

        /* renamed from: g  reason: collision with root package name */
        public C0014a f1229g;

        /* renamed from: androidx.constraintlayout.widget.b$a$a  reason: collision with other inner class name */
        /* compiled from: ConstraintSet */
        public static class C0014a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f1230a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1231b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1232c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1233d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1234e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f1235f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f1236g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1237h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f1238i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1239j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f1240k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1241l = 0;

            public void a(int i10, float f10) {
                int i11 = this.f1235f;
                int[] iArr = this.f1233d;
                if (i11 >= iArr.length) {
                    this.f1233d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1234e;
                    this.f1234e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1233d;
                int i12 = this.f1235f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1234e;
                this.f1235f = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f1232c;
                int[] iArr = this.f1230a;
                if (i12 >= iArr.length) {
                    this.f1230a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1231b;
                    this.f1231b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1230a;
                int i13 = this.f1232c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1231b;
                this.f1232c = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f1238i;
                int[] iArr = this.f1236g;
                if (i11 >= iArr.length) {
                    this.f1236g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1237h;
                    this.f1237h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1236g;
                int i12 = this.f1238i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1237h;
                this.f1238i = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f1241l;
                int[] iArr = this.f1239j;
                if (i11 >= iArr.length) {
                    this.f1239j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1240k;
                    this.f1240k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1239j;
                int i12 = this.f1241l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1240k;
                this.f1241l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void a(ConstraintLayout.a aVar) {
            C0015b bVar = this.f1226d;
            aVar.f1164e = bVar.f1259i;
            aVar.f1166f = bVar.f1261j;
            aVar.f1168g = bVar.f1263k;
            aVar.f1170h = bVar.f1265l;
            aVar.f1172i = bVar.f1267m;
            aVar.f1174j = bVar.f1269n;
            aVar.f1176k = bVar.f1271o;
            aVar.f1178l = bVar.f1273p;
            aVar.f1180m = bVar.f1275q;
            aVar.f1182n = bVar.f1276r;
            aVar.f1184o = bVar.f1277s;
            aVar.f1191s = bVar.f1278t;
            aVar.f1192t = bVar.f1279u;
            aVar.f1193u = bVar.f1280v;
            aVar.f1194v = bVar.f1281w;
            aVar.leftMargin = bVar.G;
            aVar.rightMargin = bVar.H;
            aVar.topMargin = bVar.I;
            aVar.bottomMargin = bVar.J;
            aVar.A = bVar.S;
            aVar.B = bVar.R;
            aVar.f1196x = bVar.O;
            aVar.f1198z = bVar.Q;
            aVar.E = bVar.f1282x;
            aVar.F = bVar.f1283y;
            aVar.f1186p = bVar.A;
            aVar.f1188q = bVar.B;
            aVar.f1190r = bVar.C;
            aVar.G = bVar.f1284z;
            aVar.T = bVar.D;
            aVar.U = bVar.E;
            aVar.I = bVar.U;
            aVar.H = bVar.V;
            aVar.K = bVar.X;
            aVar.J = bVar.W;
            aVar.W = bVar.f1268m0;
            aVar.X = bVar.f1270n0;
            aVar.L = bVar.Y;
            aVar.M = bVar.Z;
            aVar.P = bVar.f1244a0;
            aVar.Q = bVar.f1246b0;
            aVar.N = bVar.f1248c0;
            aVar.O = bVar.f1250d0;
            aVar.R = bVar.f1252e0;
            aVar.S = bVar.f1254f0;
            aVar.V = bVar.F;
            aVar.f1160c = bVar.f1255g;
            aVar.f1156a = bVar.f1251e;
            aVar.f1158b = bVar.f1253f;
            aVar.width = bVar.f1247c;
            aVar.height = bVar.f1249d;
            String str = bVar.f1266l0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.f1274p0;
            aVar.setMarginStart(bVar.L);
            aVar.setMarginEnd(this.f1226d.K);
            aVar.a();
        }

        public final void b(int i10, ConstraintLayout.a aVar) {
            this.f1223a = i10;
            C0015b bVar = this.f1226d;
            bVar.f1259i = aVar.f1164e;
            bVar.f1261j = aVar.f1166f;
            bVar.f1263k = aVar.f1168g;
            bVar.f1265l = aVar.f1170h;
            bVar.f1267m = aVar.f1172i;
            bVar.f1269n = aVar.f1174j;
            bVar.f1271o = aVar.f1176k;
            bVar.f1273p = aVar.f1178l;
            bVar.f1275q = aVar.f1180m;
            bVar.f1276r = aVar.f1182n;
            bVar.f1277s = aVar.f1184o;
            bVar.f1278t = aVar.f1191s;
            bVar.f1279u = aVar.f1192t;
            bVar.f1280v = aVar.f1193u;
            bVar.f1281w = aVar.f1194v;
            bVar.f1282x = aVar.E;
            bVar.f1283y = aVar.F;
            bVar.f1284z = aVar.G;
            bVar.A = aVar.f1186p;
            bVar.B = aVar.f1188q;
            bVar.C = aVar.f1190r;
            bVar.D = aVar.T;
            bVar.E = aVar.U;
            bVar.F = aVar.V;
            bVar.f1255g = aVar.f1160c;
            bVar.f1251e = aVar.f1156a;
            bVar.f1253f = aVar.f1158b;
            bVar.f1247c = aVar.width;
            bVar.f1249d = aVar.height;
            bVar.G = aVar.leftMargin;
            bVar.H = aVar.rightMargin;
            bVar.I = aVar.topMargin;
            bVar.J = aVar.bottomMargin;
            bVar.M = aVar.D;
            bVar.U = aVar.I;
            bVar.V = aVar.H;
            bVar.X = aVar.K;
            bVar.W = aVar.J;
            bVar.f1268m0 = aVar.W;
            bVar.f1270n0 = aVar.X;
            bVar.Y = aVar.L;
            bVar.Z = aVar.M;
            bVar.f1244a0 = aVar.P;
            bVar.f1246b0 = aVar.Q;
            bVar.f1248c0 = aVar.N;
            bVar.f1250d0 = aVar.O;
            bVar.f1252e0 = aVar.R;
            bVar.f1254f0 = aVar.S;
            bVar.f1266l0 = aVar.Y;
            bVar.O = aVar.f1196x;
            bVar.Q = aVar.f1198z;
            bVar.N = aVar.f1195w;
            bVar.P = aVar.f1197y;
            bVar.S = aVar.A;
            bVar.R = aVar.B;
            bVar.T = aVar.C;
            bVar.f1274p0 = aVar.Z;
            bVar.K = aVar.getMarginEnd();
            this.f1226d.L = aVar.getMarginStart();
        }

        public final void c(int i10, c.a aVar) {
            b(i10, aVar);
            this.f1224b.f1303d = aVar.f1321r0;
            e eVar = this.f1227e;
            eVar.f1307b = aVar.f1324u0;
            eVar.f1308c = aVar.f1325v0;
            eVar.f1309d = aVar.f1326w0;
            eVar.f1310e = aVar.f1327x0;
            eVar.f1311f = aVar.f1328y0;
            eVar.f1312g = aVar.f1329z0;
            eVar.f1313h = aVar.A0;
            eVar.f1315j = aVar.B0;
            eVar.f1316k = aVar.C0;
            eVar.f1317l = aVar.D0;
            eVar.f1319n = aVar.f1323t0;
            eVar.f1318m = aVar.f1322s0;
        }

        public Object clone() throws CloneNotSupportedException {
            a aVar = new a();
            C0015b bVar = aVar.f1226d;
            C0015b bVar2 = this.f1226d;
            bVar.getClass();
            bVar.f1243a = bVar2.f1243a;
            bVar.f1247c = bVar2.f1247c;
            bVar.f1245b = bVar2.f1245b;
            bVar.f1249d = bVar2.f1249d;
            bVar.f1251e = bVar2.f1251e;
            bVar.f1253f = bVar2.f1253f;
            bVar.f1255g = bVar2.f1255g;
            bVar.f1257h = bVar2.f1257h;
            bVar.f1259i = bVar2.f1259i;
            bVar.f1261j = bVar2.f1261j;
            bVar.f1263k = bVar2.f1263k;
            bVar.f1265l = bVar2.f1265l;
            bVar.f1267m = bVar2.f1267m;
            bVar.f1269n = bVar2.f1269n;
            bVar.f1271o = bVar2.f1271o;
            bVar.f1273p = bVar2.f1273p;
            bVar.f1275q = bVar2.f1275q;
            bVar.f1276r = bVar2.f1276r;
            bVar.f1277s = bVar2.f1277s;
            bVar.f1278t = bVar2.f1278t;
            bVar.f1279u = bVar2.f1279u;
            bVar.f1280v = bVar2.f1280v;
            bVar.f1281w = bVar2.f1281w;
            bVar.f1282x = bVar2.f1282x;
            bVar.f1283y = bVar2.f1283y;
            bVar.f1284z = bVar2.f1284z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f1244a0 = bVar2.f1244a0;
            bVar.f1246b0 = bVar2.f1246b0;
            bVar.f1248c0 = bVar2.f1248c0;
            bVar.f1250d0 = bVar2.f1250d0;
            bVar.f1252e0 = bVar2.f1252e0;
            bVar.f1254f0 = bVar2.f1254f0;
            bVar.f1256g0 = bVar2.f1256g0;
            bVar.f1258h0 = bVar2.f1258h0;
            bVar.f1260i0 = bVar2.f1260i0;
            bVar.f1266l0 = bVar2.f1266l0;
            int[] iArr = bVar2.f1262j0;
            if (iArr == null || bVar2.f1264k0 != null) {
                bVar.f1262j0 = null;
            } else {
                bVar.f1262j0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f1264k0 = bVar2.f1264k0;
            bVar.f1268m0 = bVar2.f1268m0;
            bVar.f1270n0 = bVar2.f1270n0;
            bVar.f1272o0 = bVar2.f1272o0;
            bVar.f1274p0 = bVar2.f1274p0;
            c cVar = aVar.f1225c;
            c cVar2 = this.f1225c;
            cVar.getClass();
            cVar.f1286a = cVar2.f1286a;
            cVar.f1287b = cVar2.f1287b;
            cVar.f1289d = cVar2.f1289d;
            cVar.f1290e = cVar2.f1290e;
            cVar.f1291f = cVar2.f1291f;
            cVar.f1294i = cVar2.f1294i;
            cVar.f1292g = cVar2.f1292g;
            cVar.f1293h = cVar2.f1293h;
            d dVar = aVar.f1224b;
            d dVar2 = this.f1224b;
            dVar.getClass();
            dVar.f1300a = dVar2.f1300a;
            dVar.f1301b = dVar2.f1301b;
            dVar.f1303d = dVar2.f1303d;
            dVar.f1304e = dVar2.f1304e;
            dVar.f1302c = dVar2.f1302c;
            e eVar = aVar.f1227e;
            e eVar2 = this.f1227e;
            eVar.getClass();
            eVar.f1306a = eVar2.f1306a;
            eVar.f1307b = eVar2.f1307b;
            eVar.f1308c = eVar2.f1308c;
            eVar.f1309d = eVar2.f1309d;
            eVar.f1310e = eVar2.f1310e;
            eVar.f1311f = eVar2.f1311f;
            eVar.f1312g = eVar2.f1312g;
            eVar.f1313h = eVar2.f1313h;
            eVar.f1314i = eVar2.f1314i;
            eVar.f1315j = eVar2.f1315j;
            eVar.f1316k = eVar2.f1316k;
            eVar.f1317l = eVar2.f1317l;
            eVar.f1318m = eVar2.f1318m;
            eVar.f1319n = eVar2.f1319n;
            aVar.f1223a = this.f1223a;
            aVar.f1229g = this.f1229g;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ConstraintSet */
    public static class C0015b {

        /* renamed from: q0  reason: collision with root package name */
        public static SparseIntArray f1242q0;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1243a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f1244a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1245b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f1246b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1247c;

        /* renamed from: c0  reason: collision with root package name */
        public int f1248c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1249d;

        /* renamed from: d0  reason: collision with root package name */
        public int f1250d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1251e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public float f1252e0 = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public int f1253f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f1254f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1255g = -1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f1256g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1257h = true;

        /* renamed from: h0  reason: collision with root package name */
        public int f1258h0 = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1259i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f1260i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1261j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f1262j0;

        /* renamed from: k  reason: collision with root package name */
        public int f1263k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public String f1264k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1265l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f1266l0;

        /* renamed from: m  reason: collision with root package name */
        public int f1267m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f1268m0 = false;

        /* renamed from: n  reason: collision with root package name */
        public int f1269n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1270n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f1271o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f1272o0 = true;

        /* renamed from: p  reason: collision with root package name */
        public int f1273p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public int f1274p0 = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f1275q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f1276r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1277s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1278t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1279u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1280v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1281w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f1282x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public float f1283y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f1284z = null;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1242q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            f1242q0.append(44, 25);
            f1242q0.append(46, 28);
            f1242q0.append(47, 29);
            f1242q0.append(52, 35);
            f1242q0.append(51, 34);
            f1242q0.append(24, 4);
            f1242q0.append(23, 3);
            f1242q0.append(19, 1);
            f1242q0.append(61, 6);
            f1242q0.append(62, 7);
            f1242q0.append(31, 17);
            f1242q0.append(32, 18);
            f1242q0.append(33, 19);
            f1242q0.append(15, 90);
            f1242q0.append(0, 26);
            f1242q0.append(48, 31);
            f1242q0.append(49, 32);
            f1242q0.append(30, 10);
            f1242q0.append(29, 9);
            f1242q0.append(66, 13);
            f1242q0.append(69, 16);
            f1242q0.append(67, 14);
            f1242q0.append(64, 11);
            f1242q0.append(68, 15);
            f1242q0.append(65, 12);
            f1242q0.append(55, 38);
            f1242q0.append(41, 37);
            f1242q0.append(40, 39);
            f1242q0.append(54, 40);
            f1242q0.append(39, 20);
            f1242q0.append(53, 36);
            f1242q0.append(28, 5);
            f1242q0.append(42, 91);
            f1242q0.append(50, 91);
            f1242q0.append(45, 91);
            f1242q0.append(22, 91);
            f1242q0.append(18, 91);
            f1242q0.append(3, 23);
            f1242q0.append(5, 27);
            f1242q0.append(7, 30);
            f1242q0.append(8, 8);
            f1242q0.append(4, 33);
            f1242q0.append(6, 2);
            f1242q0.append(1, 22);
            f1242q0.append(2, 21);
            f1242q0.append(56, 41);
            f1242q0.append(34, 42);
            f1242q0.append(17, 41);
            f1242q0.append(16, 42);
            f1242q0.append(71, 76);
            f1242q0.append(25, 61);
            f1242q0.append(27, 62);
            f1242q0.append(26, 63);
            f1242q0.append(60, 69);
            f1242q0.append(38, 70);
            f1242q0.append(12, 71);
            f1242q0.append(10, 72);
            f1242q0.append(11, 73);
            f1242q0.append(13, 74);
            f1242q0.append(9, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.e.f27966f);
            this.f1245b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f1242q0.get(index);
                switch (i11) {
                    case 1:
                        int i12 = this.f1275q;
                        int[] iArr = b.f1217d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1275q = resourceId;
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        int i13 = this.f1273p;
                        int[] iArr2 = b.f1217d;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1273p = resourceId2;
                        break;
                    case 4:
                        int i14 = this.f1271o;
                        int[] iArr3 = b.f1217d;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1271o = resourceId3;
                        break;
                    case 5:
                        this.f1284z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case b4.f10106f /*8*/:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        int i15 = this.f1281w;
                        int[] iArr4 = b.f1217d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1281w = resourceId4;
                        break;
                    case 10:
                        int i16 = this.f1280v;
                        int[] iArr5 = b.f1217d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, i16);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1280v = resourceId5;
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f1251e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1251e);
                        break;
                    case 18:
                        this.f1253f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1253f);
                        break;
                    case 19:
                        this.f1255g = obtainStyledAttributes.getFloat(index, this.f1255g);
                        break;
                    case 20:
                        this.f1282x = obtainStyledAttributes.getFloat(index, this.f1282x);
                        break;
                    case 21:
                        this.f1249d = obtainStyledAttributes.getLayoutDimension(index, this.f1249d);
                        break;
                    case 22:
                        this.f1247c = obtainStyledAttributes.getLayoutDimension(index, this.f1247c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        int i17 = this.f1259i;
                        int[] iArr6 = b.f1217d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, i17);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1259i = resourceId6;
                        break;
                    case 25:
                        int i18 = this.f1261j;
                        int[] iArr7 = b.f1217d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, i18);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1261j = resourceId7;
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        int i19 = this.f1263k;
                        int[] iArr8 = b.f1217d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, i19);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1263k = resourceId8;
                        break;
                    case 29:
                        int i20 = this.f1265l;
                        int[] iArr9 = b.f1217d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, i20);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1265l = resourceId9;
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        int i21 = this.f1278t;
                        int[] iArr10 = b.f1217d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, i21);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1278t = resourceId10;
                        break;
                    case 32:
                        int i22 = this.f1279u;
                        int[] iArr11 = b.f1217d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, i22);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1279u = resourceId11;
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        int i23 = this.f1269n;
                        int[] iArr12 = b.f1217d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, i23);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1269n = resourceId12;
                        break;
                    case 35:
                        int i24 = this.f1267m;
                        int[] iArr13 = b.f1217d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, i24);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1267m = resourceId13;
                        break;
                    case 36:
                        this.f1283y = obtainStyledAttributes.getFloat(index, this.f1283y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        b.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                int i25 = this.A;
                                int[] iArr14 = b.f1217d;
                                int resourceId14 = obtainStyledAttributes.getResourceId(index, i25);
                                if (resourceId14 == -1) {
                                    resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                }
                                this.A = resourceId14;
                                break;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1252e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1254f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1256g0 = obtainStyledAttributes.getInt(index, this.f1256g0);
                                        break;
                                    case 73:
                                        this.f1258h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1258h0);
                                        break;
                                    case 74:
                                        this.f1264k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1272o0 = obtainStyledAttributes.getBoolean(index, this.f1272o0);
                                        break;
                                    case 76:
                                        this.f1274p0 = obtainStyledAttributes.getInt(index, this.f1274p0);
                                        break;
                                    case 77:
                                        int i26 = this.f1276r;
                                        int[] iArr15 = b.f1217d;
                                        int resourceId15 = obtainStyledAttributes.getResourceId(index, i26);
                                        if (resourceId15 == -1) {
                                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f1276r = resourceId15;
                                        break;
                                    case 78:
                                        int i27 = this.f1277s;
                                        int[] iArr16 = b.f1217d;
                                        int resourceId16 = obtainStyledAttributes.getResourceId(index, i27);
                                        if (resourceId16 == -1) {
                                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f1277s = resourceId16;
                                        break;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.f1246b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1246b0);
                                        break;
                                    case 84:
                                        this.f1244a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1244a0);
                                        break;
                                    case 85:
                                        this.f1250d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1250d0);
                                        break;
                                    case 86:
                                        this.f1248c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1248c0);
                                        break;
                                    case 87:
                                        this.f1268m0 = obtainStyledAttributes.getBoolean(index, this.f1268m0);
                                        break;
                                    case 88:
                                        this.f1270n0 = obtainStyledAttributes.getBoolean(index, this.f1270n0);
                                        break;
                                    case 89:
                                        this.f1266l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1257h = obtainStyledAttributes.getBoolean(index, this.f1257h);
                                        break;
                                    case 91:
                                        StringBuilder a10 = android.support.v4.media.a.a("unused attribute 0x");
                                        a10.append(Integer.toHexString(index));
                                        a10.append("   ");
                                        a10.append(f1242q0.get(index));
                                        Log.w("ConstraintSet", a10.toString());
                                        break;
                                    default:
                                        StringBuilder a11 = android.support.v4.media.a.a("Unknown attribute 0x");
                                        a11.append(Integer.toHexString(index));
                                        a11.append("   ");
                                        a11.append(f1242q0.get(index));
                                        Log.w("ConstraintSet", a11.toString());
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class c {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f1285o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1286a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1287b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f1288c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f1289d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1290e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1291f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f1292g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f1293h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f1294i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f1295j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f1296k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f1297l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1298m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f1299n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1285o = sparseIntArray;
            sparseIntArray.append(3, 1);
            f1285o.append(5, 2);
            f1285o.append(9, 3);
            f1285o.append(2, 4);
            f1285o.append(1, 5);
            f1285o.append(0, 6);
            f1285o.append(4, 7);
            f1285o.append(8, 8);
            f1285o.append(7, 9);
            f1285o.append(6, 10);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.e.f27967g);
            this.f1286a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1285o.get(index)) {
                    case 1:
                        this.f1294i = obtainStyledAttributes.getFloat(index, this.f1294i);
                        break;
                    case 2:
                        this.f1290e = obtainStyledAttributes.getInt(index, this.f1290e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f1289d = u.a.f25912c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f1289d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f1291f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i11 = this.f1287b;
                        int[] iArr = b.f1217d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1287b = resourceId;
                        break;
                    case 6:
                        this.f1288c = obtainStyledAttributes.getInteger(index, this.f1288c);
                        break;
                    case 7:
                        this.f1292g = obtainStyledAttributes.getFloat(index, this.f1292g);
                        break;
                    case b4.f10106f /*8*/:
                        this.f1296k = obtainStyledAttributes.getInteger(index, this.f1296k);
                        break;
                    case 9:
                        this.f1295j = obtainStyledAttributes.getFloat(index, this.f1295j);
                        break;
                    case 10:
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 != 1) {
                            if (i12 != 3) {
                                this.f1298m = obtainStyledAttributes.getInteger(index, this.f1299n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1297l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f1298m = -1;
                                    break;
                                } else {
                                    this.f1299n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f1298m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1299n = resourceId2;
                            if (resourceId2 == -1) {
                                break;
                            } else {
                                this.f1298m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1300a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1301b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1302c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f1303d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1304e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.e.f27969i);
            this.f1300a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f1303d = obtainStyledAttributes.getFloat(index, this.f1303d);
                } else if (index == 0) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f1301b);
                    this.f1301b = i11;
                    int[] iArr = b.f1217d;
                    this.f1301b = b.f1217d[i11];
                } else if (index == 4) {
                    this.f1302c = obtainStyledAttributes.getInt(index, this.f1302c);
                } else if (index == 3) {
                    this.f1304e = obtainStyledAttributes.getFloat(index, this.f1304e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class e {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f1305o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1306a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f1307b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1308c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1309d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1310e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1311f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1312g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f1313h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f1314i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1315j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1316k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1317l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1318m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f1319n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1305o = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1305o.append(7, 2);
            f1305o.append(8, 3);
            f1305o.append(4, 4);
            f1305o.append(5, 5);
            f1305o.append(0, 6);
            f1305o.append(1, 7);
            f1305o.append(2, 8);
            f1305o.append(3, 9);
            f1305o.append(9, 10);
            f1305o.append(10, 11);
            f1305o.append(11, 12);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y.e.f27971k);
            this.f1306a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1305o.get(index)) {
                    case 1:
                        this.f1307b = obtainStyledAttributes.getFloat(index, this.f1307b);
                        break;
                    case 2:
                        this.f1308c = obtainStyledAttributes.getFloat(index, this.f1308c);
                        break;
                    case 3:
                        this.f1309d = obtainStyledAttributes.getFloat(index, this.f1309d);
                        break;
                    case 4:
                        this.f1310e = obtainStyledAttributes.getFloat(index, this.f1310e);
                        break;
                    case 5:
                        this.f1311f = obtainStyledAttributes.getFloat(index, this.f1311f);
                        break;
                    case 6:
                        this.f1312g = obtainStyledAttributes.getDimension(index, this.f1312g);
                        break;
                    case 7:
                        this.f1313h = obtainStyledAttributes.getDimension(index, this.f1313h);
                        break;
                    case b4.f10106f /*8*/:
                        this.f1315j = obtainStyledAttributes.getDimension(index, this.f1315j);
                        break;
                    case 9:
                        this.f1316k = obtainStyledAttributes.getDimension(index, this.f1316k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1317l = obtainStyledAttributes.getDimension(index, this.f1317l);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1318m = true;
                            this.f1319n = obtainStyledAttributes.getDimension(index, this.f1319n);
                            break;
                        }
                    case 12:
                        int i11 = this.f1314i;
                        int[] iArr = b.f1217d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1314i = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1218e.append(82, 25);
        f1218e.append(83, 26);
        f1218e.append(85, 29);
        f1218e.append(86, 30);
        f1218e.append(92, 36);
        f1218e.append(91, 35);
        f1218e.append(63, 4);
        f1218e.append(62, 3);
        f1218e.append(58, 1);
        f1218e.append(60, 91);
        f1218e.append(59, 92);
        f1218e.append(101, 6);
        f1218e.append(102, 7);
        f1218e.append(70, 17);
        f1218e.append(71, 18);
        f1218e.append(72, 19);
        f1218e.append(54, 99);
        f1218e.append(0, 27);
        f1218e.append(87, 32);
        f1218e.append(88, 33);
        f1218e.append(69, 10);
        f1218e.append(68, 9);
        f1218e.append(106, 13);
        f1218e.append(109, 16);
        f1218e.append(107, 14);
        f1218e.append(104, 11);
        f1218e.append(108, 15);
        f1218e.append(105, 12);
        f1218e.append(95, 40);
        f1218e.append(80, 39);
        f1218e.append(79, 41);
        f1218e.append(94, 42);
        f1218e.append(78, 20);
        f1218e.append(93, 37);
        f1218e.append(67, 5);
        f1218e.append(81, 87);
        f1218e.append(90, 87);
        f1218e.append(84, 87);
        f1218e.append(61, 87);
        f1218e.append(57, 87);
        f1218e.append(5, 24);
        f1218e.append(7, 28);
        f1218e.append(23, 31);
        f1218e.append(24, 8);
        f1218e.append(6, 34);
        f1218e.append(8, 2);
        f1218e.append(3, 23);
        f1218e.append(4, 21);
        f1218e.append(96, 95);
        f1218e.append(73, 96);
        f1218e.append(2, 22);
        f1218e.append(13, 43);
        f1218e.append(26, 44);
        f1218e.append(21, 45);
        f1218e.append(22, 46);
        f1218e.append(20, 60);
        f1218e.append(18, 47);
        f1218e.append(19, 48);
        f1218e.append(14, 49);
        f1218e.append(15, 50);
        f1218e.append(16, 51);
        f1218e.append(17, 52);
        f1218e.append(25, 53);
        f1218e.append(97, 54);
        f1218e.append(74, 55);
        f1218e.append(98, 56);
        f1218e.append(75, 57);
        f1218e.append(99, 58);
        f1218e.append(76, 59);
        f1218e.append(64, 61);
        f1218e.append(66, 62);
        f1218e.append(65, 63);
        f1218e.append(28, 64);
        f1218e.append(121, 65);
        f1218e.append(35, 66);
        f1218e.append(122, 67);
        f1218e.append(113, 79);
        f1218e.append(1, 38);
        f1218e.append(112, 68);
        f1218e.append(100, 69);
        f1218e.append(77, 70);
        f1218e.append(111, 97);
        f1218e.append(32, 71);
        f1218e.append(30, 72);
        f1218e.append(31, 73);
        f1218e.append(33, 74);
        f1218e.append(29, 75);
        f1218e.append(114, 76);
        f1218e.append(89, 77);
        f1218e.append(123, 78);
        f1218e.append(56, 80);
        f1218e.append(55, 81);
        f1218e.append(116, 82);
        f1218e.append(120, 83);
        f1218e.append(119, 84);
        f1218e.append(118, 85);
        f1218e.append(117, 86);
        f1219f.append(85, 6);
        f1219f.append(85, 7);
        f1219f.append(0, 27);
        f1219f.append(89, 13);
        f1219f.append(92, 16);
        f1219f.append(90, 14);
        f1219f.append(87, 11);
        f1219f.append(91, 15);
        f1219f.append(88, 12);
        f1219f.append(78, 40);
        f1219f.append(71, 39);
        f1219f.append(70, 41);
        f1219f.append(77, 42);
        f1219f.append(69, 20);
        f1219f.append(76, 37);
        f1219f.append(60, 5);
        f1219f.append(72, 87);
        f1219f.append(75, 87);
        f1219f.append(73, 87);
        f1219f.append(57, 87);
        f1219f.append(56, 87);
        f1219f.append(5, 24);
        f1219f.append(7, 28);
        f1219f.append(23, 31);
        f1219f.append(24, 8);
        f1219f.append(6, 34);
        f1219f.append(8, 2);
        f1219f.append(3, 23);
        f1219f.append(4, 21);
        f1219f.append(79, 95);
        f1219f.append(64, 96);
        f1219f.append(2, 22);
        f1219f.append(13, 43);
        f1219f.append(26, 44);
        f1219f.append(21, 45);
        f1219f.append(22, 46);
        f1219f.append(20, 60);
        f1219f.append(18, 47);
        f1219f.append(19, 48);
        f1219f.append(14, 49);
        f1219f.append(15, 50);
        f1219f.append(16, 51);
        f1219f.append(17, 52);
        f1219f.append(25, 53);
        f1219f.append(80, 54);
        f1219f.append(65, 55);
        f1219f.append(81, 56);
        f1219f.append(66, 57);
        f1219f.append(82, 58);
        f1219f.append(67, 59);
        f1219f.append(59, 62);
        f1219f.append(58, 63);
        f1219f.append(28, 64);
        f1219f.append(105, 65);
        f1219f.append(34, 66);
        f1219f.append(106, 67);
        f1219f.append(96, 79);
        f1219f.append(1, 38);
        f1219f.append(97, 98);
        f1219f.append(95, 68);
        f1219f.append(83, 69);
        f1219f.append(68, 70);
        f1219f.append(32, 71);
        f1219f.append(30, 72);
        f1219f.append(31, 73);
        f1219f.append(33, 74);
        f1219f.append(29, 75);
        f1219f.append(98, 76);
        f1219f.append(74, 77);
        f1219f.append(107, 78);
        f1219f.append(55, 80);
        f1219f.append(54, 81);
        f1219f.append(100, 82);
        f1219f.append(104, 83);
        f1219f.append(103, 84);
        f1219f.append(102, 85);
        f1219f.append(101, 86);
        f1219f.append(94, 97);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006b
            r1 = -2
            if (r0 == r6) goto L_0x0027
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L_0x002d
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r1) goto L_0x002b
            if (r9 == r5) goto L_0x002b
        L_0x0025:
            r1 = 0
            goto L_0x002c
        L_0x0027:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002b:
            r1 = r9
        L_0x002c:
            r4 = 0
        L_0x002d:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r9 == 0) goto L_0x003f
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x003a
            r8.width = r1
            r8.W = r4
            goto L_0x006a
        L_0x003a:
            r8.height = r1
            r8.X = r4
            goto L_0x006a
        L_0x003f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.C0015b
            if (r9 == 0) goto L_0x0051
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0015b) r8
            if (r11 != 0) goto L_0x004c
            r8.f1247c = r1
            r8.f1268m0 = r4
            goto L_0x006a
        L_0x004c:
            r8.f1249d = r1
            r8.f1270n0 = r4
            goto L_0x006a
        L_0x0051:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.a.C0014a
            if (r9 == 0) goto L_0x006a
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0014a) r8
            if (r11 != 0) goto L_0x0062
            r8.b(r3, r1)
            r9 = 80
            r8.d(r9, r4)
            goto L_0x006a
        L_0x0062:
            r8.b(r2, r1)
            r9 = 81
            r8.d(r9, r4)
        L_0x006a:
            return
        L_0x006b:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0073
            goto L_0x0173
        L_0x0073:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x0173
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x0173
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x0173
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00c8
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r10 == 0) goto L_0x00b3
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x00ac
            r8.width = r7
            goto L_0x00ae
        L_0x00ac:
            r8.height = r7
        L_0x00ae:
            h(r8, r9)
            goto L_0x0173
        L_0x00b3:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0015b
            if (r10 == 0) goto L_0x00bd
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0015b) r8
            r8.f1284z = r9
            goto L_0x0173
        L_0x00bd:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.a.C0014a
            if (r10 == 0) goto L_0x0173
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0014a) r8
            r8.c(r6, r9)
            goto L_0x0173
        L_0x00c8:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0116
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0173 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x0173 }
            if (r10 == 0) goto L_0x00e8
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x0173 }
            if (r11 != 0) goto L_0x00e2
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0173 }
            r8.H = r9     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x00e2:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0173 }
            r8.I = r9     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x00e8:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0015b     // Catch:{ NumberFormatException -> 0x0173 }
            if (r10 == 0) goto L_0x00fc
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0015b) r8     // Catch:{ NumberFormatException -> 0x0173 }
            if (r11 != 0) goto L_0x00f6
            r8.f1247c = r7     // Catch:{ NumberFormatException -> 0x0173 }
            r8.V = r9     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x00f6:
            r8.f1249d = r7     // Catch:{ NumberFormatException -> 0x0173 }
            r8.U = r9     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x00fc:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.a.C0014a     // Catch:{ NumberFormatException -> 0x0173 }
            if (r10 == 0) goto L_0x0173
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0014a) r8     // Catch:{ NumberFormatException -> 0x0173 }
            if (r11 != 0) goto L_0x010d
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0173 }
            r10 = 39
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x010d:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0173 }
            r10 = 40
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x0116:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0173
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0173 }
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x0173 }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x0173 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x0173 }
            r0 = 2
            if (r10 == 0) goto L_0x0144
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x0173 }
            if (r11 != 0) goto L_0x013d
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0173 }
            r8.R = r9     // Catch:{ NumberFormatException -> 0x0173 }
            r8.L = r0     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x013d:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0173 }
            r8.S = r9     // Catch:{ NumberFormatException -> 0x0173 }
            r8.M = r0     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x0144:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0015b     // Catch:{ NumberFormatException -> 0x0173 }
            if (r10 == 0) goto L_0x015a
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0015b) r8     // Catch:{ NumberFormatException -> 0x0173 }
            if (r11 != 0) goto L_0x0153
            r8.f1247c = r7     // Catch:{ NumberFormatException -> 0x0173 }
            r8.f1252e0 = r9     // Catch:{ NumberFormatException -> 0x0173 }
            r8.Y = r0     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x0153:
            r8.f1249d = r7     // Catch:{ NumberFormatException -> 0x0173 }
            r8.f1254f0 = r9     // Catch:{ NumberFormatException -> 0x0173 }
            r8.Z = r0     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x015a:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.a.C0014a     // Catch:{ NumberFormatException -> 0x0173 }
            if (r9 == 0) goto L_0x0173
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0014a) r8     // Catch:{ NumberFormatException -> 0x0173 }
            if (r11 != 0) goto L_0x016b
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0173 }
            r9 = 54
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0173 }
            goto L_0x0173
        L_0x016b:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0173 }
            r9 = 55
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0173 }
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i10 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i10);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i10, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        aVar.G = str;
    }

    public void a(ConstraintLayout constraintLayout) {
        b(constraintLayout, true);
        constraintLayout.setConstraintSet((b) null);
        constraintLayout.requestLayout();
    }

    public void b(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1222c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1222c.containsKey(Integer.valueOf(id2))) {
                StringBuilder a10 = android.support.v4.media.a.a("id unknown ");
                a10.append(x.a.b(childAt));
                Log.w("ConstraintSet", a10.toString());
            } else if (this.f1221b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f1222c.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = this.f1222c.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f1226d.f1260i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f1226d.f1256g0);
                            barrier.setMargin(aVar.f1226d.f1258h0);
                            barrier.setAllowsGoneWidget(aVar.f1226d.f1272o0);
                            C0015b bVar = aVar.f1226d;
                            int[] iArr = bVar.f1262j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1264k0;
                                if (str != null) {
                                    bVar.f1262j0 = d(barrier, str);
                                    barrier.setReferencedIds(aVar.f1226d.f1262j0);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        if (z10) {
                            y.a.b(childAt, aVar.f1228f);
                        }
                        childAt.setLayoutParams(aVar2);
                        d dVar = aVar.f1224b;
                        if (dVar.f1302c == 0) {
                            childAt.setVisibility(dVar.f1301b);
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        childAt.setAlpha(aVar.f1224b.f1303d);
                        childAt.setRotation(aVar.f1227e.f1307b);
                        childAt.setRotationX(aVar.f1227e.f1308c);
                        childAt.setRotationY(aVar.f1227e.f1309d);
                        childAt.setScaleX(aVar.f1227e.f1310e);
                        childAt.setScaleY(aVar.f1227e.f1311f);
                        e eVar = aVar.f1227e;
                        if (eVar.f1314i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1227e.f1314i);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1312g)) {
                                childAt.setPivotX(aVar.f1227e.f1312g);
                            }
                            if (!Float.isNaN(aVar.f1227e.f1313h)) {
                                childAt.setPivotY(aVar.f1227e.f1313h);
                            }
                        }
                        childAt.setTranslationX(aVar.f1227e.f1315j);
                        childAt.setTranslationY(aVar.f1227e.f1316k);
                        if (i11 >= 21) {
                            childAt.setTranslationZ(aVar.f1227e.f1317l);
                            e eVar2 = aVar.f1227e;
                            if (eVar2.f1318m) {
                                childAt.setElevation(eVar2.f1319n);
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f1222c.get(num);
            if (aVar3 != null) {
                if (aVar3.f1226d.f1260i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0015b bVar2 = aVar3.f1226d;
                    int[] iArr2 = bVar2.f1262j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f1264k0;
                        if (str2 != null) {
                            bVar2.f1262j0 = d(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.f1226d.f1262j0);
                        }
                    }
                    barrier2.setType(aVar3.f1226d.f1256g0);
                    barrier2.setMargin(aVar3.f1226d.f1258h0);
                    ConstraintLayout.a b10 = constraintLayout.generateDefaultLayoutParams();
                    barrier2.k();
                    aVar3.a(b10);
                    constraintLayout.addView(barrier2, b10);
                }
                if (aVar3.f1226d.f1243a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a b11 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.a(b11);
                    constraintLayout.addView(guideline, b11);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof a) {
                ((a) childAt2).g(constraintLayout);
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        bVar.f1222c.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!bVar.f1221b || id2 != -1) {
                if (!bVar.f1222c.containsKey(Integer.valueOf(id2))) {
                    bVar.f1222c.put(Integer.valueOf(id2), new a());
                }
                a aVar2 = bVar.f1222c.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    HashMap<String, y.a> hashMap = bVar.f1220a;
                    HashMap<String, y.a> hashMap2 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap.keySet()) {
                        y.a aVar3 = hashMap.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                hashMap2.put(next, new y.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                try {
                                    hashMap2.put(next, new y.a(aVar3, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0])));
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    e.printStackTrace();
                                } catch (InvocationTargetException e12) {
                                    e = e12;
                                    e.printStackTrace();
                                }
                            }
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            e.printStackTrace();
                        } catch (IllegalAccessException e14) {
                            e = e14;
                            e.printStackTrace();
                        } catch (InvocationTargetException e15) {
                            e = e15;
                            e.printStackTrace();
                        }
                    }
                    aVar2.f1228f = hashMap2;
                    aVar2.b(id2, aVar);
                    aVar2.f1224b.f1301b = childAt.getVisibility();
                    int i11 = Build.VERSION.SDK_INT;
                    aVar2.f1224b.f1303d = childAt.getAlpha();
                    aVar2.f1227e.f1307b = childAt.getRotation();
                    aVar2.f1227e.f1308c = childAt.getRotationX();
                    aVar2.f1227e.f1309d = childAt.getRotationY();
                    aVar2.f1227e.f1310e = childAt.getScaleX();
                    aVar2.f1227e.f1311f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar2.f1227e;
                        eVar.f1312g = pivotX;
                        eVar.f1313h = pivotY;
                    }
                    aVar2.f1227e.f1315j = childAt.getTranslationX();
                    aVar2.f1227e.f1316k = childAt.getTranslationY();
                    if (i11 >= 21) {
                        aVar2.f1227e.f1317l = childAt.getTranslationZ();
                        e eVar2 = aVar2.f1227e;
                        if (eVar2.f1318m) {
                            eVar2.f1319n = childAt.getElevation();
                        }
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar2.f1226d.f1272o0 = barrier.getAllowsGoneWidget();
                        aVar2.f1226d.f1262j0 = barrier.getReferencedIds();
                        aVar2.f1226d.f1256g0 = barrier.getType();
                        aVar2.f1226d.f1258h0 = barrier.getMargin();
                    }
                }
                i10++;
                bVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final int[] d(View view, String str) {
        int i10;
        Object c10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = y.d.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c10 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c10 instanceof Integer)) {
                i10 = ((Integer) c10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    public final a e(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? y.e.f27963c : y.e.f27961a);
        int i10 = 3;
        int i11 = 1;
        if (z10) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            a.C0014a aVar2 = new a.C0014a();
            aVar.f1229g = aVar2;
            aVar.f1225c.f1286a = false;
            aVar.f1226d.f1245b = false;
            aVar.f1224b.f1300a = false;
            aVar.f1227e.f1306a = false;
            int i12 = 0;
            while (i12 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i12);
                switch (f1219f.get(index)) {
                    case 2:
                        aVar2.b(2, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.J));
                        break;
                    case 5:
                        aVar2.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        aVar2.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1226d.D));
                        break;
                    case 7:
                        aVar2.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1226d.E));
                        break;
                    case b4.f10106f /*8*/:
                        aVar2.b(8, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.K));
                        break;
                    case 11:
                        aVar2.b(11, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.Q));
                        break;
                    case 12:
                        aVar2.b(12, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.R));
                        break;
                    case 13:
                        aVar2.b(13, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.N));
                        break;
                    case 14:
                        aVar2.b(14, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.P));
                        break;
                    case 15:
                        aVar2.b(15, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.S));
                        break;
                    case 16:
                        aVar2.b(16, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.O));
                        break;
                    case 17:
                        aVar2.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1226d.f1251e));
                        break;
                    case 18:
                        aVar2.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1226d.f1253f));
                        break;
                    case 19:
                        aVar2.a(19, obtainStyledAttributes.getFloat(index, aVar.f1226d.f1255g));
                        break;
                    case 20:
                        aVar2.a(20, obtainStyledAttributes.getFloat(index, aVar.f1226d.f1282x));
                        break;
                    case 21:
                        aVar2.b(21, obtainStyledAttributes.getLayoutDimension(index, aVar.f1226d.f1249d));
                        break;
                    case 22:
                        aVar2.b(22, f1217d[obtainStyledAttributes.getInt(index, aVar.f1224b.f1301b)]);
                        break;
                    case 23:
                        aVar2.b(23, obtainStyledAttributes.getLayoutDimension(index, aVar.f1226d.f1247c));
                        break;
                    case 24:
                        aVar2.b(24, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.G));
                        break;
                    case 27:
                        aVar2.b(27, obtainStyledAttributes.getInt(index, aVar.f1226d.F));
                        break;
                    case 28:
                        aVar2.b(28, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.H));
                        break;
                    case 31:
                        aVar2.b(31, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.L));
                        break;
                    case 34:
                        aVar2.b(34, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.I));
                        break;
                    case 37:
                        aVar2.a(37, obtainStyledAttributes.getFloat(index, aVar.f1226d.f1283y));
                        break;
                    case 38:
                        int resourceId = obtainStyledAttributes.getResourceId(index, aVar.f1223a);
                        aVar.f1223a = resourceId;
                        aVar2.b(38, resourceId);
                        break;
                    case 39:
                        aVar2.a(39, obtainStyledAttributes.getFloat(index, aVar.f1226d.V));
                        break;
                    case 40:
                        aVar2.a(40, obtainStyledAttributes.getFloat(index, aVar.f1226d.U));
                        break;
                    case 41:
                        aVar2.b(41, obtainStyledAttributes.getInt(index, aVar.f1226d.W));
                        break;
                    case 42:
                        aVar2.b(42, obtainStyledAttributes.getInt(index, aVar.f1226d.X));
                        break;
                    case 43:
                        aVar2.a(43, obtainStyledAttributes.getFloat(index, aVar.f1224b.f1303d));
                        break;
                    case 44:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            aVar2.d(44, true);
                            aVar2.a(44, obtainStyledAttributes.getDimension(index, aVar.f1227e.f1319n));
                            break;
                        }
                    case 45:
                        aVar2.a(45, obtainStyledAttributes.getFloat(index, aVar.f1227e.f1308c));
                        break;
                    case 46:
                        aVar2.a(46, obtainStyledAttributes.getFloat(index, aVar.f1227e.f1309d));
                        break;
                    case 47:
                        aVar2.a(47, obtainStyledAttributes.getFloat(index, aVar.f1227e.f1310e));
                        break;
                    case 48:
                        aVar2.a(48, obtainStyledAttributes.getFloat(index, aVar.f1227e.f1311f));
                        break;
                    case 49:
                        aVar2.a(49, obtainStyledAttributes.getDimension(index, aVar.f1227e.f1312g));
                        break;
                    case 50:
                        aVar2.a(50, obtainStyledAttributes.getDimension(index, aVar.f1227e.f1313h));
                        break;
                    case 51:
                        aVar2.a(51, obtainStyledAttributes.getDimension(index, aVar.f1227e.f1315j));
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*52*/:
                        aVar2.a(52, obtainStyledAttributes.getDimension(index, aVar.f1227e.f1316k));
                        break;
                    case 53:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            aVar2.a(53, obtainStyledAttributes.getDimension(index, aVar.f1227e.f1317l));
                            break;
                        }
                    case 54:
                        aVar2.b(54, obtainStyledAttributes.getInt(index, aVar.f1226d.Y));
                        break;
                    case 55:
                        aVar2.b(55, obtainStyledAttributes.getInt(index, aVar.f1226d.Z));
                        break;
                    case 56:
                        aVar2.b(56, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.f1244a0));
                        break;
                    case 57:
                        aVar2.b(57, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.f1246b0));
                        break;
                    case 58:
                        aVar2.b(58, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.f1248c0));
                        break;
                    case 59:
                        aVar2.b(59, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.f1250d0));
                        break;
                    case 60:
                        aVar2.a(60, obtainStyledAttributes.getFloat(index, aVar.f1227e.f1307b));
                        break;
                    case 62:
                        aVar2.b(62, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.B));
                        break;
                    case 63:
                        aVar2.a(63, obtainStyledAttributes.getFloat(index, aVar.f1226d.C));
                        break;
                    case 64:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, aVar.f1225c.f1287b);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        aVar2.b(64, resourceId2);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            aVar2.c(65, u.a.f25912c[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        } else {
                            aVar2.c(65, obtainStyledAttributes.getString(index));
                            break;
                        }
                    case 66:
                        aVar2.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        aVar2.a(67, obtainStyledAttributes.getFloat(index, aVar.f1225c.f1294i));
                        break;
                    case 68:
                        aVar2.a(68, obtainStyledAttributes.getFloat(index, aVar.f1224b.f1304e));
                        break;
                    case 69:
                        aVar2.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        aVar2.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        aVar2.b(72, obtainStyledAttributes.getInt(index, aVar.f1226d.f1256g0));
                        break;
                    case 73:
                        aVar2.b(73, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.f1258h0));
                        break;
                    case 74:
                        aVar2.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        aVar2.d(75, obtainStyledAttributes.getBoolean(index, aVar.f1226d.f1272o0));
                        break;
                    case 76:
                        aVar2.b(76, obtainStyledAttributes.getInt(index, aVar.f1225c.f1290e));
                        break;
                    case 77:
                        aVar2.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        aVar2.b(78, obtainStyledAttributes.getInt(index, aVar.f1224b.f1302c));
                        break;
                    case 79:
                        aVar2.a(79, obtainStyledAttributes.getFloat(index, aVar.f1225c.f1292g));
                        break;
                    case 80:
                        aVar2.d(80, obtainStyledAttributes.getBoolean(index, aVar.f1226d.f1268m0));
                        break;
                    case 81:
                        aVar2.d(81, obtainStyledAttributes.getBoolean(index, aVar.f1226d.f1270n0));
                        break;
                    case 82:
                        aVar2.b(82, obtainStyledAttributes.getInteger(index, aVar.f1225c.f1288c));
                        break;
                    case 83:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, aVar.f1227e.f1314i);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        aVar2.b(83, resourceId3);
                        break;
                    case 84:
                        aVar2.b(84, obtainStyledAttributes.getInteger(index, aVar.f1225c.f1296k));
                        break;
                    case 85:
                        aVar2.a(85, obtainStyledAttributes.getFloat(index, aVar.f1225c.f1295j));
                        break;
                    case 86:
                        int i13 = obtainStyledAttributes.peekValue(index).type;
                        if (i13 != i11) {
                            if (i13 != 3) {
                                c cVar = aVar.f1225c;
                                cVar.f1298m = obtainStyledAttributes.getInteger(index, cVar.f1299n);
                                aVar2.b(88, aVar.f1225c.f1298m);
                                break;
                            } else {
                                aVar.f1225c.f1297l = obtainStyledAttributes.getString(index);
                                aVar2.c(90, aVar.f1225c.f1297l);
                                if (aVar.f1225c.f1297l.indexOf("/") <= 0) {
                                    aVar.f1225c.f1298m = -1;
                                    aVar2.b(88, -1);
                                    break;
                                } else {
                                    aVar.f1225c.f1299n = obtainStyledAttributes.getResourceId(index, -1);
                                    aVar2.b(89, aVar.f1225c.f1299n);
                                    aVar.f1225c.f1298m = -2;
                                    aVar2.b(88, -2);
                                    break;
                                }
                            }
                        } else {
                            aVar.f1225c.f1299n = obtainStyledAttributes.getResourceId(index, -1);
                            aVar2.b(89, aVar.f1225c.f1299n);
                            c cVar2 = aVar.f1225c;
                            if (cVar2.f1299n == -1) {
                                break;
                            } else {
                                cVar2.f1298m = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    case 87:
                        StringBuilder a10 = android.support.v4.media.a.a("unused attribute 0x");
                        a10.append(Integer.toHexString(index));
                        a10.append("   ");
                        a10.append(f1218e.get(index));
                        Log.w("ConstraintSet", a10.toString());
                        break;
                    case 93:
                        aVar2.b(93, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.M));
                        break;
                    case 94:
                        aVar2.b(94, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1226d.T));
                        break;
                    case 95:
                        g(aVar2, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        g(aVar2, obtainStyledAttributes, index, i11);
                        break;
                    case 97:
                        aVar2.b(97, obtainStyledAttributes.getInt(index, aVar.f1226d.f1274p0));
                        break;
                    case 98:
                        int i14 = x.d.f27233d0;
                        if (obtainStyledAttributes.peekValue(index).type != i10) {
                            aVar.f1223a = obtainStyledAttributes.getResourceId(index, aVar.f1223a);
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        aVar2.d(99, obtainStyledAttributes.getBoolean(index, aVar.f1226d.f1257h));
                        break;
                    default:
                        StringBuilder a11 = android.support.v4.media.a.a("Unknown attribute 0x");
                        a11.append(Integer.toHexString(index));
                        a11.append("   ");
                        a11.append(f1218e.get(index));
                        Log.w("ConstraintSet", a11.toString());
                        break;
                }
                i12++;
                i10 = 3;
                i11 = 1;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount2; i15++) {
                int index2 = obtainStyledAttributes.getIndex(i15);
                if (!(index2 == 1 || 23 == index2 || 24 == index2)) {
                    aVar.f1225c.f1286a = true;
                    aVar.f1226d.f1245b = true;
                    aVar.f1224b.f1300a = true;
                    aVar.f1227e.f1306a = true;
                }
                switch (f1218e.get(index2)) {
                    case 1:
                        C0015b bVar = aVar.f1226d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index2, bVar.f1275q);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar.f1275q = resourceId4;
                        break;
                    case 2:
                        C0015b bVar2 = aVar.f1226d;
                        bVar2.J = obtainStyledAttributes.getDimensionPixelSize(index2, bVar2.J);
                        break;
                    case 3:
                        C0015b bVar3 = aVar.f1226d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index2, bVar3.f1273p);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar3.f1273p = resourceId5;
                        break;
                    case 4:
                        C0015b bVar4 = aVar.f1226d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index2, bVar4.f1271o);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar4.f1271o = resourceId6;
                        break;
                    case 5:
                        aVar.f1226d.f1284z = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        C0015b bVar5 = aVar.f1226d;
                        bVar5.D = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar5.D);
                        break;
                    case 7:
                        C0015b bVar6 = aVar.f1226d;
                        bVar6.E = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar6.E);
                        break;
                    case b4.f10106f /*8*/:
                        C0015b bVar7 = aVar.f1226d;
                        bVar7.K = obtainStyledAttributes.getDimensionPixelSize(index2, bVar7.K);
                        break;
                    case 9:
                        C0015b bVar8 = aVar.f1226d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index2, bVar8.f1281w);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar8.f1281w = resourceId7;
                        break;
                    case 10:
                        C0015b bVar9 = aVar.f1226d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index2, bVar9.f1280v);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar9.f1280v = resourceId8;
                        break;
                    case 11:
                        C0015b bVar10 = aVar.f1226d;
                        bVar10.Q = obtainStyledAttributes.getDimensionPixelSize(index2, bVar10.Q);
                        break;
                    case 12:
                        C0015b bVar11 = aVar.f1226d;
                        bVar11.R = obtainStyledAttributes.getDimensionPixelSize(index2, bVar11.R);
                        break;
                    case 13:
                        C0015b bVar12 = aVar.f1226d;
                        bVar12.N = obtainStyledAttributes.getDimensionPixelSize(index2, bVar12.N);
                        break;
                    case 14:
                        C0015b bVar13 = aVar.f1226d;
                        bVar13.P = obtainStyledAttributes.getDimensionPixelSize(index2, bVar13.P);
                        break;
                    case 15:
                        C0015b bVar14 = aVar.f1226d;
                        bVar14.S = obtainStyledAttributes.getDimensionPixelSize(index2, bVar14.S);
                        break;
                    case 16:
                        C0015b bVar15 = aVar.f1226d;
                        bVar15.O = obtainStyledAttributes.getDimensionPixelSize(index2, bVar15.O);
                        break;
                    case 17:
                        C0015b bVar16 = aVar.f1226d;
                        bVar16.f1251e = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar16.f1251e);
                        break;
                    case 18:
                        C0015b bVar17 = aVar.f1226d;
                        bVar17.f1253f = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar17.f1253f);
                        break;
                    case 19:
                        C0015b bVar18 = aVar.f1226d;
                        bVar18.f1255g = obtainStyledAttributes.getFloat(index2, bVar18.f1255g);
                        break;
                    case 20:
                        C0015b bVar19 = aVar.f1226d;
                        bVar19.f1282x = obtainStyledAttributes.getFloat(index2, bVar19.f1282x);
                        break;
                    case 21:
                        C0015b bVar20 = aVar.f1226d;
                        bVar20.f1249d = obtainStyledAttributes.getLayoutDimension(index2, bVar20.f1249d);
                        break;
                    case 22:
                        d dVar = aVar.f1224b;
                        dVar.f1301b = obtainStyledAttributes.getInt(index2, dVar.f1301b);
                        d dVar2 = aVar.f1224b;
                        dVar2.f1301b = f1217d[dVar2.f1301b];
                        break;
                    case 23:
                        C0015b bVar21 = aVar.f1226d;
                        bVar21.f1247c = obtainStyledAttributes.getLayoutDimension(index2, bVar21.f1247c);
                        break;
                    case 24:
                        C0015b bVar22 = aVar.f1226d;
                        bVar22.G = obtainStyledAttributes.getDimensionPixelSize(index2, bVar22.G);
                        break;
                    case 25:
                        C0015b bVar23 = aVar.f1226d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index2, bVar23.f1259i);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar23.f1259i = resourceId9;
                        break;
                    case 26:
                        C0015b bVar24 = aVar.f1226d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index2, bVar24.f1261j);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar24.f1261j = resourceId10;
                        break;
                    case 27:
                        C0015b bVar25 = aVar.f1226d;
                        bVar25.F = obtainStyledAttributes.getInt(index2, bVar25.F);
                        break;
                    case 28:
                        C0015b bVar26 = aVar.f1226d;
                        bVar26.H = obtainStyledAttributes.getDimensionPixelSize(index2, bVar26.H);
                        break;
                    case 29:
                        C0015b bVar27 = aVar.f1226d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index2, bVar27.f1263k);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar27.f1263k = resourceId11;
                        break;
                    case 30:
                        C0015b bVar28 = aVar.f1226d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index2, bVar28.f1265l);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar28.f1265l = resourceId12;
                        break;
                    case 31:
                        C0015b bVar29 = aVar.f1226d;
                        bVar29.L = obtainStyledAttributes.getDimensionPixelSize(index2, bVar29.L);
                        break;
                    case 32:
                        C0015b bVar30 = aVar.f1226d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index2, bVar30.f1278t);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar30.f1278t = resourceId13;
                        break;
                    case 33:
                        C0015b bVar31 = aVar.f1226d;
                        int resourceId14 = obtainStyledAttributes.getResourceId(index2, bVar31.f1279u);
                        if (resourceId14 == -1) {
                            resourceId14 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar31.f1279u = resourceId14;
                        break;
                    case 34:
                        C0015b bVar32 = aVar.f1226d;
                        bVar32.I = obtainStyledAttributes.getDimensionPixelSize(index2, bVar32.I);
                        break;
                    case 35:
                        C0015b bVar33 = aVar.f1226d;
                        int resourceId15 = obtainStyledAttributes.getResourceId(index2, bVar33.f1269n);
                        if (resourceId15 == -1) {
                            resourceId15 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar33.f1269n = resourceId15;
                        break;
                    case 36:
                        C0015b bVar34 = aVar.f1226d;
                        int resourceId16 = obtainStyledAttributes.getResourceId(index2, bVar34.f1267m);
                        if (resourceId16 == -1) {
                            resourceId16 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar34.f1267m = resourceId16;
                        break;
                    case 37:
                        C0015b bVar35 = aVar.f1226d;
                        bVar35.f1283y = obtainStyledAttributes.getFloat(index2, bVar35.f1283y);
                        break;
                    case 38:
                        aVar.f1223a = obtainStyledAttributes.getResourceId(index2, aVar.f1223a);
                        break;
                    case 39:
                        C0015b bVar36 = aVar.f1226d;
                        bVar36.V = obtainStyledAttributes.getFloat(index2, bVar36.V);
                        break;
                    case 40:
                        C0015b bVar37 = aVar.f1226d;
                        bVar37.U = obtainStyledAttributes.getFloat(index2, bVar37.U);
                        break;
                    case 41:
                        C0015b bVar38 = aVar.f1226d;
                        bVar38.W = obtainStyledAttributes.getInt(index2, bVar38.W);
                        break;
                    case 42:
                        C0015b bVar39 = aVar.f1226d;
                        bVar39.X = obtainStyledAttributes.getInt(index2, bVar39.X);
                        break;
                    case 43:
                        d dVar3 = aVar.f1224b;
                        dVar3.f1303d = obtainStyledAttributes.getFloat(index2, dVar3.f1303d);
                        break;
                    case 44:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            e eVar = aVar.f1227e;
                            eVar.f1318m = true;
                            eVar.f1319n = obtainStyledAttributes.getDimension(index2, eVar.f1319n);
                            break;
                        }
                    case 45:
                        e eVar2 = aVar.f1227e;
                        eVar2.f1308c = obtainStyledAttributes.getFloat(index2, eVar2.f1308c);
                        break;
                    case 46:
                        e eVar3 = aVar.f1227e;
                        eVar3.f1309d = obtainStyledAttributes.getFloat(index2, eVar3.f1309d);
                        break;
                    case 47:
                        e eVar4 = aVar.f1227e;
                        eVar4.f1310e = obtainStyledAttributes.getFloat(index2, eVar4.f1310e);
                        break;
                    case 48:
                        e eVar5 = aVar.f1227e;
                        eVar5.f1311f = obtainStyledAttributes.getFloat(index2, eVar5.f1311f);
                        break;
                    case 49:
                        e eVar6 = aVar.f1227e;
                        eVar6.f1312g = obtainStyledAttributes.getDimension(index2, eVar6.f1312g);
                        break;
                    case 50:
                        e eVar7 = aVar.f1227e;
                        eVar7.f1313h = obtainStyledAttributes.getDimension(index2, eVar7.f1313h);
                        break;
                    case 51:
                        e eVar8 = aVar.f1227e;
                        eVar8.f1315j = obtainStyledAttributes.getDimension(index2, eVar8.f1315j);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*52*/:
                        e eVar9 = aVar.f1227e;
                        eVar9.f1316k = obtainStyledAttributes.getDimension(index2, eVar9.f1316k);
                        break;
                    case 53:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            e eVar10 = aVar.f1227e;
                            eVar10.f1317l = obtainStyledAttributes.getDimension(index2, eVar10.f1317l);
                            break;
                        }
                    case 54:
                        C0015b bVar40 = aVar.f1226d;
                        bVar40.Y = obtainStyledAttributes.getInt(index2, bVar40.Y);
                        break;
                    case 55:
                        C0015b bVar41 = aVar.f1226d;
                        bVar41.Z = obtainStyledAttributes.getInt(index2, bVar41.Z);
                        break;
                    case 56:
                        C0015b bVar42 = aVar.f1226d;
                        bVar42.f1244a0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar42.f1244a0);
                        break;
                    case 57:
                        C0015b bVar43 = aVar.f1226d;
                        bVar43.f1246b0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar43.f1246b0);
                        break;
                    case 58:
                        C0015b bVar44 = aVar.f1226d;
                        bVar44.f1248c0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar44.f1248c0);
                        break;
                    case 59:
                        C0015b bVar45 = aVar.f1226d;
                        bVar45.f1250d0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar45.f1250d0);
                        break;
                    case 60:
                        e eVar11 = aVar.f1227e;
                        eVar11.f1307b = obtainStyledAttributes.getFloat(index2, eVar11.f1307b);
                        break;
                    case 61:
                        C0015b bVar46 = aVar.f1226d;
                        int resourceId17 = obtainStyledAttributes.getResourceId(index2, bVar46.A);
                        if (resourceId17 == -1) {
                            resourceId17 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar46.A = resourceId17;
                        break;
                    case 62:
                        C0015b bVar47 = aVar.f1226d;
                        bVar47.B = obtainStyledAttributes.getDimensionPixelSize(index2, bVar47.B);
                        break;
                    case 63:
                        C0015b bVar48 = aVar.f1226d;
                        bVar48.C = obtainStyledAttributes.getFloat(index2, bVar48.C);
                        break;
                    case 64:
                        c cVar3 = aVar.f1225c;
                        int resourceId18 = obtainStyledAttributes.getResourceId(index2, cVar3.f1287b);
                        if (resourceId18 == -1) {
                            resourceId18 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        cVar3.f1287b = resourceId18;
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            aVar.f1225c.f1289d = u.a.f25912c[obtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        } else {
                            aVar.f1225c.f1289d = obtainStyledAttributes.getString(index2);
                            break;
                        }
                    case 66:
                        aVar.f1225c.f1291f = obtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        c cVar4 = aVar.f1225c;
                        cVar4.f1294i = obtainStyledAttributes.getFloat(index2, cVar4.f1294i);
                        break;
                    case 68:
                        d dVar4 = aVar.f1224b;
                        dVar4.f1304e = obtainStyledAttributes.getFloat(index2, dVar4.f1304e);
                        break;
                    case 69:
                        aVar.f1226d.f1252e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        aVar.f1226d.f1254f0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        C0015b bVar49 = aVar.f1226d;
                        bVar49.f1256g0 = obtainStyledAttributes.getInt(index2, bVar49.f1256g0);
                        break;
                    case 73:
                        C0015b bVar50 = aVar.f1226d;
                        bVar50.f1258h0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar50.f1258h0);
                        break;
                    case 74:
                        aVar.f1226d.f1264k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        C0015b bVar51 = aVar.f1226d;
                        bVar51.f1272o0 = obtainStyledAttributes.getBoolean(index2, bVar51.f1272o0);
                        break;
                    case 76:
                        c cVar5 = aVar.f1225c;
                        cVar5.f1290e = obtainStyledAttributes.getInt(index2, cVar5.f1290e);
                        break;
                    case 77:
                        aVar.f1226d.f1266l0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        d dVar5 = aVar.f1224b;
                        dVar5.f1302c = obtainStyledAttributes.getInt(index2, dVar5.f1302c);
                        break;
                    case 79:
                        c cVar6 = aVar.f1225c;
                        cVar6.f1292g = obtainStyledAttributes.getFloat(index2, cVar6.f1292g);
                        break;
                    case 80:
                        C0015b bVar52 = aVar.f1226d;
                        bVar52.f1268m0 = obtainStyledAttributes.getBoolean(index2, bVar52.f1268m0);
                        break;
                    case 81:
                        C0015b bVar53 = aVar.f1226d;
                        bVar53.f1270n0 = obtainStyledAttributes.getBoolean(index2, bVar53.f1270n0);
                        break;
                    case 82:
                        c cVar7 = aVar.f1225c;
                        cVar7.f1288c = obtainStyledAttributes.getInteger(index2, cVar7.f1288c);
                        break;
                    case 83:
                        e eVar12 = aVar.f1227e;
                        int resourceId19 = obtainStyledAttributes.getResourceId(index2, eVar12.f1314i);
                        if (resourceId19 == -1) {
                            resourceId19 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        eVar12.f1314i = resourceId19;
                        break;
                    case 84:
                        c cVar8 = aVar.f1225c;
                        cVar8.f1296k = obtainStyledAttributes.getInteger(index2, cVar8.f1296k);
                        break;
                    case 85:
                        c cVar9 = aVar.f1225c;
                        cVar9.f1295j = obtainStyledAttributes.getFloat(index2, cVar9.f1295j);
                        break;
                    case 86:
                        int i16 = obtainStyledAttributes.peekValue(index2).type;
                        if (i16 != 1) {
                            if (i16 != 3) {
                                c cVar10 = aVar.f1225c;
                                cVar10.f1298m = obtainStyledAttributes.getInteger(index2, cVar10.f1299n);
                                break;
                            } else {
                                aVar.f1225c.f1297l = obtainStyledAttributes.getString(index2);
                                if (aVar.f1225c.f1297l.indexOf("/") <= 0) {
                                    aVar.f1225c.f1298m = -1;
                                    break;
                                } else {
                                    aVar.f1225c.f1299n = obtainStyledAttributes.getResourceId(index2, -1);
                                    aVar.f1225c.f1298m = -2;
                                    break;
                                }
                            }
                        } else {
                            aVar.f1225c.f1299n = obtainStyledAttributes.getResourceId(index2, -1);
                            c cVar11 = aVar.f1225c;
                            if (cVar11.f1299n == -1) {
                                break;
                            } else {
                                cVar11.f1298m = -2;
                                break;
                            }
                        }
                    case 87:
                        StringBuilder a12 = android.support.v4.media.a.a("unused attribute 0x");
                        a12.append(Integer.toHexString(index2));
                        a12.append("   ");
                        a12.append(f1218e.get(index2));
                        Log.w("ConstraintSet", a12.toString());
                        break;
                    case 91:
                        C0015b bVar54 = aVar.f1226d;
                        int resourceId20 = obtainStyledAttributes.getResourceId(index2, bVar54.f1276r);
                        if (resourceId20 == -1) {
                            resourceId20 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar54.f1276r = resourceId20;
                        break;
                    case 92:
                        C0015b bVar55 = aVar.f1226d;
                        int resourceId21 = obtainStyledAttributes.getResourceId(index2, bVar55.f1277s);
                        if (resourceId21 == -1) {
                            resourceId21 = obtainStyledAttributes.getInt(index2, -1);
                        }
                        bVar55.f1277s = resourceId21;
                        break;
                    case 93:
                        C0015b bVar56 = aVar.f1226d;
                        bVar56.M = obtainStyledAttributes.getDimensionPixelSize(index2, bVar56.M);
                        break;
                    case 94:
                        C0015b bVar57 = aVar.f1226d;
                        bVar57.T = obtainStyledAttributes.getDimensionPixelSize(index2, bVar57.T);
                        break;
                    case 95:
                        g(aVar.f1226d, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        g(aVar.f1226d, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        C0015b bVar58 = aVar.f1226d;
                        bVar58.f1274p0 = obtainStyledAttributes.getInt(index2, bVar58.f1274p0);
                        break;
                    default:
                        StringBuilder a13 = android.support.v4.media.a.a("Unknown attribute 0x");
                        a13.append(Integer.toHexString(index2));
                        a13.append("   ");
                        a13.append(f1218e.get(index2));
                        Log.w("ConstraintSet", a13.toString());
                        break;
                }
            }
            C0015b bVar59 = aVar.f1226d;
            if (bVar59.f1264k0 != null) {
                bVar59.f1262j0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void f(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a e10 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e10.f1226d.f1243a = true;
                    }
                    this.f1222c.put(Integer.valueOf(e10.f1223a), e10);
                }
            }
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }
}
