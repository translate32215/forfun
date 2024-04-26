package com.google.android.youtube.player;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.c;
import u.b;
import z9.e;
import z9.h;
import z9.j;

public class a extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public C0104a f9638a;

    /* renamed from: b  reason: collision with root package name */
    public YouTubePlayerView f9639b;

    /* renamed from: c  reason: collision with root package name */
    public int f9640c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f9641d;

    /* renamed from: com.google.android.youtube.player.a$a  reason: collision with other inner class name */
    public final class C0104a implements YouTubePlayerView.b {
        public C0104a(byte b10) {
        }

        public final void a(YouTubePlayerView youTubePlayerView) {
            YouTubePlayerView youTubePlayerView2 = a.this.f9639b;
            if (!(youTubePlayerView2 == null || youTubePlayerView2 == youTubePlayerView)) {
                youTubePlayerView2.f(true);
            }
            a aVar = a.this;
            aVar.f9639b = youTubePlayerView;
            if (aVar.f9640c > 0) {
                youTubePlayerView.a();
            }
            if (a.this.f9640c >= 2) {
                youTubePlayerView.e();
            }
        }

        public final void b(YouTubePlayerView youTubePlayerView, String str, c.a aVar) {
            a aVar2 = a.this;
            Bundle bundle = aVar2.f9641d;
            if (youTubePlayerView.f9630e == null && youTubePlayerView.f9635r == null) {
                youTubePlayerView.f9633h = youTubePlayerView;
                b.b(aVar, "listener cannot be null");
                youTubePlayerView.f9635r = aVar;
                youTubePlayerView.f9634i = bundle;
                h hVar = youTubePlayerView.f9632g;
                hVar.f28746a.setVisibility(0);
                hVar.f28747b.setVisibility(8);
                z9.c a10 = z9.a.f28739a.a(youTubePlayerView.getContext(), str, new d(youTubePlayerView, aVar2), new e(youTubePlayerView));
                youTubePlayerView.f9629d = a10;
                a10.b();
            }
            a.this.f9641d = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9638a = new C0104a((byte) 0);
        this.f9641d = bundle != null ? bundle.getBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE") : null;
    }

    public void onDestroy() {
        YouTubePlayerView youTubePlayerView = this.f9639b;
        if (youTubePlayerView != null) {
            boolean isFinishing = isFinishing();
            t1.c cVar = youTubePlayerView.f9630e;
            if (cVar != null) {
                try {
                    ((e) cVar.f25351c).e6(isFinishing);
                    youTubePlayerView.f(isFinishing);
                } catch (RemoteException e10) {
                    throw new j(e10);
                }
            }
        }
        super.onDestroy();
    }

    public void onPause() {
        t1.c cVar;
        this.f9640c = 1;
        YouTubePlayerView youTubePlayerView = this.f9639b;
        if (!(youTubePlayerView == null || (cVar = youTubePlayerView.f9630e) == null)) {
            try {
                ((e) cVar.f25351c).U2();
            } catch (RemoteException e10) {
                throw new j(e10);
            }
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f9640c = 2;
        YouTubePlayerView youTubePlayerView = this.f9639b;
        if (youTubePlayerView != null) {
            youTubePlayerView.e();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        YouTubePlayerView youTubePlayerView = this.f9639b;
        if (youTubePlayerView != null) {
            t1.c cVar = youTubePlayerView.f9630e;
            if (cVar == null) {
                bundle2 = youTubePlayerView.f9634i;
            } else {
                try {
                    bundle2 = ((e) cVar.f25351c).c1();
                } catch (RemoteException e10) {
                    throw new j(e10);
                }
            }
        } else {
            bundle2 = this.f9641d;
        }
        bundle.putBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE", bundle2);
    }

    public void onStart() {
        super.onStart();
        this.f9640c = 1;
        YouTubePlayerView youTubePlayerView = this.f9639b;
        if (youTubePlayerView != null) {
            youTubePlayerView.a();
        }
    }

    public void onStop() {
        t1.c cVar;
        this.f9640c = 0;
        YouTubePlayerView youTubePlayerView = this.f9639b;
        if (!(youTubePlayerView == null || (cVar = youTubePlayerView.f9630e) == null)) {
            try {
                ((e) cVar.f25351c).j4();
            } catch (RemoteException e10) {
                throw new j(e10);
            }
        }
        super.onStop();
    }
}
