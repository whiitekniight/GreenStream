package p005j$.time;

import p005j$.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: j$.time.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0830h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3322a = null;

    static {
        int[] r0 = new int[ChronoUnit.values().length];
        f3322a = r0;
        r0[ChronoUnit.NANOS.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
    L18:
        f3322a[ChronoUnit.MICROS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
    L22:
        f3322a[ChronoUnit.MILLIS.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
    L30:
        f3322a[ChronoUnit.SECONDS.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
    L20:
        f3322a[ChronoUnit.MINUTES.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
    L24:
        f3322a[ChronoUnit.HOURS.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
    L26:
        f3322a[ChronoUnit.HALF_DAYS.ordinal()] = 7;     // Catch: NoSuchFieldError -> L17
        return;
    }
}
