package r1;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.startapp.startappsdk.R;
import f.b;
import f.i;
import f.l;
import h.f;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kd.g;
import o1.k;
import o1.r;
import v0.c;

/* compiled from: ActionBarOnDestinationChangedListener.kt */
public final class a implements k.b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24487a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Integer> f24488b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<c> f24489c;

    /* renamed from: d  reason: collision with root package name */
    public f f24490d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f24491e;

    /* renamed from: f  reason: collision with root package name */
    public final i f24492f;

    public a(i iVar, b bVar) {
        b f10 = iVar.H().f();
        if (f10 != null) {
            Context O = l.this.O();
            ud.k.e(O, "checkNotNull(activity.dr… }.actionBarThemedContext");
            this.f24487a = O;
            this.f24488b = bVar.f24493a;
            c cVar = bVar.f24494b;
            this.f24489c = cVar != null ? new WeakReference<>(cVar) : null;
            this.f24492f = iVar;
            return;
        }
        throw new IllegalStateException(("Activity " + iVar + " does not have an DrawerToggleDelegate set").toString());
    }

    public void a(k kVar, r rVar, Bundle bundle) {
        ud.k.f(rVar, "destination");
        if (!(rVar instanceof o1.b)) {
            WeakReference<c> weakReference = this.f24489c;
            c cVar = weakReference != null ? (c) weakReference.get() : null;
            if (this.f24489c == null || cVar != null) {
                CharSequence charSequence = rVar.f22802d;
                boolean z10 = true;
                if (charSequence != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle == null || !bundle.containsKey(group)) {
                            throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + charSequence + '\"');
                        }
                        matcher.appendReplacement(stringBuffer, "");
                        stringBuffer.append(String.valueOf(bundle.get(group)));
                    }
                    matcher.appendTail(stringBuffer);
                    f.a I = this.f24492f.I();
                    if (I != null) {
                        I.q(stringBuffer);
                    } else {
                        StringBuilder a10 = android.support.v4.media.a.a("Activity ");
                        a10.append(this.f24492f);
                        a10.append(" does not have an ActionBar set via setSupportActionBar()");
                        throw new IllegalStateException(a10.toString().toString());
                    }
                }
                boolean b10 = e.b(rVar, this.f24488b);
                if (cVar != null || !b10) {
                    if (cVar == null || !b10) {
                        z10 = false;
                    }
                    b(z10);
                    return;
                }
                c((Drawable) null, 0);
                return;
            }
            kVar.f22733q.remove(this);
        }
    }

    public final void b(boolean z10) {
        g gVar;
        f fVar = this.f24490d;
        if (fVar != null) {
            gVar = new g(fVar, Boolean.TRUE);
        } else {
            f fVar2 = new f(this.f24487a);
            this.f24490d = fVar2;
            gVar = new g(fVar2, Boolean.FALSE);
        }
        f fVar3 = (f) gVar.f20614a;
        boolean booleanValue = ((Boolean) gVar.f20615b).booleanValue();
        c(fVar3, z10 ? R.string.nav_app_bar_open_drawer_description : R.string.nav_app_bar_navigate_up_description);
        float f10 = z10 ? 0.0f : 1.0f;
        if (booleanValue) {
            float f11 = fVar3.f18765i;
            ValueAnimator valueAnimator = this.f24491e;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar3, "progress", new float[]{f11, f10});
            this.f24491e = ofFloat;
            if (ofFloat != null) {
                ofFloat.start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.animation.ObjectAnimator");
        }
        fVar3.setProgress(f10);
    }

    public void c(Drawable drawable, int i10) {
        f.a I = this.f24492f.I();
        if (I != null) {
            I.m(drawable != null);
            b f10 = this.f24492f.H().f();
            if (f10 != null) {
                l lVar = l.this;
                lVar.S();
                f.a aVar = lVar.f17890h;
                if (aVar != null) {
                    aVar.o(drawable);
                    aVar.n(i10);
                    return;
                }
                return;
            }
            StringBuilder a10 = android.support.v4.media.a.a("Activity ");
            a10.append(this.f24492f);
            a10.append(" does not have an DrawerToggleDelegate set");
            throw new IllegalStateException(a10.toString().toString());
        }
        StringBuilder a11 = android.support.v4.media.a.a("Activity ");
        a11.append(this.f24492f);
        a11.append(" does not have an ActionBar set via setSupportActionBar()");
        throw new IllegalStateException(a11.toString().toString());
    }
}
