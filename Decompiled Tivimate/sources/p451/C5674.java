package p451;

import android.text.Editable;
import p287.C3989;

/* JADX INFO: renamed from: ﹶᐧ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5674 extends Editable.Factory {

    /* JADX INFO: renamed from: ʽ */
    public static Class f20451;

    /* JADX INFO: renamed from: ⁱˊ */
    public static volatile C5674 f20452;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Object f20453 = null;

    static {
        f20453 = new Object();
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence r3) {
        Class r0 = f20451;
        if (r0 == null) goto L7;
        return new C3989(r0, r3);
    L7:
        return super.newEditable(r3);
    }
}
