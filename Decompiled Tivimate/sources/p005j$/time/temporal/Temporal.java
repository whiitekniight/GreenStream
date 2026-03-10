package p005j$.time.temporal;

import p005j$.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    /* JADX INFO: renamed from: B */
    Temporal mo2869B(long r1, ChronoUnit r3);

    /* JADX INFO: renamed from: c */
    Temporal mo2873c(long r1, InterfaceC0857o r3);

    /* JADX INFO: renamed from: d */
    Temporal mo2874d(long r1, TemporalUnit r3);

    /* JADX INFO: renamed from: l */
    Temporal mo2875l(LocalDate r1);

    long until(Temporal r1, TemporalUnit r2);
}
