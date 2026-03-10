package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;
import p005j$.util.DesugarTimeZone;

/* JADX INFO: renamed from: com.google.android.material.datepicker.ʼʼ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0654 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final AtomicReference f2702 = null;

    static {
        f2702 = new AtomicReference();
    }

    /* JADX INFO: renamed from: ʽ */
    public static Calendar m2446(Calendar r3) {
        Calendar r0 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (r3 != null) goto L6;
        r0.clear();
        return r0;
    L6:
        r0.setTimeInMillis(r3.getTimeInMillis());
        return r0;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static Calendar m2447() {
        AbstractC0660 r0 = (AbstractC0660) f2702.get();
        Calendar r02 = Calendar.getInstance();
        r02.set(11, 0);
        r02.set(12, 0);
        r02.set(13, 0);
        r02.set(14, 0);
        r02.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return r02;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Calendar m2448(Calendar r4) {
        Calendar r42 = m2446(r4);
        Calendar r0 = m2446(null);
        r0.set(r42.get(1), r42.get(2), r42.get(5));
        return r0;
    }
}
