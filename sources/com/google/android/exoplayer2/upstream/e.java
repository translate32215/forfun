package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import u6.i;

/* compiled from: DataSource */
public interface e extends c {

    /* compiled from: DataSource */
    public interface a {
        e a();
    }

    Uri M();

    Map<String, List<String>> N();

    long O(u6.e eVar) throws IOException;

    void P(i iVar);

    void close() throws IOException;
}
