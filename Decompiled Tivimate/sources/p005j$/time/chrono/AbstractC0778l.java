package p005j$.time.chrono;

import p005j$.time.temporal.EnumC0843a;

/* JADX INFO: renamed from: j$.time.chrono.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0778l {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3175a = null;

    static {
        int[] r0 = new int[EnumC0843a.values().length];
        f3175a = r0;
        r0[EnumC0843a.DAY_OF_MONTH.ordinal()] = 1;     // Catch: NoSuchFieldError -> L10
    L16:
        f3175a[EnumC0843a.DAY_OF_YEAR.ordinal()] = 2;     // Catch: NoSuchFieldError -> L11
    L20:
        f3175a[EnumC0843a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
    L26:
        f3175a[EnumC0843a.YEAR.ordinal()] = 4;     // Catch: NoSuchFieldError -> L13
    L18:
        f3175a[EnumC0843a.YEAR_OF_ERA.ordinal()] = 5;     // Catch: NoSuchFieldError -> L14
    L22:
        f3175a[EnumC0843a.ERA.ordinal()] = 6;     // Catch: NoSuchFieldError -> L15
        return;
    }
}
