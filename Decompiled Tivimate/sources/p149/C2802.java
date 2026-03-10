package p149;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: ˉˆ.ᵎˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2802 implements ListAdapter, SpinnerAdapter {

    /* JADX INFO: renamed from: ⁱˊ */
    public ListAdapter f9997;

    /* JADX INFO: renamed from: ﹳٴ */
    public SpinnerAdapter f9998;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter r0 = this.f9997;
        if (r0 != null) goto L5;
        return true;
    L5:
        return r0.areAllItemsEnabled();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter r0 = this.f9998;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int r2, View r3, ViewGroup r4) {
        SpinnerAdapter r0 = this.f9998;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getDropDownView(r2, r3, r4);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r2) {
        SpinnerAdapter r0 = this.f9998;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getItem(r2);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        SpinnerAdapter r0 = this.f9998;
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.getItemId(r3);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int r1) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int r1, View r2, ViewGroup r3) {
        return getDropDownView(r1, r2, r3);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter r0 = this.f9998;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.hasStableIds() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        if (getCount() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int r2) {
        ListAdapter r0 = this.f9997;
        if (r0 != null) goto L5;
        return true;
    L5:
        return r0.isEnabled(r2);
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver r2) {
        SpinnerAdapter r0 = this.f9998;
        if (r0 == null) goto L6;
        r0.registerDataSetObserver(r2);
        return;
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver r2) {
        SpinnerAdapter r0 = this.f9998;
        if (r0 == null) goto L6;
        r0.unregisterDataSetObserver(r2);
        return;
    }
}
