package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher */
public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    public Object d(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
