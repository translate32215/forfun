package x4;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import f0.h;
import v6.e0;
import x4.a1;
import z4.d;

/* compiled from: AudioFocusManager */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f27451a;

    /* renamed from: b  reason: collision with root package name */
    public final a f27452b;

    /* renamed from: c  reason: collision with root package name */
    public b f27453c;

    /* renamed from: d  reason: collision with root package name */
    public d f27454d;

    /* renamed from: e  reason: collision with root package name */
    public int f27455e;

    /* renamed from: f  reason: collision with root package name */
    public int f27456f;

    /* renamed from: g  reason: collision with root package name */
    public float f27457g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f27458h;

    /* compiled from: AudioFocusManager */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f27459a;

        public a(Handler handler) {
            this.f27459a = handler;
        }

        public void onAudioFocusChange(int i10) {
            this.f27459a.post(new h(this, i10));
        }
    }

    /* compiled from: AudioFocusManager */
    public interface b {
    }

    public c(Context context, Handler handler, b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f27451a = audioManager;
        this.f27453c = bVar;
        this.f27452b = new a(handler);
        this.f27455e = 0;
    }

    public final void a() {
        if (this.f27455e != 0) {
            if (e0.f26436a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f27458h;
                if (audioFocusRequest != null) {
                    this.f27451a.abandonAudioFocusRequest(audioFocusRequest);
                }
            } else {
                this.f27451a.abandonAudioFocus(this.f27452b);
            }
            d(0);
        }
    }

    public final void b(int i10) {
        b bVar = this.f27453c;
        if (bVar != null) {
            a1.c cVar = (a1.c) bVar;
            boolean k10 = a1.this.k();
            a1.this.X(k10, i10, a1.M(k10, i10));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r6.f28338a == 1) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r3 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(z4.d r6) {
        /*
            r5 = this;
            z4.d r0 = r5.f27454d
            boolean r0 = v6.e0.a(r0, r6)
            if (r0 != 0) goto L_0x004c
            r5.f27454d = r6
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L_0x000f
            goto L_0x003f
        L_0x000f:
            int r2 = r6.f28340c
            r3 = 3
            java.lang.String r4 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L_0x0035;
                case 1: goto L_0x003a;
                case 2: goto L_0x0033;
                case 3: goto L_0x003f;
                case 4: goto L_0x0033;
                case 5: goto L_0x0040;
                case 6: goto L_0x0040;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x0040;
                case 11: goto L_0x002f;
                case 12: goto L_0x0040;
                case 13: goto L_0x0040;
                case 14: goto L_0x003a;
                case 15: goto L_0x0017;
                case 16: goto L_0x0027;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.String r2 = "Unidentified audio usage: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            int r6 = r6.f28340c
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            goto L_0x003c
        L_0x0027:
            int r6 = v6.e0.f26436a
            r2 = 19
            if (r6 < r2) goto L_0x0033
            r3 = 4
            goto L_0x0040
        L_0x002f:
            int r6 = r6.f28338a
            if (r6 != r1) goto L_0x0040
        L_0x0033:
            r3 = 2
            goto L_0x0040
        L_0x0035:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            android.util.Log.w(r4, r6)
        L_0x003a:
            r3 = 1
            goto L_0x0040
        L_0x003c:
            android.util.Log.w(r4, r6)
        L_0x003f:
            r3 = 0
        L_0x0040:
            r5.f27456f = r3
            if (r3 == r1) goto L_0x0046
            if (r3 != 0) goto L_0x0047
        L_0x0046:
            r0 = 1
        L_0x0047:
            java.lang.String r6 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            v6.a.b(r0, r6)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.c.c(z4.d):void");
    }

    public final void d(int i10) {
        if (this.f27455e != i10) {
            this.f27455e = i10;
            float f10 = i10 == 3 ? 0.2f : 1.0f;
            if (this.f27457g != f10) {
                this.f27457g = f10;
                b bVar = this.f27453c;
                if (bVar != null) {
                    a1 a1Var = a1.this;
                    a1Var.P(1, 2, Float.valueOf(a1Var.A * a1Var.f27358l.f27457g));
                }
            }
        }
    }

    public int e(boolean z10, int i10) {
        int i11;
        AudioFocusRequest.Builder builder;
        int i12 = 1;
        if (i10 == 1 || this.f27456f != 1) {
            a();
            if (z10) {
                return 1;
            }
            return -1;
        } else if (!z10) {
            return -1;
        } else {
            if (this.f27455e != 1) {
                if (e0.f26436a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f27458h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            builder = new AudioFocusRequest.Builder(this.f27456f);
                        } else {
                            builder = new AudioFocusRequest.Builder(this.f27458h);
                        }
                        d dVar = this.f27454d;
                        boolean z11 = dVar != null && dVar.f28338a == 1;
                        dVar.getClass();
                        this.f27458h = builder.setAudioAttributes(dVar.a()).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f27452b).build();
                    }
                    i11 = this.f27451a.requestAudioFocus(this.f27458h);
                } else {
                    AudioManager audioManager = this.f27451a;
                    a aVar = this.f27452b;
                    d dVar2 = this.f27454d;
                    dVar2.getClass();
                    i11 = audioManager.requestAudioFocus(aVar, e0.A(dVar2.f28340c), this.f27456f);
                }
                if (i11 == 1) {
                    d(1);
                } else {
                    d(0);
                    i12 = -1;
                }
            }
            return i12;
        }
    }
}
