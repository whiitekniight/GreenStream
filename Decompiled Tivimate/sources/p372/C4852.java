package p372;

import android.net.Uri;

/* JADX INFO: renamed from: ᵔٴ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C4852 {

    /* JADX INFO: renamed from: ʽ */
    public final int f17163;

    /* JADX INFO: renamed from: ˈ */
    public final boolean f17164;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f17165;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f17166;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Uri f17167;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int f17168;

    public C4852(Uri r1, int r2, int r3, boolean r4, int r5) {
        r1.getClass();
        this.f17167 = r1;
        this.f17166 = r2;
        this.f17163 = r3;
        this.f17164 = r4;
        this.f17165 = null;
        this.f17168 = r5;
    }

    public C4852(String r3, String r4) {
        this.f17167 = new Uri.Builder().scheme("systemfont").authority(r3).build();
        this.f17166 = 0;
        this.f17163 = 400;
        this.f17164 = false;
        this.f17165 = r4;
        this.f17168 = 0;
    }
}
