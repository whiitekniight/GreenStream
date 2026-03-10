package p005j$.time.temporal;

import java.util.Map;
import p005j$.time.format.C0799D;
import p005j$.time.format.EnumC0800E;

/* JADX INFO: renamed from: j$.time.temporal.a */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0843a extends Enum implements InterfaceC0857o {
    public static final EnumC0843a ALIGNED_DAY_OF_WEEK_IN_MONTH = null;
    public static final EnumC0843a ALIGNED_DAY_OF_WEEK_IN_YEAR = null;
    public static final EnumC0843a ALIGNED_WEEK_OF_MONTH = null;
    public static final EnumC0843a ALIGNED_WEEK_OF_YEAR = null;
    public static final EnumC0843a AMPM_OF_DAY = null;
    public static final EnumC0843a CLOCK_HOUR_OF_AMPM = null;
    public static final EnumC0843a CLOCK_HOUR_OF_DAY = null;
    public static final EnumC0843a DAY_OF_MONTH = null;
    public static final EnumC0843a DAY_OF_WEEK = null;
    public static final EnumC0843a DAY_OF_YEAR = null;
    public static final EnumC0843a EPOCH_DAY = null;
    public static final EnumC0843a ERA = null;
    public static final EnumC0843a HOUR_OF_AMPM = null;
    public static final EnumC0843a HOUR_OF_DAY = null;
    public static final EnumC0843a INSTANT_SECONDS = null;
    public static final EnumC0843a MICRO_OF_DAY = null;
    public static final EnumC0843a MICRO_OF_SECOND = null;
    public static final EnumC0843a MILLI_OF_DAY = null;
    public static final EnumC0843a MILLI_OF_SECOND = null;
    public static final EnumC0843a MINUTE_OF_DAY = null;
    public static final EnumC0843a MINUTE_OF_HOUR = null;
    public static final EnumC0843a MONTH_OF_YEAR = null;
    public static final EnumC0843a NANO_OF_DAY = null;
    public static final EnumC0843a NANO_OF_SECOND = null;
    public static final EnumC0843a OFFSET_SECONDS = null;
    public static final EnumC0843a PROLEPTIC_MONTH = null;
    public static final EnumC0843a SECOND_OF_DAY = null;
    public static final EnumC0843a SECOND_OF_MINUTE = null;
    public static final EnumC0843a YEAR = null;
    public static final EnumC0843a YEAR_OF_ERA = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC0843a[] f3364c = null;

    /* JADX INFO: renamed from: a */
    public final String f3365a;

    /* JADX INFO: renamed from: b */
    public final C0860r f3366b;

    static {
        ChronoUnit r4 = ChronoUnit.NANOS;
        ChronoUnit r9 = ChronoUnit.SECONDS;
        EnumC0843a r0 = new EnumC0843a("NANO_OF_SECOND", 0, "NanoOfSecond", r4, r9, C0860r.m3134f(0, 999999999));
        NANO_OF_SECOND = r0;
        ChronoUnit r19 = ChronoUnit.DAYS;
        EnumC0843a r1 = new EnumC0843a("NANO_OF_DAY", 1, "NanoOfDay", r4, r19, C0860r.m3134f(0, 86399999999999L));
        NANO_OF_DAY = r1;
        ChronoUnit r92 = ChronoUnit.MICROS;
        EnumC0843a r5 = new EnumC0843a("MICRO_OF_SECOND", 2, "MicroOfSecond", r92, r9, C0860r.m3134f(0, 999999));
        MICRO_OF_SECOND = r5;
        EnumC0843a r15 = new EnumC0843a("MICRO_OF_DAY", 3, "MicroOfDay", r92, r19, C0860r.m3134f(0, 86399999999L));
        MICRO_OF_DAY = r15;
        ChronoUnit r93 = ChronoUnit.MILLIS;
        EnumC0843a r52 = new EnumC0843a("MILLI_OF_SECOND", 4, "MilliOfSecond", r93, r9, C0860r.m3134f(0, 999));
        MILLI_OF_SECOND = r52;
        EnumC0843a r152 = new EnumC0843a("MILLI_OF_DAY", 5, "MilliOfDay", r93, r19, C0860r.m3134f(0, 86399999));
        MILLI_OF_DAY = r152;
        ChronoUnit r10 = ChronoUnit.MINUTES;
        EnumC0843a r53 = new EnumC0843a("SECOND_OF_MINUTE", 6, "SecondOfMinute", r9, r10, C0860r.m3134f(0, 59), 0);
        SECOND_OF_MINUTE = r53;
        EnumC0843a r54 = new EnumC0843a("SECOND_OF_DAY", 7, "SecondOfDay", r9, r19, C0860r.m3134f(0, 86399));
        SECOND_OF_DAY = r54;
        ChronoUnit r39 = ChronoUnit.HOURS;
        EnumC0843a r26 = new EnumC0843a("MINUTE_OF_HOUR", 8, "MinuteOfHour", r10, r39, C0860r.m3134f(0, 59), 0);
        MINUTE_OF_HOUR = r26;
        EnumC0843a r153 = new EnumC0843a("MINUTE_OF_DAY", 9, "MinuteOfDay", r10, r19, C0860r.m3134f(0, 1439));
        MINUTE_OF_DAY = r153;
        ChronoUnit r40 = ChronoUnit.HALF_DAYS;
        EnumC0843a r35 = new EnumC0843a("HOUR_OF_AMPM", 10, "HourOfAmPm", r39, r40, C0860r.m3134f(0, 11));
        HOUR_OF_AMPM = r35;
        EnumC0843a r352 = new EnumC0843a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", r39, r40, C0860r.m3134f(1, 12));
        CLOCK_HOUR_OF_AMPM = r352;
        EnumC0843a r154 = new EnumC0843a("HOUR_OF_DAY", 12, "HourOfDay", r39, r19, C0860r.m3134f(0, 23), 0);
        HOUR_OF_DAY = r154;
        EnumC0843a r155 = new EnumC0843a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", r39, r19, C0860r.m3134f(1, 24));
        CLOCK_HOUR_OF_DAY = r155;
        EnumC0843a r156 = new EnumC0843a("AMPM_OF_DAY", 14, "AmPmOfDay", r40, r19, C0860r.m3134f(0, 1), 0);
        AMPM_OF_DAY = r156;
        ChronoUnit r20 = ChronoUnit.WEEKS;
        EnumC0843a r157 = new EnumC0843a("DAY_OF_WEEK", 15, "DayOfWeek", r19, r20, C0860r.m3134f(1, 7), 0);
        DAY_OF_WEEK = r157;
        EnumC0843a r158 = new EnumC0843a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", r19, r20, C0860r.m3134f(1, 7));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = r158;
        EnumC0843a r159 = new EnumC0843a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", r19, r20, C0860r.m3134f(1, 7));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = r159;
        ChronoUnit r45 = ChronoUnit.MONTHS;
        EnumC0843a r1510 = new EnumC0843a("DAY_OF_MONTH", 18, "DayOfMonth", r19, r45, C0860r.m3135g(1, 28, 31), 0);
        DAY_OF_MONTH = r1510;
        ChronoUnit r50 = ChronoUnit.YEARS;
        EnumC0843a r1511 = new EnumC0843a("DAY_OF_YEAR", 19, "DayOfYear", r19, r50, C0860r.m3135g(1, 365, 366));
        DAY_OF_YEAR = r1511;
        ChronoUnit r51 = ChronoUnit.FOREVER;
        EnumC0843a r1512 = new EnumC0843a("EPOCH_DAY", 20, "EpochDay", r19, r51, C0860r.m3134f(-365243219162L, 365241780471L));
        EPOCH_DAY = r1512;
        EnumC0843a r36 = new EnumC0843a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", r20, r45, C0860r.m3135g(1, 4, 5));
        ALIGNED_WEEK_OF_MONTH = r36;
        EnumC0843a r362 = new EnumC0843a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", r20, r50, C0860r.m3134f(1, 53));
        ALIGNED_WEEK_OF_YEAR = r362;
        EnumC0843a r41 = new EnumC0843a("MONTH_OF_YEAR", 23, "MonthOfYear", r45, r50, C0860r.m3134f(1, 12), 0);
        MONTH_OF_YEAR = r41;
        EnumC0843a r412 = new EnumC0843a("PROLEPTIC_MONTH", 24, "ProlepticMonth", r45, r51, C0860r.m3134f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = r412;
        EnumC0843a r46 = new EnumC0843a("YEAR_OF_ERA", 25, "YearOfEra", r50, r51, C0860r.m3135g(1, 999999999, 1000000000));
        YEAR_OF_ERA = r46;
        EnumC0843a r462 = new EnumC0843a("YEAR", 26, "Year", r50, r51, C0860r.m3134f(-999999999, 999999999), 0);
        YEAR = r462;
        EnumC0843a r512 = new EnumC0843a("ERA", 27, "Era", ChronoUnit.ERAS, r51, C0860r.m3134f(0, 1), 0);
        ERA = r512;
        EnumC0843a r55 = new EnumC0843a("INSTANT_SECONDS", 28, "InstantSeconds", r9, r51, C0860r.m3134f(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = r55;
        EnumC0843a r56 = new EnumC0843a("OFFSET_SECONDS", 29, "OffsetSeconds", r9, r51, C0860r.m3134f(-64800, 64800));
        OFFSET_SECONDS = r56;
        f3364c = new EnumC0843a[]{r0, r1, r5, r15, r52, r152, r53, r54, r26, r153, r35, r352, r154, r155, r156, r157, r158, r159, r1510, r1511, r1512, r36, r362, r41, r412, r46, r462, r512, r55, r56};
    }

    EnumC0843a(String r1, int r2, String r3, ChronoUnit r4, ChronoUnit r5, C0860r r6) {
        this.f3365a = r3;
        this.f3366b = r6;
    }

    EnumC0843a(String r1, int r2, String r3, ChronoUnit r4, ChronoUnit r5, C0860r r6, int r7) {
        this.f3365a = r3;
        this.f3366b = r6;
    }

    public static EnumC0843a valueOf(String r1) {
        return (EnumC0843a) Enum.valueOf(EnumC0843a.class, r1);
    }

    public static EnumC0843a[] values() {
        return (EnumC0843a[]) f3364c.clone();
    }

    @Override // p005j$.time.temporal.InterfaceC0857o
    /* JADX INFO: renamed from: B */
    public final Temporal mo3117B(Temporal r1, long r2) {
        return r1.mo2873c(r2, this);
    }

    /* JADX INFO: renamed from: F */
    public final void m3118F(long r2) {
        this.f3366b.m3137b(r2, this);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m3119S() {
        if (ordinal() >= DAY_OF_WEEK.ordinal()) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p005j$.time.temporal.InterfaceC0857o
    public final boolean isDateBased() {
        if (ordinal() >= DAY_OF_WEEK.ordinal()) goto L5;
        return false;
    L5:
        if (ordinal() > ERA.ordinal()) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p005j$.time.temporal.InterfaceC0857o
    /* JADX INFO: renamed from: k */
    public final boolean mo3120k(TemporalAccessor r1) {
        return r1.mo2861e(this);
    }

    @Override // p005j$.time.temporal.InterfaceC0857o
    /* JADX INFO: renamed from: l */
    public final C0860r mo3121l(TemporalAccessor r1) {
        return r1.mo2863m(this);
    }

    @Override // p005j$.time.temporal.InterfaceC0857o
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ TemporalAccessor mo3122m(Map r1, C0799D r2, EnumC0800E r3) {
        return null;
    }

    @Override // p005j$.time.temporal.InterfaceC0857o
    /* JADX INFO: renamed from: q */
    public final C0860r mo3123q() {
        return this.f3366b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3365a;
    }

    @Override // p005j$.time.temporal.InterfaceC0857o
    /* JADX INFO: renamed from: w */
    public final long mo3124w(TemporalAccessor r3) {
        return r3.mo2860F(this);
    }
}
