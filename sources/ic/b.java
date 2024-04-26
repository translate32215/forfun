package ic;

import android.view.View;
import dev.pankaj.ytvclib.data.model.Channel;
import dev.pankaj.ytvclib.data.model.Event;
import kc.d;
import ud.k;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19353a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19354b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f19355c;

    public /* synthetic */ b(c cVar, Event event) {
        this.f19354b = cVar;
        this.f19355c = event;
    }

    public /* synthetic */ b(d.a aVar, Channel channel) {
        this.f19354b = aVar;
        this.f19355c = channel;
    }

    public final void onClick(View view) {
        switch (this.f19353a) {
            case 0:
                c cVar = (c) this.f19354b;
                Event event = (Event) this.f19355c;
                k.f(cVar, "this$0");
                k.f(event, "$event");
                cVar.f19357v.c(event);
                return;
            default:
                d.a aVar = (d.a) this.f19354b;
                Channel channel = (Channel) this.f19355c;
                int i10 = d.a.f20602w;
                k.f(aVar, "this$0");
                k.f(channel, "$channel");
                aVar.f20604v.c(channel);
                return;
        }
    }
}
