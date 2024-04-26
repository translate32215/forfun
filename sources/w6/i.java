package w6;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: VideoDecoderGLFrameRenderer */
public class i implements GLSurfaceView.Renderer, l {

    /* renamed from: i  reason: collision with root package name */
    public static final float[] f27087i = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

    /* renamed from: r  reason: collision with root package name */
    public static final String[] f27088r = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: s  reason: collision with root package name */
    public static final FloatBuffer f27089s = e.i.f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: a  reason: collision with root package name */
    public final int[] f27090a = new int[3];

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<k> f27091b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    public int f27092c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f27093d = new int[3];

    /* renamed from: e  reason: collision with root package name */
    public int f27094e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f27095f = new int[3];

    /* renamed from: g  reason: collision with root package name */
    public int[] f27096g = new int[3];

    /* renamed from: h  reason: collision with root package name */
    public k f27097h;

    public i(GLSurfaceView gLSurfaceView) {
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = this.f27095f;
            this.f27096g[i10] = -1;
            iArr[i10] = -1;
        }
    }

    public void onDrawFrame(GL10 gl10) {
        k andSet = this.f27091b.getAndSet((Object) null);
        if (andSet != null || this.f27097h != null) {
            if (andSet != null) {
                k kVar = this.f27097h;
                if (kVar != null) {
                    kVar.getClass();
                    throw null;
                }
                this.f27097h = andSet;
            }
            this.f27097h.getClass();
            GLES20.glUniformMatrix3fv(this.f27094e, 1, false, f27087i, 0);
            throw null;
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int e10 = e.i.e("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.f27092c = e10;
        GLES20.glUseProgram(e10);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f27092c, "in_pos");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, f27089s);
        this.f27093d[0] = GLES20.glGetAttribLocation(this.f27092c, "in_tc_y");
        GLES20.glEnableVertexAttribArray(this.f27093d[0]);
        this.f27093d[1] = GLES20.glGetAttribLocation(this.f27092c, "in_tc_u");
        GLES20.glEnableVertexAttribArray(this.f27093d[1]);
        this.f27093d[2] = GLES20.glGetAttribLocation(this.f27092c, "in_tc_v");
        GLES20.glEnableVertexAttribArray(this.f27093d[2]);
        e.i.c();
        this.f27094e = GLES20.glGetUniformLocation(this.f27092c, "mColorConversion");
        e.i.c();
        GLES20.glGenTextures(3, this.f27090a, 0);
        for (int i10 = 0; i10 < 3; i10++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f27092c, f27088r[i10]), i10);
            GLES20.glActiveTexture(33984 + i10);
            GLES20.glBindTexture(3553, this.f27090a[i10]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        e.i.c();
        e.i.c();
    }
}
