package p005j$.time.chrono;

import p005j$.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: j$.time.chrono.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0768b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3161a = null;

    static {
        int[] r0 = new int[ChronoUnit.values().length];
        f3161a = r0;
        r0[ChronoUnit.DAYS.ordinal()] = 1;     // Catch: NoSuchFieldError -> L12
    L20:
        f3161a[ChronoUnit.WEEKS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
    L24:
        f3161a[ChronoUnit.MONTHS.ordinal()] = 3;     // Catch: NoSuchFieldError -> L14
    L34:
        f3161a[ChronoUnit.YEARS.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
    L22:
        f3161a[ChronoUnit.DECADES.ordinal()] = 5;     // Catch: NoSuchFieldError -> L16
    L26:
        f3161a[ChronoUnit.CENTURIES.ordinal()] = 6;     // Catch: NoSuchFieldError -> L17
    L28:
        f3161a[ChronoUnit.MILLENNIA.ordinal()] = 7;     // Catch: NoSuchFieldError -> L18
    L30:
        f3161a[ChronoUnit.ERAS.ordinal()] = 8;     // Catch: NoSuchFieldError -> L19
        return;
    }
}
