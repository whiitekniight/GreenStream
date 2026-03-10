package p005j$.time;

import p005j$.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: j$.time.p */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0838p {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3341a = null;

    static {
        int[] r0 = new int[ChronoUnit.values().length];
        f3341a = r0;
        r0[ChronoUnit.NANOS.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
    L18:
        f3341a[ChronoUnit.MICROS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
    L22:
        f3341a[ChronoUnit.MILLIS.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
    L30:
        f3341a[ChronoUnit.SECONDS.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
    L20:
        f3341a[ChronoUnit.MINUTES.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
    L24:
        f3341a[ChronoUnit.HOURS.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
    L26:
        f3341a[ChronoUnit.HALF_DAYS.ordinal()] = 7;     // Catch: NoSuchFieldError -> L17
        return;
    }
}
