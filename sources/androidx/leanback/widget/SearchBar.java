package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.a0;
import androidx.leanback.app.p;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SearchOrbView;
import androidx.leanback.widget.l1;
import com.startapp.b4;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class SearchBar extends RelativeLayout {
    public static final /* synthetic */ int J = 0;
    public int A;
    public SpeechRecognizer B;
    public h1 C;
    public boolean D;
    public SoundPool E;
    public SparseIntArray F = new SparseIntArray();
    public boolean G = false;
    public final Context H;
    public k I;

    /* renamed from: a  reason: collision with root package name */
    public j f2199a;

    /* renamed from: b  reason: collision with root package name */
    public SearchEditText f2200b;

    /* renamed from: c  reason: collision with root package name */
    public SpeechOrbView f2201c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f2202d;

    /* renamed from: e  reason: collision with root package name */
    public String f2203e;

    /* renamed from: f  reason: collision with root package name */
    public String f2204f;

    /* renamed from: g  reason: collision with root package name */
    public String f2205g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f2206h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f2207i = new Handler();

    /* renamed from: r  reason: collision with root package name */
    public final InputMethodManager f2208r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2209s = false;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f2210t;

    /* renamed from: u  reason: collision with root package name */
    public final int f2211u;

    /* renamed from: v  reason: collision with root package name */
    public final int f2212v;

    /* renamed from: w  reason: collision with root package name */
    public final int f2213w;

    /* renamed from: x  reason: collision with root package name */
    public final int f2214x;

    /* renamed from: y  reason: collision with root package name */
    public int f2215y;

    /* renamed from: z  reason: collision with root package name */
    public int f2216z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2217a;

        public a(int i10) {
            this.f2217a = i10;
        }

        public void run() {
            SearchBar.this.E.play(SearchBar.this.F.get(this.f2217a), 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                SearchBar searchBar = SearchBar.this;
                searchBar.f2207i.post(new z0(searchBar));
            } else {
                SearchBar.this.a();
            }
            SearchBar.this.h(z10);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            SearchBar searchBar = SearchBar.this;
            searchBar.setSearchQueryInternal(searchBar.f2200b.getText().toString());
        }
    }

    public class d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f2221a;

        public d(Runnable runnable) {
            this.f2221a = runnable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchBar searchBar = SearchBar.this;
            if (!searchBar.G) {
                searchBar.f2207i.removeCallbacks(this.f2221a);
                SearchBar.this.f2207i.post(this.f2221a);
            }
        }
    }

    public class e implements SearchEditText.a {
        public e() {
        }
    }

    public class f implements TextView.OnEditorActionListener {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchBar.this.f();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            public void run() {
                p pVar = p.this;
                pVar.B0 |= 2;
                pVar.r0();
            }
        }

        public class c implements Runnable {
            public c() {
            }

            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f2209s = true;
                searchBar.f2201c.requestFocus();
            }
        }

        public f() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (3 == i10 || i10 == 0) {
                SearchBar searchBar = SearchBar.this;
                if (searchBar.f2199a != null) {
                    searchBar.a();
                    SearchBar.this.f2207i.postDelayed(new a(), 500);
                    return true;
                }
            }
            if (1 == i10) {
                SearchBar searchBar2 = SearchBar.this;
                if (searchBar2.f2199a != null) {
                    searchBar2.a();
                    SearchBar.this.f2207i.postDelayed(new b(), 500);
                    return true;
                }
            }
            if (2 != i10) {
                return false;
            }
            SearchBar.this.a();
            SearchBar.this.f2207i.postDelayed(new c(), 500);
            return true;
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        public void onClick(View view) {
            SearchBar searchBar = SearchBar.this;
            if (searchBar.G) {
                searchBar.e();
            } else {
                searchBar.d();
            }
        }
    }

    public class h implements View.OnFocusChangeListener {
        public h() {
        }

        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                SearchBar.this.a();
                SearchBar searchBar = SearchBar.this;
                if (searchBar.f2209s) {
                    searchBar.d();
                    SearchBar.this.f2209s = false;
                }
            } else {
                SearchBar.this.e();
            }
            SearchBar.this.h(z10);
        }
    }

    public class i implements RecognitionListener {
        public i() {
        }

        public void onBeginningOfSpeech() {
        }

        public void onBufferReceived(byte[] bArr) {
        }

        public void onEndOfSpeech() {
        }

        public void onError(int i10) {
            switch (i10) {
                case 1:
                    int i11 = SearchBar.J;
                    Log.w("SearchBar", "recognizer network timeout");
                    break;
                case 2:
                    int i12 = SearchBar.J;
                    Log.w("SearchBar", "recognizer network error");
                    break;
                case 3:
                    int i13 = SearchBar.J;
                    Log.w("SearchBar", "recognizer audio error");
                    break;
                case 4:
                    int i14 = SearchBar.J;
                    Log.w("SearchBar", "recognizer server error");
                    break;
                case 5:
                    int i15 = SearchBar.J;
                    Log.w("SearchBar", "recognizer client error");
                    break;
                case 6:
                    int i16 = SearchBar.J;
                    Log.w("SearchBar", "recognizer speech timeout");
                    break;
                case 7:
                    int i17 = SearchBar.J;
                    Log.w("SearchBar", "recognizer no match");
                    break;
                case b4.f10106f /*8*/:
                    int i18 = SearchBar.J;
                    Log.w("SearchBar", "recognizer busy");
                    break;
                case 9:
                    int i19 = SearchBar.J;
                    Log.w("SearchBar", "recognizer insufficient permissions");
                    break;
                default:
                    int i20 = SearchBar.J;
                    Log.d("SearchBar", "recognizer other error");
                    break;
            }
            SearchBar.this.e();
            SearchBar.this.c(R.raw.lb_voice_failure);
        }

        public void onEvent(int i10, Bundle bundle) {
        }

        public void onPartialResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null && stringArrayList.size() != 0) {
                String str = stringArrayList.get(0);
                String str2 = stringArrayList.size() > 1 ? stringArrayList.get(1) : null;
                SearchEditText searchEditText = SearchBar.this.f2200b;
                searchEditText.getClass();
                if (str == null) {
                    str = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                if (str2 != null) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(str2);
                    Matcher matcher = l1.f2410f.matcher(str2);
                    while (matcher.find()) {
                        int start = matcher.start() + length;
                        spannableStringBuilder.setSpan(new l1.b(str2.charAt(matcher.start()), start), start, matcher.end() + length, 33);
                    }
                }
                searchEditText.f2415d = Math.max(str.length(), searchEditText.f2415d);
                searchEditText.setText(new SpannedString(spannableStringBuilder));
                searchEditText.bringPointIntoView(searchEditText.length());
                ObjectAnimator objectAnimator = searchEditText.f2416e;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                int streamPosition = searchEditText.getStreamPosition();
                int length2 = searchEditText.length();
                int i10 = length2 - streamPosition;
                if (i10 > 0) {
                    if (searchEditText.f2416e == null) {
                        ObjectAnimator objectAnimator2 = new ObjectAnimator();
                        searchEditText.f2416e = objectAnimator2;
                        objectAnimator2.setTarget(searchEditText);
                        searchEditText.f2416e.setProperty(l1.f2411g);
                    }
                    searchEditText.f2416e.setIntValues(new int[]{streamPosition, length2});
                    searchEditText.f2416e.setDuration(((long) i10) * 50);
                    searchEditText.f2416e.start();
                }
            }
        }

        public void onReadyForSpeech(Bundle bundle) {
            SpeechOrbView speechOrbView = SearchBar.this.f2201c;
            speechOrbView.setOrbColors(speechOrbView.B);
            speechOrbView.setOrbIcon(speechOrbView.getResources().getDrawable(R.drawable.lb_ic_search_mic));
            speechOrbView.a(true);
            speechOrbView.f2244u = false;
            speechOrbView.c();
            speechOrbView.b(1.0f);
            speechOrbView.D = 0;
            speechOrbView.E = true;
            SearchBar.this.c(R.raw.lb_voice_open);
        }

        public void onResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null) {
                SearchBar.this.f2203e = stringArrayList.get(0);
                SearchBar searchBar = SearchBar.this;
                searchBar.f2200b.setText(searchBar.f2203e);
                SearchBar.this.f();
            }
            SearchBar.this.e();
            SearchBar.this.c(R.raw.lb_voice_success);
        }

        public void onRmsChanged(float f10) {
            SearchBar.this.f2201c.setSoundLevel(f10 < 0.0f ? 0 : (int) (f10 * 10.0f));
        }
    }

    public interface j {
    }

    public interface k {
    }

    static {
        Class<SearchBar> cls = SearchBar.class;
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.H = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.lb_search_bar, this, true);
        this.A = getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A);
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f2203e = "";
        this.f2208r = (InputMethodManager) context.getSystemService("input_method");
        this.f2212v = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.f2211u = resources.getColor(R.color.lb_search_bar_text);
        this.f2216z = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.f2215y = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.f2214x = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.f2213w = resources.getColor(R.color.lb_search_bar_hint);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
    }

    public void a() {
        this.f2208r.hideSoftInputFromWindow(this.f2200b.getWindowToken(), 0);
    }

    public final boolean b() {
        return this.f2201c.isFocused();
    }

    public final void c(int i10) {
        this.f2207i.post(new a(i10));
    }

    public void d() {
        k kVar;
        if (!this.G) {
            if (!hasFocus()) {
                requestFocus();
            }
            if (this.C != null) {
                this.f2200b.setText("");
                this.f2200b.setHint("");
                this.C.a();
                this.G = true;
            } else if (this.B != null) {
                if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                    this.G = true;
                    this.f2200b.setText("");
                    Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                    intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                    intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
                    this.B.setRecognitionListener(new i());
                    this.D = true;
                    this.B.startListening(intent);
                } else if (Build.VERSION.SDK_INT < 23 || (kVar = this.I) == null) {
                    throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
                } else {
                    p pVar = p.this;
                    String[] strArr = {"android.permission.RECORD_AUDIO"};
                    if (pVar.C != null) {
                        a0 y10 = pVar.y();
                        if (y10.D != null) {
                            y10.E.addLast(new a0.l(pVar.f1794f, 0));
                            y10.D.a(strArr);
                            return;
                        }
                        y10.f1598v.getClass();
                        return;
                    }
                    throw new IllegalStateException("Fragment " + pVar + " not attached to Activity");
                }
            }
        }
    }

    public void e() {
        if (this.G) {
            this.f2200b.setText(this.f2203e);
            this.f2200b.setHint(this.f2204f);
            this.G = false;
            if (this.C == null && this.B != null) {
                this.f2201c.d();
                if (this.D) {
                    this.B.cancel();
                    this.D = false;
                }
                this.B.setRecognitionListener((RecognitionListener) null);
            }
        }
    }

    public void f() {
        j jVar;
        if (!TextUtils.isEmpty(this.f2203e) && (jVar = this.f2199a) != null) {
            String str = this.f2203e;
            p pVar = p.this;
            pVar.B0 |= 2;
            pVar.r0();
            p.h hVar = pVar.f2064u0;
            if (hVar != null) {
                hVar.b(str);
            }
        }
    }

    public final void g() {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(this.f2205g)) {
            if (b()) {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title_speech, new Object[]{this.f2205g});
            } else {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title, new Object[]{this.f2205g});
            }
        } else if (b()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.f2204f = string;
        SearchEditText searchEditText = this.f2200b;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public Drawable getBadgeDrawable() {
        return this.f2206h;
    }

    public CharSequence getHint() {
        return this.f2204f;
    }

    public String getTitle() {
        return this.f2205g;
    }

    public void h(boolean z10) {
        if (z10) {
            this.f2210t.setAlpha(this.f2216z);
            if (b()) {
                this.f2200b.setTextColor(this.f2214x);
                this.f2200b.setHintTextColor(this.f2214x);
            } else {
                this.f2200b.setTextColor(this.f2212v);
                this.f2200b.setHintTextColor(this.f2214x);
            }
        } else {
            this.f2210t.setAlpha(this.f2215y);
            this.f2200b.setTextColor(this.f2211u);
            this.f2200b.setHintTextColor(this.f2213w);
        }
        g();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = new SoundPool(2, 1, 0);
        Context context = this.H;
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = iArr[i10];
            this.F.put(i11, this.E.load(context, i11, 1));
        }
    }

    public void onDetachedFromWindow() {
        e();
        this.E.release();
        super.onDetachedFromWindow();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2210t = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.f2200b = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(R.id.lb_search_bar_badge);
        this.f2202d = imageView;
        Drawable drawable = this.f2206h;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f2200b.setOnFocusChangeListener(new b());
        this.f2200b.addTextChangedListener(new d(new c()));
        this.f2200b.setOnKeyboardDismissListener(new e());
        this.f2200b.setOnEditorActionListener(new f());
        this.f2200b.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.f2201c = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new g());
        this.f2201c.setOnFocusChangeListener(new h());
        h(hasFocus());
        g();
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f2206h = drawable;
        ImageView imageView = this.f2202d;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable != null) {
                this.f2202d.setVisibility(0);
            } else {
                this.f2202d.setVisibility(8);
            }
        }
    }

    public void setNextFocusDownId(int i10) {
        this.f2201c.setNextFocusDownId(i10);
        this.f2200b.setNextFocusDownId(i10);
    }

    public void setPermissionListener(k kVar) {
        this.I = kVar;
    }

    public void setSearchAffordanceColors(SearchOrbView.c cVar) {
        SpeechOrbView speechOrbView = this.f2201c;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(cVar);
        }
    }

    public void setSearchAffordanceColorsInListening(SearchOrbView.c cVar) {
        SpeechOrbView speechOrbView = this.f2201c;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(cVar);
        }
    }

    public void setSearchBarListener(j jVar) {
        this.f2199a = jVar;
    }

    public void setSearchQuery(String str) {
        e();
        this.f2200b.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (!TextUtils.equals(this.f2203e, str)) {
            this.f2203e = str;
            j jVar = this.f2199a;
            if (jVar != null) {
                p pVar = p.this;
                p.h hVar = pVar.f2064u0;
                if (hVar == null) {
                    pVar.f2065v0 = str;
                } else if (hVar.a(str)) {
                    pVar.B0 &= -3;
                }
            }
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(h1 h1Var) {
        this.C = h1Var;
        if (h1Var != null && this.B != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        e();
        SpeechRecognizer speechRecognizer2 = this.B;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener((RecognitionListener) null);
            if (this.D) {
                this.B.cancel();
                this.D = false;
            }
        }
        this.B = speechRecognizer;
        if (this.C != null && speechRecognizer != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setTitle(String str) {
        this.f2205g = str;
        g();
    }
}
