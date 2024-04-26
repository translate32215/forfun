package t6;

import e.i;
import java.nio.FloatBuffer;
import x6.d;

/* compiled from: ProjectionRenderer */
public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f25756j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f25757k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f25758l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    public static final float[] f25759m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    public static final float[] f25760n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o  reason: collision with root package name */
    public static final float[] f25761o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p  reason: collision with root package name */
    public static final float[] f25762p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public int f25763a;

    /* renamed from: b  reason: collision with root package name */
    public a f25764b;

    /* renamed from: c  reason: collision with root package name */
    public a f25765c;

    /* renamed from: d  reason: collision with root package name */
    public int f25766d;

    /* renamed from: e  reason: collision with root package name */
    public int f25767e;

    /* renamed from: f  reason: collision with root package name */
    public int f25768f;

    /* renamed from: g  reason: collision with root package name */
    public int f25769g;

    /* renamed from: h  reason: collision with root package name */
    public int f25770h;

    /* renamed from: i  reason: collision with root package name */
    public int f25771i;

    /* compiled from: ProjectionRenderer */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f25772a;

        /* renamed from: b  reason: collision with root package name */
        public final FloatBuffer f25773b;

        /* renamed from: c  reason: collision with root package name */
        public final FloatBuffer f25774c;

        /* renamed from: d  reason: collision with root package name */
        public final int f25775d;

        public a(d.b bVar) {
            float[] fArr = bVar.f27867c;
            this.f25772a = fArr.length / 3;
            this.f25773b = i.f(fArr);
            this.f25774c = i.f(bVar.f27868d);
            int i10 = bVar.f27866b;
            if (i10 == 1) {
                this.f25775d = 5;
            } else if (i10 != 2) {
                this.f25775d = 4;
            } else {
                this.f25775d = 6;
            }
        }
    }

    public static boolean a(d dVar) {
        d.a aVar = dVar.f27860a;
        d.a aVar2 = dVar.f27861b;
        d.b[] bVarArr = aVar.f27864a;
        if (bVarArr.length == 1 && bVarArr[0].f27865a == 0) {
            d.b[] bVarArr2 = aVar2.f27864a;
            if (bVarArr2.length == 1 && bVarArr2[0].f27865a == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
