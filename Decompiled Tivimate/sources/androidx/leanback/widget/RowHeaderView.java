package androidx.leanback.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import ar.tvplayer.p002tv.R;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public final class RowHeaderView extends TextView {
    public RowHeaderView(Context r2, AttributeSet r3) {
        super(r2, r3, R.attr.u);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(ﹳٴ.ﹳٴ.ˉـ(r1, this));
    }
}
