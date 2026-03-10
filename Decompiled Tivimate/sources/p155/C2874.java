package p155;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: ˉٴ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C2874 {

    /* JADX INFO: renamed from: ʽ */
    public final int f10166;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Configuration f10167;

    /* JADX INFO: renamed from: ﹳٴ */
    public final ColorStateList f10168;

    public C2874(ColorStateList r1, Configuration r2, Resources.Theme r3) {
        this.f10168 = r1;
        this.f10167 = r2;
        if (r3 != null) goto L5;
        int r12 = 0;
    L6:
        this.f10166 = r12;
        return;
    L5:
        r12 = r3.hashCode();
        goto L6
    }
}
