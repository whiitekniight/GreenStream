package p149;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p362.AbstractC4778;
import ᐧﹳ.ʽ;
import ﹳˋ.ٴﹶ;

/* JADX INFO: renamed from: ˉˆ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C2780 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final ʽ f9920;

    /* JADX INFO: renamed from: ﹳٴ */
    public final TextView f9921;

    public C2780(TextView r2) {
        this.f9921 = r2;
        this.f9920 = new ʽ(r2);
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m6055(boolean r2) {
        ((ٴﹶ) this.f9920.ᴵˊ).ٴᵢ(r2);
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m6056(boolean r2) {
        ((ٴﹶ) this.f9920.ᴵˊ).ᵎⁱ(r2);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6057(AttributeSet r4, int r5) {
        TypedArray r42 = this.f9921.getContext().obtainStyledAttributes(r4, AbstractC4778.f16842, r5, 0);
        boolean r1 = true;
        if (r42.hasValue(14) == false) goto L9;
        r1 = r42.getBoolean(14, true);     // Catch: Throwable -> L7
    L9:
        r42.recycle();
        m6056(r1);
        return;
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final InputFilter[] m6058(InputFilter[] r2) {
        return ((ٴﹶ) this.f9920.ᴵˊ).ـˆ(r2);
    }
}
