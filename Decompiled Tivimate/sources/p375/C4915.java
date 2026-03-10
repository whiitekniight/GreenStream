package p375;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: ᵔᵢ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4915 extends ArrayAdapter {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ C4894 f17482;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ AlertController$RecycleListView f17483;

    public C4915(C4894 r1, ContextThemeWrapper r2, int r3, CharSequence[] r4, AlertController$RecycleListView r5) {
        this.f17482 = r1;
        this.f17483 = r5;
        super(r2, r3, R.id.text1, r4);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int r2, View r3, ViewGroup r4) {
        View r32 = super.getView(r2, r3, r4);
        boolean[] r42 = this.f17482.f17347;
        if (r42 != null) goto L5;
    L7:
        return r32;
    L5:
        if (r42[r2] == false) goto L7;
        this.f17483.setItemChecked(r2, true);
        goto L7
    }
}
