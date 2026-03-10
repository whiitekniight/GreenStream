package p287;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ـﹶ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class C3995 implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f14782;

    /* JADX INFO: renamed from: ᴵˊ */
    public final AtomicInteger f14783;

    public C3995(Object r3) {
        this.f14783 = new AtomicInteger(0);
        this.f14782 = r3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r2) {
        ((TextWatcher) this.f14782).afterTextChanged(r2);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r2, int r3, int r4, int r5) {
        ((TextWatcher) this.f14782).beforeTextChanged(r2, r3, r4, r5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable r2, Object r3, int r4, int r5) {
        if (this.f14783.get() > 0) goto L5;
    L7:
        ((SpanWatcher) this.f14782).onSpanAdded(r2, r3, r4, r5);
        return;
    L5:
        if ((r3 instanceof C3998) == false) goto L7;
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable r9, Object r10, int r11, int r12, int r13, int r14) {
        if (this.f14783.get() <= 0) goto L8;
        if ((r10 instanceof C3998) == false) goto L8;
        return;
    L8:
        if (Build.VERSION.SDK_INT < 28) goto L10;
    L14:
        int r4 = r11;
        int r6 = r13;
    L15:
        ((SpanWatcher) this.f14782).onSpanChanged(r9, r10, r4, r12, r6, r14);
        return;
    L10:
        if (r11 <= r12) goto L12;
        r11 = 0;
    L12:
        if (r13 <= r14) goto L14;
        r4 = r11;
        r6 = 0;
        goto L15
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable r2, Object r3, int r4, int r5) {
        if (this.f14783.get() > 0) goto L5;
    L7:
        ((SpanWatcher) this.f14782).onSpanRemoved(r2, r3, r4, r5);
        return;
    L5:
        if ((r3 instanceof C3998) == false) goto L7;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r2, int r3, int r4, int r5) {
        ((TextWatcher) this.f14782).onTextChanged(r2, r3, r4, r5);
    }
}
