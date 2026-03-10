package p372;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: ᵔٴ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C4849 {

    /* JADX INFO: renamed from: ʽ */
    public final String f17147;

    /* JADX INFO: renamed from: ˈ */
    public final List f17148;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f17149;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final String f17150;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f17151;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f17152;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String f17153;

    public C4849(String r1, String r2, String r3, List r4, String r5, String r6) {
        r1.getClass();
        this.f17152 = r1;
        r2.getClass();
        this.f17151 = r2;
        this.f17147 = r3;
        r4.getClass();
        this.f17148 = r4;
        this.f17149 = r5;
        this.f17153 = r6;
        this.f17150 = r1 + "-" + r2 + "-" + r3 + "-" + r5 + "-" + r6;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("FontRequest {mProviderAuthority: " + this.f17152 + ", mProviderPackage: " + this.f17151 + ", mQuery: " + this.f17147 + ", mSystemFont: " + this.f17149 + ", mVariationSettings: " + this.f17153 + ", mCertificates:");
        int r2 = 0;
    L3:
        List r3 = this.f17148;
        if (r2 >= r3.size()) goto L10;
        r0.append(" [");
        List r32 = (List) r3.get(r2);
        int r4 = 0;
    L7:
        if (r4 >= r32.size()) goto L9;
        r0.append(" \"");
        r0.append(Base64.encodeToString((byte[]) r32.get(r4), 0));
        r0.append("\"");
        r4 = r4 + 1;
        goto L7
    L9:
        r0.append(" ]");
        r2 = r2 + 1;
        goto L3
    L10:
        r0.append("}mCertificatesArray: 0");
        return r0.toString();
    }
}
