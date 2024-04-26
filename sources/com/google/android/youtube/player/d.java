package com.google.android.youtube.player;

import android.app.Activity;
import android.os.RemoteException;
import t1.c;
import z9.e;
import z9.h;
import z9.j;
import z9.l;

public final class d implements l.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f9656a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ YouTubePlayerView f9657b;

    public d(YouTubePlayerView youTubePlayerView, Activity activity) {
        this.f9657b = youTubePlayerView;
        this.f9656a = activity;
    }

    public final void a() {
        YouTubePlayerView youTubePlayerView = this.f9657b;
        if (youTubePlayerView.f9629d != null) {
            YouTubePlayerView.d(youTubePlayerView, this.f9656a);
        }
        this.f9657b.f9629d = null;
    }

    public final void b() {
        c cVar;
        YouTubePlayerView youTubePlayerView = this.f9657b;
        if (!youTubePlayerView.f9636s && (cVar = youTubePlayerView.f9630e) != null) {
            cVar.getClass();
            try {
                ((e) cVar.f25351c).z5();
            } catch (RemoteException e10) {
                throw new j(e10);
            }
        }
        h hVar = this.f9657b.f9632g;
        hVar.f28746a.setVisibility(8);
        hVar.f28747b.setVisibility(8);
        YouTubePlayerView youTubePlayerView2 = this.f9657b;
        if (youTubePlayerView2.indexOfChild(youTubePlayerView2.f9632g) < 0) {
            YouTubePlayerView youTubePlayerView3 = this.f9657b;
            youTubePlayerView3.addView(youTubePlayerView3.f9632g);
            YouTubePlayerView youTubePlayerView4 = this.f9657b;
            youTubePlayerView4.removeView(youTubePlayerView4.f9631f);
        }
        YouTubePlayerView youTubePlayerView5 = this.f9657b;
        youTubePlayerView5.f9631f = null;
        youTubePlayerView5.f9630e = null;
        youTubePlayerView5.f9629d = null;
    }
}
