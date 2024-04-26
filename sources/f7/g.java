package f7;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.b;
import d7.l;
import java.util.ArrayList;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18269a;

    /* renamed from: b  reason: collision with root package name */
    public String f18270b;

    /* renamed from: c  reason: collision with root package name */
    public String f18271c;

    /* renamed from: d  reason: collision with root package name */
    public String f18272d;

    /* renamed from: e  reason: collision with root package name */
    public String f18273e;

    /* renamed from: f  reason: collision with root package name */
    public int f18274f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f18275g;

    /* renamed from: h  reason: collision with root package name */
    public PointF f18276h;

    /* renamed from: i  reason: collision with root package name */
    public PointF f18277i;

    /* renamed from: j  reason: collision with root package name */
    public Handler f18278j;

    /* renamed from: k  reason: collision with root package name */
    public Runnable f18279k = new f(this, 0);

    public g(Context context) {
        this.f18269a = context;
        this.f18275g = ViewConfiguration.get(context).getScaledTouchSlop();
        l.B.f13200q.b();
        this.f18278j = (Handler) l.B.f13200q.f13155c;
    }

    public final void a() {
        String str;
        try {
            if (!(this.f18269a instanceof Activity)) {
                e.J("Can not create dialog without Activity Context");
                return;
            }
            b bVar = l.B.f13196m;
            synchronized (bVar.f5656a) {
                str = bVar.f5658c;
            }
            String str2 = !TextUtils.isEmpty(str) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str3 = l.B.f13196m.g() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            arrayList.add("Ad Information");
            arrayList.add(str2);
            arrayList.add(str3);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f18269a, l.B.f13188e.q());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new i(this, arrayList.size() - 1, arrayList.size() - 1, arrayList.size() - 1));
            builder.create().show();
        } catch (WindowManager.BadTokenException e10) {
            e.v("", e10);
        }
    }

    public final boolean b(float f10, float f11, float f12, float f13) {
        return Math.abs(this.f18276h.x - f10) < ((float) this.f18275g) && Math.abs(this.f18276h.y - f11) < ((float) this.f18275g) && Math.abs(this.f18277i.x - f12) < ((float) this.f18275g) && Math.abs(this.f18277i.y - f13) < ((float) this.f18275g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getHistorySize()
            int r2 = r11.getPointerCount()
            r3 = 0
            if (r0 != 0) goto L_0x0021
            r10.f18274f = r3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r3)
            float r11 = r11.getY(r3)
            r0.<init>(r1, r11)
            r10.f18276h = r0
            return
        L_0x0021:
            int r4 = r10.f18274f
            r5 = -1
            if (r4 != r5) goto L_0x0027
            return
        L_0x0027:
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L_0x0056
            if (r0 != r6) goto L_0x0056
            r10.f18274f = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r7)
            float r11 = r11.getY(r7)
            r0.<init>(r1, r11)
            r10.f18277i = r0
            android.os.Handler r11 = r10.f18278j
            java.lang.Runnable r0 = r10.f18279k
            e8.l<java.lang.Long> r1 = e8.t.f16629o2
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r1 = r2.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L_0x0056:
            if (r4 != r6) goto L_0x00a0
            r4 = 2
            if (r2 == r4) goto L_0x005d
        L_0x005b:
            r3 = 1
            goto L_0x0095
        L_0x005d:
            if (r0 != r4) goto L_0x0095
            r0 = 0
            r2 = 0
        L_0x0061:
            if (r0 >= r1) goto L_0x007d
            float r4 = r11.getHistoricalX(r3, r0)
            float r6 = r11.getHistoricalY(r3, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.b(r4, r6, r8, r9)
            if (r4 != 0) goto L_0x007a
            r2 = 1
        L_0x007a:
            int r0 = r0 + 1
            goto L_0x0061
        L_0x007d:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.b(r0, r1, r3, r11)
            if (r11 != 0) goto L_0x0094
            goto L_0x005b
        L_0x0094:
            r3 = r2
        L_0x0095:
            if (r3 == 0) goto L_0x00a0
            r10.f18274f = r5
            android.os.Handler r11 = r10.f18278j
            java.lang.Runnable r0 = r10.f18279k
            r11.removeCallbacks(r0)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.g.c(android.view.MotionEvent):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f18270b);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f18273e);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f18272d);
        sb2.append(",Ad Unit ID: ");
        return androidx.activity.e.a(sb2, this.f18271c, "}");
    }
}
