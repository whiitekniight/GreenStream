package p023;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import p191.AbstractC3156;

/* JADX INFO: renamed from: ʻᐧ.ʾˋ */
/* JADX INFO: loaded from: classes.dex */
public final class C1339 extends AbstractC3156 {

    /* JADX INFO: renamed from: ʿ */
    public boolean f4600;

    /* JADX INFO: renamed from: ˈⁱ */
    public final ColorStateList f4601;

    /* JADX INFO: renamed from: ˉـ */
    public boolean f4602;

    /* JADX INFO: renamed from: ᴵˑ */
    public final SparseArray f4603;

    /* JADX INFO: renamed from: ﹳـ */
    public final Drawable f4604;

    public C1339(View r5) {
        super(r5);
        SparseArray r0 = new SparseArray(4);
        this.f4603 = r0;
        TextView r2 = (TextView) r5.findViewById(R.id.title);
        r0.put(R.id.title, r2);
        r0.put(R.id.summary, r5.findViewById(R.id.summary));
        r0.put(R.id.icon, r5.findViewById(R.id.icon));
        r0.put(ar.tvplayer.p002tv.R.id.u, r5.findViewById(ar.tvplayer.p002tv.R.id.u));
        r0.put(R.id.icon_frame, r5.findViewById(R.id.icon_frame));
        this.f4604 = r5.getBackground();
        if (r2 == null) goto L6;
        this.f4601 = r2.getTextColors();
        return;
    }

    /* JADX INFO: renamed from: יـ */
    public final View m3765(int r3) {
        SparseArray r0 = this.f4603;
        View r1 = (View) r0.get(r3);
        if (r1 == null) goto L5;
        return r1;
    L5:
        View r12 = this.f11118.findViewById(r3);
        if (r12 == null) goto L8;
        r0.put(r3, r12);
    L8:
        return r12;
    }
}
