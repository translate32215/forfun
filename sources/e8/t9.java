package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.TextureView;
import androidx.appcompat.widget.o;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.f7;
import e.g;
import e7.i;
import f7.f0;
import java.util.HashMap;
import java.util.Map;
import l0.e;
import u7.m;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class t9 extends aa implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: z  reason: collision with root package name */
    public static final Map<Integer, String> f16715z;

    /* renamed from: c  reason: collision with root package name */
    public final ia f16716c;

    /* renamed from: d  reason: collision with root package name */
    public final ka f16717d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16718e;

    /* renamed from: f  reason: collision with root package name */
    public int f16719f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f16720g = 0;

    /* renamed from: h  reason: collision with root package name */
    public MediaPlayer f16721h;

    /* renamed from: i  reason: collision with root package name */
    public Uri f16722i;

    /* renamed from: r  reason: collision with root package name */
    public int f16723r;

    /* renamed from: s  reason: collision with root package name */
    public int f16724s;

    /* renamed from: t  reason: collision with root package name */
    public int f16725t;

    /* renamed from: u  reason: collision with root package name */
    public ga f16726u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f16727v;

    /* renamed from: w  reason: collision with root package name */
    public int f16728w;

    /* renamed from: x  reason: collision with root package name */
    public f7 f16729x;

    /* renamed from: y  reason: collision with root package name */
    public Integer f16730y = null;

    static {
        HashMap hashMap = new HashMap();
        f16715z = hashMap;
        int i10 = Build.VERSION.SDK_INT;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i10 >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public t9(Context context, ia iaVar, boolean z10, boolean z11, ka kaVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.f16716c = iaVar;
        this.f16717d = kaVar;
        this.f16727v = z10;
        this.f16718e = z11;
        kaVar.c(this);
    }

    public final void a() {
        ma maVar = this.f13669b;
        float f10 = 0.0f;
        float f11 = maVar.f15479e ? 0.0f : maVar.f15480f;
        if (maVar.f15477c) {
            f10 = f11;
        }
        MediaPlayer mediaPlayer = this.f16721h;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        } else {
            e.K("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    public final void e() {
        e.H("AdMediaPlayerView pause");
        if (x() && this.f16721h.isPlaying()) {
            this.f16721h.pause();
            z(4);
            p.f5702i.post(new v9(this, 2));
        }
        this.f16720g = 4;
    }

    public final void g() {
        e.H("AdMediaPlayerView play");
        if (x()) {
            this.f16721h.start();
            z(3);
            this.f13668a.f14384c = true;
            p.f5702i.post(new v9(this, 1));
        }
        this.f16720g = 3;
    }

    public final int getCurrentPosition() {
        if (x()) {
            return this.f16721h.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        if (x()) {
            return this.f16721h.getDuration();
        }
        return -1;
    }

    public final long getTotalBytes() {
        if (this.f16730y != null) {
            return ((long) getDuration()) * ((long) this.f16730y.intValue());
        }
        return -1;
    }

    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.f16721h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.f16721h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final void h(int i10) {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i10);
        e.H(sb2.toString());
        if (x()) {
            this.f16721h.seekTo(i10);
            this.f16728w = 0;
            return;
        }
        this.f16728w = i10;
    }

    public final void i() {
        e.H("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f16721h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f16721h.release();
            this.f16721h = null;
            z(0);
            this.f16720g = 0;
        }
        this.f16717d.a();
    }

    public final void j(float f10, float f11) {
        ga gaVar = this.f16726u;
        if (gaVar != null) {
            gaVar.e(f10, f11);
        }
    }

    public final void k(f7 f7Var) {
        this.f16729x = f7Var;
    }

    public final String l() {
        String str = this.f16727v ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    public final long m() {
        if (this.f16730y != null) {
            return (getTotalBytes() * ((long) this.f16725t)) / 100;
        }
        return -1;
    }

    public final int n() {
        if (Build.VERSION.SDK_INT < 26 || !x()) {
            return -1;
        }
        return this.f16721h.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f16725t = i10;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        e.H("AdMediaPlayerView completion");
        z(5);
        this.f16720g = 5;
        p.f5702i.post(new v9(this, 0));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map<Integer, String> map = f16715z;
        String str = (String) ((HashMap) map).get(Integer.valueOf(i10));
        String str2 = (String) ((HashMap) map).get(Integer.valueOf(i11));
        StringBuilder sb2 = new StringBuilder(o.a(str2, o.a(str, 38)));
        sb2.append("AdMediaPlayerView MediaPlayer error: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        e.K(sb2.toString());
        z(-1);
        this.f16720g = -1;
        p.f5702i.post(new f0(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map<Integer, String> map = f16715z;
        String str = (String) ((HashMap) map).get(Integer.valueOf(i10));
        String str2 = (String) ((HashMap) map).get(Integer.valueOf(i11));
        StringBuilder sb2 = new StringBuilder(o.a(str2, o.a(str, 37)));
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        e.H(sb2.toString());
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r1 > r6) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f16723r
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f16724s
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f16723r
            if (r2 <= 0) goto L_0x0083
            int r2 = r5.f16724s
            if (r2 <= 0) goto L_0x0083
            e8.ga r2 = r5.f16726u
            if (r2 != 0) goto L_0x0083
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0047
            if (r1 != r2) goto L_0x0047
            int r0 = r5.f16723r
            int r1 = r0 * r7
            int r2 = r5.f16724s
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r0 * r7
            int r0 = r0 / r2
            goto L_0x006a
        L_0x003c:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L_0x0067
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L_0x0058
        L_0x0047:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x005a
            int r0 = r5.f16724s
            int r0 = r0 * r6
            int r2 = r5.f16723r
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0057
            if (r0 <= r7) goto L_0x0057
            goto L_0x0067
        L_0x0057:
            r1 = r0
        L_0x0058:
            r0 = r6
            goto L_0x0083
        L_0x005a:
            if (r1 != r2) goto L_0x006c
            int r1 = r5.f16723r
            int r1 = r1 * r7
            int r2 = r5.f16724s
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0069
            if (r1 <= r6) goto L_0x0069
        L_0x0067:
            r0 = r6
            goto L_0x006a
        L_0x0069:
            r0 = r1
        L_0x006a:
            r1 = r7
            goto L_0x0083
        L_0x006c:
            int r2 = r5.f16723r
            int r4 = r5.f16724s
            if (r1 != r3) goto L_0x0078
            if (r4 <= r7) goto L_0x0078
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x007a
        L_0x0078:
            r1 = r2
            r7 = r4
        L_0x007a:
            if (r0 != r3) goto L_0x0069
            if (r1 <= r6) goto L_0x0069
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0058
        L_0x0083:
            r5.setMeasuredDimension(r0, r1)
            e8.ga r6 = r5.f16726u
            if (r6 == 0) goto L_0x008d
            r6.i(r0, r1)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.t9.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        e.H("AdMediaPlayerView prepared");
        z(2);
        this.f16717d.e();
        p.f5702i.post(new i(this, mediaPlayer));
        this.f16723r = mediaPlayer.getVideoWidth();
        this.f16724s = mediaPlayer.getVideoHeight();
        int i10 = this.f16728w;
        if (i10 != 0) {
            h(i10);
        }
        w();
        int i11 = this.f16723r;
        int i12 = this.f16724s;
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i11);
        sb2.append(" x ");
        sb2.append(i12);
        e.J(sb2.toString());
        if (this.f16720g == 3) {
            g();
        }
        a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        e.H("AdMediaPlayerView surface created");
        v();
        p.f5702i.post(new x9(this, 0));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e.H("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f16721h;
        if (mediaPlayer != null && this.f16728w == 0) {
            this.f16728w = mediaPlayer.getCurrentPosition();
        }
        ga gaVar = this.f16726u;
        if (gaVar != null) {
            gaVar.c();
        }
        p.f5702i.post(new x9(this, 1));
        y(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e.H("AdMediaPlayerView surface changed");
        boolean z10 = true;
        boolean z11 = this.f16720g == 3;
        if (!(this.f16723r == i10 && this.f16724s == i11)) {
            z10 = false;
        }
        if (this.f16721h != null && z11 && z10) {
            int i12 = this.f16728w;
            if (i12 != 0) {
                h(i12);
            }
            g();
        }
        ga gaVar = this.f16726u;
        if (gaVar != null) {
            gaVar.i(i10, i11);
        }
        p.f5702i.post(new w9(this, i10, i11));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f16717d.d(this);
        this.f13668a.a(surfaceTexture, this.f16729x);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        e.H(sb2.toString());
        this.f16723r = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f16724s = videoHeight;
        if (this.f16723r != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    public final void onWindowVisibilityChanged(int i10) {
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i10);
        e.H(sb2.toString());
        p.f5702i.post(new m(this, i10));
        super.onWindowVisibilityChanged(i10);
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        kh0 i10 = kh0.i(parse);
        if (i10 == null || i10.f15289a != null) {
            if (i10 != null) {
                parse = Uri.parse(i10.f15289a);
            }
            this.f16722i = parse;
            this.f16728w = 0;
            v();
            requestLayout();
            invalidate();
        }
    }

    public final String toString() {
        String name = t9.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return g.a(o.a(hexString, name.length() + 1), name, "@", hexString);
    }

    public final long u() {
        return 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r6 = this;
            java.lang.String r0 = "AdMediaPlayerView init MediaPlayer"
            l0.e.H(r0)
            android.graphics.SurfaceTexture r0 = r6.getSurfaceTexture()
            android.net.Uri r1 = r6.f16722i
            if (r1 == 0) goto L_0x00d3
            if (r0 != 0) goto L_0x0011
            goto L_0x00d3
        L_0x0011:
            r1 = 0
            r6.y(r1)
            r2 = 1
            d7.l r3 = d7.l.B     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            d4.f r3 = r3.f13201r     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r3 = new android.media.MediaPlayer     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.<init>()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r6.f16721h = r3     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.setOnBufferingUpdateListener(r6)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r3 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.setOnCompletionListener(r6)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r3 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.setOnErrorListener(r6)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r3 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.setOnInfoListener(r6)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r3 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.setOnPreparedListener(r6)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r3 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.setOnVideoSizeChangedListener(r6)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r6.f16725t = r1     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            boolean r3 = r6.f16727v     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            if (r3 == 0) goto L_0x007c
            e8.ga r3 = new e8.ga     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.content.Context r4 = r6.getContext()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r6.f16726u = r3     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            int r4 = r6.getWidth()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            int r5 = r6.getHeight()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.f14751u = r4     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.f14750t = r5     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.f14753w = r0     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            e8.ga r3 = r6.f16726u     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.start()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            e8.ga r3 = r6.f16726u     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.graphics.SurfaceTexture r4 = r3.f14753w     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r5 = 0
            if (r4 != 0) goto L_0x006a
            r3 = r5
            goto L_0x0071
        L_0x006a:
            java.util.concurrent.CountDownLatch r4 = r3.B     // Catch:{ InterruptedException -> 0x006f }
            r4.await()     // Catch:{ InterruptedException -> 0x006f }
        L_0x006f:
            android.graphics.SurfaceTexture r3 = r3.f14752v     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
        L_0x0071:
            if (r3 == 0) goto L_0x0075
            r0 = r3
            goto L_0x007c
        L_0x0075:
            e8.ga r3 = r6.f16726u     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.c()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r6.f16726u = r5     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
        L_0x007c:
            android.media.MediaPlayer r3 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.content.Context r4 = r6.getContext()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.net.Uri r5 = r6.f16722i     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.setDataSource(r4, r5)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            d7.l r3 = d7.l.B     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            androidx.databinding.a r3 = r3.f13202s     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.view.Surface r3 = new android.view.Surface     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r0 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r0.setSurface(r3)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r0 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r3 = 3
            r0.setAudioStreamType(r3)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r0 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r0.setScreenOnWhilePlaying(r2)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            android.media.MediaPlayer r0 = r6.f16721h     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r0.prepareAsync()     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            r6.z(r2)     // Catch:{ IOException -> 0x00ad, IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x00a9 }
            return
        L_0x00a9:
            r0 = move-exception
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            goto L_0x00ae
        L_0x00ad:
            r0 = move-exception
        L_0x00ae:
            android.net.Uri r3 = r6.f16722i
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 36
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Failed to initialize MediaPlayer at "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            l0.e.D(r3, r0)
            android.media.MediaPlayer r0 = r6.f16721h
            r6.onError(r0, r2, r1)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.t9.v():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e A[LOOP:0: B:16:0x003e->B:21:0x0059, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r8 = this;
            boolean r0 = r8.f16718e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.x()
            if (r0 == 0) goto L_0x0063
            android.media.MediaPlayer r0 = r8.f16721h
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0063
            int r0 = r8.f16720g
            r1 = 3
            if (r0 == r1) goto L_0x0063
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            l0.e.H(r0)
            r0 = 0
            android.media.MediaPlayer r1 = r8.f16721h
            if (r1 == 0) goto L_0x0026
            r1.setVolume(r0, r0)     // Catch:{ IllegalStateException -> 0x002b }
            goto L_0x002b
        L_0x0026:
            java.lang.String r0 = "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared()."
            l0.e.K(r0)
        L_0x002b:
            android.media.MediaPlayer r0 = r8.f16721h
            r0.start()
            android.media.MediaPlayer r0 = r8.f16721h
            int r0 = r0.getCurrentPosition()
            d7.l r1 = d7.l.B
            z7.b r1 = r1.f13193j
            long r1 = r1.b()
        L_0x003e:
            boolean r3 = r8.x()
            if (r3 == 0) goto L_0x005b
            android.media.MediaPlayer r3 = r8.f16721h
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x005b
            d7.l r3 = d7.l.B
            z7.b r3 = r3.f13193j
            long r3 = r3.b()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x003e
        L_0x005b:
            android.media.MediaPlayer r0 = r8.f16721h
            r0.pause()
            r8.a()
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.t9.w():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f16719f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.f16721h
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f16719f
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.t9.x():boolean");
    }

    public final void y(boolean z10) {
        e.H("AdMediaPlayerView release");
        ga gaVar = this.f16726u;
        if (gaVar != null) {
            gaVar.c();
            this.f16726u = null;
        }
        MediaPlayer mediaPlayer = this.f16721h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f16721h.release();
            this.f16721h = null;
            z(0);
            if (z10) {
                this.f16720g = 0;
                this.f16720g = 0;
            }
        }
    }

    public final void z(int i10) {
        if (i10 == 3) {
            this.f16717d.b();
            ma maVar = this.f13669b;
            maVar.f15478d = true;
            maVar.b();
        } else if (this.f16719f == 3) {
            this.f16717d.f15261m = false;
            this.f13669b.a();
        }
        this.f16719f = i10;
    }
}
