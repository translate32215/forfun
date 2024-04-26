package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: EmojiCompatInitializer */
public class g extends e.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.h f1530a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1531b;

    public g(EmojiCompatInitializer.b bVar, e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1530a = hVar;
        this.f1531b = threadPoolExecutor;
    }

    public void a(Throwable th) {
        try {
            this.f1530a.a(th);
        } finally {
            this.f1531b.shutdown();
        }
    }

    public void b(m mVar) {
        try {
            this.f1530a.b(mVar);
        } finally {
            this.f1531b.shutdown();
        }
    }
}
