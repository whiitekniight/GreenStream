package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0561 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int[] f2363 = null;

    static {
        int[] r0 = new int[TimeUnit.values().length];
        f2363 = r0;
        r0[TimeUnit.NANOSECONDS.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
    L18:
        f2363[TimeUnit.MICROSECONDS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
    L22:
        f2363[TimeUnit.MILLISECONDS.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
    L30:
        f2363[TimeUnit.SECONDS.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
    L20:
        f2363[TimeUnit.MINUTES.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
    L24:
        f2363[TimeUnit.HOURS.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
    L26:
        f2363[TimeUnit.DAYS.ordinal()] = 7;     // Catch: NoSuchFieldError -> L17
        return;
    }
}
