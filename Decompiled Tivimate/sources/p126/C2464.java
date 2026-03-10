package p126;

import android.os.Build;
import com.google.android.gms.internal.measurement.AbstractC0473;
import java.util.Locale;

/* JADX INFO: renamed from: ˆﾞ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2464 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2464 f8781 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final InterfaceC2466 f8782;

    static {
        f8781 = m5678(new Locale[0]);
    }

    public C2464(InterfaceC2466 r1) {
        this.f8782 = r1;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C2464 m5677(String r5) {
        if (r5 == null) goto L12;
        if (r5.isEmpty() == true) goto L12;
        String[] r52 = r5.split(",", -1);
        int r0 = r52.length;
        Locale[] r1 = new Locale[r0];
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L10;
        String r3 = r52[r2];
        int r4 = AbstractC2468.f8788;
        r1[r2] = Locale.forLanguageTag(r3);
        r2 = r2 + 1;
        goto L7
    L10:
        return m5678(r1);
    L12:
        return f8781;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C2464 m5678(Locale... r2) {
        if (Build.VERSION.SDK_INT < 24) goto L7;
        return new C2464(new C2470(AbstractC0473.m1973(r2)));
    L7:
        return new C2464(new C2465(r2));
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2464) == false) goto L8;
        InterfaceC2466 r22 = ((C2464) r2).f8782;
        if (this.f8782.equals(r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.f8782.hashCode();
    }

    public final String toString() {
        return this.f8782.toString();
    }
}
