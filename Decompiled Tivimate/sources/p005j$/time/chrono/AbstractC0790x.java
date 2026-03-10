package p005j$.time.chrono;

import p005j$.time.temporal.EnumC0843a;

/* JADX INFO: renamed from: j$.time.chrono.x */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0790x {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3208a = null;

    static {
        int[] r0 = new int[EnumC0843a.values().length];
        f3208a = r0;
        r0[EnumC0843a.PROLEPTIC_MONTH.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L10:
        f3208a[EnumC0843a.YEAR_OF_ERA.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L12:
        f3208a[EnumC0843a.YEAR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
        return;
    }
}
