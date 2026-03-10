package p242;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import p133.AbstractC2509;

/* JADX INFO: renamed from: ˑʿ.ᵔי */
/* JADX INFO: loaded from: classes.dex */
public class C3659 extends AbstractC2509 {

    /* JADX INFO: renamed from: ʼˎ */
    public static boolean f13064 = true;

    /* JADX INFO: renamed from: ˆʾ */
    public static boolean f13065 = true;

    /* JADX INFO: renamed from: ٴﹶ */
    public static boolean f13066 = true;

    /* JADX INFO: renamed from: ﾞʻ */
    public static boolean f13067 = true;

    @Override // p133.AbstractC2509
    /* JADX INFO: renamed from: ʾˋ */
    public void mo5777(View r3, int r4) {
        if (Build.VERSION.SDK_INT != 28) goto L7;
        super.mo5777(r3, r4);
        return;
    L7:
        if (f13067 == false) goto L14;
        AbstractC3655.m7698(r3, r4);     // Catch: NoSuchMethodError -> L10
        return;
    L10:
        f13067 = false;
        return;
    }

    /* JADX INFO: renamed from: ˈⁱ */
    public void mo7658(View r2, int r3, int r4, int r5, int r6) {
        if (f13066 == false) goto L10;
        AbstractC3650.m7689(r2, r3, r4, r5, r6);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f13066 = false;
        return;
    }

    /* JADX INFO: renamed from: ˉـ */
    public void mo7659(View r2, Matrix r3) {
        if (f13065 == false) goto L10;
        AbstractC3656.m7699(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f13065 = false;
        return;
    }

    /* JADX INFO: renamed from: ᴵˑ */
    public void mo7660(View r2, Matrix r3) {
        if (f13064 == false) goto L10;
        AbstractC3656.m7700(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f13064 = false;
        return;
    }
}
