package com.startapp.sdk.ads.video.vast;

import androidx.activity.result.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Sta */
public class VASTResource {

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f12049f = Arrays.asList(new String[]{"image/jpeg", "image/png", "image/bmp", "image/gif"});

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f12050g = Collections.singletonList("application/x-javascript");

    /* renamed from: a  reason: collision with root package name */
    public final String f12051a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f12052b;

    /* renamed from: c  reason: collision with root package name */
    public final CreativeType f12053c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12054d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12055e;

    /* compiled from: Sta */
    public enum CreativeType {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* compiled from: Sta */
    public enum Type {
        HTML_RESOURCE,
        IFRAME_RESOURCE
    }

    public VASTResource(String str, Type type, CreativeType creativeType, int i10, int i11) {
        this.f12051a = str;
        this.f12052b = type;
        this.f12053c = creativeType;
        this.f12054d = i10;
        this.f12055e = i11;
    }

    public String a() {
        StringBuilder a10 = d.a("<!DOCTYPE html><html><head>", "<link rel=\"icon\" href=\"data:;base64,iVBORw0KGgo=\" />", "<style type=\"text/css\"> html, body { background-color: black; height: 100%; margin: 0; } #content { border: 0px; position: absolute; top: 50%; left: 50%; margin: -");
        a10.append(this.f12055e / 2);
        a10.append("px 0 0 -");
        a10.append(this.f12054d / 2);
        a10.append("px; }</style>");
        a10.append("<script>function performClick() { top.location.href = \"https://www.startapp.com\"; }</script>");
        a10.append("</head><body onclick=\"performClick()\">");
        int ordinal = this.f12052b.ordinal();
        if (ordinal == 0) {
            CreativeType creativeType = this.f12053c;
            if (creativeType == CreativeType.IMAGE) {
                a10.append("<img id=\"content\"");
                a(a10);
            } else if (creativeType == CreativeType.JAVASCRIPT) {
                a10.append("<script src=\"");
                a10.append(this.f12051a);
                a10.append("\" />");
            }
        } else if (ordinal == 1) {
            return this.f12051a;
        } else {
            if (ordinal == 2) {
                a10.append("<iframe id=\"content\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\"");
                a(a10);
            }
        }
        a10.append("</body></html>");
        return a10.toString();
    }

    public final void a(StringBuilder sb2) {
        sb2.append(" width=\"");
        sb2.append(this.f12054d);
        sb2.append("\"");
        sb2.append(" height=\"");
        sb2.append(this.f12055e);
        sb2.append("\"");
        sb2.append(" src=\"");
        sb2.append(this.f12051a);
        sb2.append("\" />");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.startapp.sdk.ads.video.vast.VASTResource a(com.startapp.bc r10, com.startapp.sdk.ads.video.vast.VASTResource.Type r11, int r12, int r13) {
        /*
            java.lang.String r0 = "StaticResource"
            r1 = 0
            com.startapp.bc r2 = r10.b(r0, r1, r1)
            if (r2 != 0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            java.lang.String r3 = "creativeType"
            java.lang.String r2 = r2.a(r3)
            if (r2 != 0) goto L_0x0014
        L_0x0012:
            r2 = r1
            goto L_0x0018
        L_0x0014:
            java.lang.String r2 = r2.toLowerCase()
        L_0x0018:
            com.startapp.sdk.ads.video.vast.VASTResource$CreativeType r3 = com.startapp.sdk.ads.video.vast.VASTResource.CreativeType.NONE
            int r4 = r11.ordinal()
            if (r4 == 0) goto L_0x0036
            r0 = 1
            if (r4 == r0) goto L_0x002e
            r0 = 2
            if (r4 == r0) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            java.lang.String r0 = "IFrameResource"
            java.lang.String r10 = r10.f(r0)
            goto L_0x0034
        L_0x002e:
            java.lang.String r0 = "HTMLResource"
            java.lang.String r10 = r10.f(r0)
        L_0x0034:
            r5 = r10
            goto L_0x003d
        L_0x0036:
            java.lang.String r10 = r10.f(r0)
            if (r10 != 0) goto L_0x003f
        L_0x003c:
            r5 = r1
        L_0x003d:
            r7 = r3
            goto L_0x005d
        L_0x003f:
            java.util.List<java.lang.String> r0 = f12049f
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L_0x0051
            java.util.List<java.lang.String> r3 = f12050g
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r10 = r1
        L_0x0051:
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x005a
            com.startapp.sdk.ads.video.vast.VASTResource$CreativeType r3 = com.startapp.sdk.ads.video.vast.VASTResource.CreativeType.IMAGE
            goto L_0x0034
        L_0x005a:
            com.startapp.sdk.ads.video.vast.VASTResource$CreativeType r3 = com.startapp.sdk.ads.video.vast.VASTResource.CreativeType.JAVASCRIPT
            goto L_0x0034
        L_0x005d:
            if (r5 != 0) goto L_0x0060
            return r1
        L_0x0060:
            com.startapp.sdk.ads.video.vast.VASTResource r10 = new com.startapp.sdk.ads.video.vast.VASTResource
            r4 = r10
            r6 = r11
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.vast.VASTResource.a(com.startapp.bc, com.startapp.sdk.ads.video.vast.VASTResource$Type, int, int):com.startapp.sdk.ads.video.vast.VASTResource");
    }
}
