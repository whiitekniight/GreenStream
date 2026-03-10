package androidx.leanback.widget;

import android.graphics.Color;

/* JADX INFO: renamed from: androidx.leanback.widget.ᵎᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C0140 {

    /* JADX INFO: renamed from: ʼˎ */
    public float f984;

    /* JADX INFO: renamed from: ʽ */
    public float f985;

    /* JADX INFO: renamed from: ˆʾ */
    public final /* synthetic */ PagingIndicator f986;

    /* JADX INFO: renamed from: ˈ */
    public float f987;

    /* JADX INFO: renamed from: ˑﹳ */
    public float f988;

    /* JADX INFO: renamed from: ᵎﹶ */
    public float f989;

    /* JADX INFO: renamed from: ᵔᵢ */
    public float f990;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f991;

    /* JADX INFO: renamed from: ﹳٴ */
    public float f992;

    /* JADX INFO: renamed from: ﾞᴵ */
    public float f993;

    public C0140(PagingIndicator r2) {
        this.f986 = r2;
        float r0 = 1.0f;
        this.f990 = 1.0f;
        if (r2.f683 == true) goto L6;
        r0 = -1.0f;
    L6:
        this.f984 = r0;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m648() {
        this.f985 = 0.0f;
        this.f987 = 0.0f;
        PagingIndicator r1 = this.f986;
        this.f988 = r1.f696;
        float r2 = r1.f682;
        this.f993 = r2;
        this.f989 = r2 * r1.f687;
        this.f992 = 0.0f;
        m649();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m649() {
        int r0 = Math.round(this.f992 * 255.0f);
        PagingIndicator r1 = this.f986;
        this.f991 = Color.argb(r0, Color.red(r1.f692), Color.green(r1.f692), Color.blue(r1.f692));
    }
}
