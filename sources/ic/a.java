package ic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.data.model.Event;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kd.o;
import td.l;
import ud.k;

/* compiled from: EventAdapter.kt */
public final class a extends RecyclerView.e<RecyclerView.a0> {

    /* renamed from: d  reason: collision with root package name */
    public final l<Event, o> f19351d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Event> f19352e = new ArrayList<>();

    public a(l<? super Event, o> lVar) {
        this.f19351d = lVar;
    }

    public int b() {
        return this.f19352e.size();
    }

    public void e(RecyclerView.a0 a0Var, int i10) {
        String str;
        k.f(a0Var, "holder");
        if (a0Var instanceof c) {
            c cVar = (c) a0Var;
            Event event = this.f19352e.get(i10);
            k.e(event, "items[position]");
            Event event2 = event;
            k.f(event2, "event");
            cVar.f19356u.f28812a.setOnClickListener(new b(cVar, event2));
            AppCompatImageView appCompatImageView = cVar.f19356u.f28816e;
            k.e(appCompatImageView, "binding.logo1");
            b8.a.g(appCompatImageView, event2.getTeam1().getLogo());
            AppCompatImageView appCompatImageView2 = cVar.f19356u.f28817f;
            k.e(appCompatImageView2, "binding.logo2");
            b8.a.g(appCompatImageView2, event2.getTeam2().getLogo());
            TextView textView = cVar.f19356u.f28820i;
            k.f(event2, "event");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis >= event2.getStartTime() && currentTimeMillis < event2.getEndTime()) {
                str = "جارية الآن";
            } else if (currentTimeMillis > event2.getEndTime()) {
                str = "إنتهت المباراة";
            } else {
                k.f("hh:mm a", "pattern");
                str = new SimpleDateFormat("hh:mm a", Locale.US).format(new Date(event2.getStartTime() * 1000));
                k.e(str, "SimpleDateFormat(pattern….format(Date(timeMillis))");
            }
            textView.setText(str);
            cVar.f19356u.f28818g.setText(event2.getTeam1().getName());
            cVar.f19356u.f28819h.setText(event2.getTeam2().getName());
            cVar.f19356u.f28815d.setText(event2.getCommentary());
            cVar.f19356u.f28814c.setText(event2.getChannel());
            cVar.f19356u.f28813b.setText(event2.getChampions());
        }
    }

    public RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
        k.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_event, viewGroup, false);
        int i11 = R.id.champ;
        AppCompatTextView appCompatTextView = (AppCompatTextView) b8.a.d(inflate, R.id.champ);
        if (appCompatTextView != null) {
            i11 = R.id.channel;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) b8.a.d(inflate, R.id.channel);
            if (appCompatTextView2 != null) {
                i11 = R.id.commentary;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) b8.a.d(inflate, R.id.commentary);
                if (appCompatTextView3 != null) {
                    i11 = R.id.logo1;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) b8.a.d(inflate, R.id.logo1);
                    if (appCompatImageView != null) {
                        i11 = R.id.logo2;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) b8.a.d(inflate, R.id.logo2);
                        if (appCompatImageView2 != null) {
                            i11 = R.id.name1;
                            TextView textView = (TextView) b8.a.d(inflate, R.id.name1);
                            if (textView != null) {
                                i11 = R.id.name2;
                                TextView textView2 = (TextView) b8.a.d(inflate, R.id.name2);
                                if (textView2 != null) {
                                    i11 = R.id.time;
                                    TextView textView3 = (TextView) b8.a.d(inflate, R.id.time);
                                    if (textView3 != null) {
                                        return new c(new zb.k((MaterialCardView) inflate, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatImageView, appCompatImageView2, textView, textView2, textView3), this.f19351d);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
