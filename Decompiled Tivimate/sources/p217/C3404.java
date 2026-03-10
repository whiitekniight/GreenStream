package p217;

import com.google.android.gms.internal.play_billing.י;
import java.util.Arrays;
import p329.AbstractC4397;

/* JADX INFO: renamed from: ˎᴵ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3404 {

    /* JADX INFO: renamed from: ʽ */
    public final String f11986;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f11987;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f11988;

    public C3404(String r1, String r2, String r3) {
        this.f11987 = r2;
        this.f11988 = r1;
        this.f11986 = m7159(r3);
    }

    public C3404(C3404 r2, String r3) {
        this.f11988 = r2.f11988;
        if (י.ـˆ(r2.f11987) == false) goto L11;
        this.f11987 = r2.f11987;
        if (י.ـˆ(r2.f11986) == false) goto L8;
        this.f11986 = r2.f11986 + "\\" + m7159(r3);
        return;
    L8:
        this.f11986 = m7159(r3);
        return;
    L11:
        throw new IllegalArgumentException("Can only make child SmbPath of fully specified SmbPath");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m7159(String r2) {
        if (י.ـˆ(r2) == true) goto L5;
        return r2;
    L5:
        return r2.replace('/', '\\');
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (C3404.class != r5.getClass()) goto L17;
        C3404 r52 = (C3404) r5;
        if (AbstractC4397.m8805(this.f11988, r52.f11988) == false) goto L17;
        if (AbstractC4397.m8805(this.f11987, r52.f11987) == false) goto L17;
        if (AbstractC4397.m8805(this.f11986, r52.f11986) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11988, this.f11987, this.f11986});
    }

    public final String toString() {
        return m7160();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final String m7160() {
        StringBuilder r0 = new StringBuilder("\\\\");
        r0.append(this.f11988);
        String r1 = this.f11987;
        if (r1 == null) goto L13;
        if (r1.isEmpty() == true) goto L13;
        if (r1.charAt(0) == '\\') goto L9;
        r0.append("\\");
    L9:
        r0.append(r1);
        String r12 = this.f11986;
        if (י.ـˆ(r12) == false) goto L13;
        r0.append("\\");
        r0.append(r12);
    L13:
        return r0.toString();
    }
}
