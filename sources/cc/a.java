package cc;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.b;
import androidx.leanback.widget.r0;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.data.model.Event;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ud.k;

/* compiled from: EventCardPresenter.kt */
public final class a extends r0 {
    public void c(r0.a aVar, Object obj) {
        String str;
        k.f(aVar, "viewHolder");
        k.f(obj, "item");
        View view = aVar.f2509a;
        if (view != null) {
            b bVar = (b) view;
            Event event = (Event) obj;
            View findViewById = bVar.findViewById(R.id.logo1);
            k.e(findViewById, "cardView.findViewById<ImageView>(R.id.logo1)");
            b8.a.g((ImageView) findViewById, event.getTeam1().getLogo());
            View findViewById2 = bVar.findViewById(R.id.logo2);
            k.e(findViewById2, "cardView.findViewById<ImageView>(R.id.logo2)");
            b8.a.g((ImageView) findViewById2, event.getTeam2().getLogo());
            TextView textView = (TextView) bVar.findViewById(R.id.time);
            k.f(event, "event");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis >= event.getStartTime() && currentTimeMillis < event.getEndTime()) {
                str = "جارية الآن";
            } else if (currentTimeMillis > event.getEndTime()) {
                str = "إنتهت المباراة";
            } else {
                k.f("hh:mm a", "pattern");
                str = new SimpleDateFormat("hh:mm a", Locale.US).format(new Date(event.getStartTime() * 1000));
                k.e(str, "SimpleDateFormat(pattern….format(Date(timeMillis))");
            }
            textView.setText(str);
            ((TextView) bVar.findViewById(R.id.name1)).setText(event.getTeam1().getName());
            ((TextView) bVar.findViewById(R.id.name2)).setText(event.getTeam2().getName());
            ((TextView) bVar.findViewById(R.id.commentary)).setText(event.getCommentary());
            ((TextView) bVar.findViewById(R.id.channel)).setText(event.getChannel());
            ((TextView) bVar.findViewById(R.id.champ)).setText(event.getChampions());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.leanback.widget.BaseCardView");
    }

    public r0.a d(ViewGroup viewGroup) {
        k.f(viewGroup, "parent");
        b bVar = new b(viewGroup.getContext(), (AttributeSet) null, R.attr.baseCardViewStyle);
        bVar.setFocusable(true);
        bVar.setFocusableInTouchMode(true);
        bVar.addView(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_event_tv, (ViewGroup) null));
        return new r0.a(bVar);
    }

    public void e(r0.a aVar) {
        k.f(aVar, "viewHolder");
    }
}
