package t6;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.ui.PlayerView;
import t6.a;
import t6.f;

/* compiled from: TouchTracker */
public class g extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, a.C0248a {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f25813a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    public final PointF f25814b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    public final a f25815c;

    /* renamed from: d  reason: collision with root package name */
    public final float f25816d;

    /* renamed from: e  reason: collision with root package name */
    public final GestureDetector f25817e;

    /* renamed from: f  reason: collision with root package name */
    public volatile float f25818f;

    /* renamed from: g  reason: collision with root package name */
    public e f25819g;

    /* compiled from: TouchTracker */
    public interface a {
    }

    public g(Context context, a aVar, float f10) {
        this.f25815c = aVar;
        this.f25816d = f10;
        this.f25817e = new GestureDetector(context, this);
        this.f25818f = 3.1415927f;
    }

    public void a(float[] fArr, float f10) {
        this.f25818f = -f10;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f25813a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f25813a.x) / this.f25816d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f25813a;
        float f12 = (y10 - pointF.y) / this.f25816d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = (double) this.f25818f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f25814b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = (cos * f12) + (sin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        a aVar = this.f25815c;
        PointF pointF3 = this.f25814b;
        f.a aVar2 = (f.a) aVar;
        synchronized (aVar2) {
            aVar2.f25808g = pointF3.y;
            aVar2.b();
            Matrix.setRotateM(aVar2.f25807f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        e eVar = this.f25819g;
        if (eVar == null) {
            return false;
        }
        PlayerView playerView = PlayerView.this;
        int i10 = PlayerView.J;
        return playerView.k();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f25817e.onTouchEvent(motionEvent);
    }
}
