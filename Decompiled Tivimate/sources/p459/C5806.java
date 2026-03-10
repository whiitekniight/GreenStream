package p459;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0492;
import p308.AbstractC4142;

/* JADX INFO: renamed from: ﹶﾞ.ᵎʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C5806 {

    /* JADX INFO: renamed from: ʽ */
    public final long f21154;

    /* JADX INFO: renamed from: ˈ */
    public final C0492 f21155;

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean f21156;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final String f21157;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Boolean f21158;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Context f21159;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final Long f21160;

    public C5806(Context r4, C0492 r5, Long r6) {
        this.f21156 = true;
        AbstractC4142.m8398(r4);
        Context r42 = r4.getApplicationContext();
        AbstractC4142.m8398(r42);
        this.f21159 = r42;
        this.f21160 = r6;
        if (r5 == null) goto L8;
        this.f21155 = r5;
        this.f21156 = r5.f2265;
        this.f21154 = r5.f2268;
        this.f21157 = r5.f2269;
        Bundle r43 = r5.f2267;
        if (r43 == null) goto L9;
        this.f21158 = Boolean.valueOf(r43.getBoolean("dataCollectionDefaultEnabled", true));
        return;
    L9:
        return;
    }
}
