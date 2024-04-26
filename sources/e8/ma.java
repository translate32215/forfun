package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ma implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f15475a;

    /* renamed from: b  reason: collision with root package name */
    public final la f15476b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15477c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15478d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15479e;

    /* renamed from: f  reason: collision with root package name */
    public float f15480f = 1.0f;

    public ma(Context context, la laVar) {
        this.f15475a = (AudioManager) context.getSystemService("audio");
        this.f15476b = laVar;
    }

    public final void a() {
        this.f15478d = false;
        b();
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        boolean z13 = this.f15478d && !this.f15479e && this.f15480f > 0.0f;
        if (z13 && !(z11 = this.f15477c)) {
            AudioManager audioManager = this.f15475a;
            if (audioManager != null && !z11) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z12 = true;
                }
                this.f15477c = z12;
            }
            this.f15476b.a();
        } else if (!z13 && (z10 = this.f15477c)) {
            AudioManager audioManager2 = this.f15475a;
            if (audioManager2 != null && z10) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z12 = true;
                }
                this.f15477c = z12;
            }
            this.f15476b.a();
        }
    }

    public final void onAudioFocusChange(int i10) {
        this.f15477c = i10 > 0;
        this.f15476b.a();
    }
}
