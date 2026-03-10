package p451;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p287.C3991;

/* JADX INFO: renamed from: ﹶᐧ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C5669 implements InputFilter {

    /* JADX INFO: renamed from: ⁱˊ */
    public C5668 f20441;

    /* JADX INFO: renamed from: ﹳٴ */
    public final TextView f20442;

    public C5669(TextView r1) {
        this.f20442 = r1;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence r4, int r5, int r6, Spanned r7, int r8, int r9) {
        TextView r0 = this.f20442;
        if (r0.isInEditMode() == true) goto L33;
        int r1 = C3991.m8184().m8188();
        if (r1 != 0) goto L8;
    L27:
        C3991 r52 = C3991.m8184();
        if (this.f20441 != null) goto L30;
        this.f20441 = new C5668(r0, this);
    L30:
        r52.m8189(this.f20441);
        return r4;
    L8:
        if (r1 != 1) goto L10;
        if (r9 != 0) goto L19;
        if (r8 != 0) goto L19;
        if (r7.length() != 0) goto L19;
        if (r4 != r0.getText()) goto L19;
        return r4;
    L19:
        if (r4 == null) goto L32;
        if (r5 == 0) goto L22;
    L24:
        r4 = r4.subSequence(r5, r6);
    L26:
        return C3991.m8184().m8187(r4, 0, r4.length());
    L22:
        if (r6 != r4.length()) goto L24;
    L32:
        return r4;
    L10:
        if (r1 == 3) goto L27;
        return r4;
    L33:
        return r4;
    }
}
