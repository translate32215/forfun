package e7;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import e8.ti0;
import e8.y8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class m extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final ImageButton f13649a;

    /* renamed from: b  reason: collision with root package name */
    public final q f13650b;

    public m(Context context, l lVar, q qVar) {
        super(context);
        this.f13650b = qVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f13649a = imageButton;
        imageButton.setImageResource(17301527);
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        y8 y8Var = ti0.f16763j.f16764a;
        int a10 = y8.a(context.getResources().getDisplayMetrics(), lVar.f13645a);
        y8 y8Var2 = ti0.f16763j.f16764a;
        int a11 = y8.a(context.getResources().getDisplayMetrics(), 0);
        y8 y8Var3 = ti0.f16763j.f16764a;
        int a12 = y8.a(context.getResources().getDisplayMetrics(), lVar.f13646b);
        y8 y8Var4 = ti0.f16763j.f16764a;
        imageButton.setPadding(a10, a11, a12, y8.a(context.getResources().getDisplayMetrics(), lVar.f13647c));
        imageButton.setContentDescription("Interstitial close button");
        y8 y8Var5 = ti0.f16763j.f16764a;
        int a13 = y8.a(context.getResources().getDisplayMetrics(), lVar.f13648d + lVar.f13645a + lVar.f13646b);
        y8 y8Var6 = ti0.f16763j.f16764a;
        addView(imageButton, new FrameLayout.LayoutParams(a13, y8.a(context.getResources().getDisplayMetrics(), lVar.f13648d + lVar.f13647c), 17));
    }

    public final void onClick(View view) {
        q qVar = this.f13650b;
        if (qVar != null) {
            qVar.b4();
        }
    }
}
