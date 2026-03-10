package p005j$.time.temporal;

import p005j$.com.android.tools.p006r8.AbstractC0754a;
import p005j$.time.C0793d;

/* JADX INFO: loaded from: classes2.dex */
public enum ChronoUnit extends Enum<ChronoUnit> implements TemporalUnit {
    public static final ChronoUnit CENTURIES = null;
    public static final ChronoUnit DAYS = null;
    public static final ChronoUnit DECADES = null;
    public static final ChronoUnit ERAS = null;
    public static final ChronoUnit FOREVER = null;
    public static final ChronoUnit HALF_DAYS = null;
    public static final ChronoUnit HOURS = null;
    public static final ChronoUnit MICROS = null;
    public static final ChronoUnit MILLENNIA = null;
    public static final ChronoUnit MILLIS = null;
    public static final ChronoUnit MINUTES = null;
    public static final ChronoUnit MONTHS = null;
    public static final ChronoUnit NANOS = null;
    public static final ChronoUnit SECONDS = null;
    public static final ChronoUnit WEEKS = null;
    public static final ChronoUnit YEARS = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ChronoUnit[] f3353c = null;

    /* JADX INFO: renamed from: a */
    public final String f3354a;

    /* JADX INFO: renamed from: b */
    public final C0793d f3355b;

    static {
        ChronoUnit r0 = new ChronoUnit("NANOS", 0, "Nanos", C0793d.m3021m(1));
        NANOS = r0;
        ChronoUnit r3 = new ChronoUnit("MICROS", 1, "Micros", C0793d.m3021m(1000));
        MICROS = r3;
        ChronoUnit r4 = new ChronoUnit("MILLIS", 2, "Millis", C0793d.m3021m(1000000));
        MILLIS = r4;
        ChronoUnit r6 = new ChronoUnit("SECONDS", 3, "Seconds", C0793d.m3020l(1, 0));
        SECONDS = r6;
        ChronoUnit r1 = new ChronoUnit("MINUTES", 4, "Minutes", C0793d.m3020l(60, 0));
        MINUTES = r1;
        ChronoUnit r2 = new ChronoUnit("HOURS", 5, "Hours", C0793d.m3020l(3600, 0));
        HOURS = r2;
        ChronoUnit r8 = new ChronoUnit("HALF_DAYS", 6, "HalfDays", C0793d.m3020l(43200, 0));
        HALF_DAYS = r8;
        ChronoUnit r7 = new ChronoUnit("DAYS", 7, "Days", C0793d.m3020l(86400, 0));
        DAYS = r7;
        ChronoUnit r9 = new ChronoUnit("WEEKS", 8, "Weeks", C0793d.m3020l(604800, 0));
        WEEKS = r9;
        ChronoUnit r11 = new ChronoUnit("MONTHS", 9, "Months", C0793d.m3020l(2629746, 0));
        MONTHS = r11;
        ChronoUnit r12 = new ChronoUnit("YEARS", 10, "Years", C0793d.m3020l(31556952, 0));
        YEARS = r12;
        ChronoUnit r13 = new ChronoUnit("DECADES", 11, "Decades", C0793d.m3020l(315569520, 0));
        DECADES = r13;
        ChronoUnit r5 = new ChronoUnit("CENTURIES", 12, "Centuries", C0793d.m3020l(3155695200L, 0));
        CENTURIES = r5;
        ChronoUnit r02 = new ChronoUnit("MILLENNIA", 13, "Millennia", C0793d.m3020l(31556952000L, 0));
        MILLENNIA = r02;
        ChronoUnit r14 = new ChronoUnit("ERAS", 14, "Eras", C0793d.m3020l(31556952000000000L, 0));
        ERAS = r14;
        ChronoUnit r03 = new ChronoUnit("FOREVER", 15, "Forever", C0793d.m3020l(AbstractC0754a.m2806P(Long.MAX_VALUE, AbstractC0754a.m2811U(999999999, 1000000000)), (int) AbstractC0754a.m2810T(999999999, 1000000000)));
        FOREVER = r03;
        f3353c = new ChronoUnit[]{r0, r3, r4, r6, r1, r2, r8, r7, r9, r11, r12, r13, r5, r02, r14, r03};
    }

    ChronoUnit(String r1, int r2, String r3, C0793d r4) {
        this.f3354a = r3;
        this.f3355b = r4;
    }

    public static ChronoUnit valueOf(String r1) {
        return (ChronoUnit) Enum.valueOf(ChronoUnit.class, r1);
    }

    public static ChronoUnit[] values() {
        return (ChronoUnit[]) f3353c.clone();
    }

    @Override // p005j$.time.temporal.TemporalUnit
    public long between(Temporal r1, Temporal r2) {
        return r1.until(r2, this);
    }

    @Override // p005j$.time.temporal.TemporalUnit
    public final C0793d getDuration() {
        return this.f3355b;
    }

    @Override // p005j$.time.temporal.TemporalUnit
    /* JADX INFO: renamed from: k */
    public final Temporal mo3114k(Temporal r1, long r2) {
        return r1.mo2874d(r2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3354a;
    }
}
