package e;

import android.app.AppOpsManager;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.support.v4.media.a;
import android.util.Log;
import c0.f;
import com.google.android.gms.internal.ads.b7;
import de.w0;
import e8.p50;
import e8.r0;
import f7.c0;
import ge.b;
import ge.c;
import ge.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import v6.v;

public class i {
    public static void a(int i10, String str, int i11) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            Log.e("GlUtil", GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i11, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        c();
    }

    public static final <T> e<T> b(b<T> bVar) {
        return new c(bVar, (w0) null);
    }

    public static void c() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder a10 = a.a("glError ");
                a10.append(GLU.gluErrorString(glGetError));
                Log.e("GlUtil", a10.toString());
            } else {
                return;
            }
        }
    }

    public static int d(Context context, String str) {
        int i10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i11 = Build.VERSION.SDK_INT;
            String d10 = i11 >= 23 ? f.a.d(str) : null;
            if (d10 == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            if (!(Process.myUid() == myUid && n0.b.a(context.getPackageName(), packageName))) {
                i10 = f.a(context, d10, packageName);
            } else if (i11 >= 29) {
                AppOpsManager c10 = f.b.c(context);
                i10 = f.b.a(c10, d10, Binder.getCallingUid(), packageName);
                if (i10 == 0) {
                    i10 = f.b.a(c10, d10, myUid, f.b.b(context));
                }
            } else {
                i10 = f.a(context, d10, packageName);
            }
            if (i10 == 0) {
                return 0;
            }
            return -2;
        }
        return -1;
    }

    public static int e(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        c();
        a(35633, str, glCreateProgram);
        a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder a10 = a.a("Unable to link shader program: \n");
            a10.append(GLES20.glGetProgramInfoLog(glCreateProgram));
            Log.e("GlUtil", a10.toString());
        }
        c();
        return glCreateProgram;
    }

    public static FloatBuffer f(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static long g(v vVar, int i10, int i11) {
        vVar.D(i10);
        if (vVar.a() < 5) {
            return -9223372036854775807L;
        }
        int f10 = vVar.f();
        if ((8388608 & f10) != 0 || ((2096896 & f10) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((f10 & 32) != 0) && vVar.s() >= 7 && vVar.a() >= 7) {
            if ((vVar.s() & 16) == 16) {
                byte[] bArr = new byte[6];
                System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, 6);
                vVar.f26519b += 6;
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static void h(Context context) {
        boolean z10;
        Object obj = b7.f5991b;
        boolean z11 = false;
        if (((Boolean) r0.f16220a.b()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    z11 = true;
                }
            } catch (Exception e10) {
                l0.e.D("Fail to determine debug setting.", e10);
            }
        }
        if (z11) {
            synchronized (b7.f5991b) {
                z10 = b7.f5992c;
            }
            if (!z10) {
                p50<?> b10 = new c0(context).b();
                l0.e.J("Updating ad debug logging enablement.");
                e.g(b10, "AdDebugLogUpdater.updateEnablement");
            }
        }
    }
}
