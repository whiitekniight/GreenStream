package p005j$.time.chrono;

import p005j$.time.temporal.EnumC0843a;

/* JADX INFO: renamed from: j$.time.chrono.F */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0764F {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3155a = null;

    static {
        int[] r0 = new int[EnumC0843a.values().length];
        f3155a = r0;
        r0[EnumC0843a.DAY_OF_MONTH.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
    L18:
        f3155a[EnumC0843a.DAY_OF_YEAR.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
    L22:
        f3155a[EnumC0843a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
    L30:
        f3155a[EnumC0843a.YEAR_OF_ERA.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
    L20:
        f3155a[EnumC0843a.PROLEPTIC_MONTH.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
    L24:
        f3155a[EnumC0843a.YEAR.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
    L26:
        f3155a[EnumC0843a.ERA.ordinal()] = 7;     // Catch: NoSuchFieldError -> L17
        return;
    }
}
