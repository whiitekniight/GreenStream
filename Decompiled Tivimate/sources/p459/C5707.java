package p459;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ﹶﾞ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C5707 extends AbstractC5759 {

    /* JADX INFO: renamed from: ʽʽ */
    public long f20591;

    /* JADX INFO: renamed from: ˈٴ */
    public String f20592;

    /* JADX INFO: renamed from: ʼᵢ */
    public final long m10959() {
        m11178();
        return this.f20591;
    }

    /* JADX INFO: renamed from: יˉ */
    public final String m10960() {
        m11178();
        return this.f20592;
    }

    @Override // p459.AbstractC5759
    /* JADX INFO: renamed from: ﹶˎ */
    public final boolean mo10920() {
        Calendar r0 = Calendar.getInstance();
        TimeUnit r1 = TimeUnit.MINUTES;
        int r2 = r0.get(15);
        this.f20591 = r1.convert(r0.get(16) + r2, TimeUnit.MILLISECONDS);
        Locale r02 = Locale.getDefault();
        String r12 = r02.getLanguage();
        Locale r22 = Locale.ENGLISH;
        String r13 = r12.toLowerCase(r22);
        String r03 = r02.getCountry().toLowerCase(r22);
        StringBuilder r4 = new StringBuilder((String.valueOf(r13).length() + 1) + String.valueOf(r03).length());
        r4.append(r13);
        r4.append("-");
        r4.append(r03);
        this.f20592 = r4.toString();
        return false;
    }
}
