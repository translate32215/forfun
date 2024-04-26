package com.startapp;

import android.os.AsyncTask;

/* compiled from: Sta */
public abstract class ee extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public a f10337a;

    /* renamed from: b  reason: collision with root package name */
    public final b f10338b;

    /* compiled from: Sta */
    public interface a {
    }

    /* compiled from: Sta */
    public interface b {
    }

    public ee(b bVar) {
        this.f10338b = bVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f10337a;
        if (aVar != null) {
            ke keVar = (ke) aVar;
            keVar.f10808c = null;
            ee poll = keVar.f10807b.poll();
            keVar.f10808c = poll;
            if (poll != null) {
                poll.executeOnExecutor(keVar.f10806a, new Object[0]);
            }
        }
    }
}
