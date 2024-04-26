package com.google.android.exoplayer2.ui;

/* compiled from: TimeBar */
public interface d {

    /* compiled from: TimeBar */
    public interface a {
        void a(d dVar, long j10);

        void d(d dVar, long j10);

        void h(d dVar, long j10, boolean z10);
    }

    void a(long[] jArr, boolean[] zArr, int i10);

    void b(a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
