package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: androidx.leanback.widget.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public class C0096 {

    /* JADX INFO: renamed from: ʼˎ */
    public int f870;

    /* JADX INFO: renamed from: ʽ */
    public CharSequence f871;

    /* JADX INFO: renamed from: ˆʾ */
    public int f872;

    /* JADX INFO: renamed from: ˈ */
    public CharSequence f873;

    /* JADX INFO: renamed from: ˉʿ */
    public int f874;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f875;

    /* JADX INFO: renamed from: ٴﹶ */
    public int f876;

    /* JADX INFO: renamed from: ᵎﹶ */
    public CharSequence f877;

    /* JADX INFO: renamed from: ᵔᵢ */
    public int f878;

    /* JADX INFO: renamed from: ⁱˊ */
    public Drawable f879;

    /* JADX INFO: renamed from: ﹳٴ */
    public long f880;

    /* JADX INFO: renamed from: ﾞʻ */
    public int f881;

    /* JADX INFO: renamed from: ﾞᴵ */
    public CharSequence f882;

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        if (TextUtils.isEmpty(this.f871) == true) goto L6;
        r0.append(this.f871);
    L6:
        if (TextUtils.isEmpty(this.f873) == true) goto L12;
        if (TextUtils.isEmpty(this.f871) == true) goto L10;
        r0.append(" ");
    L10:
        r0.append(this.f873);
    L12:
        if (this.f879 == null) goto L17;
        if (r0.length() != 0) goto L17;
        r0.append("(action icon)");
    L17:
        return r0.toString();
    }

    /* JADX INFO: renamed from: ʽ */
    public final boolean m579() {
        if (this.f878 != 1) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: ˈ */
    public final boolean m580() {
        if ((this.f875 & 16) != 16) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m581(String r3, Bundle r4) {
        if (m579() == false) goto L9;
        String r32 = r4.getString(r3);
        if (r32 == null) goto L25;
        this.f871 = r32;
        return;
    L25:
        return;
    L9:
        if (this.f878 != 2) goto L22;
        int r0 = this.f881 & 4080;
        if (r0 == 128) goto L22;
        if (r0 == 144) goto L22;
        if (r0 == 224) goto L22;
        String r33 = r4.getString(r3);
        if (r33 == null) goto L26;
        this.f873 = r33;
        return;
    L26:
        return;
    L22:
        if (this.f874 == 0) goto L27;
        m583(r4.getBoolean(r3, m584()) ? 1 : 0, 1);
        return;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m582(boolean r2) {
        if (r2 == false) goto L5;
        int r22 = 16;
    L6:
        m583(r22, 16);
        return;
    L5:
        r22 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final void m583(int r3, int r4) {
        int r32 = r3 & r4;
        this.f875 = r32 | (this.f875 & (~r4));
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean m584() {
        if ((this.f875 & 1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m585() {
        if (this.f878 != 3) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m586(String r3, Bundle r4) {
        if (m579() == false) goto L9;
        CharSequence r0 = this.f871;
        if (r0 == null) goto L9;
        r4.putString(r3, r0.toString());
        return;
    L9:
        if (this.f878 != 2) goto L22;
        int r02 = this.f881 & 4080;
        if (r02 == 128) goto L22;
        if (r02 == 144) goto L22;
        if (r02 == 224) goto L22;
        CharSequence r03 = this.f873;
        if (r03 == null) goto L22;
        r4.putString(r3, r03.toString());
        return;
    L22:
        if (this.f874 == 0) goto L25;
        r4.putBoolean(r3, m584());
        return;
    }
}
