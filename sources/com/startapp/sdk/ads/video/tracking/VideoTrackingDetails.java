package com.startapp.sdk.ads.video.tracking;

import com.startapp.cc;
import com.startapp.ob;
import com.startapp.sdk.ads.video.vast.a;
import com.startapp.yb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = -1841622077369870410L;
    @ob(type = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;
    @ob(type = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    private boolean isVAST;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClickTrackingUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;
    @ob(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    public AbsoluteTrackingLink[] a() {
        return this.absoluteTrackingUrls;
    }

    public ActionTrackingLink[] b() {
        return this.creativeViewUrls;
    }

    public FractionTrackingLink[] c() {
        return this.fractionTrackingUrls;
    }

    public ActionTrackingLink[] d() {
        return this.impressionUrls;
    }

    public ActionTrackingLink[] e() {
        return this.inlineErrorTrackingUrls;
    }

    public ActionTrackingLink[] f() {
        return this.soundMuteUrls;
    }

    public ActionTrackingLink[] g() {
        return this.soundUnmuteUrls;
    }

    public ActionTrackingLink[] h() {
        return this.videoClickTrackingUrls;
    }

    public ActionTrackingLink[] i() {
        return this.videoClosedUrls;
    }

    public ActionTrackingLink[] j() {
        return this.videoPausedUrls;
    }

    public ActionTrackingLink[] k() {
        return this.isVAST ? this.videoPostRollClickTrackingUrls : this.videoClickTrackingUrls;
    }

    public ActionTrackingLink[] l() {
        return this.videoPostRollClosedUrls;
    }

    public ActionTrackingLink[] m() {
        return this.videoPostRollImpressionUrls;
    }

    public ActionTrackingLink[] n() {
        return this.videoResumedUrls;
    }

    public ActionTrackingLink[] o() {
        return this.videoRewardedUrls;
    }

    public ActionTrackingLink[] p() {
        return this.videoSkippedUrls;
    }

    public String toString() {
        return super.toString();
    }

    public VideoTrackingDetails(yb ybVar) {
        this.isVAST = true;
        this.impressionUrls = b(ybVar.j());
        this.soundMuteUrls = b(ybVar.l());
        this.soundUnmuteUrls = b(ybVar.q());
        this.videoPausedUrls = b(ybVar.m());
        this.videoResumedUrls = b(ybVar.n());
        this.videoSkippedUrls = b(ybVar.p());
        this.videoClosedUrls = b(ybVar.e());
        this.inlineErrorTrackingUrls = b(ybVar.h());
        this.videoClickTrackingUrls = b(ybVar.d());
        this.absoluteTrackingUrls = a(ybVar.a());
        this.fractionTrackingUrls = a(ybVar.i(), ybVar.g());
        a f10 = ybVar.f();
        if (f10 != null) {
            this.videoPostRollImpressionUrls = b(f10.d());
            this.videoPostRollClickTrackingUrls = b(f10.b());
        }
    }

    public static ActionTrackingLink[] b(List<String> list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String b10 : list) {
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.b(b10);
            actionTrackingLink.a(true);
            actionTrackingLink.a("");
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[0]);
    }

    public final AbsoluteTrackingLink[] a(List<cc<Integer>> list) {
        if (list == null) {
            return new AbsoluteTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (cc next : list) {
            AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
            absoluteTrackingLink.b(next.f10253a);
            if (((Integer) next.f10254b).intValue() != -1) {
                absoluteTrackingLink.a(((Integer) next.f10254b).intValue());
            }
            absoluteTrackingLink.a(true);
            absoluteTrackingLink.a("");
            arrayList.add(absoluteTrackingLink);
        }
        return (AbsoluteTrackingLink[]) arrayList.toArray(new AbsoluteTrackingLink[0]);
    }

    public final FractionTrackingLink[] a(List<cc<Float>> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (cc next : list) {
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.b(next.f10253a);
            fractionTrackingLink.a((int) (((Float) next.f10254b).floatValue() * 100.0f));
            fractionTrackingLink.a(true);
            fractionTrackingLink.a("");
            arrayList.add(fractionTrackingLink);
        }
        for (String b10 : list2) {
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.b(b10);
            fractionTrackingLink2.a(100);
            fractionTrackingLink2.a(true);
            fractionTrackingLink2.a("");
            arrayList.add(fractionTrackingLink2);
        }
        return arrayList.size() > 0 ? (FractionTrackingLink[]) arrayList.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
    }
}
