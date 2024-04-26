package o4;

import java.util.regex.Pattern;
import p5.p;
import v6.e0;

public final /* synthetic */ class k implements p.g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k f22955a = new k(0);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ k f22956b = new k(1);

    public /* synthetic */ k(int i10) {
    }

    public int c(Object obj) {
        Pattern pattern = p.f23924a;
        String str = ((p5.k) obj).f23877a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (e0.f26436a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
