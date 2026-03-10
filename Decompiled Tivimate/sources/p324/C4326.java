package p324;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import ar.tvplayer.p002tv.R;
import p191.AbstractC3156;

/* JADX INFO: renamed from: ᐧⁱ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C4326 extends AbstractC3156 {

    /* JADX INFO: renamed from: ˈⁱ */
    public final View f15830;

    /* JADX INFO: renamed from: ﹳـ */
    public final TextView f15831;

    public C4326(View r3) {
        super(r3);
        if (Build.VERSION.SDK_INT >= 26) goto L5;
        r3.setFocusable(true);
    L5:
        this.f15831 = (TextView) r3.findViewById(R.id.u);
        this.f15830 = r3.findViewById(R.id.u);
    }
}
